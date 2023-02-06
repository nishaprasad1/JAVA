package _06_OOP;

public class _23_Instance_control_flow {
/* 1. whenever we are executing a java class, 1st static control flow will be executed,
 * 		in the static control flow if we are creating an object then the following sequence
 * 		of events will be executed as a part of instance control flow:
 * 		a)Identification of instance members from top to bottom
 * 		b) Execution of instance variable assignments and instance block from top to
 * 			bottom.
 * 		c) Execution of constructor.
 *  refer: ./ss_03_instance_control_flow.png
-----------------
class Test{
	int i =10;
	{
		m1();
		System.out.println("first instance block");
	}
	Test(){
		System.out.println("consturctor");
	}
	public static void main(String[] args) {
		System.out.println("main");
	}
	public void m1() {
		System.out.println("j: "+j);
	}
	{
		System.out.println("second instance block");
	}
	int j =20;
}
o/p:  main
------------------
class Test{
	int i =10;
	{
		m1();
		System.out.println("first instance block");
	}
	Test(){
		System.out.println("consturctor");
	}
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("main");
	}
	public void m1() {
		System.out.println("j: "+j);
	}
	{
		System.out.println("second instance block");
	}
	int j =20;
}
o/p:
j: 0
first instance block
second instance block
consturctor
main
 
 * 2. static control flow is one time activity, which will be performed at the time of class
 * 		loading, but instance control flow is not onetime activity and it will be performed
 * 		for every object creation.
 * 3. object creation is the most costly operation, if their is no specific requirement then
 * 		it is not recommended.
 */
	public static void main(String[] args) {}
}
class Test_23{
	int i =10;
	{
		m1();
		System.out.println("first instance block");
	}
	Test_23(){
		System.out.println("consturctor");
	}
	public static void main(String[] args) {
		Test_23 t = new Test_23();
		System.out.println("main");
	}
	public void m1() {
		System.out.println("j: "+j);
	}
	{
		System.out.println("second instance block");
	}
	int j =20;
}