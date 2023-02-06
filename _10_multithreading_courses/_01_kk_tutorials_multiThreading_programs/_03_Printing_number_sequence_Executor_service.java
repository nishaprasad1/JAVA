package _10_multithreading_courses._01_kk_tutorials_multiThreading_programs;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * using 3 Threads print 1 to 10 such that 
t1     t2    t3
1      2     3
4      5     6
7      8     9
10

 */
public class _03_Printing_number_sequence_Executor_service {
	public static void main(String[] args) {
		NumPrinter p = new NumPrinter(3, 10);
		ExecutorService service= null;
		try {
			service = Executors.newFixedThreadPool(3);
			service.submit(()-> p.print(1));
			service.submit(()-> p.print(2));
			service.submit(()-> p.print(0));
		}finally {
			if(Objects.nonNull(service))
				service.shutdown();
		}
	}
}
class NumPrinter{
	private int num =1;
	private final int THREAD_COUNT;
	private final int MAX;
	public NumPrinter(int THREAD_COUNT, int MAX) {
		this.THREAD_COUNT= THREAD_COUNT;
		this.MAX = MAX;
	}
	
	public void print(int modulo) {
		synchronized (this) {
			while(num < MAX -1) {
				while(num % THREAD_COUNT != modulo) {
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
class MyThread extends Thread{
	private Num_Printer printer;
	private int modulo;
	
	public MyThread(Num_Printer printer, int modulo, String tName) {
		super(tName);
		this.printer= printer;
		this.modulo= modulo;
	}
	
	public void run() {
		printer.print(modulo);
	}
}