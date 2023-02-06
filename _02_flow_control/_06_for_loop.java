package _02_flow_control;

public class _06_for_loop {
/*
 * 1. if we know number of iteration in advance then for is best choice
 * 2.<syntax>
 * 			for(initialization_section ; condition_check ; increment/decrement_section){
 				loop body
 			}
 	3. curly braces optional, without this only one non-declarative statement allowed.
 	4.<initialization_section>
 		this part will be executed only once in loop life cycle, here we can declare 
 		and initialize local variables of for loop. Here we can declare any number of variables
 		but of same type.
 	5.<condition_check>
 		here we can take any valid java statement but the type should be boolean,
 		it is optional by default compiler puts true here.
 	6.<increment/decrement_section>
 		
 */
	public static void main(String[] args) {

		case1();
		case2();
		case3();
		System.out.println("=========================");
		//4.
		case4();
		case5();
		case6();
		
		//5.
		case8();
		case9();
	}
	
	private static void case1() {
		for(int i=0;i<7;i++)
			System.out.println("Hello");
	}
	
	private static void case2() {
		for(int i=0;i<7;i++);
	}
	
	private static void case3() {
//		for(int i=0;i<7;i++)
//			int x=10;
	}
	
	private static void case4() {
		for(int i=0,j=5; i<7; i++);
//		for(int i=0,String j="Hello"; i<7; i++);// different types not allowed
//		for(int i=0,int j=5; i<7; i++);
	}
	
	private static void case5() {
		int i=0;
		for(System.out.println("Hello"); i<3; i++)
			System.out.println("Hi");
	}
	
	private static void case6() {
		System.out.println("_06_for_loop.case6()");
		int i=0;
		for( ; i<3; i++)
			System.out.println("Hi");
	}
	
	private static void case7() {
		System.out.println("_06_for_loop.case7()");
//		int i=0;
//		for( return ; i<3; i++)
//			System.out.println("Hi");
	}
	
	private static void case8() {
		System.out.println("_06_for_loop.case8()");
		int i=0;
		for( ; ; i++)
			System.out.println("Hi");
	}
	
	private static void case9() {
		System.out.println("_06_for_loop.case9()");
		int i=0;
		for(System.out.println("Hi") ; i<3; System.out.println("Hello"))
			i++;
			
	}
	//infinite loop
	private static void case10() {
		for(;;);
	}
	
	//infinite loop
	private static void case11() {
		for(;;)
			System.out.println("hii");
	}
	
	private static void case12() {
//		for(int i=0; true; i++)
//			System.out.println("hello");
//		System.out.println("hi"); // unreachable code
	}
	
	private static void case13() {
//		for(int i=0; false; i++)
//			System.out.println("hello");// unreachable code
		System.out.println("hi"); 
	}
	
	private static void case14() {
//		for(int i=0; ; i++)
//			System.out.println("hello");
//		System.out.println("hi"); // unreachable code
	}
	
	private static void case15() {
		int a=10,b=20;		
		for(int i=0; a<b ; i++)
			System.out.println("hello");
		System.out.println("hi");
	}
	private static void case16() {
//		final int a=10,b=20;		
//		for(int i=0; a<b ; i++)
//			System.out.println("hello");
//		System.out.println("hi"); // unreachable code
	}
	private static void case17() {
//		final int a=10,b=20;		
//		for(int i=0; a>b ; i++)
//			System.out.println("hello");// unreachable code
//		System.out.println("hi");
	}
}
