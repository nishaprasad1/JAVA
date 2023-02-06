package _06_OOP;

public class _29_Singleton_class {
/*
 * 1. for any java class if we allowed to create only one object such type of class
 *    is called as singleton class, eg:-Runtime,ServiceLoader etc.
 * Advantages:-
 * a) if several people have same requirement then it is not recommended to create 
 * 		separate object for every requirement.
 * 		we have to create only one object and we can reuse same object for every similar
 * 		requirement so that performance and memory utilization will be improved, this is
 * 		the central idea for singleton classes.
			eg:-
			Runtime r1 = Runtime.getRuntime();
			Runtime r2 = Runtime.getRuntime();
			Runtime r3 = Runtime.getRuntime();
			
			System.out.println(r1 == r2);//true
			System.out.println(r2 == r3);//true
===========================================================
Q) how to create singleton class?
Ans) we can create our own singleton classes for these we have to use private constructor
	and private static variable and public factory method.
approach 1:

 	class Test{
		private static Test t = new Test();
		
		private Test() {
		}
		
		public static Test getTest() {
			return t;
		}
	}
Note: Runtime class is internally implemented by using this approach. 	
-------------------------------------------------------------------------------- 	
approach 2:
 	class Test{
		private static Test t = null;
		
		private Test() {
		}
		
		public static Test getTest() {
			if(t == null)
				t = new Test();
			return t;
		}
	}
--------------------------------------------------------------------------------
at any point of time for Test class we can create only one object hence Test class is
singleton class.
================================================================================
Q) class is not final but we are not allowed to create child classes,
 	how can we achieve this?
Ans) By declaring every constructor as private we can restrict child creation.
class P{
	private P() {------> for this class it is impossible to create child class
		
	}
}
class C extends P{//CE:Implicit super constructor P() is not visible for default constructor.
	             //Must define an explicit constructor
	
}
 */
	public static void main(String[] args) {}
}
