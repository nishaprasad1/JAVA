package _07_Exception_handling;

public class _05_try_catch {
/*
 * 1. it is highly recommended to handle exception, the code which may raise
 * 		exception is called risky code and we have to define that code inside
 * 		try block and coressponding handling code we have to define inside
 * 		catch block.

					try{
					  risky code 
					}catch(Exception e){
						handling code
					}
----------
without try-catch ---->(abnormal termination)						| with try-catch ----->(normal termination)
class Test{															| class Test{
  	public static void main(String[] args){							|		public static void main(String[] args){
 		System.out.println("stmnt 1");								|			System.out.println("stmnt 1");
 		System.out.println(10/0);									|			try{
 		System.out.println("stmnt 3");								|				System.out.println(10/0);
 	}																|			}catch(ArithmeticException e){
}																	|				System.out.println(10/2);
o/p:																|			}
stmnt 1																|			System.out.println("stmnt 3");
Exception in thread "main" java.lang.ArithmeticException: / by zero	|		}	
	at _07_Exception_handling.Test.main(_05_try_catch.java:30)		| }
																	|o/p:
																	|stmnt 1
																	|5
																	|stmnt 3
																	|
 */
	public static void main(String[] args) {}
}
class Test_05{
  	public static void main(String[] args){
 		System.out.println("stmnt 1");
 		try{
 			System.out.println(10/0);
 		}catch (ArithmeticException e) {
 			System.out.println(10/2);
 		}
 		System.out.println("stmnt 3");
 	}
}