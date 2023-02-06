package _07_Exception_handling;

public class _11_throw {
/*
 * 1. sometimes we can create exception object explicitly and handover it to jvm
 * 		manually for this we have to use throw keyword
		+------------------------------------------------+
		+	throw  new ArithmeticException("/ by zero");  +
	       \____/ 	\_________________________________/
	          |                   |------> creation of ArithmeticException object
	      	  |                    			explicitly
	      	  |---> handover our
	      	  	created exception object
	      	  	to the jvm manually
	
	Hence the main objective of 'throw' keyword is to handover our created exception
	object to jvm manually
	--> hence the result of following two programs is exactly same:

class Test{										|	class Test{
	public static void main(String[] ag){       |		public static void main(String[] ag){
		System.out.println(10/0);				|			throw new AritmeticException("/ by zero");		
	}											|		}
}												| 	}
        										|o/p:
o/p:											|Exception in thread "main" java.lang.ArithmeticException: / by zero
Exception in thread "main"  					|	at _07_Exception_handling.Test.main(_11_throw_vs_throws.java:35)
java.lang.ArithmeticException: / by zero    	|____________________________
at _07_Exception_handling.Test.main(_11_throw_vs_throws.java:34)			|
												____________________________|
--> in this case main  method is responsible	|--> in this case programmer is creating exception object explicitly and
to create exception object and handover to		|handover to jvm manually.
the jvm internally.								|
________________________________________________|________________________________________________________________________

 * 2. best use of throw keyword is for user defined exception or customised exceptions.
 * case 1) throw e;
 *  if e refers null then we will get NullPointerException

class Test{  													|	class Test{
	static ArithmeticException e = new ArithmeticException(); 	|		static ArithmeticException e;
	public static void main(String[] args) { 					|		public static void main(String[] args){
				throw e; 										|			throw e;
	}                 						 					|		}
}                												|	}
o/p:Exception in thread "main" java.lang.ArithmeticException    |o/p:Exception in thread "main" java.lang.NullPointerException:
-----------------------------------------------------------------------------------------------------------------------------------
 * case 2) after 'throw' statement we are not allowed to write any statement
 * 			directly, otherwise we will get CE saying "unreachable statement"
 
 class Test{  													|	class Test{
	public static void main(String[] args) { 					|		public static void main(String[] args){
		System.out.println(10/0);                               | 			throw new ArithmeticException();
		System.out.println("hello");							|			System.out.println("hello");//CE:Unreachable code
	}                 						 					|		}
 }                												|	}
-----------------------------------------------------------------------------------------------------------------------------------
 * case 3) we can use throw keyword only for throwable type if we are trying to
 * 			use for normal java objects we will get CE saying incompatible types
 
 class Test{  																|	class Test extends RuntimeException{
	public static void main(String[] args) { 								|		public static void main(String[] args){
		throw new Test();//CE:No exception of type Test can be thrown;		| 			throw new Test();
	}                 	//an exception type must be a subclass of Throwable	|		}
 }                															|	}
 																			|o/p:Exception in thread "main" Test
 																			|	at Test.main()
-----------------------------------------------------------------------------------------------------------------------------------
 
 */
	public static void main(String[] args) {}
}
class Test_11 extends RuntimeException{
	public static void main(String[] args) {
		throw new Test_11();
	}
}