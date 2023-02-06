package _07_Exception_handling;

public class _02_default_exception_handling {
/*
 * 1. inside a method if any exception occurs the method in which it rise is responsible
 * 		to create exception object by including the following information:
 * 		a)Name of exception
 * 		b) decription of exception
 * 		c) location at which exception occured[stack trace]
 * 2. after creating the exception object method handovers the object to JVM, jvm will
 * 		whether the method contains any exception handling code or not. If the method
 * 		doesn't contain exception handling code the jvm terminates that method abnormally
 * 		and removes its entry from runtime stack.
 * --> then jvm identifies caller method and checks caller method contains any handling
 * 		code or not, if the caller method doesn't contain exception handling code then
 * 		jvm terminates that caller method also abnormally and removes coressponding
 * 		entry from runtime stack, this process will be continued until main method
 * 		and if the main method doesn't have exception handling code then jvm terminates
 * 		main method also abnormally and removes coressponding entry from the stack.
 *      Then jvm handovers responsibility of exception handling to "Default Exception Handler"
 *      which is the part of jvm.     
 *      "Default Exception Handler" prints exception information in the following format
 *      and terminates program abnormally.
 *      ___________________________________________________________________________________
 *      | <Exception in thread "abcd"> <name of the exception> : <description stack trace> |
 *      +----------------------------------------------------------------------------------+
==============================================================================================
Example 1)
 class Test{
	public static void main(String[] args) {                    
		doStuff();
	}

	private static void doStuff() {                  |______________|
		doMoreStuff();								 |doMoreStuff()-|---> terminated abnormally
	}												 |______________|	
													 | doStuff()----|---> terminated abnormally	
	private static void doMoreStuff() {              |______________| 
		System.out.println(10/0);                    |main()--------|---> terminated abnormally
	}                                                |______________|
}													Runtime stack trace

exception:
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at _07_Exception_handling.Test.doMoreStuff(_02_default_exception_handling.java:40)
	at _07_Exception_handling.Test.doStuff(_02_default_exception_handling.java:36)
	at _07_Exception_handling.Test.main(_02_default_exception_handling.java:32)

==============================================================================================
Example 2)
 class Test{
	public static void main(String[] args) {                    
		doStuff();
		System.out.println(10/0);
	}

	private static void doStuff() {                  |______________|
		doMoreStuff();								 |doMoreStuff()-|---> terminated normally
  		System.out.println("hii");					 |______________|	
	}												 | doStuff()----|---> terminated normally	
	private static void doMoreStuff() {              |______________| 
		System.out.println("hello");                 |main()--------|---> terminated abnormally
	}                                                |______________|
}													Runtime stack trace

exception:
hello
hii
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at _07_Exception_handling.Test.main(_02_default_exception_handling.java:77)
==================================================================================================
Note: in a program if atleast one method terminates abnormally then the program
 		termination is abnormal termination, if all the methods terminated
 		normally then only program termination is normal termination. 
 
 */
	public static void main(String[] args) {}
}