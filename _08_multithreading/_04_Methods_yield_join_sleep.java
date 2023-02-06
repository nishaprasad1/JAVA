package _08_multithreading;

public class _04_Methods_yield_join_sleep {
/*
 * 1. we can prevent a thread execution by using following methods:
 * 		a)yield();
 * 		b)join();
 * 		c)sleep();
================================================================================
           
                  a) yield();           (long batsman required yield() method)

 * 1. yield() method causes to pause current executing thread to give the chance 
 * 		for waiting threads of same priority.
 * 	---> if there is no waiting threads or all waiting threads have low priority
 * 			then same thread can continue its execution.
 * ---> if multiple threads are waiting with the same priority then we cannot expect 
 * 		  which waiting thread will get the chance it depends on thread scheduler.
 * --> the thread which is yielded, when it will get chance once again it depneds on
 * 		thread scheduler and we cannot expect exaclty.
 *         
			 		+---------------------------------------+
			 		|  public static native void yield();   |
			 		+---------------------------------------+
			 		
			 		
 		class MyThread extends Thread{
			public void run(){
				for(int i=0;i<10;i++) {
					System.out.println("child thread");
					Thread.yield();                         //line (1)
				}
			}
		}
		class ThreadDemo{
			public static void main(String[] args) {
					MyThread t = new MyThread();
					t.start();
					
					for(int i=0;i<10;i++) {
						System.out.println("main thread");
					}
			}
		}
 
 ---> in the above program if we are commenting "line (1)" then both threads will
  		be executed simultaneously and we cannot expect which thread will complete
  		first.
---> if we are not commenting "line (1)" , then child thread always calls yield() method
       because of that "main" thread will get chance more number of times and the chance
       of "main" thread first is high.
       
Note: some platforms won't provide proper for yield() method.         		
================================================================================

                         b) join();

1. if a thread wants to wait until completing some other thread, then we should
	go for join method.
	eg:- if a thread t1 wants to wait until completing t2,
	     then t1 has to call  t2.join()
	  --> if t1 executes t2.join() then immediately t1 will be entered into waiting
	     	state until t2 completes.
      --> once t2 completes then t1 can continue its execution.
      
    venue fixing        wedding card              wedding cards
      activity  	     	printing               distribution
        (t1)                 (t2)                      (t3)  	   
          |                   |                          |
          |                   |                          |
          |                   |                          |
                             t1.join();                  t2.join();

--> wedding card printing thread(t2) has to wait until venue fixing thread(t1)
      completion hence t2 has to call t1.join();
--> weddig card distribution thread (t3) has to wait wedding card printing thread(t2)
      completion , hence t3 has to call t2.join();
      
      +-----------------------------------------------------------------------+
      |   public final void join() throws InterruptedException                |
      |   public final void join(long ms) throws InterruptedException         |
      |   public final void join(long ms, int ns) throws InterruptedException |
      |_______________________________________________________________________|
      
Note: every join() method throws "InterruptedException" which is checked exception
      hence compulsary we should handle this exception either using try-catch or
      throws keyword otherwise we will get CE.
      	
      	                                            	__________________________
	      	                                            |    waiting state       |
	      	                           			   	 +--|    (Blocked for        |
	      	                                         |  |       joining)         |<-------------+
      	                                             |  |________________________|             /|\
      	                                             |                                          |   
      	                                             |1.if t2 completes. (or)                   |  t2.join();
      	                                             |2.if time expires. (or)                   |  t2.join(1000);
      	                                             |3.if waiting thread got interrupted.      |  t2.join(1000,100);
      	                                             |                                          |
      	      MyThread t = new MyThread();          \|/                                         |                         +-------+
	      +-------------+                         +--|----------+                          +----|----+    if run()        |       | 
	      |  New/       |          t.start();     | Ready/      |  if Thread scheduler     | Running |------------------->| Dead  |        
	      |  Born       |------------------------>| Runnable    |------------------------->|         | method completes   |       |
	      +-------------+                         +-------------+    allocates processor   +---------+                    +-------+


--------------------
case1) waiting of "main" thread until completing child thread

		class MyThread extends Thread{
			public void run(){
				for(int i=0;i<10;i++) {
					System.out.println("child thread");
					try {
						Thread.sleep(2000L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		class ThreadJoinDemo{
			public static void main(String[] args) throws InterruptedException {
					MyThread t = new MyThread();
					t.start();
					t.join();                      //---------> "line (1)"
		//			t.join(10000L);
					
					for(int i=0;i<10;i++) {
						System.out.println("main thread");
					}
			}
		}
		
Note: if we comment "line (1)" then both main and child thread will be executed
		simultaneously
	--> if we are not commenting "line (1)" then main thread call join() method
		on child thread object hence main thread will wait untill completing
		child thread. in this case o/p is
		
		child thread
		child thread
		child thread
		..10 times
		main thread
		main thread
		main thread
		..10 times
		
-----------------------------
case2) waiting of child thread until completing main thread

		class MyThread extends Thread{
			static Thread mt;
			public void run(){
				try {
					mt.join();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				for(int i=0;i<10;i++) {
					System.out.println("child thread");
				}
			}
		}
		class ThreadJoinDemo{
			public static void main(String[] args) throws InterruptedException {
					MyThread.mt = Thread.currentThread();
					
					MyThread t = new MyThread();
					t.start();
					
					for(int i=0;i<10;i++) {
						System.out.println("main thread");
						Thread.sleep(2000L);
					}
			}
		}
		
--> it the above example child thread calls join method on main thread object
		hence child thread has to wait until completion of main thread. In this
		case o/p is
		
		main thread
		main thread
		main thread
		..10 times
		child thread
		child thread
		child thread
		..10 times
		
---------------------------------
case3) if main thread calls join() method on child thread object and child thread
		calls join() method on main thread object, then both thread will wait
		forever and the program will be stuck ie deadlock.
---------------------------------
case4) if a thread calls join() method on the thread itself then the program will
		be stuck, this is something like deadlock. In this case thread has to 
		wait infinite amount of time.
		
		 class Test{
			public static void main(String[] args) throws InterruptedException {
				Thread.currentThread().join();
			}
		}

================================================================================
  
  			c) sleep();
  			
1. if a thread do not want to perform any operation for a particular amount of 
	time then we sholud go for sleep() method.
	
			____________________________________________________________________________
			|                                                                          | 
			|  public static native void sleep(long ns) throws InterruptedException;   |
			|  public static void sleep(long ns, int ns) throws InterruptedException;  |
			|__________________________________________________________________________|
			
Note: every sleep() method throws "InterruptedException", which is checked exception,
		hence whenever we are using sleep() compulsary we should handle InterruptedException
		either by try-catch or by throws keyword otherwise we will get CE.
		
		
														__________________________
	      	                           			   	 +--|                        |
	      	                                         |  |    sleeping state      |<-------------+
      	                                             |  |________________________|             /|\
      	                                             |                                          |   
      	                                             |1.if time expires. (or)                   |  Thread.sleep(1000);
      	                                             |2.if sleeping thread got interrupted.     |  Thread.sleep(1000,100);
      	                                             |                                          |
      	      MyThread t = new MyThread();          \|/                                         |                         +-------+
	      +-------------+                         +--|----------+                          +----|----+    if run()        |       | 
	      |  New/       |          t.start();     | Ready/      |  if Thread scheduler     | Running |------------------->| Dead  |        
	      |  Born       |------------------------>| Runnable    |------------------------->|         | method completes   |       |
	      +-------------+                         +-------------+    allocates processor   +---------+                    +-------+

		
eg:-

		class SlideRotator{
			public static void main(String[] args) throws InterruptedException {
				for(int i=1;i<=10;i++) {
					System.out.println("slide "+i);
					Thread.sleep(2000L);
				}
			}
		}
 ===============================================================================
 
property          |    yield()                        |    join()                   |  sleep()            
------------------+-----------------------------------+-----------------------------+-------------------------------------------                                   
 1. purpose?      | if a thread wants to              |  if a thread wants to wait  |   if a thread don't want 
                  | pause its execution to give the   |   until completing some     |   to perform any operation 
                  | chance for remaining threads of   |   other thread.             |   for a particular amount of 
                  | same priority.                    |                             |   time.
------------------+-----------------------------------+-----------------------------+-------------------------------------------
 2. is it         |     No                            |      Yes                    |    Yes
    overloaded?   |                                   |                             |
 -----------------+-----------------------------------+-----------------------------+--------------------------------------------   
 3. is it final?  |     No                            |       Yes                   |     No
 -----------------+-----------------------------------+-----------------------------+-------------------------------------------- 
 4. throws IE     |     No                            |       Yes                   |     Yes
 -----------------+-----------------------------------+-----------------------------+--------------------------------------------
 5. is it native? |     Yes                           |       no                    |     sleep(long ms);----> native
                  |                                   |                             |     sleep(long ms, int ns);--->non-native
------------------+-----------------------------------+-----------------------------+--------------------------------------------
 6. is it static? |     Yes                           |       No                    |     Yes
 -----------------+-----------------------------------+-----------------------------+--------------------------------------------                                                                                        
 *
 */
	
	public static void main(String[] args) {}
}