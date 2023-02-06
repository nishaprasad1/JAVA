package _01_operators_assignments;

public class _02_ArithematicOperators {
//	+, -, *, /, %
	public static void main(String[] args) {
		/**
		 * 1. the result datatype for operation a <action> b, is always  max(int, type of a, type of b)
		 * 
		 * (MIN)                                       (MAX)
		 * byte---> short --\ 
		 * 					int --> long --> float --> double
		 *            char--/
		 *            
		 * hence,
		 * byte + byte = int
		 * byte + short = int
		 * byte + long = long
		 * short + short = int
		 * char + char = int    ie, 'a'+ 'b'==> 97+98==> 195                     
		 */
		System.out.println('a'+'b');
		System.out.println('a'+ 0.28d);
		
		
	}

}
