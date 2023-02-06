package _09_multithreading_enhancement;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class _04_callable_and_future {
/*
 * 1. in the case of runnable job thread won't return anything after completing
 * 		the job.
 * 	---> if a thread is required to return some result after execution then we should
 * 			go for callable. Callable interface containe only one method call().
 * 		_________________________________________
 * 		| public Object call() throws Exception |
 * 		+---------------------------------------+
 * 
 * ---> if we submit callable object to executor then after completing the job 
 * 		thread return object of type Future, ie Future object can be used to 
 * 		reterive result from callable job. 
 
 example:
 class MyCallable implements Callable{
	int num;
	MyCallable(int i){
		this.num=i;
	}
	public Object call() {
		System.out.println(Thread.currentThread().getName()+
				" is responsible to find sum of first "+num+" numbers");
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		return sum;
	}
}
class CallableFutureDemo{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable[] jobs = { new MyCallable(10),
							new MyCallable(20),	
							new MyCallable(30),	
							new MyCallable(40),	
							new MyCallable(50),	
							new MyCallable(60)	
							};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(MyCallable job : jobs) {
			Future f= service.submit(job);
			System.out.println(f.get());
		}
		
		service.shutdown();
	}
}
=========================================================================================
 *
 * Difference b/w Runnable and callable
 * 
				Runnable                |             callable
----------------------------------------+----------------------------------------- 	
 1. if a thread is not required to      |     1. if a thread required to return 
 	return anything after completing    |        something after completing job
 	the job then we should go for		|		then we should go for Callable.	 
 	Runnable.                           | 				
----------------------------------------+-----------------------------------------
 2. Runnable interface contains only    |      2. Callable interface contains only
  	one method run().                   |          one method call().
----------------------------------------+-----------------------------------------
 3. Runnable job not required to return	|	   3. Callable job is required to return
  	anything and hence return type of	|			something and hence return type of
  	run() method is void.               |           call() method is Object.
----------------------------------------+-----------------------------------------
 4. within the run() method if there is |      4. inside call() method if there is
 	any chance of raising checked       |			any chance of raising checked 
 	exception compulsory we should      |          exception we are not required to
 	handle by using try-catch because we|			handle by using try-catch because
 	cannnot use throws keyword for run()|			call method already throws exception.
 	method.                             |
----------------------------------------+-----------------------------------------
 5. Runnable interface present in       |  5. Callable interface present in   
 	java.lang package					|		java.util.concurrent package	
----------------------------------------+-----------------------------------------
 6. introduced in 1.0V                  |  6. introduced in 1.5V      
----------------------------------------+-----------------------------------------

 */
	public static void main(String[] args) { }
}
class MyCallable implements Callable{
	int num;
	MyCallable(int i){
		this.num=i;
	}
	public Object call() {
		System.out.println(Thread.currentThread().getName()+
				" is responsible to find sum of first "+num+" numbers");
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		return sum;
	}
}
class CallableFutureDemo{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable[] jobs = { new MyCallable(10),
							new MyCallable(20),	
							new MyCallable(30),	
							new MyCallable(40),	
							new MyCallable(50),	
							new MyCallable(60)	
							};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(MyCallable job : jobs) {
			Future f= service.submit(job);
			System.out.println(f.get());
		}
		
		service.shutdown();
	}
}