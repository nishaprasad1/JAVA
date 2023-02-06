package _01_operators_assignments;

public class _05_RelationalOperators {
//	Relational operators <, <=, >, >=
	
	public static void main(String[] args) {

		/**
		 * we can apply relational operators for every primitive type except
		 * boolean 
		 */
		System.out.println(10 < 20);
		
		System.out.println('a' < 20);
		
		System.out.println('a' < 97.5);
		
		System.out.println('a' > 'A');
		
//		System.out.println(false > true);
//		System.out.println(false < true);
		
		System.out.println("****************************************");
		
		/**
		 * we cannot apply relational operators for object types
		 */
//		System.out.println("durga123" > "durga");error:The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
		
		
		/**
		 * nesting of relational operators not allowed
		 */
		System.out.println(10 < 20);
//		System.out.println(10 < 20 < 30); error: 10 < 20 < 30 ==> true < 30
	}
}
