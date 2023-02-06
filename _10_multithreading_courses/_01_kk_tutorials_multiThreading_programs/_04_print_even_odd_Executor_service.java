package _10_multithreading_courses._01_kk_tutorials_multiThreading_programs;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * using 2 Threads print even and odd numbers as below 
	t1          t2
	1			2
	3			4
	5			6
	7			8
	9			10
 */
public class _04_print_even_odd_Executor_service {

	public static void main(String[] args) {
		PrinterCls myPrinter = new PrinterCls(20);
		ExecutorService service = null;
		
		try {
			service = Executors.newFixedThreadPool(2);
			service.submit(()->myPrinter.print(1));
			service.submit(()->myPrinter.print(0));
		} finally {
			if(Objects.nonNull(service))
				service.shutdown();
		}
	}
}
class PrinterCls{
	private int num =1;
	private final int MAX;
	public PrinterCls(int MAX) {
		this.MAX = MAX;
	}
	public void print(int modulo) {
		synchronized (this) {
			while(num < MAX) {
				while(num % 2 != modulo) {
					try {
						wait();
					} catch (InterruptedException e) { }
				}
				System.out.println(Thread.currentThread().getName()+"-->"+num++);
				notifyAll();
			}
		}
	}
}