package _02_flow_control;

public class _03_switch {

	public static void main(String[] args) {
/**
 * 1. if several options are available then it is not recommended to use nested if-else
 *	  because it reduces readability
 *    to handle this requirement we should go with 'switch'
 * 2. <Syntax>
	   switch(x){
	 		case 1: 	action-1;
	 					break;
	 		case 2: 	action-2;
	 					break;
	 		case 3: 	action-3;
	 					break;
	 		.		
	 		.
	 		.
	 		case n: 	action-n;
	 					break;
	 		default: 	action-default;
	 					break;
	 	}
 	3. allowed types are
 					till 1.4v -> byte, short, char, int
 					     1.5V -> Byte, Short, Character, Integer, enum
 					     1.7V -> String
 	4. curly braces are mandatory, except switch everywhere curly brace is 
 		optional.
 	5. Inside switch every statement should be under any case or default, ie
 		independent statements not allowed inside switch otherwise we will get
 		compile time error
 	6. case y:
 	 	not allowed as y is variable, but if y was compile time constant ie of type final
 	 	then it will work case3(), case4()
 	7. switch argument and case label can be constant expression
 	8. every switch label should be in the range of switch argument type, otherwise
 	 	we will get CE
 	9. duplicate case label not allowed
 	10. fall-through inside switch, we can define common action for different case
 		ie, code re-usability
 	11. default case, we can take default case only once
 	 				  we can write it any were but recommended to write in last
 */
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
	}
	
	private static void case1() {
		int x=0;
		switch(x) {

		}
	}
	private static void case2() {
		int x=0;
		switch(x) {
//		System.out.println("hello");//error:SwitchLabelDefaultExpr expected after this token
		
		}
	}

	private static void case3() {
		int x=10;
		int y=20;
		switch(x) {
		case 10:
//		case y: case expressions must be constant expressions
		}
		
	}
	
	private static void case4() {
		int x=10;
		final int y=20;
		switch(x) {
		case 10:
		case y: 
		}

	}
	
	private static void case5() {
		int x=10;

		switch(x+1) {
		case 1+2+3:
		}
	}
	private static void case6() {
		byte b=10;
		
		switch(b) {
		case 10: 
		case 100:
//		case 1000:// error: case label should be in the range of
//														switch argument
		}
	}
	private static void case7() {
		byte b=10;

		switch(b+1) {
		case 10: 
		case 100: 
		case 1000:
		}
	}
	
	private static void case8() {
		byte b=10;

		switch(b+1) {
		case 10: 
		case 100: 
		case 1000:
		case 'a':
		}
	}
	
	private static void case9() {
		byte b=10;
		
		switch(b+1) {
		case 10: 
//		case 97: //duplicate case label not allowed
		case 1000:
//		case 'a': //duplicate case label not allowed
		}
	}
	
	private static void case10() {
		int x=10;
		
		switch(x) {
		case 1:
		case 2:
		case 3:
			System.out.println("Q-1");
			break;
			
		case 4:
		case 5:
		case 6:
			System.out.println("Q-2");
			break;
		}
	}
}
