package _10_multithreading_courses._01_kk_tutorials_multiThreading_programs;
/*
--------> 1. using jconsole
          jps -l -m
          jstack <pId>
          
--------> 2. using jvisualvm          
 */
public class _05_DeadLock_detection {
	public static void main(String[] args) {
		final String resource1 ="chandrakesh";
		final String resource2 ="ramnath";
		
		Thread t1 = new Thread(()->{
			synchronized(resource1) {
				System.out.println("Thread-1 : locked resource 1");

				try {
					Thread.sleep(200L);
				} catch (InterruptedException e) { }

				synchronized(resource2) {
					System.out.println("Thread-1 : locked resource 2");
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			synchronized(resource2) {
				System.out.println("Thread-2 : locked resource 2");

				try {
					Thread.sleep(200L);
				} catch (InterruptedException e) { }

				synchronized(resource1) {
					System.out.println("Thread-2 : locked resource 1");
				}
			}
		});
		
		t1.start();
		t2.start();
		
	}
}
