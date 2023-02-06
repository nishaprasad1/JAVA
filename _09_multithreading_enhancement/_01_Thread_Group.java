package _09_multithreading_enhancement;

public class _01_Thread_Group {
/*
 * 1. based on functionality we can group threads into a single unit which is
 * 		nothing but thread group, that is thread group contains a group of threads
 * 		in addition to threads thread group can also contain sub thread groups.

			+---------------------------------------+
			|     ~~>t1   ~~>t2 ...  ~~>tn          |
			|                                       |
			|  +-----------------+                  |
			|  |      ~~>t2      |                  |                                                            
			|  | ~~>t1     ~~>t7 |                  |
			|  +-----------------+                  |
			|	   sub Thread        +----------+   |
			|	    group            |  ~~>t1   |   |
			|	                     |	~~>t2	|   |
			|	                     +----------+   |
			|										|
			+---------------------------------------+
						Thread Group
						
 * 2. the main advantage of maintaining thread in the form of thread groups is 
 * 		we can perform common operations very easily.
 *
 * 3. every thread in java belongs to some group, main thread belongs to main
 * 		group.
 * --> every thread in java is the child group of system group either directly or
 * 		indirectly hence system group acts as root for all thread groups in java.
 * --> system group contains several system level threads like:
 * 		Finalizer, Reference handler, signal dispatcher, attach listner

					       Signal dispatcher
					        /
					+------/-----+
					|	System  -+------Reference handler
					+--|-------\-+
				   /   |        \     
				  /   Finalizer  \
				 /               Attach Listener 
			+-----------------+
			|main thread group|	
			+/---|----------\-+
			/    |           \
		   /    Thread-0 ...  \
		  /                    \
	 Main Thread             +---------------+
	                         | SubThreadGroup|
	                         +---------------+
			
class Test{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());//main
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());//system
	}
}
=================================================================================
 * 4. ThreadGroup is a java present in java.lang package and it is the direct
 * 		child class Object.
=================================================================================
Constructors:  +----------------------------------------------+
			1. |ThreadGroup g = new ThreadGroup(String gName);|
			   +----------------------------------------------+
--> creates a new thread group with the specified group name,the parent of this
		new group is the thread group of currently executing thread.
		
		class Test{
			public static void main(String[] args) {
				ThreadGroup g = new ThreadGroup("First Group");
				System.out.println(g.getName());                //First Group
				System.out.println(g.getParent().getName());   //main
			}
		}
   +-----------------------------------------------------------------------+		
2. | ThreadGroup g1 = new ThreadGroup(ThreadGroup parentGrp, String gName);|
   +-----------------------------------------------------------------------+
--> creates a new thread group with a specified group name, the parent of this 
   		new thread group is the specified parent group.

class Test{
	public static void main(String[] args) {
		ThreadGroup g = new ThreadGroup("First Group");
		System.out.println(g.getParent().getName());//main

		ThreadGroup gChild = new ThreadGroup(g,"Second Group");
		System.out.println(gChild.getParent().getName());//First Group
	}
}
                         
in above program:  system--->main--->First Group--->Second Group
===================================================================================
Important methods of ThreadGroup class:
1. String getName():  returns name to the thread group.
---------------------------------------------------------------
2. int getMaxPriority(): returns max priority of thread group.
---------------------------------------------------------------
3. void setMaxPriority(int p): to set maximum priority of thread group. The default
  								max priority is 10.
--> threads is the thread group that already have higher priority won't be affected
      but for newly added thread this max priority is applicable.
      
class Test{
	public static void main(String[] args) {
		ThreadGroup g1 = new ThreadGroup("First Group");
		                                -------------> parent main thread(p=5)
		Thread t1 = new Thread(g1, "Thread1");
		Thread t2 = new Thread(g1, "Thread2");
		g1.setMaxPriority(3);
		Thread t3 = new Thread(g1, "Thread3");
		
		System.out.println(t1.getPriority());//5
		System.out.println(t2.getPriority());//5
		System.out.println(t3.getPriority());//3  minimum(thread group max priority,
															parent thread priority here it is main thread(p=5))
		
	}
}        								  									
----------------------------------------------------------------------------------
4. ThreadGroup getParent(): returns parent group of current thread.
----------------------------------------------------------------------------------
5. void list(): it prints information about thread group to the console.
----------------------------------------------------------------------------------
6. int activeCount(): return number of active threads present in the thread group.
----------------------------------------------------------------------------------
7. int activeGroupCount(): it returns number of active thread groups present in 
							the current thread group.
----------------------------------------------------------------------------------
8. int enumerate(Thread[] t): to copy all active threads of this thread group into
								provided thread array. In this case subGroup threads
								will also be considered.
----------------------------------------------------------------------------------
9. int enumerate(ThreadGroup[] g): to copy all active sub thread groups into provided
									ThreadGroup array.
----------------------------------------------------------------------------------
10. boolean isDaemon(): to check whether the ThreadGroup is Daemon.
----------------------------------------------------------------------------------
11. void setDaemon(boolean b): to change Daemon nature of ThreadGroup.
----------------------------------------------------------------------------------
12. void interrupt(): to interrupt all waiting or sleeping threads in ThreadGroup.
----------------------------------------------------------------------------------
13. void destroy(): to destroy ThreadGroup and its sub ThreadGroups.
----------------------------------------------------------------------------------
example:                     
class Test{                                                                      +-------+
	public static void main(String[] args) throws Exception {                    |system |
																				 +-|-----+		
		ThreadGroup pg = new ThreadGroup("Parent Group");                          |
		ThreadGroup cg = new ThreadGroup(pg,"Child Group");                       \|/ 
		                                                                          +-----+
		MyThread t1 = new MyThread(pg, "ChildThread1");                           |main |
		MyThread t2 = new MyThread(pg, "ChildThread2");                           +-|---+
		t1.start();                                                                 |
		t2.start();                                                                \|/
		                                                                          +-------------+
		System.out.println(pg.activeCount());                                     | Parent Group|
		System.out.println(pg.activeGroupCount());                                +-|---|-------+
		pg.list();                                                                  |   +---> childThread1
		Thread.sleep(10000L);                                                      \|/  +---> childThread2 
		                                                                          +-------------+
		System.out.println(pg.activeCount());                                     | Child Group |
		System.out.println(pg.activeGroupCount());                                +-------------+
		pg.list();
		
	}
}
o/p
2
1
java.lang.ThreadGroup[name=Parent Group,maxpri=10]
    Thread[ChildThread1,5,Parent Group]
    Thread[ChildThread2,5,Parent Group]
    java.lang.ThreadGroup[name=Child Group,maxpri=10]
chilld thread
chilld thread
0
1
java.lang.ThreadGroup[name=Parent Group,maxpri=10]
    java.lang.ThreadGroup[name=Child Group,maxpri=10]
================================================================================================================
Q) write a program to display all active thread names belongs to system group
 	and its child groups?
Answer)

 	class MyThread extends Thread{
		MyThread(ThreadGroup g, String tName){
			super(g,tName);
		}
		public void run() {
			System.out.println("chilld thread");
			try {
				Thread.sleep(5000L);
			} catch (InterruptedException e) { }
		}
	}
	class Test{
		public static void main(String[] args) throws Exception {
			
			ThreadGroup systemGroup = 
					Thread.currentThread()
					.getThreadGroup()
					.getParent();
			Thread[] t= new Thread[systemGroup.activeCount()];
			systemGroup.enumerate(t);
			
			for(Thread t1 : t) {
				System.out.println(t1.getName()+" is Daemon? "+t1.isDaemon());
			}
		}
	}
	
o/p:	
Reference Handler....true
Finalizer....true
Signal Dispatcher....true
Attach Listener....true
Notification Thread....true
main....false
Common-Cleaner....true

 */
	public static void main(String[] args) {}
}
class Test_01{
	public static void main(String[] args) throws Exception {
		
		ThreadGroup systemGroup = 
				Thread.currentThread()
				.getThreadGroup()
				.getParent();
		Thread[] t= new Thread[systemGroup.activeCount()];
		systemGroup.enumerate(t);
		
		for(Thread t1 : t) {
			System.out.println(t1.getName()+"...."+t1.isDaemon());
		}
	}
}