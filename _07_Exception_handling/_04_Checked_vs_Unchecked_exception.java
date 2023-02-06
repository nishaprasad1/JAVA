package _07_Exception_handling;

public class _04_Checked_vs_Unchecked_exception {
/*
 * 1. Checked exceptions:
 * the exceptions which are checked by compiler form smooth execution of the 
 * program are called checked exceptions.
 * eg:- FileNotFoundException
 * 
 * In our program is there is chance of raising checked exception then compulsary
 * we should handle that checked exception(either by try-catch or throws keyword)
 * otherwise we will get compiletime error.
 * 
 *  2. Unchecked exceptions:
 *  the exceptions which are not checked by compiler whether programmer handling or
 *  not, such type of exceptions are called unchecked exceptions
 *  eg:- ArithematicException
 *  
 *   Note: 1)whether it is checked or unchecked every exception occurs at runtime only
 *   		 there is no chance of occuring any exception at compile time.
 *   	2) RuntimeException and its child classes, Error and its child classes are unchecked
 *   		except thses remaining are checked
 *   
 * 
 * ===> fully checked vs partially checked
 * a) A checked exception is said to be fully checked if and only if all its child classes alos checked
 * 		eg:- IOException,InterruptedException
 * b) A checked exception is said to be partially checked if and only if some of its child classes are
 * 		unchecked.
 * 		eg:- Exception, Throwable
 * 
 * Note: the only possible partially checked exception are Exception, Throwable.
 * 
 *  Q) Describe the behaviour of following exception:
 *  (i)IOException----------------------------->checked(fully)
 *  (ii)RuntimeException----------------------->unchecked
 *  (iii)InterruptedException------------------>checked(fully)
 *  (iv)Error---------------------------------->unchecked
 *  (v)Throwable------------------------------->checked(partially)
 *  (vi)ArithmeticException-------------------->unchecked
 *  (vii)NullPointerException------------------>unchecked
 *  (viii)Exception---------------------------->checked(partially)
 *  (ix)FileNotFoundException------------------>checked(fully)
 *  
 */
}
