package _04_interface;

public class _09_interface_vs_abstract_class_vs_concrete_class {
/*
 * 1. if we don't know any thing about implementation just we have requirement 
 * 		specification then we should go for interface.
 * 		eg:- Servlet(I)
 * 
 *  2. if we are talking about implementation but not completely(Partial implementation)
 *  	then we should go for abstract class.
 *  	eg:- GenericServlet(AC), HttpServlet(AC)
 *  
 *  3. if we are talking about implementation completely and ready to provide service
 *  	then we should go for concrete class.
 *  	eg:- our own custom servlet class  
 						 
 						 example					real life example		
 			Interface <============> Servlet(I)-----------------------> building plan
 			   /|\                      /|\                                 /|\
 			  	|						 | 		                             |
 			  	|						 |                                   |
 			Abstract  <============> GenericServlet(AC),--------------> partially completed
 			  class                   HttpServlet(AC)						building
 			   /|\						/|\									/|\
 			    |						 |									 |
 			    |						 |									 |
 			 Concrete <============> my own servlet-------------------> fully completed 
 			 	class					class								building
 			 							
 */
}
