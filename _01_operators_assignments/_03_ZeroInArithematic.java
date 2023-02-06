package _01_operators_assignments;

public class _03_ZeroInArithematic {

	public static void main(String[] args) {
		/**
		 * for integral value like byte,short,int,long we cannot hold infinity hence when x/0 gives exception
		 */
//		System.out.println(10/0); error:Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		/**
		 * whereas no exception in floating values
		 */
		System.out.println(10/0f);
		System.out.println(10/0d);
		
		System.out.println(-10/0f);
		System.out.println(-10/0d);
		
		System.out.println(Float.NEGATIVE_INFINITY);
		System.out.println(Float.POSITIVE_INFINITY);
		
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.POSITIVE_INFINITY);
		
		System.out.println("****************************************");
		/**
		 * for integral value like byte,short,int,long there is no way to define undefined values ie, 0/0
		 */
//		System.out.println(0/0); error:Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		System.out.println(0/0f);
		System.out.println(0f/0);
		System.out.println(0/0d);
		System.out.println(0d/0);
		System.out.println(Float.NaN);
		System.out.println(Double.NaN);
		
		
		System.out.println(0/0.0); //NaN
		System.out.println(-0/0.0);//NaN
		
		System.out.println("****************************************");
		
		System.err.println(10 <  Float.NaN);			// false
		System.err.println(10 >= Float.NaN);			// false
		System.err.println(10 == Float.NaN);			// false
		System.err.println(10 <  Float.NaN);			// false
		System.err.println(10 != Float.NaN);			// true
		System.err.println(Float.NaN !=  Float.NaN);	// true
		System.err.println(Float.NaN <  Float.NaN);		// false
		System.err.println(Float.NaN ==  Float.NaN);	// false
		
		System.out.println("****************************************");
		
		/**---------------------
		 * Arithmetic Exception 
		 * ---------------------
		 * 1.It is Runtime Exception and not compile time error
		 * 2.It is only possible in integral arithmetic and not in floating point arithmetic
		 * 3.the only operators that cause are /, %   
		 */
		
	}

}
