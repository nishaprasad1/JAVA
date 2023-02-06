package _08_multithreading;

public class _03_Thread_priorities {
/*
 * 1. every thread in java has some priority, it may be default priority generated
 * 	  by jvm or customised priority provided by programmer.
 * 
 * 2. valid range of Thread priority is 1 to 10, were 1 is min priority and 
 * 	  10 is max priority.
 * 
 * 3. Thread class defines the following constants to represent
 * 	  some standard priorities:
 * 				a) Thread.MIN_PRIORITY--------------> 1
 * 				b) Thread.NORM_PRIORITY-------------> 5
 * 				c)Thread.MAX_PRIORITY---------------> 10
 * 
 * 4. thread scheduler will use priorities while allocating processor, the thread
 * 		which is having higest priority will get chance first. If two threads 
 * 		having same priority then we cannot expect exact execution order, it
 * 		depends on thread scheduler.
 * 
 * 5. thread class defines the following methods, to get and set priority of a 
 * 	  thread.
 * 					public final int getPriority();
 * 					public final void setPriority(int p);------> allowed values 
 *                                                               range : 1 to 10
 *                                                             otherwise RE: IllegalArgumentException
 *                                                             
 *                eg:- t.setPriority(7);---------> valid
 *                     t.setPriority(17);--------> RE: IllegalArgumentException
 *                     
 * 6. Default priority: the default priority only for the "main" thread is 5,for all
 * 		remaining threads the default priority will be inherited form parent to child ie,
 * 		whatever priority parent thread has the same priority will be there for child thread.


					class MyThread extends Thread{
						
					}
					class ThreadDemo{
						public static void main(String[] args) {
							System.out.println(Thread.currentThread().getPriority());
							
					//		Thread.currentThread().setPriority(15);//RE: java.lang.IllegalArgumentException
							Thread.currentThread().setPriority(7);//---> line (1)
							
							MyThread t = new MyThread();
							System.out.println(t.getPriority());
						}
					}
					
Note: if we comment "line (1)", then child thread priority will become 5.
-------------

		class MyThread extends Thread{
			public void run() {
				for(int i=0;i<10;i++)
					System.out.println("child thread");
			}
		}
		class ThreadPriorityDemo{
			public static void main(String[] args) {
				
				MyThread t = new MyThread();
				t.setPriority(10);                    // line (1)
				t.start();
		
				for(int i=0;i<10;i++)
					System.out.println("main thread");
			}
		}
		
Note: if we are commenting "line (1)" then both "main" and "child" thread will have
		same priority 5, hence we cannot expect execution order and output.
	if we are not commenting "line (1)" then "main" thread has priority 5 and "child"
	thread has priority 10 and hence "child" thread will get chance first followed by
	"main" thread. 
		o/p:
		child thread
		child thread
		child thread
		...10 times
		main thread
		main thread
		main thread
		main thread
		...10 times
	
 * Note: some platforms won't provide proper support for thread priorities.
 */
	public static void main(String[] args) {}
}