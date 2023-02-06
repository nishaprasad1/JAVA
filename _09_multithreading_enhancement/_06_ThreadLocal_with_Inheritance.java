package _09_multithreading_enhancement;

public class _06_ThreadLocal_with_Inheritance {
/*
	ThreadLocal vs  Inheritance
--> parent thread's ThreadLocal variable by default not available to the child
			thread.
--> if we want to make parent thread local value available to the child thread
		then we should go for InheritableThreadLocal class.
--> by default child thread local value is exactly same as parent threads value
 		but we can provide customised value for child thread local by overriding
 		childValue() method.
 		
Constructor:    _____________________________________________________________
 				| InheritableThreadLocal tL = new InheritableThreadLocal(); |
 				+-----------------------------------------------------------+
 				
Methods:
--> InheritableThreadLocal is child class of ThreadLocal and hence all methods
 	present in ThreadLocal by defaut available to InheritableThreadLocal.
--> in addition to these methods it contains only one method childValue().	
	   	________________________________________________
	   	| public Object childValue(Object childValue); |
	   	+----------------------------------------------+
==================================================================================
case1:
class ParentThread extends Thread{
	public static ThreadLocal local = new ThreadLocal();
	
	public void run() {
		local.set("pp");
		System.out.println("parent thread value--"+local.get());//pp
		ChildThread ct = new ChildThread();
		ct.start();
	}
}
class ChildThread extends Thread{
	public void run() {
		System.out.println("child thread value--"+ParentThread.local.get());// null
	}
}
class ThreadLocalDemo3{
	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}
}	   	
==================================================================================
case 2
class ParentThread extends Thread{
	public static InheritableThreadLocal local = new InheritableThreadLocal();
	
	public void run() {
		local.set("pp");
		System.out.println("parent thread value--"+local.get());//pp
		ChildThread ct = new ChildThread();
		ct.start();
	}
}
class ChildThread extends Thread{
	public void run() {
		System.out.println("child thread value--"+ParentThread.local.get());//pp
	}
}
class ThreadLocalDemo3{
	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}
}
==================================================================================
case 3:
class ParentThread extends Thread{
	public static InheritableThreadLocal local = new InheritableThreadLocal() {

		@Override
		protected Object childValue(Object parentValue) {
			return "cc";
		}
		
	};
	
	public void run() {
		local.set("pp");
		System.out.println("parent thread value--"+local.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}
class ChildThread extends Thread{
	public void run() {
		System.out.println("child thread value--"+ParentThread.local.get());
	}
}
class ThreadLocalDemo3{
	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}
}

Note:
--> in the above program if we replace InheritableThreadLocal with ThreadLocal
	and if we are not overriding childValue() method then the o/p is:    (case 1) 
		parent thread value--pp
		child thread value--null
		
--> in the above program if we are maintaining InheritableThreadLocal and if we
	are not overriding childValue() method then the o/p is:    (case 2)
		parent thread value--pp
		child thread value--pp

 */
	public static void main(String[] args) { }
}
class ParentThread extends Thread{
	public static InheritableThreadLocal local = new InheritableThreadLocal() {

		@Override
		protected Object childValue(Object parentValue) {
			return "cc";
		}
		
	};
	
	public void run() {
		local.set("pp");
		System.out.println("parent thread value--"+local.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}
class ChildThread extends Thread{
	public void run() {
		System.out.println("child thread value--"+ParentThread.local.get());
	}
}
class ThreadLocalDemo3{
	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}
}