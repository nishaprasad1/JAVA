package _06_OOP;

public class _22_Static_control_flow_parent_2_child_relationship {
/*
 * 1. whenever we are executing child class the following sequence of
 * 		event will be executed as a part of static control flow:-
 * 			(refer: ss_static_control_flow_parent_to_child.png)
 * 		a) Identification of static members from parent to child. [ 1 to 11]
 *      b) Execution of static variable assignment and static blocks  
 *      	from parent to child. [ 12 to 22]
 *      c) Execution of only child class main method. [23 to 25]


class Base{
	static int i =10;
	static {
		m1();
		System.out.println("Base static block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("Base main method");
	}
	public static void m1() {
		System.out.println("j: "+j);
	}
	static int j = 20;
}
class Derived extends Base{
	static int x =100;
	static {
		m2();
		System.out.println("derived first static block");
	}
	public static void main(String[] args) {
		m2();
		System.out.println("Derieved class main method");
	}
	public static void m2() {
		System.out.println("y: "+y);
	}
	static  {
		System.out.println("derived second static block");
	}
	
	static int y = 200; 
}
o/p:-
>> java Base
j: 0
Base static block
j: 20
Base main method
-------
>> java Derived
j: 0
Base static block
y: 0
derived first static block
derived second static block
y: 200
Derieved class main method


Note: whenever we are loading child class automatically parent class will be loaded, but
  		whenever we are loading parent class child class wont be loaded(because parent class
  		member by default available to child class whereas child class members by default wont
  		available to parent).
 */
	public static void main(String[] args) {}
}