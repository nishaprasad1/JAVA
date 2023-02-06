package _10_multithreading_courses._01_kk_tutorials_multiThreading_programs;
/*
 * using 3 Threads print 1 to 10 such that 
t1     t2    t3
1      2     3
4      5     6
7      8     9
10

 */
public class _01_Printing_number_sequence_3_threads {
	public static void main(String[] args) {
		Num_Printer p = new Num_Printer(3, 10);
		MyPrinterThread t1 = new MyPrinterThread(p, 1, "Thread-1");
		MyPrinterThread t2 = new MyPrinterThread(p, 2, "Thread-2");
		MyPrinterThread t3 = new MyPrinterThread(p, 0, "Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
class Num_Printer{
	private int num =1;
	private final int THREAD_COUNT;
	private final int MAX;
	public Num_Printer(int THREAD_COUNT, int MAX) {
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
class MyPrinterThread extends Thread{
	private Num_Printer printer;
	private int modulo;
	
	public MyPrinterThread(Num_Printer printer, int modulo, String tName) {
		super(tName);
		this.printer= printer;
		this.modulo= modulo;
	}
	
	public void run() {
		printer.print(modulo);
	}
}