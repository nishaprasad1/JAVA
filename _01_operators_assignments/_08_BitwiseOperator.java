package _01_operators_assignments;

public class _08_BitwiseOperator {
	//	Bitwise operator &(and), |(or), ^(ex-or)

	public static void main(String[] args) {
		/**
		 * &--> A & B, return true only A,B both are true, else false
		 * |--> A | B, return true if atleast one of A,B is true, if both false then return false
		 * ^--> A ^ B, return true if A and B are different, else false 
		 */

		System.out.println(true & false);
		System.out.println(true | false);
		System.out.println(true ^ false);

		System.out.println("****************************************");

		/**
		 * We can apply these operators for integral types also
		 */
		
		System.out.println(4 & 5);
//		4--> 100
//		5--> 101
//		------------
//		&	 100--> 4	     
		
		System.out.println(4 | 5);
//		4--> 100
//		5--> 101
//		------------
//		|	 101--> 5
		
		System.out.println(4 ^ 5);
//		4--> 100
//		5--> 101
//		------------
//		^	 001--> 1	    
		
		System.out.println("****************************************");
		/**
		 * bitwise complement operator (~)
		 * only applicable to integral types, not for boolean types
		 */
		
//		System.out.println(~ true); error:The operator ~ is undefined for the argument type(s) boolean
		
		System.out.println(~4);
		
//		4--> (0)0000.....100   (32 bits)
//	   ~4--> (1)1111.....011	which is negative as msb is 1, then the value is 2's complement
//	          - (...........) 1's complement
//				0000.....100   now add 1
//		      - 0000.....101==> -5
		
		System.out.println("****************************************");
		/**
		 * boolean negation operator !
		 * only allowed for boolean operators
		 */
		
//		System.out.println(!4); error
		System.out.println(!false);
		System.out.println(!true);
	}
}
