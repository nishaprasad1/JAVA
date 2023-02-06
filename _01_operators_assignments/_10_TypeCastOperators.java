package _01_operators_assignments;

public class _10_TypeCastOperators {
// types:  1)Implicit type casting,  2)Explicit type casting

	public static void main(String[] args) {
		/**
		 * Implicit type casting
		 * 1. performed by compiler internally
		 * 2. only when smaller type is assigned to bigger type
		 * 		(MIN)          		                       (MAX)
		 * 		byte---> short --\ 
		 * 						int --> long --> float --> double
		 *          	   char--/
		 *            
		 * 			ie, int i = 'c';
		 * 	   			long l = 10;
		 * 3. no loss of data
		 * 4. also known as widening
		 */
		
		int a= 'c';
		System.out.println(a);
		
		double d = 10;
		System.out.println(d);
		
		System.out.println("****************************************");
		
		/**
		 * Explicit type casting
		 * 1. performed by programer
		 * 2. assigning bigger type to smaller type, explicit casting is required
		 * 	(MIN)           		                       (MAX)
		 * 	  byte <--- short <--{ 
		 * 						int <-- long <-- float <-- double
		 *				 char <--{            

		 *				int i= 130;
		 * 			ie, byte b = (byte)i;
		 * 3. loss of data
		 * 4. also known as narrowing
		 */
		int i =130;
		byte b = (byte)i;
		System.out.println(b);
		
		int x = 150;
		byte b1 = (byte)x;
		System.out.println(b1);
		
		short s1 = (short)x;
		System.out.println(s1);
		
		double d1= 130.456;
		int x2= (int)d1;
		System.out.println(x2);
		
		byte b2= (byte)d1;
		System.out.println(b2);
	}

}
