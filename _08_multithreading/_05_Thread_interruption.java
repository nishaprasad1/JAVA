package _08_multithreading;

public class _05_Thread_interruption {
/*
 * Q) how a thread can interrupt another Thread?
 * 
 * ans) A thread can interrupt a sleeping or waiting thread by using interrupt()
 * 			method of Thread class
					_____________________________
					| public void interrupt();  |
					+---------------------------+
					
					
					class MyThread extends Thread{
						public void run() {
							try {
								for(int i=0;i<10;i++) {
									System.out.println("I am lazy Thread");
									Thread.sleep(2000L);
								}
							}catch (InterruptedException e) {
								System.out.println("I got Interrupted");
							}			
						}
					}
					class ThreadSleepDemo{
						public static void main(String[] args) {
							MyThread t = new MyThread();
							t.start();
							t.interrupt();                              //----------->"line (1)"
							System.out.println("end of main");
							
						}
					}

Note: if we comment "line (1)" then main thread wont interrupt child thread,
 		in this case child thread will execute for loop 10 times.
 	--> if we are not commenting "line (1)" then main thread interrupts child
         thread, in this case o/p is:

         	end of main
			I am lazy Thread
			I got Interrupted

Note: whenever we are calling interrupt() method, if the target thread not in 
      sleeping or waiting state then there is no impact of interrupt call
      immediately interrupt call will be waited until target thread entered into
      sleeping or waiting state.
  --> if the target thread enters into sleeping or waiting state then immediately
      interrupt call will interrupt the target thread.
  --> if the target thread never entered into sleeping or waiting in its life time
      then there is no impact of interrupt call this is the only case iterrupt
      call will be wasted.
          
          
          class MyThread extends Thread{
			public void run() {
				
				for(int i=0;i<10000;i++) {
					System.out.println("I am lazy Thread-"+i);
				}
				
				System.out.println("I am entering into sleeping state");
				
				try {
					Thread.sleep(20000L);
				}catch (InterruptedException e) {
					System.out.println("I got Interrupted");
				}			
			}
		}
		class ThreadSleepDemo{
			public static void main(String[] args) {
				MyThread t = new MyThread();
				t.start();
				t.interrupt();                              //----------->"line (1)"
				System.out.println("end of main");
				
			}
		}
		
--> in the above example iterrupt call waited until child thread completed for
		loop 10,000 times.
 */
	
	public static void main(String[] args) {}
}
class MyThread_05 extends Thread{
	public void run() {
		
		for(int i=0;i<10000;i++) {
			System.out.println("I am lazy Thread-"+i);
		}
		
		System.out.println("I am entering into sleeping state");
		
		try {
			Thread.sleep(20000L);
		}catch (InterruptedException e) {
			System.out.println("I got Interrupted");
		}			
	}
}
class ThreadSleepDemo{
	public static void main(String[] args) {
		MyThread_05 t = new MyThread_05();
		t.start();
		t.interrupt();                              //----------->"line (1)"
		System.out.println("end of main");
		
	}
}