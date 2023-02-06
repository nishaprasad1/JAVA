package _10_multithreading_courses._02_multiThreading_udemy_by_Michael_Porgebinsky;

public class _02_Thread_inheritance {

	public static void main(String[] args) {
		Thread t1 = new NewThread();
		t1.start();
		
	}
	
	private static class NewThread extends Thread{
		public void run() {//job
			System.out.println(this.getName()+" in action, with priority: "+
								this.getPriority());
		}
	}
}
