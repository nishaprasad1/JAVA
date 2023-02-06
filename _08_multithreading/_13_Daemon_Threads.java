package _08_multithreading;

public class _13_Daemon_Threads {
/*
 * 1. the threads which are executing in the background are called demon
 * 		threads eg:-Garbage collector, signal dispatcher, attach listener etc.
 * 2. the main objective of daemon thread is to provide support for non-daemon
 * 		thread (main thread).
 * 		for example if main thread runs with low memory then jvm runs garbage 
 * 		collector to destroy useless objects so that number of bytes of free 
 * 		memory will be improved, with this free memory main thread can continue
 * 		its execution.
 * --> usually daemon threads having low priority but based on our requirement
 * 		demon threads can run on high priority also.
 * 
 * --> we can check daemon nature of a thread by using isDaemon() method of Thread
 * 		class.          ______________________________
 * 			            | public boolean isDaemon()  |
 *                      +----------------------------+
 *                       
 * --> we can change daemon nature of a thread by using setDaemon() method.
 *                  ____________________________________                      
 *                  | public void setDaemon(boolean b) |
 *                  +----------------------------------+
 *      but changing daemon nature is possible before starting of a thread only
 *      after starting a thread if we are trying to change the daemon nature 
 *      then we will get RE saying IllegalThreadStateException.
====================================================================================
		Default nature of a thread

1. by default main thread is always non-daemon and for all remaining thread 
		daemon nature will be inherited from parent to child, ie if parent 
		thread is daemon then automatically child thread is also daemon and
		if the parent thread is non-daemon then automatically child thread is also
		non-daemon.
		
Note: it is impossible to change daemon nature of main thread because it is already
		started by jvm at begining.

example:
		class MyThread extends Thread{
			
		}
		class Test{
			public static void main(String[] args) {
				System.out.println(Thread.currentThread().isDaemon());//false
		//		Thread.currentThread().setDaemon(true);//RE:java.lang.IllegalThreadStateException
				
				MyThread t = new MyThread();
				System.out.println(t.isDaemon());//false
				
				t.setDaemon(true);
				System.out.println(t.isDaemon());//true
			}
		}
=============================
--> whenever last non-daemon thread terminates, automatically all daemon threads
		will be terminated, irrespective of their position.
		
		
		
		class MyThread extends Thread{
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("child thread");
					try {
						Thread.sleep(2000L);
					}catch (InterruptedException e) { }
				}
			}
		}
		class DaemonThreadDemo{
			public static void main(String[] args) {
				MyThread t = new MyThread();
				t.setDaemon(true);          ---------> "line 1"
				t.start();
				System.out.println("end of main thread");
			}
		}
o/p             p1                       p2                          p3
			end of main thread        end of main thread           child thread
			child thread                                           end of main thread
			
			
---> if we are commenting "line 1" both main and child threads are non-daemon
		and hence both threads will be executed untill their execution.
---> if we are not commenting "line 1" then main thread is non-daemon and child 
		thread is daemon hence whenever main thread terminates child thread will
		be terminate.
 */
	public static void main(String[] args) { }
}
