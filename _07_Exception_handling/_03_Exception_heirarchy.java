package _07_Exception_handling;

public class _03_Exception_heirarchy {
/*
 * 1. Throwable class acts as root for java exception heirarchy.
 * 2. Throwable class defines two child classes 
 * 		(i) Exception
 * 		(ii)Error
		
		_______________________________Throwable_______________________________
		|						                                              |
	Exception																Error
		
 * (I)Exception:
 * 		Most of the time exceptions are caused by our program and these are recoverable.
 * 		for example if our programing requirement is reading data from file located at london,
 * 		at runtime if remote file is not available then we get runtime exception saying
 * 		FileNotFoundException.
 * 				If FileNotFoundException occurs we can provide local file and continue rest
 * 		of the program normally.
				
				try{
					Read data from remote file located at london
				}catch(FileNotFoundException e){
					use local file and continue rest
					of the program normally
				}
				
 * (II) Error:
 * 			Most of the times errors are not caused by our program and these are due to lack
 * 		of system resources, error are not recoverable.
 * 	for example OutOfMemoryError occurs then beign a programmer we cannot do anything and the
 * 	program will be terminated abnormally, sysad is responsible to increase heap memory.
----------

					_______________________________Throwable________________________________________________________
					|						                                                                       |
_________________Exception_________________________________________________________________						 Error
|                                     |               |                  |                 |...                    |
RuntimeException	              IOException       ServletException   RemoteException    InterruptedException     |
	   |                               |                                                             			   |
	   |---->ArithmeticException       |-->EOFileException                                  _______________________|_________________ 
       |---->NullPointerException      |-->FileNotFoundException                            |                |                      | ........
       |---->ClassCastException        |-->InterruptedIOException                         VMError      AssertionError    ExceptionInInitializerError     
       |---->IndexOutOfBoundsException                                                      |          
       |              |-->ArrayIOOBE                                                        |-->StackOverFlowError
       |              |-->StringIOOBE                                                       |-->OutOfMemoryError
       |
       |----> IllegalArgumentException
                      |-->NumberFormatException     	
 */
	
}
