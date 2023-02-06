package _07_Exception_handling;

public class _09_final_vs_finally_vs_finalize {
/*
 * 1. final: final is the modifier applicable for classes,methods and variables. 
 * 			-->	if a class declared as final then we cannot extend that class ie,
 * 		we cannot create child class for that class.Inheritance is not possible for
 * 		final classes.
 * 			--> if a method is final then we cannot override that method in child 
 * 				class.
 * 			--> if a variable is declared as final then we cannot perform re-assignment
 * 				for that variable.
 * 
 * 2. finally: finally is a block always associated with try-catch to maintain clean up
 * 				code.
						try{
							risky code
						}catch(Exception e){
							handling code
						}finally{
							clean up code
						}
 *
 *			--> the speciality of finally block is it will be executed always irrespective
 *				of whether exception is raised or not raised and whether handled or not
 *				handled.
 *
 * 3. finalize() : it is a method always invoked by garbage collector just before destroying
 * 					an object to perform clean up activities, once finalize method completes
 * 					immediately grabage colletor destroys that object.
 * 
 *  Note: finally block is responsible to perform clean up activites related to try block,
 *  		ie whatever resources we opened as a part of try block will be closed inside
 *  		finally block.
 *  	finalize method is responsible to perform clean up activities related to object,
 *  		ie whatever resources associated with object will be deallocted before destroying
 *  		the object by using finalize method.
 */
}
