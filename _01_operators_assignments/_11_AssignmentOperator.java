package _01_operators_assignments;

public class _11_AssignmentOperator {
/**
 * 1. simple:  	int x = 10;
 * 2. chained:	a = b = c = 10;
 * 3. compound: a+=20;
 */
	public static void main(String[] args) {
//		chained assignment:	a = b = c = 10;
		int a,b,c,d;
		a = b = c = d = 20;
		System.out.println(a+" "+b+" "+c+" "+d);
		
		/**
		 * we cannot perform chained assignment directly at time of declaration
		 */
//		int a1 = b1 = c1 = d1 = 20; error: b1,c1,d1 not found
		
		int b2,c2,d2;
		int a2 = b2 = c2 = d2 = 20;
		System.out.println(a2+" "+b2+" "+c2+" "+d2);
		
		System.out.println("****************************************");
//		compound assignment: a+=20;
//		+=, -=, *=, /=, %=
//		&=, |=, ^=
//		>>=, >>>=, <<=
		/**
		 * in the case of compound assignment operators internal type casting
		 * will be performed automatically
		 */
		int a3,b3,c3,d3;
		a3 = b3 = c3 = d3 =20;
		
		a3 += b3 -= c3 *= d3 /= 2;
		
		System.out.println(a3+" "+b3+" "+" "+c3+" "+d3);
		
		System.out.println("****************************************");
//		conditional operator (? :)
//		the only possible ternary operator in java
//		int x = (10 < 20) ? 30 : 40
		int a4 = (10 < 20) ? 30 : 40;
		System.out.println(a4);
		
//		nesting of conditional operator is possible
		int a5 = (10 > 20) ? 30: (60 < 70 ? 101 : 202);
		System.out.println(a5);
		
		/**
		 *  new operator
		 *  Test t = new Test()
		 *   the 'new' keyword is used to create new object and constructor is used to
		 *   initialize the object
		 *   destruction of object is responsibility of garbage operator 
		 */
		
		/**
		 * [] operator used to create array
		 */
		int y[] = new int[10];
	}

}
