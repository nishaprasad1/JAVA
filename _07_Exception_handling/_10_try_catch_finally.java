package _07_Exception_handling;

public class _10_try_catch_finally {
/*
 * 1. In try-catch-finally order is important
 * 2. whenever we are writing try compulsary we should either catch or finally
 * 		 otherwise we will get compile time error, ie try without catch or finally
 * 		is invalid.
 * 3. whenever we are writing catch block, compulsary try block must be required
 * 		ie catch without try is invalid
 * 4. whenever we are writing finally block, compulsary we should write try block
 * 		ie finally without try is invalid.
 * 5. inside try-catch-finally block we can declare try-catch-finally block
 * 		ie nesting of try-catch-finally is allowed.
 * 6. for try catch finally blocks curly braces are mandatory
 */
	public static void main(String[] args) {
//		1.------------>valid
		try {

		}catch (X e) {

		}
		
//		2.----------->valid
		try {
			
		}catch (X e) {

		}catch (Y e) {

		}
		
//		3.----------->invalid
//		try {
//			
//		}catch (X e) {
//
//		}catch (X e) {//CE:Unreachable catch block for X.
//					 //It is already handled by the catch block for X
//		}
		
//		4.------------>valid
		try {
			
		}catch (X e) {

		}finally {
			
		}
		
//		5.-------->valid
		try {
			
		}finally {
			
		}
		
//		6.
		try {
			
		}catch (X e) {
		}
		try {
			
		}catch (Y e) {

		}
		
//		7.
		try {
			
		}catch (X e) {
			
		}
		try {
			
		}finally {
			
		}
		
//		8.
//		try {
//			
//		}//CE: Syntax error, insert "Finally" to complete TryStatement
		
//		9.
//		catch(X e) {
//			
//		}
		
//		10.
//		finally {
//			
//		}
		
//		11.
//		try {
//			
//		}finally {
//			
//		}catch (Exception e) {---> order should be try-catch-finally
//
//		}
		
//		12.
//		try {----------------------> catch or finally missing
//			
//		}
//		System.out.println("hello");
//		catch (X e) {------------>try missing
//
//		}
		
//		13.
//		try {
//			
//		}catch(X e) {
//			
//		}
//		System.out.println("hello");
//		catch(Y e) {--------------------> catch without finally
//			
//		}
		
//		14.
//		try {
//			
//		}catch (X e) {
//
//		}
//		System.out.println("hello");
//		finally {------------------------> try block missing
//			
//		}
		
//		15.
		try {
			try {

			}catch (X e) {

			}
		}catch (X e) {

		}
		
//		16.
//		try {
//			try {
//				
//			}------> catch missing
//		}catch (X e) {
//
//		}
		
//		17.
		try {
			try {
				
			}finally {
				
			}
		}catch (X e) {

		}
		
//		18.
		try {
			
		}catch (X e) {
			try {
				
			}finally {
				
			}
		}
		
//		19.
//		try {
//			
//		}catch (X e) {
//			finally {-----> try missing
//				
//			}
//		}
		
//		20.
		try {
			
		}catch (X e) {

		}finally {
			try {
				
			} catch (X e) {

			}
		}
		
//		21.
//		try {
//			
//		}catch (X e) {
//
//		}finally {
//			finally {-----> try block missing
//				
//			}
//		}
		
//		22.
//		try {
//			
//		} catch (X e) {
//
//		}finally {
//			
//		}
//		finally {----->try block missing
//			
//		}
		
//		23.
//		try----------------------------> curly braces important
//		Ststem.out.println("try");
//		catch(X e) {
//			
//		}finally {
//			
//		}
		
//		24.
//		try {
//			
//		}catch (X e)------------------------> curly braces missing
//			System.out.println("catch");
//		finally {
//			
//		}
		
//		25.
//		try {
//			
//		}catch(X e) {
//			
//		}finally---------------------------> curly braces missing 
//		System.out.println("finally");
	}

}
class X extends ArrayIndexOutOfBoundsException{}
class Y extends NullPointerException{}