package _10_multithreading_courses._02_multiThreading_udemy_by_Michael_Porgebinsky;

public class _04_Thread_interrupt_a {

	public static void main(String[] args) {
		Thread t1 = new BlockingThread();
		t1.start();
		
		t1.interrupt();// if we are handling InterruptedException, we can directly
					  // call interrupt() method to interrupt t1. 
	}
	
	private static class BlockingThread extends Thread{
		public void run() {
			try {
				Thread.sleep(500000L);
			} catch (InterruptedException e) {
				System.out.println("Exiting blocking thread");
			}
		}
	}
}
