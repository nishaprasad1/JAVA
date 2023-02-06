package _06_OOP;

public class _25_static_instance_combined_flow {
/*
class Test{
	{
		System.out.println("1st instance block");
	}
	static	{
		System.out.println("1st static block");
	}
	Test(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("main");
		Test t1 = new Test();
	}
	static {
		System.out.println("2nd static block");
	}
	{
		System.out.println("2nd instance block");
	}
}
o/p:
1st static block--------|________\
2nd static block--------|        /   One time only
1st instance block
2nd instance block
constructor
main
1st instance block
2nd instance block
constructor
--------------------------------------------
2.

class Initialization{
	private static String m1(String msg) {
		System.out.println(msg);
		return msg;
	}
	public Initialization() {
		m = m1("1");
	}
	{
		m = m1("2");
	}
	String m = m1("3");
	public static void main(String[] args) {
		Object o = new Initialization();
	}
}
o/p:
2
3
1
-----------------------------------------------------
class Initialization{
	private static String m1(String msg) {
		System.out.println(msg);
		return msg;
	}
	static	String m = m1("1");
	{
		m = m1("2");
	}
	static {
		m = m1("3");
	}
	public static void main(String[] args) {
		Object o = new Initialization();
	}
}
o/p:
1
3
2
-----------------------------------------------------
 * Note: from static area we cannot instance members directly while executing static 
 * 			area jvm may not identify instance members.
 *
 */
	public static void main(String[] args) {}
}
class Test_25{
	int x =10;
	public static void main(String[] args) {
//		System.out.println(x);//CE:Cannot make a static reference to the non-static field x
		Test_25 t = new Test_25();
		System.out.println(t.x);
	}
}