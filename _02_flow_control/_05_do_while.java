package _02_flow_control;

public class _05_do_while {
/*
 * <syntax>
 		do{
 		
 		
 		}while(condition); // here ; is mandatory
 */
	public static void main(String[] args) {
		case1();
		case2();
		case3();
		case4();
		case5();
		case6();
		
		case7();
		case8();
		case9();
		case10();
		case11();
		case12();
		
		
	}

	private static void case1() {
		do
			System.out.println("Hello");
		while(true);
	}
	
	private static void case2() {
		do;
		while(true);
	}
	
	private static void case3() {
//		do
//			int x =10;
//		while(true);
	}
	
	private static void case4() {
		do {
			int x =10;
		}
		while(true);
	}
	
	private static void case5() {
//		do
//		while(true);//body required
	}
	
	private static void case6() {
		do
			while(true)
				System.out.println("hello");
		while(false);
	}
	
	private static void case7() {
//		do {
//			System.out.println("hello");
//		}while(true);
//		System.out.println("Hi");// unreachable code
	}
	
	private static void case8() {
		do {
			System.out.println("hello");
		}while(false);
		System.out.println("Hi");
	}
	
	private static void case9() {
		int a=10,b=20;
		do {
			System.out.println("hello");
		}while(a<b);
		System.out.println("Hi");
	}
	
	private static void case10() {
		int a=10,b=20;
		do {
			System.out.println("hello");
		}while(a<b);
		System.out.println("Hi");
	}
	private static void case11() {
//		final int a=10,b=20;
//		do {
//			System.out.println("hello");
//		}while(a<b); //---compile time---> while(true)
//		System.out.println("Hi");
	}
	
	private static void case12() {
		final int a=10,b=20;
		do {
			System.out.println("hello");
		}while(a>b);
		System.out.println("Hi");
	}
	
	

}
