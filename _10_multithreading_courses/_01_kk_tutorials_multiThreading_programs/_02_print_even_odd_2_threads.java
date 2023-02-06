package _10_multithreading_courses._01_kk_tutorials_multiThreading_programs;
/*
 * using 2 Threads print even and odd numbers as below 
	t1          t2
	1			2
	3			4
	5			6
	7			8
	9			10
 */
public class _02_print_even_odd_2_threads {

	public static void main(String[] args) {
		Printer myPrinter = new Printer(20);
		Thread t1 = new Thread(()-> myPrinter.print(1), "Thread-1");
		Thread t2 = new Thread(()-> myPrinter.print(0), "Thread-2");
		
		t1.start();
		t2.start();
	}
}
class Printer{
	private int num =1;
	private final int MAX;
	public Printer(int MAX) {
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