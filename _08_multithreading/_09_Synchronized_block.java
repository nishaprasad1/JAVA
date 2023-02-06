package _08_multithreading;

public class _09_Synchronized_block {
/*
 * 1. if very few lines of code required synchronization then it is not recommended
 * 		to declare entire method as synchronized we have to enclose those few lines 
 * 		of the code by using synchronized block.
 * --> the main advantage of synchronized block over synchronized method is, it
 * 		reduces waiting time of thread and improves performance of the system.
==================================================================================== 
 * 2. we can declare synchronized block as follows:
 * 
  	a) to get lock of current object:
			
			synchronized(this){
				//
			   //
			}
			
			if a thread got lock of current object then only
			it is allowed to executed this area.
			
			eg:-
			class Display{
				public void wish(String name) {
					;;;;;;// 1 lakh lines of code
			
					synchronized (this) {
			
						for(int i =0;i< 10;i++) {
							System.out.print("Good morining: ");
			
							try {
								Thread.sleep(2000L);
							}catch(InterruptedException e){ }
			
							System.out.println(name);
						}
					}
					;;;;;;// 1 lakh lines of code
				}
			}
			class MyThread extends Thread{
				private Display d;
				private String name;
				
				public MyThread(Display d, String name) {
					this.d=d;
					this.name=name;
				}
				public void run() {
					this.d.wish(this.name);
				}
			}
			class MySynchronizedDemo{
				public static void main(String[] args) {
					Display d = new Display();
					MyThread t1 = new MyThread(d, "dhoni");
					MyThread t2 = new MyThread(d, "raina");
					
					t1.start();
					t2.start();
				}
			}
	b) to get lock of particular object 'b':
			
			synchronized(b){
				//
			   //
			}
			
			if a thread got lock of particular object 'b' then
			only it is allowed to execute this aread.
			
	c) to get class level lock:
	
			synchronized(Display.class){
				//
			   //
			}
			
			if thread got class level lock of 'Display' class, then
			only it is allowed to execute this area.
			
			eg:-
			
			class Display{
				public void wish(String name) {
					;;;;;;// 1 lakh lines of code
			
					synchronized (Display.class) {
			
						for(int i =0;i< 10;i++) {
							System.out.print("Good morining: ");
			
							try {
								Thread.sleep(2000L);
							}catch(InterruptedException e){ }
			
							System.out.println(name);
						}
					}
					;;;;;;// 1 lakh lines of code
				}
			}
			class MyThread extends Thread{
				private Display d;
				private String name;
				
				public MyThread(Display d, String name) {
					this.d=d;
					this.name=name;
				}
				public void run() {
					this.d.wish(this.name);
				}
			}
			class MySynchronizedDemo{
				public static void main(String[] args) {
					Display d1 = new Display();
					Display d2 = new Display();
					MyThread t1 = new MyThread(d1, "dhoni");
					MyThread t2 = new MyThread(d2, "raina");
					
					t1.start();
					t2.start();
				}
			}
====================================================================================
 
 * 3. lock concept applicable for object types and class types but not for primitives
 * 		hence we cannot pass primitive type as argument to synchronized block
 * 		otherwise we will get CE saying "unexpected type, found: int, required: reference
			
		class Test{
			public static void main(String[] args) {
				int x =10;
		//		synchronized (x) {//CE:int is not a valid type's argument for the synchronized statement
		//			
		//		}
			}
		}
		
====================================================================================
FAQ's
1. what is synchronized keyword and where we can apply? 
	(method and blocks but not for classes n variables) 
2. explain advantage of synchronized keyword?
	(we can resolve data inconsistency problem)
3. explain disadvantages of synchronized keyword?
	(increases waiting time of thread and create performance problem)
4. what is race condition?
	(if multiple threads are operating simultaneously on same java object
		then may be a chance of data inconsistency problem, this is 
		called race condition, we can overcome this problem by using
		synchronized keyword)
5. what is object lock and when it is required?
	(every object in java has a unique lock which is known as
		object lock, when a thread wants to execute synchronized method or block
		then it has to acquire object lock)
6. what is class level lock and when it is required?
	(every class in java has a unique lock which is known as
		class level lock, when a thread wants to execute static synchronized method
		then it has to acquire class level lock)
7. what is difference b/w object level lock and class level lock?
	()
8. while a thread executing synchronized method on given object is the remaining
	threads are allowed to execute any other synchronized method simultaneously
	on the same object?
ans)	No
9. what is synchronized block?
	()
10. how to declare synchronized block to get lock of current object?
	synchronized(this){
	
	}
11. how to declare synchronized block to get class level lock?
	synchronized(<Class name>.class){
	
	}
12. what is the advantage of synchronized block over synchronized method?
	()
13. is thread can acquire multiple lock simultaneously?
ans) yes, from different objects.

	class X{
		public synchronized void m() {
						-----------------------------> here thread has lock of 'x' object
			Y y = new Y();
			synchronized (y) {
						-----------------------------> here thread has lock of 'x' and 'y' object
				Z z = new Z();
				synchronized (z) {
						-----------------------------> here thread has lock of 'x' and 'y' and 'z' object
				}
			}
		}
	}
	class Y{}
	class Z{}
	class Test{
		public static void main(String[] args) {
			X x = new X();
			Thread t = new Thread(()->{
				x.m();
			});
		}
	}	

14. what is synchronized statement?
ans) interview people created terminology,
	the statements present in synchronized method and synchronized block are 
	called synchronized statements.
 */
	public static void main(String[] args) {}
}