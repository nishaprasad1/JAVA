package _01_operators_assignments;

public class _09_ShortCircuitOperators {
	// &&, ||

	public static void main(String[] args) {

		System.out.println("****************************************");
		//		difference b/w
		//						&,| 			!!					  &&,||
		//		1.both arguments evaluated  	!!  1.	second argument is optional,for A&&B,
		//										!!		B is evaluated only if A is true,
		//										!!		for A||B, B is only evaluate id A is false
		//		2. low performance				!!	2.	high performance
		//		3. applicable to boolean as		!!	3.	only applicable for boolean types
		//			well as integral types 		!!

		/**
		 *  x && y => y will be evaluated iff x is true,
		 *  		 ie, if x is false then y wont be evaluated
		 *  
		 *  x || y => y will be evaluated iff x is false,
		 *  		 ie, if x is true then y wont be evaluated 
		 */

		case1();
		case2();
		case3();
		case4();
		case5();
		
	}

	public static void case1() {
		int x=10,y=15;

		if(++x < 10 & ++y > 15) {
			x++;
		}else {
			y++;
		}

		System.out.println(x+" "+y);
	}

	public static void case2() {
		int x=10,y=15;

		if(++x < 10 && ++y > 15) {
			x++;
		}else {
			y++;
		}

		System.out.println(x+" "+y);
	}

	public static void case3() {
		int x=10,y=15;

		if(++x < 10 | ++y > 15) {
			x++;
		}else {
			y++;
		}

		System.out.println(x+" "+y);
	}

	public static void case4() {
		int x=10,y=15;

		if(++x > 10 || ++y > 15) {
			x++;
		}else {
			y++;
		}

		System.out.println(x+" "+y);
	}

	public static void case5() {
		int x=10;

		if(++x < 10 && x/0 >10) {			
			System.out.println("Hello");
		}else {
			System.out.println("Hiii");
		}
	}
}