package _08_multithreading;

public class _10_Inter_thread_communication {
/*
 * 1. two threads can communicate with each other by using wait(), notify(),
 * 		notifyAll() methods.
 * 2. the thread which is waiting updation is responsible to call wait() method,
 * 		then immediately the thread will enter into waiting state.
 * 	--> the thread which is responsible to perform updation, after performing
 * 		updation it is responsible to call notify() method then waiting thread 
 * 		will get that notification and continue its execution with those
 * 		updated items.
 * 
 * 3. wait(), notify(), notifyAll() methods present in Object class but no in
 * 		Thread class because thread can call these methods on any java object.
 * 
 * 4. to call wait(), notify(), notifyAll() methods on any object thread should be
 * 		owner of that object ie, thread should have lock of that object, that is 
 * 		the thread should be inside synchronized area.
 * 		Hence we can call wait(), notify(), notifyAll() methods only form synchronized
 * 		area otherwise we will get RE saying "IllegalMonitorStateException".
 * 
 * 5. if a thread calls wait() method on any object it immediately releases the lock
 * 		of that particular object and enter into waiting state.
 * --> if a thread calls notify() method on any object it releases the lock of that object
 * 		but may not immediately, except wait(), notify(), notifyAll() there not other
 * 		method were thread releases the lock.

		method         |       is thread releases lock?
		---------------+---------------------------------
		yeild()        |   No
		---------------+--------------------------------- 
		join()         |   No
		---------------+--------------------------------- 
		sleep()        |   No
		---------------+--------------------------------- 
		wait()         |   Yes
		---------------+--------------------------------- 
		notify()       |   Yes
		---------------+--------------------------------- 
		notifyAll()    |   Yes
		---------------+--------------------------------- 
 *
 *  Q) which of the following is valid?
 * 		i) if a thread call wait() method immediately it will enter into waiting state
 * 			without releasing any lock? (invalid)
 * 		ii) if a threas call wait() method on any object it releases the lock that
 * 			of object but may not immediately? (invalid)
 * 		iii)if a thread calls wait() method on any object it releases all locks
 * 			 acquired by that thread and immediately enter into waiting state? (invalid)
 * 		iv) if a thread calls wait() method on any object it immediately releases
 * 			the lock of that particular object and enter into waiting state? (valid)
 * 		v) if a thread calls notify() method on any object it immediately releases
 * 			the lock of that particular object? (invalid)
 * 		vi) if a thread calls notify() method on any object it releases the lock but 
 * 			may not immediately? (valid)
 * 
========================================================================================

	_____________________________________________________________________________
	|    public final void 	wait() throws InterruptedException        	  		| 
	|    public final void 	wait(long ms) throws InterruptedException       	| 
	|    public final void 	wait(long ms, int ns) throws InterruptedException   |
	+---------------------------------------------------------------------------+
	|    public final native void notify()										|  
	|    public final native void notifyAll()   								|
	+---------------------------------------------------------------------------+
	
Note: every wait() method throws InterruptedException which is checked exception
		hence whenever we are using wait() method compulsary we should handle
		this checked exception either by try-catch or by throws keyword, otherwise
		we will get CE.
========================================================================================


      													              ________________
	      	                           			   	        		  |    	         |
	      	                                         +<<<-------------| waiting state|<----------+
      	                                             |                |______________|         	/|\
      	                                             |                                           |   
      	                                             |1.if waiting thread get notification. (or) |  obj.join();
      	                                             |2.if time expires. (or)                    |  obj.join(1000);
      	                                             |3.if waiting thread got interrupted.       |  obj.join(1000,100);
      	                                             |                                           |
      	                                            \|/                                          |
      	                                 +------------------------------+                        |
      	                                 |another waiting state         |                        |
      	                                 |(to get lock on that object)  |                        |                                       
      	                                 +------------------------------+                        |                                       
      	                                             |                                           |                                       
      	                                             |                                           |                                       
      	      MyThread t = new MyThread();          \|/                                          |                         +-------+
	      +-------------+                         +--|----------+                          +-----|---+    if run()        |       | 
	      |  New/       |          t.start();     | Ready/      |  if Thread scheduler     | Running |------------------->| Dead  |        
	      |  Born       |------------------------>| Runnable    |------------------------->|         | method completes   |       |
	      +-------------+                         +-------------+    allocates processor   +---------+                    +-------+

--------------------------------------------------------------------------------
example1:

class ThreadB extends Thread{
	int total=0;
	public void run() {
		synchronized (this) {
			for(int i=1;i<=100;i++)
				total+=i;
		}
	}
}
class ThreadA{
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {

			try {
				b.wait();
			} catch (InterruptedException e) {	}
		}
		System.out.println(b.total);
	}
}
--------------------------------------------------------------------------------
			
 */
	public static void main(String[] args) {}
}
class ThreadB extends Thread{
	int total=0;
	public void run() {
		synchronized (this) {
			System.out.println("child thread starts calculation");
			for(int i=1;i<=100;i++)
				total+=i;
			
			System.out.println("child thread trying to give notification");
			this.notify();
		}
	}
}
class ThreadA{
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("main thread trying to call wait() method");
			try {
				b.wait(1000L);
				System.out.println("main thread got notification");
				System.out.println(b.total);
			} catch (InterruptedException e) {	}
		}
	}
}