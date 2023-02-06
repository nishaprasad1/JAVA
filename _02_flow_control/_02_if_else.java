package _02_flow_control;

public class _02_if_else {

	public static void main(String[] args) {
		case1();
		case2();
		case3();
		case4();
		case5();
		
		/*
		 * in if-else, the else part n curly braces are optional
		 * without curly braces only one statement is allowed under 'if' 
		 * which should not be declarative statement
		 */
		case6();
		case7();
		case8();
		case9();
		
		/*
		 * in java there is no dangling else problem, the else belongs to
		 * nearest 'if' statement
		 */
		case10();
	}
	
	private static void case1() {
//		int x=0;
//		if(x) {//error:Type mismatch: cannot convert from int to boolean
//			System.out.println("Hello");
//		}else {
//			System.out.println("Hi");
//		}
	}
	
	private static void case2() {
//		int x=10;
//		if(x = 20) {//error:Type mismatch: cannot convert from int to boolean
//			System.out.println("Hello");
//		}else {
//			System.out.println("Hi");
//		}
	}
	
	private static void case3() {
		int x=10;
		if(x == 20) {
			System.out.println("Hello");
		}else {
			System.out.println("Hi");
		}
	}
	
	private static void case4() {
		boolean b =true;
		if(b = false) {
			System.out.println("Hello");
		}else {
			System.out.println("Hi");
		}
	}
	
	private static void case5() {
		boolean b =false;
		if(b == false) {
			System.out.println("Hello");
		}else {
			System.out.println("Hi");
		}
	}

	private static void case6() {
		if(true)
			System.out.println("hello");
	}

	private static void case7() {
		if(true);
	}
	
	private static void case8() {
//		if(true)
//			int x= 10;// error:
	}
	
	private static void case9() {
		if(true) {
			int x= 10;
		}
	}
	
	private static void case10() {
		if(true)
			if(false)
				System.out.println("Hello");
			else
				System.out.println("hii");

	}
}
