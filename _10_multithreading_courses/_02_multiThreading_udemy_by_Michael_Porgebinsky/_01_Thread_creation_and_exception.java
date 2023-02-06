package _10_multithreading_courses._02_multiThreading_udemy_by_Michael_Porgebinsky;

public class _01_Thread_creation_and_exception {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+" in action");
//		1. Thread creation
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" in action");
			}
		});
		myThread.start();
		System.out.println(Thread.currentThread().getName()+" in action");
		
//		2. Thread re-naming
		Thread t1 = new Thread(()->{
			System.out.println(Thread.currentThread().getName()+" in action");
		},"new worker thread");
		t1.start();
//		Thread.sleep(200L);
		t1.setName("thunder");
		
//		3. priority(1 - 10)
		Thread t2 = new Thread(()->{},"superman");
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		
//		4. exception handling
		Thread t3 = new Thread(()->{
			System.out.println(Thread.currentThread().getName()+
					" is going to throw exception");
			throw new RuntimeException("Intentional exception");
		},"romeo-thread");
		
		t3.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.err.println("A critical error happened in thread: "+t.getName()+
						" and the error: "+e.getMessage());
			}
		});
		
		t3.start();
	}
}
