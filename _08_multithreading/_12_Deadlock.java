package _08_multithreading;

public class _12_Deadlock {
/*
 * 1. if two threads are waiting for each other forever such type of infinite
 * 		waiting is called deadlock.
 * 
 * 2. synchronized keyword is the only reason for deadlock situation, hence
 * 		while using synchronized keyword we have to take special care.
 * --> there are no resolution technique for deadlock but several prevention 
 * 		technique are available.

example:
				class A{
					public synchronized void d1(B b) {
						System.out.println("Thread1 starts execution of d1() method");
						try {
							Thread.sleep(6000L);
						}catch (InterruptedException e) { }
						System.out.println("Thread1 trying to call B's last()");
						b.last();
					}
					public synchronized void last() {
						System.out.println("Inside A, this is last() method");
					}
				}
				
				class B{
					public synchronized void d2(A a) {
						System.out.println("Thread2 starts execution of d1() method");
						try {
							Thread.sleep(6000L);
						}catch (InterruptedException e) { }
						System.out.println("Thread2 trying to call A's last()");
						a.last();
					}
					public synchronized void last() {
						System.out.println("Inside A, this is last() method");
					}
				}
				class DeadLock extends Thread{
					private A a = new A();
					private B b = new B();
					
					public void m() {
						this.start();
						a.d1(b);// this line is executed by main thread
					}
					public void run() {
						b.d2(a);// this line is executed by child thread
					}
					
					public static void main(String[] args) {
						DeadLock d = new DeadLock();
						d.m();
					}
				}


--> in the above program if we remove atleast one synchronized keyword, then
 		the program won't enter into deadlock. hence synchronized keyword is the
 		only reason for deadlock situation, due to this while using synchronized
 		keyword we have to take special care.

===============================================================================================
 			 			Deadlock vs starvation
1. long waiting of a thread were waiting never ends is called deadlock,
		whereas long waiting of a thread waiting ends at certain point is called
		starvation.
	eg:- low priority thread has to wait until completing all high priority
			threads, it may be long waiting but ends at certain point, which
			is nothing but starvation.
 		

 */
	public static void main(String[] args) { }
}
