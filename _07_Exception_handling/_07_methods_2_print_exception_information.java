package _07_Exception_handling;

public class _07_methods_2_print_exception_information {
/*
 * 1. throwable class defines the following methods to print exception
 * 	 information:

	     METHOD                           PRINTABLE FORMAT
	a) printStackTrace()               Name of Exception : Description
	     								stack trace
	-----------------------------------------------------------------------
	b) toString()                      Name of Exception : Description
	-----------------------------------------------------------------------
	c) getMessage()                    Description 

===========
class Test{
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch (ArithmeticException e) {
			
			System.out.println("a)printStackTrace()");
			e.printStackTrace();

			System.out.println("b)toString()");
			System.out.println(e.toString());
			
			System.out.println("c)getMessage()");
			System.out.println(e.getMessage());
		}
	}
}
o/p:
a)printStackTrace()
java.lang.ArithmeticException: / by zero
	at _07_Exception_handling.Test.main(_07_methods_2_print_exception_information.java:22)
	
b)toString()
java.lang.ArithmeticException: / by zero

c)getMessage()
/ by zero
===========
--> internally default exception handler will use printStackTrace() method to print
      exception information to the console	    											
 */
	public static void main(String[] args) {}
}
class Test_07{
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch (ArithmeticException e) {
			
			System.out.println("b)toString()");
			System.out.println(e.toString());
			
			System.out.println("c)getMessage()");
			System.out.println(e.getMessage());
			
			System.out.println("a)printStackTrace()");
			e.printStackTrace();
		}
	}
}