package _09_multithreading_enhancement;

public class _02_java_util_concurrent_package {
/*
 *  Problems with traditional synchronized keyword:
 *  1. we are not having any flexibility to try for a lock without waiting.
 *  2. there is no way to specify maximum waiting time for a thread to get
 *  	lock so that thread will wait until getting lock which may create
 *  	performance problems or cause deadlock.
 *  3. if a thread releases lock then which waiting thread will get that lock
 *  	 we are not having control on this.
 *  4. there is no Api to list out all waiting thread for a lock.
 *  5. the synchronization keyword compulsary we have to use either at method
 *  	level or within a method and it is not possible to use accross multiple
 *  	methods.
 *  --> to overcome these problems SUN people introduced java.util.concurrent.locks
 *  	package in 1.5V, it also provides several enhancements to the programmer
 *  	to provide more control on concurrency.
====================================================================================
		Lock(I)
--> Lock object is similar to implicit lock acquired by a thread to execute 
		synchronized method or synchronized block. Lock implementions provides
		 more extensive operations than traditional implicit locks.
-------------
Important methods of Lock(I) interface: 
1. void lock(): we can use this method to acquire a lock, if lock is available
		 		then immediately current thread will get lock. If the is not
		 		available then it will wait until getting the lock. It is exactly
		 		same behaviour of traditional synchronized keyword.
-------------
2. boolean tryLock(): to acquire the lock without waiting, if the lock is available
		 				then the thread acquired the lock and returns true.
		 			if the lock is not available then this method returns false
		 			and continue its execution without waiting, in this case
		 			thread will never enter into waiting state.
		 			
		 			if(l.tryLock()){
		 				preform safe operations
		 			}else{
		 				perform alternate operations
		 			}
-------------		 			
3. boolean tryLock(long time, TimeUnit unit): 
			if lock is available then thread will get lock and continue its execution,
			if the lock is not available then the thread will wait until specified
			amount of time, still lock is not available then thread can continue its
			execution.
				if(l.tryLock(1000, TimeUnit.MILLISECONDS)){
				
				}
				
TimeUnit: it is enum present in java.util.concurrent package  
			 enum TimeUnit{
				NANOSECONDS,
				MICROSECONDS,
				MILLISECONDS,
				SECONDS,
				MINUTES,
				HOURS,
				DAYS;
			}												
-------------
4. void lockInterruptibly():
		 			acquires the lock if it is available and returns immediately.
		 			if the lock is not available then it will wait, while waiting
		 			if the thread is interrupted then the thread won't get the lock.
-------------
5. void unLock(): 
		 		to release the acquired lock.
---> to call this method compulsary current thread should be owner of the lock
		 		otherwise we will get RE saying IllegalMonitorStateException.
======================================================================================

		 		ReentrantLock(C)
--> it is a implementation class of Lock interface and it is direct child class
		 		of Object.
--> reentrant means a thread can acquire same lock multiple times without any 
	issue, internally reentrant lock increments threads personal count whenever
	we call lock() method and decrements count value whenever thread calls 
	 unlock() method, and the lock will be released whenever count reaches zero.
	 
Constructors:
1. ReentrantLock l = new ReentrantLock();
--> creates an instance of reentrantLock

  	 
2. ReentrantLock l = new ReentrantLock(boolean fairness);
--> creates reentrantLock with the given fairness policy,if the fairness is true
  	 then longest waiting thread can acquire the lock if it is available, that is
  	 it follows first come first serve policy (FCFS). If fairness is false then 
  	 which waiting thread will get chance we cannot expect.
  	 
Note: the default value for fairness is false.

Question) which of the following declarations are equal?
a)ReentrantLock lock = new ReentrantLock();
b)ReentrantLock lock = new ReentrantLock(true);
c)ReentrantLock lock = new ReentrantLock(false);
d) all of the above
answer) a & c
========================================================================================
Important methods of ReentrantLock class:
1. void lock();                      --------+  
2. boolean tryLock();                        |
3. boolean tryLock(long l, TimeUnit t);      |---> from Lock interface 
4. void lockInterruptibly();                 |
5. void unlock();                    --------+
  	 
6. int getHoldCount():
--> returns number of holds on this lock by current thread.

7. boolean isHeldByCurrentThread():
--> return true if and only if lock is hold by current thread.

8. int getQueueLength():
--> returns number of threads waiting for the lock.

9. Collection getQueuedThreads():
--> it returns collection of threads which are waiting to get lock.

10. boolean hasQueuedThreads():
--> returns true if any thread waiting to get lock.

11. boolean isLocked():
--> returns true if lock is acquired by some thread.

12. boolean isFair():
--> returns true if the fairness policy is with true value.

13. Thread getOwner():
--> returns the Thread which acquires the lock.

===================================================================================
example 1)
class Display{
	ReentrantLock l = new ReentrantLock();
	public void wish(String name) {
		l.lock();               //---------->"line 1"
		for(int i=0;i<10;i++) {
			System.out.print("good morning: ");
			try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) { }
			System.out.println(name);
		}
		l.unlock();            //---------->"line 2"
	}
}

class ReentrantDemo1{
	public static void main(String[] args) {
		Display d = new Display();
		Thread t1 = new Thread(()-> d.wish("dhoni"));
		Thread t2 = new Thread(()-> d.wish("yuvraj"));
		Thread t3 = new Thread(()-> d.wish("kholi"));
		
		t1.start();
		t2.start();
		t3.start();
	}
}
Note: if we comment "line 1" & "line 2" then the threads will be executed simultaneously
		and we will get irregular o/p.
----> if we are not commenting "line 1" and "line 2" then the threads will be executed
		one by one and we will get regular o/p.
===================================================================================
Demo program for tryLock() method

class MyThread extends Thread{
	static ReentrantLock l = new ReentrantLock();
	
	public MyThread(String tName) {
		super(tName);
	}
	public void run() {
		if(l.tryLock()) {
			System.out.println(Thread.currentThread().getName()
					+"...got lock and performing safe operation");
			try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) { }
			l.unlock();
		}else {
			System.out.println(Thread.currentThread().getName()
					+"...unable to get lock and hence performing alternate operations");
		}
	}
}

class ReentrantDemo1{
	public static void main(String[] args) {
		MyThread t1 = new MyThread("First Thread");
		MyThread t2 = new MyThread("Second Thread");
		
		t1.start();
		t2.start();
	}
}

o/p:
First Thread...got lock and performing safe operation
Second Thread...unable to get lock and hence performing alternate operations

===================================================================================
important example:
class MyThread extends Thread{
	static ReentrantLock l = new ReentrantLock();

	public MyThread(String tName) {
		super(tName);
	}
	public void run() {
		do {
			try {
				if(l.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName()+"...got lock");
					Thread.sleep(30000L);
					System.out.println(Thread.currentThread().getName()+"...releasing lock");
					l.unlock();
					break;
				}else {
					System.out.println(Thread.currentThread().getName()
							+"...unable to get lock and will try again");
				}
			} catch (InterruptedException e) { }
		}while(true);
	}

}

class ReentrantDemo1{
	public static void main(String[] args) {
		MyThread t1 = new MyThread("First Thread");
		MyThread t2 = new MyThread("Second Thread");
		
		t1.start();
		t2.start();
	}
}
o/p:
First Thread...got lock
Second Thread...unable to get lock and will try again
Second Thread...unable to get lock and will try again
Second Thread...unable to get lock and will try again
Second Thread...unable to get lock and will try again
Second Thread...unable to get lock and will try again
First Thread...releasing lock
Second Thread...got lock
Second Thread...releasing lock
 */
	public static void main(String[] args) { }
}
