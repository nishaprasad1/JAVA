package _09_multithreading_enhancement;

public class _05_Thread_Local {
/*
	1. ThreadLocal class provides thread local variables.
--> ThreadLocal class maintains values per thread basis.
--> each ThreadLocal object maintains a separate value like userId, txnId etc
		for each thread that accesses that object.
--> thread can access its local value, can manipulate its value and even can 
	remove its value.
--> in every part of the code which is executed by the thread we can access its
	local variable.
--> consider a servlet which invokes some business methods we have a requirement
	to generate a unique transaction id  for each and every request and we have to
	pass this transaction id to the bussiness methods for this requirement we can 
	use ThreadLocal to maintain a separate transaction id for every request
	ie, for every thread.

Note: ThreadLocal class introduced in 1.2V and enhanced in 1.5V, ThreadLocal can
	 	be associated with thread scope, total code which is executed by thread
	 	has access to the corresponding local variables.
--> a thread can access its own local variables and cannot access other thread
 	 	variables.
--> once thread entered into dead state all its local variable are by default
 	 	eligible for garbage collection.
 	 	
-----------------------------------------------------------------------------------------------
constructor:  ________________________________________
 	 	      | ThreadLocal tl = new ThreadLocal();  |
 	 	      +--------------------------------------+

methods:
1. Object get():  returns the value of thread local variable associated with
 	 	      		current thread.
 	 	      		
2. Object initialValue(): returns initial value of threadlocal variable associated with
	 	      				current thread.
	 	      			--> the default implementaion of this method returns null.
	 	      			--> to customise our own initial value we have to override
	 	      			 	this method.
	 	      			 	
3. void set(Object newValue): to set a new value.

4. void remove(): to remove the value of ThreadLocal variable associated with
	 	      		current thread.
	 	      	--> it is newly added method in 1.5V
	 	      	--> after removal if we are trying to access threadLocal variable
	 	      	  	it will be re-initialized by invoking its initialValue() 
	 	      	  	method. 
=============================================================================================
example 1:
 class ThreadLocalDemo1{
	public static void main(String[] args) {
		ThreadLocal local = new ThreadLocal();
		
		System.out.println(local.get());// null
		
		local.set("chandrakesh");
		System.out.println(local.get());//chandrakesh
		
		local.remove();
		System.out.println(local.get());//null
	}
}
---------------------------
example 2: overriding of initailValue() method.

class ThreadLocalDemo1{
	public static void main(String[] args) {
		ThreadLocal local = new ThreadLocal() {

			@Override
			protected Object initialValue() {
				return "abc";
			}
			
		};
		
		System.out.println(local.get());// null
		
		local.set("chandrakesh");
		System.out.println(local.get());//chandrakesh
		
		local.remove();
		System.out.println(local.get());//null
	}
}
------------------------------------
example 3:
class CustomerThread extends Thread{
	private static Integer custId=0;
	private ThreadLocal<Integer> local = new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return ++custId;
		}
	};
	
	public CustomerThread(String tName) {
		super(tName);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()
				+" executing with customer id: "+local.get());
	}
}
class ThreadLocalDemo2{
	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("Customer-Thread-1");
		CustomerThread c2 = new CustomerThread("Customer-Thread-2");
		CustomerThread c3 = new CustomerThread("Customer-Thread-3");
		CustomerThread c4 = new CustomerThread("Customer-Thread-4");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}
}

Note: in the above program for every customer thread a separate customer id will
	 	be maintained by threadLocal object.
 */
	public static void main(String[] args) { }
}
class CustomerThread extends Thread{
	private static Integer custId=0;
	private ThreadLocal<Integer> local = new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return ++custId;
		}
	};
	
	public CustomerThread(String tName) {
		super(tName);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()
				+" executing with customer id: "+local.get());
	}
}
class ThreadLocalDemo2{
	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("Customer-Thread-1");
		CustomerThread c2 = new CustomerThread("Customer-Thread-2");
		CustomerThread c3 = new CustomerThread("Customer-Thread-3");
		CustomerThread c4 = new CustomerThread("Customer-Thread-4");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}
}