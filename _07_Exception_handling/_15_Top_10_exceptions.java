package _07_Exception_handling;

public class _15_Top_10_exceptions {
/*
 * 1. based on the person who is raising an exception, all exceptions are divided
 * 		into two categories
 * 		a)JVM exceptions
 * 		b) programatic exceptions(programmers + API developers)
 * 
 * <I> JVM exceptions: the exceptions which are raised automatically by JVM whenever
 * 		a particular event occurs are called JVM exceptions.
 * 		eg:- ArithmeticException, NullPointerException etc.
 * 
 *  <II>programatic exceptions: the exceptions which are raised explicitly either by
 *  	programmer or API developer to indicate that something goes are called
 *  	programatic exception.
 *  	eg:-TooOldException, IllegalArgumentException etc.
==================================================================================
							___________________________
							|TOP 10 EXCEPTIONS IN JAVA|
							+-------------------------+
 
 * 1. ArrayIndexOutOfBoundsException
 * --> it is the child class of RuntimeException and hence it is unchecked.
 * --> raised automatically by jvm whenever we are trying to access array element
 * 		with out of range index.
				
			int[] x= new int[4];
			System.out.println(x[2]);
			System.out.println(x[10]);//RE:java.lang.ArrayIndexOutOfBoundsException
			System.out.println(x[-10]);//RE:java.lang.ArrayIndexOutOfBoundsException
 *
 * 2. NullPointerException
 * --> it is the child class of RuntimeException and hence it is unchecked.
 * --> raised automatically by jvm whenever we are trying to perform any operation
 * 		on null.
 					String s = null;
					System.out.println(s.length());//RE:java.lang.NullPointerException
 *
 * 3. ClassCastException
 * --> it is the child class of RuntimeException and hence it is unchecked.
 * --> raised automatically by jvm whenever we are trying to typecast parent 
 * 		object to child type.
		
		String s1 = new String("apple");
		Object o1 = (Object) s1;//--->valid
		
		Object o2 = new Object();
		String s2 = (String)o2;//RE:java.lang.ClassCastException
		
		Object o3 = new String("cat");
		String s3 = (String)o3;//---->valid
 *
 * 4. StackOverflowError
 * --> it is the child class of error and hence it is unchecked.
 * --> raised automatically by jvm whenever we are trying to perform recurssive method call.
		
		class Test{
			public static void main(String[] args) {
				m1();
			}
			private static void m1() {
				m2();
			}
			private static void m2() {
				m1();
			}
		}
 *
 * 5. NoClassDefFoundError
 * --> It is the child class of error and hence it is unchecked.
 * --> raised automatically by jvm whenever jvm unable to find required .class file
		
		java Test
		if Test.class file is not available then we will get runtime exception saying "NoClassDefFoundError"
 *
 * 6. ExceptionInInitializerError
 * --> It is the child class of error and hence it is unchecked.
 * --> raised automatically by jvm if any exception occurs while executing static variable assignments
 * 		and static blocks.
		
		class Test{
		//	static int x = 10/0;//Exception in thread "main" java.lang.ExceptionInInitializerError
							   //Caused by: java.lang.ArithmeticException: / by zero
			
		//	static {
		//		String s = null;
		//		System.out.println(s.length());//Exception in thread "main" java.lang.ExceptionInInitializerError
		//					//Caused by: java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
		//	}
			public static void main(String[] args) {
			}
		}
 *
 * 7. IllegalArgumentException
 * --> it the child class of RuntimeException and hence it is unchecked.
 * --> raised explicitly either by programmer or by API developer to indicate
 * 	    that a method has been invoked with illegal argument.
 * 
 * eg:- the valid range of thread priority is 1 to 10, if we are trying to set
 * 		priority with any other value then we will get RE saying IllegalArgumentException. 

		Thread t = new Thread();
		t.setPriority(7);
//		t.setPriority(15);//RE:Exception in thread "main" java.lang.IllegalArgumentException

 *
 * 8. NumberFormatException
 * --> it is the child of direct child class of IllegalArgumentException which is 
 * 		the child class of RuntimeException and hence it is unchecked exception.
 * --> raised explicitly either by programmer or by API developer to indicate
 * 		that we are trying to convert String to number and the string is not
 * 		properly formatted.
			
			Integer i1 = Integer.valueOf("10");
			Integer i2 = Integer.valueOf("ten");//RE:Exception in thread "main" 
							//java.lang.NumberFormatException: For input string: "ten"
 *
 * 9. IllegalStateException
 * --> it is the child class of RuntimeException and hence it is unchecked.
 * --> raised explicitly either by programmer or API developer to indicate that a
 * 		method has been invoked at wrong time.
 * eg:- after starting of a thread we are allowed to restart same thread again
 * 		otherwise we will get RE saying IllegalThreadStateException

			Thread t = new Thread();
			t.start();
			t.start();//RE:Exception in thread "main" java.lang.IllegalThreadStateException
							at java.base/java.lang.Thread.start(Thread.java:791)
 * 		
 *
 * 10. AssertionError
 * --> it is the child class of error and hence it is unchecked.
 * --> raised explicitly by the programmer or by API developer to indicate that
 * 		assert statement fails.
 * eg:- assert(x > 10);
 * if x is not greater than 10 then we will get RE saying AssertionError
 * 
 */
	public static void main(String[] args) {}
}