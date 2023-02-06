package _01_operators_assignments;

public class _12_OperatorPrecedence {
/**
 * 1. Uniary operator
 * 		[],x++,x--
 * 		++x,--x,~,!
 * 		new, <type>
 * 
 * 2. Arithmetic operators
 * 		*,/,%
 * 		+,-
 * 
 * 3. Shift operators
 * 		>>, >>>, <<
 * 
 * 4. Comparison operators
 * 		<, <=, >, >=, instanceof
 * 
 * 5. equality operator
 * 		==, !=
 * 
 * 6. Bitwise operator
 * 		&
 * 		^
 * 		|
 * 
 * 7. short circuit operators
 * 		&&
 * 		||
 * 
 * 8. conditional operator
 * 		?:
 * 
 * 9. assignment operators
 * 		=, +=, -=, *= ......
 */
//	in java we have only operator precedence but not operand precedence
//	before applying operator all operands will be evaluated from left to right
	public static void main(String[] args) {
		System.out.println("****************************************");
		System.out.println(m1(1)+ m1(2) * m1(3) / m1(4) + m1(5) * m1(6));
		
	}
	
	public static int m1(int i) {
		System.out.println(i);
		return i;
	}

}
