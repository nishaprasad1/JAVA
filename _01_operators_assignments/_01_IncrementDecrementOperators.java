package _01_operators_assignments;

public class _01_IncrementDecrementOperators {
//Increment operator x++,++x
//decrement operator x--,--x
	
	public static void main(String[] args) {
		int x=10;
		int y;

		y=x++;
		System.out.println("x = "+ x +", y = "+y);
		
		x=10;
		y=++x;
		System.out.println("x = "+ x +", y = "+y);
		
		x=10;
		y=x--;
		System.out.println("x = "+ x +", y = "+y);
		
		x=10;
		y=--x;
		System.out.println("x = "+ x +", y = "+y);
		
		/**
		 * 1. increment/decrement only allowed for variables not constant
		 */
//		y=++10; error: unexpected type found value, required variable
		
		/**
		 * 2. nesting of ++ or -- operators not allowed
		 */
		x=10;
//		y=++(++x); ==> y=++(11) error: unexpected type found value, required variable
		
		/**
		 * 3.for final variables we cannot use ++ or -- operators
		 */
		final int a=10;
//		a++; error: final variables cannot be reassigned
		
		char c='a';
		c++; // valid
		
		int i=10;
		i++; // valid
		
		long l=10;
		l++; // valid
		
		float f=10f;
		f++; // valid
		
		double d=10d;
		d++; // valid
		
		/**
		 * 4. ++ or -- not allowed for boolean values
		 */
		boolean bln=false;
//		bln++; error: ++ or -- not allowed for boolean type
		

		byte b=10;
		b++; // valid
		
//		b=b+1; error:Type mismatch: cannot convert from int to byte
//				hence b+1 != b++
//		a <any arithematic operation> b ==> result datatype will be max(int, type of a, type of b)
		
		byte b1=10;
		byte b2=11;
//		byte b3 = b1 + b2; error: as b1+b2 will give int 
		
		byte b3 =(byte) (b1+b2); // to handle above error
		
		/**
		 * 5. b++ and b=b+1 is not same as b++ comes with internal type casting
		 */
		b++; //is actually internal type casting b++ => b= (type of b)(b+1);
		
		
		
		
		
		
		
		
	}
}
