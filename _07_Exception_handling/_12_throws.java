package _07_Exception_handling;

public class _12_throws {
/*
 * 1. In our program if their is possibility of raising checked exception then
 * 		compulsary we should handle that checked exception otherwise we will
 * 		get CE saying "Unhandled exception type FileNotFoundException"
-----------
eg:1
		class Test{
			public static void main(String[] args) {
				PrintWriter printWriter = new PrintWriter("abc.txt");//CE:Unhandled exception type FileNotFoundException
				printWriter.println("hello");
			}
		}
---------
eg:2
		class Test{
			public static void main(String[] args) {
				Thread.sleep(1000);//CE:Unhandled exception type InterruptedException
			}
		}
=========================================================================================
 * 2. we can handle these CE by using following two ways:
 * 		a) by using try-catch
			
			class Test{
				public static void main(String[] args) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
			
					}
				}
			}
		
		b) by using throws keyword: we can use throws keyword to delegate responsibility
			of exception handling to the caller(it may be another method or JVM) then
			caller method is responsible to handle that exception.
			
			class Test{
				public static void main(String[] args) throws InterruptedException {
						Thread.sleep(1000);
				}
			}
=========================================================================================
 * 3. throws keyword required only for checked exception and usage of throws for unchecked
 * 		exception there is no use or there is no impact.
 * 
 * 4. throws keyword required only to convince compiler and usage of throws keyword doesn't
 * 		prevent abnormal termination of the program.
 			
 			class Test{
				public static void main(String[] args) throws InterruptedException {
						doStuff();
				}
			
				private static void doStuff() throws InterruptedException {
					doMoreStuff();
				}
			
				private static void doMoreStuff() throws InterruptedException {
					Thread.sleep(1000);
				}
			}
--> in the above program if we remove atleast one throws keyword then the program
			won't compile.
 
 	_________________
 	|               |--->we can use to delegate responsibility of exception handling  
 	| throws        |	 to	the caller(it may be method or jvm). 
 	|	clause      | 
    |_______________|----> it is required only for checked exceptions and usage of 
 			|				throws keyword for unchecked exception there is no impact.
 			|
 			+----> it is required only to convience compiler and usage of throws does
 					not prevent abnormal termination of program.
 *
 * Note: it is recommended to use try catch over throws keyword.
========================================================================================
case1: we can use throws keyword for methods and constructors but not classes.

class Test throws Exception----->invalid
{
	Test() throws Exception{------->valid
		
	}
	void m1() throws Exception {------>valid
		
	}
}
----------------------
case2: we can use throws keyword only for throwable type if we are trying to use
		for normal java class we will get CE saying "incompatible types".
		
		class Test{
			public void m1() throws Test{//CE:No exception of type Test can be thrown;
										//an exception type must be a subclass of Throwable
			}
		}
		-----------
		class Test extends RuntimeException{--->valid
			public void m1() throws Test{
				
			}
		}
----------------------
case3:
class Test {															|	class Test {
	public static void main(String[] args) { 							|		public static void main(String[] args) {
//		throw new Exception();//CE:Unhandled exception type Exception	|			throw new Error();
	}				|													|		}				|
} 					+------->(checked exception)						|	}					+------>(unchecked exception)		
																		|
																		|o/p: Exception in thread "main" java.lang.Error
------------------------------------------------------------------------------------------------------------------------------------
case4: within the try block if there is no chance of raising an then we cannot 
  		write catch block for that exception, otherwise we will get compile time
  		error saying "Exception xxx is never thrown in the body of corresponding 
  		try statement", but this rule is applicable for fully checked exceptions

class Test {
	public static void main(String[] args) {
		try {
		} catch (ArithmeticException e) {
		}
		
		try {
		} catch (Exception e) {
		}
		
		try {
		} catch (IOException e) {//CE:Unreachable catch block for IOException.
			                    //This exception is never thrown from the try statement body
		}
		
		try {
		} catch (InterruptedException e) {//CE:Unreachable catch block for InterruptedException.
			                             //This exception is never thrown from the try statement body
		}
		
		try {
		} catch (Error e) {
		}
	}
}  		
 */
	public static void main(String[] args) {}
}
