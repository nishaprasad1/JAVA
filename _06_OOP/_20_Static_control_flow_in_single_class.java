package _06_OOP;

public class _20_Static_control_flow_in_single_class {
/*
 * 1. whenever we are executing a java class the following sequence of steps will
 * 		be executed as a part of static control flow:
 * 		a) Identification of static members from top to bottom.
 * 		b) Execution of static variable assignments and static blocks from top
 * 			to bottom.
 * 		c) Execution of main method.  
refer ./ss_static_control_flow.png

class Base{
	static int i = 10;
	static {
		m1();
		System.out.println("first static block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("main method");
	}
	public static void m1() {
		System.out.println("j: "+j);
	}
	static {
		System.out.println("second static block");
	}
	static int j =20;
}

		o/p:  	j: 0
				first static block
				second static block
				j: 20
				main method
-----------
 * 2. Inside a static block if we are trying to read a variable, that read operation is called
 * 		direct read.
 * 		if we are calling a method and within that method we are trying to read a variable, this
 * 		read operation is called indirect read.
			
			class Test{
				static int i = 10;
				static {
					m1();
					System.out.println(i);//-------> direct read
				}
				public static void m1() {
					System.out.println(i);//-------> indirect read
				}
			}
 *
 * 3. if a variable is just identified by the jvm and the original value not yet assigned
 * 		then the variable is said to be in "read indirectly write only" state [RIWO].
 * 	 if a variable is in RIWO state then we cannot perform direct read but we can perform 
 * 		indirect read, if we are trying to read directly then we will get compile time error
 * 		saying illegal forward reference.
 * 
 ------------------------------------
 1.
 class Test{
	static int x = 10;
	static {
		System.out.println(x);
	}
}
o/p:-->   10
         RE: noSuchMethodError: main
----------------------------------------
2.
class Test{
	static {
//		System.out.println(x);//CE: illegal forward reference
	}
	static int x = 10;
}         
----------------------------------------
3.
class Test{
	static {
		m1();
	}
	public static void m1(){
		System.out.println(x);
	}
	static int x = 10;
}
o/p:--->    0
            RE: noSuchMethodError: main
 */
	
	public static void main(String[] args) {}
}