package _08_multithreading;

public class _06_Synchronization {
/*
 * 1. synchronized is a modifier applicable only for methods and blocks, but not 
 * 	  classes and variables.
 * 
 * 2. if multiple threads are trying to operate simultaneously on the same java
 * 	  object then there may be a chance of data inconsistency problem, to
 * 	  overcome this problem we sholud go for synchronized keyword.
 * 
 * 3. if a method or block declared as synchronized then at a time only thread is
 * 		allowed to execute that method or block on the given object so that data
 * 		inconsistency problem is resolved.
 *
 * 4. the main advantage of synchronize keyword is we can resolve data inconsistency
 * 		problem, but the main disadvantage of synchronize keyword is it increases
 * 		waiting time of thread and creates performance problems.
 * 	Hence if there is no specific requirement then it's not recommended to use
 * 	synchronize keyword.
 * 
 * 5. internally synchronization concept is implemented by using lock, every object
 * 		in java has a unique lock.
 * --> whenever we are using synchronized keyword then only lock concept will come
 * 		in the picture.
 * --> if a thread wants to execute synchronized method on the given object
 * 		1st it has to get lock on the object, once thread got the lock then
 * 		it is allowed to execute any synchronized method on that object. Once
 * 		method execution completes automatically thread releases lock.
 * --> acquiring and releasing lock internally takes care by jvm and programmer not
 * 		responsible for this activity.
 * 
 * 6. while a thread executing synchronized method on a given object, the remaining
 * 		threads are not allowed to execute any synchronized method simultaneously
 * 		on the same object but the remaining threads are allowed to execute non
 * 		non-synchronized methods simultaneously.
 
 		class X{
 			synchronized m1(){}
 			synchronized m2(){}
 			m3(){}
 		}
                      
                              t1--->lock(x)
     +---------------+        t1.m1()                
     | X x = new X() |
     +---------------+         t2
     						   t2.m1()----> waiting state
     						   
     						   t3
     						   t3.m2()----> waiting state
     						   
     						   t4
     						   t4.m3()----> can execute

---> lock concept it implemented based on object but not based on method.


                       _________________________________
                       | non-           |              |                 
 this area can         |  Synchronized  | Synchronized |                 
 be accessed by <------+-  area         |   area       |                 
 any no. of threads    |                |            --+-----> this area can be                  
 simultaneously        |________________|______________|        accessed by only one
                                   Object                        thread at a time
                                   

          class X{
          
           Synchronized area{
              wherever we are 
              performing update operation
              (Add/remove/delete/replace)
              ie, where state of object changing
                                                   
           }                                        
           
           non-Synchronized area{
              where ever object state
              won't be changed like
              read() operations
           }                                        
                                                   
          }                                                   
                 
eg:-             

                 class ReservationSystem{
					checkAvailabiltiy(){-------------> non-synchronized
						//just read operation
					}
					
					synchronized void bookTicket(){
						//update
					}
				}
--------------------------

                 class Display{
					public synchronized void wish(String name) {
						for(int i=0;i<10;i++) {
							System.out.print("good morning: ");
							try {
								Thread.sleep(2000L);
							}catch (InterruptedException e) {
							}
							System.out.println(name);
						}
					}
				}
				class MyThread extends Thread{
					private Display d;
					private String name;
					
					MyThread(Display d, String name){
						this.d=d;
						this.name=name;
					}
					public void run() {
						d.wish(this.name);
					}
				}
				class MySynchronizedDemo{
					public static void main(String[] args) {
						Display d = new Display();
				
						MyThread t1 =  new MyThread(d, "dhoni");                     
						MyThread t2 =  new MyThread(d, "yuvraj");
				
						t1.start();
						t2.start();
					}
				}
				
				_____________________________
				|                           |      t1---> d.wish("dhoni");     
				| Display d = new Display();|       
				|___________________________|      t2---> d.wish("Yuvraj");
				
--> if we are not declaring wish() method as synchronized then both threads will
 	be executed simultaneously, hence we will get irregular o/p. 
 	
 		good morning: good morning: yuvraj
		good morning: dhoni
		good morning: dhoni
		
--> if we declare wish() method as synchronized then at a time only one thread
	allowed to execute wish() method on the given display object hence we will
	get regular o/p.
	
		good morning: dhoni
		good morning: dhoni
		good morning: dhoni
		...10 times
		good morning: yuvraj
		good morning: yuvraj
		good morning: yuvraj
		...10 times
		
-------------------------------------------------
Case1)
		Display d1 = new Display();
		Display d2 = new Display();

		MyThread t1 =  new MyThread(d1, "dhoni");                     
		MyThread t2 =  new MyThread(d2, "yuvraj");

		t1.start();
		t2.start();
		
--> even though wish() method is synchronized we will get irregular o/p
		because threads are operating on different java objects.

reason: if multiple threads are operating on same java object then synchronization
		is required.
		if multiple threads are operating on multiple java objects then 
		synchronization is not required.
-------------------------------------------------
case2) class level lock:
--> every class in java has a unique lock which is nothing class level lock.
--> if a thread wants to execute a static synchronized method then a thread
		required class level lock. Once a thread gets class level lock then it
		allowed to execute any static synchronized method of that class. Once method
		execution completes, autmatically the thread will release the lock.
		
--> while a thread executing static synchronized method the remaining threads are
		not allowed to execute static synchronized method of that class simultaneously.
		But remaining threads are allowed to execute the following methods simultaneously
		 	a) normal static methods
		 	b) synchronized instance methods
		 	c) normal instance methods
		 	
		 	                                                                                       t1(got class level lock)
		 	                                                                                        |
		 	                                                                                        |m1()
		 	                                                                                        | (able to execute)
		 	class X{                              (are in waiting state)                           \|/ 
		 	static synchronized m1()             	+--------+    	m1()      		        +-------+------------+
		 	static synchronized m2()             	|	 t2--+----------------------------->|       |            | 
		 	static m3()                          	|        | didn't get class level lock  |                    |
		 	synchronized m4();         				|        |                              |                    |  
		 	m5()                       				|        |                              |                    |
		 	}										|		 |		m2()			        |        X           |  
		 	                   						|	 t3--+----------------------------->|      (object)      | 
		 	                                    	|        | didn't get class level lock  |                    |
		 	                                    	+--------+     		 				    |                    |
		 	                                    											|                    |
		 	                                              			m3()			        |                    |
		 	                           {           	t4------------------------------------->|                    | 
                             Able      {                            m4()                    |                    |
                               to      {            t5------------------------------------->|                    | 
                           execute     {                            m5()                    |                    | 
                                       {            t6------------------------------------->|                    |
                                                                                            +--------------------+ 

-------------------
eg:-

		 class Display{
			public synchronized void displayn() {
				for(int i=0;i<10;i++) {
					System.out.print(i);
					
					try {
						Thread.sleep(2000L);
					} catch (InterruptedException e) { }
				}
			}
			public synchronized void displayc() {
				for(int i=65;i<75;i++) {
					System.out.print((char)i);
					
					try {
						Thread.sleep(2000L);
					} catch (InterruptedException e) { }
				}
			}
		}
		class MyThread1 extends Thread{
			private Display d;
			
			MyThread1(Display d){
				this.d=d;
			}
			public void run() {
				d.displayn();
			}
		}
		class MyThread2 extends Thread{
			private Display d;
			
			MyThread2(Display d){
				this.d=d;
			}
			public void run() {
				d.displayc();
			}
		}
		class MySynchronizedDemo{
			public static void main(String[] args) {
				Display d1 = new Display();                                  
		                                                         _____________________________ t1
				MyThread1 t1 =  new MyThread1(d1);               |Display d1 = new Display() |---- .displayn()---                     
				MyThread2 t2 =  new MyThread2(d1);               +---------------|-----------+ 
		                                                                         |     
				t1.start();                                                      |     t2
				t2.start();                                                      +---------- .displayc()------------
			}
		}
		
o/p: 0123456789ABCDEFGHIJ		
 */
	public static void main(String[] args) {}
}
class Display_06{
	public synchronized void displayn() {
		for(int i=0;i<10;i++) {
			System.out.print(i);
			
			try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) { }
		}
	}
	public synchronized void displayc() {
		for(int i=65;i<75;i++) {
			System.out.print((char)i);
			
			try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) { }
		}
	}
}
class MyThread1 extends Thread{
	private Display_06 d;
	
	MyThread1(Display_06 d){
		this.d=d;
	}
	public void run() {
		d.displayn();
	}
}
class MyThread2 extends Thread{
	private Display_06 d;
	
	MyThread2(Display_06 d){
		this.d=d;
	}
	public void run() {
		d.displayc();
	}
}
class MySynchronizedDemo_06{
	public static void main(String[] args) {
		Display_06 d1 = new Display_06();

		MyThread1 t1 =  new MyThread1(d1);                     
		MyThread2 t2 =  new MyThread2(d1);

		t1.start();
		t2.start();
	}
}