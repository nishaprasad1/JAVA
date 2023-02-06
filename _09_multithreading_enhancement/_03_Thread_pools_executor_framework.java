package _09_multithreading_enhancement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _03_Thread_pools_executor_framework {
/*
 * 1. creating a new thread for every job may create performance and memory
 * 		problems, to over come this we should go for thread pool.
 * 2. thread pool is a pool of already created threads ready to do our jobs.
 * 3. java 1.5V inntroduces thread pool framework to implement thread pools.
 * 4. thread pool framework is also known as executor framework.
 * 5. we can create a thread pool as follows:
 * 			______________________________________________________________
 * 			| ExecutorService service = Executors.newFixedThreadPool(3); |	
 * 	        +------------------------------------------------------------+
 * 
 * 6. we can submit a runnable job by using submit() method.
 * 			_________________________
 *          | service.submit(job);  |
 *          +-----------------------+
 * 7. we can shutdown executor service by using shutdown() method.
 * 			_________________________
 * 			|  service.shutdown();  |
 * 			+-----------------------+

====================================================================================
example:

class PrintJob implements Runnable{
	String name;
	public PrintJob(String name) {
		this.name=name;
	}
	public void run() {
		System.out.println(name+"...job started by thread: "
					+Thread.currentThread().getName());
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) { }
		System.out.println(name+"...job completed by thread: "
				+Thread.currentThread().getName());
	}
}
class ExecutorDemo{
	public static void main(String[] args) {
		PrintJob[] jobs = {	new PrintJob("durga"),
							new PrintJob("anil"),
							new PrintJob("ramnath"),
							new PrintJob("maya"),
							new PrintJob("nisha"),
							new PrintJob("neha"),
							}; 
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(PrintJob job : jobs)
			service.submit(job);
		
		service.shutdown();
	}
}

--> in the above example 3 threads are responsible to execute 6 jobs so that a
		single thread can be reused for multiple jobs.
		
--> while designing webservers and application servers we can use threadpool
		 concept.
 */
	public static void main(String[] args) { }
}
class PrintJob implements Runnable{
	String name;
	public PrintJob(String name) {
		this.name=name;
	}
	public void run() {
		System.out.println(name+"...job started by thread: "
					+Thread.currentThread().getName());
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) { }
		System.out.println(name+"...job completed by thread: "
				+Thread.currentThread().getName());
	}
}
class ExecutorDemo{
	public static void main(String[] args) {
		PrintJob[] jobs = {	new PrintJob("durga"),
							new PrintJob("anil"),
							new PrintJob("ramnath"),
							new PrintJob("maya"),
							new PrintJob("nisha"),
							new PrintJob("neha"),
							}; 
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(PrintJob job : jobs)
			service.submit(job);
		
		service.shutdown();
	}
}