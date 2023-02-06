package _08_multithreading;

public class _02_Thread_creation {
/*
 * 1. Defining a Thread:
 * --> we can define a thread in following two ways
 * 	(i)  By extending Thread class
 * 	(ii) By implementing Runnable interface
================================================================================

    (I)  By extending Thread class

class MyThread extends Thread{    <---------------------------------+  
	@Override										          		|		 
	public void run() {				   <----------+	Job	      		| Defining
		for(int i=0; i<10; i++)					  |  of       		|    a
			System.out.println("child thread");	  |Thread     		| Thread
	}								   <----------+ (executed by    | 
													child thread)	|
}                                 <---------------------------------+

class ThreadDemo{
	public static void main(String[] args) {                                                         | 
																					                 |	
		MyThread t = new MyThread();------------> thread instantiation                               |main  
																					                 |thread	
		t.start();------------------------------> starting of a thread               				 |      
																									/ \
																	  				  child thread /   \main thread		
		for(int i=0;i<10;i++)                     <-------+
			System.out.println("parent thread");          | executed by main thread
			                                      <-------+
	}
}

---------------------
case1) Thread Scheduler
-->It is the part of jvm.
-->It is responsible to schedule thread ie, if multiple threads are waiting to
get chance of execution then in which order threads will be executed is decided
by thread scheduler.
--> we cannot expect exact algorithm followed by thread scheduler it is varied
form jmv to jvm, hence we cannot expect thread execution order and exact o/p.
hence whenever situation comes to multithreading there no gaurentee for exact
output but we can provide several possible output.
---------------------
case2)
 t.start()  vs t.run()
-->in the case of t.start() a new thread will be created which is responsible for
execution of run method but in the case of t.run() no new thread created and run()
method will be executed like a normal method call by main thread hence in the above
program if we replace t.start() with t.run() then the o/p is

child thread					|
child thread					|
child thread					|  this total
.. 10 times                     |   o/p produced
parent thread					|   only by main 
parent thread					|    thread
parent thread					|
parent thread					|
.. 10 times                     |
---------------------
case3) importance of thread class start() method
thread class start method is responsible to register the thread with thread scheduler
and all other mandatory activities hence without executing thread class start method
there is no chance of starting new thread in java due to this thread class start()
method is considered as heart of multithreading.

			start(){
			 1. Register this thread with thread scheduler
			 2. perform all other mandatory activities
			 3. Invoke run();
			}
---------------------
case4) overloading of run() method:
overloading of run() method is always possible but thread class start method
 can invoke no-arg run() method, the other overloaded method we have to call
 explicitly like a normal method call. 

		class MyThread extends Thread{
			public void run() {
				System.out.println("no-arg run");
			}
			public void run(int i) {
				System.out.println("int-arg run");
			}
		}
		class ThreadDemo{
			public static void main(String[] args) {
				MyThread t = new MyThread();
				t.start();
			}
		}
		
o/p: 	no-arg run
---------------------
case5) if we are not overriding run method:
if we are not overriding run() method then Thread class run() method will be
executed which has empty implementaion, hence we won't get any o/p
		
		class MyThread extends Thread{
		
		}
		class ThreadDemo{
			public static void main(String[] args) {
				MyThread t = new MyThread();
				t.start();
			}
		}
		
no o/p

Note: it is highly recommended to override run method otherwise don't go for
multithreading concept.
---------------------
case6) Overriding start method:
if we override start() method then our start method will be executed just like
a normal method call and new thread won't be created.
	
	class MyThread extends Thread{
		public void start() {
			System.out.println("start method");
		}
		public void run() {
			System.out.println("run method");
		}
	}
	class ThreadDemo{
		public static void main(String[] args) {
			MyThread t = new MyThread();
			t.start();
			System.out.println("main method");
		}
	}

o/p:
start method    \ Produced by only main thread
main method     / 

Note: it is not recommended to override start() method otherwise don't go for
multithreading.
---------------------
case7)
	 
		 class MyThread extends Thread{
			public void start() {
				super.start();    
				          --------------------------------------------------------->      
				System.out.println("start method");             	    	       /\
			}                                              			child thread  /  \ main thread
			public void run() {                                                  /    \  
				System.out.println("run method");                  "run method" /      \ "start method"
			}																			  "main method"				
		}
		class ThreadDemo{
			public static void main(String[] args) {
				MyThread t = new MyThread();
				t.start();
				System.out.println("main method");
			}
		}
		
o/p:                p1                  p2                  p3
              run method              start method         start method
              start method            main method          run method
              main method		      run method           main method
---------------------
case8)Simple thread cycle:
 
 		MyThread t = new MyThread();                                                                                      +-------+
	      +-------------+                         +-------------+                          +---------+    if run()        |       | 
	      |  New/       |          t.start();     | Ready/      |  if Thread scheduler     | Running |------------------->| Dead  |        
	      |  Born       |------------------------>| Runnable    |------------------------->|         | method completes   |       |
	      +-------------+                         +-------------+    allocates processor   +---------+                    +-------+
      
---------------------
case9) IllegalThreadStateException:
after starting athread if we are trying to restart the same thread then we will
get RE saying "IllegalThreadStateException".

	MyThread t = new MyThread();
	t.start();
	
	t.start();-----> RE: IllegalThreadStateException
	
================================================================================

	(II) defining a Thread by implementing Runnable interface

1. we can define a thread by implementing Runnable interface.

		Runnable(I) <---------+
		/|\                   |
	     |                    |
	     |                    |
	   Thread                 |  
	    /|\                   |
	     |                    |
	     |                  MyRunnable
	     |                (2nd Approach)
	   MyThread
	   (1st Approach)
	   
2. Runnable(I) present in java.lang package, and it contains only one method
				  ______________________ 	
				  |	public void run();  |
				  +---------------------+
				  
3.

      				  
      	 +-----------> class MyRunnable implements Runnable{
		 |				public void run() {            <---------------+
defining |					for(int i=0;i<10;i++)                      | Job of a
	a	 |						System.out.println("child thread");    |  thread
Thread   |				}                              <---------------+  (executed by child thread)
		 |			  }                                
		 +------------>
					class ThreadDemo{
						public static void main(String[] args) {
							MyRunnable r = new MyRunnable();
							Thread t = new Thread(r);-------------> 'r' is target runnable
							t.start();
					
							for(int i=0;i<10;i++)
								System.out.println("parent thread");------> executed by main thread  
						}
					}

Note: we will get mixed o/p and we cannot tell exact output.	
-----------------------------------------------------------------
Case Study:
					MyRunnable r = new MyRunnable();
					Thread t1 = new Thread();
					Thread t2 = new Thread(r);
					
case1) t1.start();
-->a new thread will be created, which is responsible for the execution of 
Thread class run() method, which has empty implementation.

case2) t1.run();
-->no new thread will be created and Thread class run() method will be executed 
just like a normal method call.

case3) t2.start();
--> a new thread will be executed which is responsible for the execution of 
MyRunnable class run() method.

case4) t2.run();
--> no new thread will be created and MyRunnable run() method will be executed
 just like a normal method.
 
case5) r.start();
--> we will get CE saying MyRunnable class doesn't have start() capibility.
CE: cannot find symbol
symbol: method start()
location: classMyRunnable

case6) r.run();
--> no new thread will be created and MyRunnable run() method will be executed like
normal method call.
================================================================================

Q) which approach is best to define a Thread?
Ans) among two ways of defining a thread, implements Runnable approach is recommended.
	In the first approach our class always extends thread class, there is no chance of
extending any other class hence we are missing inheritance benefits
	In second  approach while implementing Runnable interface we can extend any other
class, hence we won't miss any inheritance benefit.
	Because of above reason implementing Runnable interface approach that extending
	thread class.
================================================================================

	Thread class Constructors:
	
	1. Thread t = new Thread();
	2. Thread t = new Thread(Runnable r);
	3. Thread t = new Thread(String name);
	4. Thread t = new Thread(Runnable r, String name);
	5. Thread t = new Thread(ThreadGroup g, String name);
	6. Thread t = new Thread(ThreadGroup g, Runnable r);
	7. Thread t = new Thread(ThreadGroup g, Runnable r, String name);
	8. Thread t = new Thread(ThreadGroup g, Runnable r, String name, long stackSize);
================================================================================

	Durga's approach (not recommended)
	
	class MyThread extends Thread{
		public void run() {
			System.out.println("child Thread");
		}
	}
	class ThreadDemo{                                        Runnable(I)
		public static void main(String[] args) {                 /|\      
			MyThread k = new MyThread();                          | 
			Thread t = new Thread(k);                             |
			t.start();                                         Thread(C) 
			System.out.println("main thread");                   /|\
		}                                                         |
	}                                                             |
	                                                           MyThread
	                                                           
o/p   p1                     p2
     main thread            child Thread
	 child Thread	        main thread
================================================================================
Getting and Setting name of a thread:
1. every thread in java has some name it may be default name generated by JVM or
customised name provided by programmer.

2. we can get and set name of a thread by using following two methods of Thread
class:
            public final String getName();
            public final void setName(String name);

  	                                                    
eg:-
  	        class MyThread extends Thread{
			
			}
			class ThreadDemo{
				public static void main(String[] args) {
					System.out.println(Thread.currentThread().getName());
					MyThread t = new MyThread();
					System.out.println(t.getName());
					
					Thread.currentThread().setName("hero superstar");
					System.out.println(Thread.currentThread().getName());
				}
			}
o/p:
main
Thread-0
hero superstar

Note: we can get current executing thread object using Thread.currentThread() method.

        class MyThread extends Thread{
			public void run() {
				System.out.println("run method executed by: "+Thread.currentThread().getName());
			}
		}
		class ThreadDemo{
			public static void main(String[] args) {
				MyThread t = new MyThread();
				t.start();
				System.out.println("main method executed by: "+Thread.currentThread().getName());
			}
		}
		
o/p:
main method executed by: main
run method executed by: Thread-0

 */
	public static void main(String[] args) {}
}