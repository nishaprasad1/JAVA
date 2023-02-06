package _07_Exception_handling;

public class _08_try_with_multiple_catch {
/*
 * 1. the way of handling exception is varied form exception to exception hence
 * 		for every exception type it is highly recommended to take separate 
 * 		catch block, ie try with multiple catch block is always possible and
 * 		recommended to use.
 
 <worst programming practice>   |  <Best programming practice>
 try{                        	|	try{
 	risky code        			|		risky code
 }								|	}
 catch(Exception e){			|	catch(AithmeticException e){
 								|		handling code
 }								|	}
 								|	catch(SQLException e){
 								|		use MySQL db instead of oracle db
 								|	}
 								|	catch(FileNotFoundException e){
 								|		use local file instead of remote file
 								|	}
 								|	catch(Exception e){
 								|		default exception handling
 								|	}
================================================================================ 								
 * 2. if try with multiple catch blocks is present then the order of catch blocks
 * 		is very important, we have to take child first then parent otherwise we
 * 		will get compiletime error saying "Exception XXX has already been caught". 
--------------------
class Test{
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch (Exception e) {
		}
//		catch (ArithmeticException e) {//CE: Unreachable catch block 
//									  //for ArithmeticException. It is already handled by
//									 //the catch block for Exception
//		}
	}
}
--------------------
class Test{
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch (ArithmeticException e) {           child
		}											 |	
		catch (Exception e) {                       \|/ 
		}                                           parent 
	}															
}
================================================================================
3. we cannot two catch block for the same exception otherwise we will get
 compile time error. 

class Test{
	public static void main(String[] args) {
		try{
			int i = 10/0;
		}catch (ArithmeticException e) {
		}
//		catch (ArithmeticException e) {//CE: Unreachable catch block 
//									  //for ArithmeticException. It is already
//			                         //handled by the catch block for ArithmeticException
//		}
	}
} 								
		
 */
}
