package _02_flow_control;

public class _04_while {
/*
 * 1. if we don't know no. of iterations in advance then we should go for while loop
 * 2. <syntax>
 			while(b){
 			-----------
 			--action---
 			-----------
 			}
 			here the argument b should be boolean type, else we will get CE
 	3. curly braces are optional, without curly braces we can take only one statement
 		which should not be declarative.
 	4. for final variables(compile time constant), value resolved at compile time,
 	 	and if both the operands are final then the operation is done at compile time only
 		================================================
 		final int a=10;
 	   	final int b=20;
 	   	sopln(a); --after compilation---> sopln(10);
 	   	sopln(b); --after compilation---> sopln(20);
 	   	================================================
 	   	final int a=10;
 	   	final int b=20;
 	   	int c=20;
 	   	sopln(a+b); --after compilation---> sopln(30);
 	   	sopln(a+c); --after compilation---> sopln(10+c);
 	   	sopln(a<b); --after compilation---> sopln(true);
 	   	sopln(a<c); --after compilation---> sopln(10<c);
 	   	================================================
 	   	
 */
	public static void main(String[] args) {

	}

	private static void case1() {
		while(true)
			System.out.println("hello");
	}
	private static void case2() {
		while(true);
	}
	private static void case3() {
//		while(true)
//			int x=10;
	}
	private static void case4() {
		while(true) {
			int x=10;
		}
	}
	
	private static void case5() {
//		while(true) {
//			System.out.println("Hello");
//		}
//		System.out.println("Hi");// unreachable statement
	}
	
	private static void case6() {
//		while(false) 
//		{// this curly brace is unreachable statement
//			System.out.println("Hello");
//		}
	}
	
	private static void case7() {
		int a=10;
		int b=20;
		while(a<b) {
			System.out.println("hello");
		}
		System.out.println("hi");
	}
	private static void case8() {
		int a=10;
		int b=20;
		while(a>b) {
			System.out.println("hello");
		}
		System.out.println("hi");
	}
	
	private static void case9() {
//		final int a=10;
//		final int b=20;
//		while(a<b) {
//			System.out.println("hello");
//		}
//		System.out.println("hi");//unreachable code
	}
	private static void case10() {
//		final int a=10;
//		final int b=20;
//		while(a>b) {
//			System.out.println("hello");
//		}
//		System.out.println("hi");
	}
}
