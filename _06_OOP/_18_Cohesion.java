package _06_OOP;

public class _18_Cohesion {
/*
 * 1. for every component a clear well defined functionality is defined then that                        ___________________
 * 		component is said to follow high cohesion                                                        |                  |
 *                       					|												+------------+      		+---------+
     TotalServelet.java                     |                                     +---------|            |      		|reply.jsp|
    +-------------------------------+       |         +-------+                   |         | index.jsp  |      		+---------+
    |   login page display          |       |         | login |                   |         +------------+
 	|	   							|       |         | page  |                   |                     |        		+-----------+     
 	|	validation					|       |    |----+-------+         +------------------+            |_______________|compose.jsp|
 	|								|       |    |                      |                  |                      		+-----------+
 	|	inbox page					|       |    |                      |    validate      |
 	|								|       |    |______________________|     servlet      |
 	|	reply page					|       |                           |                  |
 	|								|       |                           |__________________|
 	|   compose page				|       |                                       |
 	|								|       |                                       |              +------------+
 	|	error page					|       |                                       |______________| error.jsp  |
 	|								|       |                                                      |            | 
 	|_______________________________|       |                                                      +------------+ 
 		(Low cohesion)                      |                   (High- cohesion)
 		
 		
 *
 * 2. high cohesion is always a good programing practice because it has several advantages.
 * 		a) without affecting other components we can modify any component hence enhancement will become easy.
 * 		b) it promotes reusability of the code(wherever validation is required we can use the same validate servlet without
 * 				rewriting).
 * 		c) it improves the maintainability of the application.
 * 
 * Note: lossely coupling and high cohesion are good programming practices.
 */
}
