package _06_OOP;

public class _06_has_A_relationship {
/*
 * 1. has-A realtionship is also known as composition or aggregation.
 * 2. there is no specific keyword to implement has-A relation but most of the
 * 		time we are depending on new keyword.
 * 3. the main advantage of has-A relationship is reusability of the code.
  			class Car{
				Engine e = new Engine();
			}
			class Engine{
				//engine specific functionality
			}
		       ++++++++++++++++++++++++++++++			
			   | Car Has-A Engine Reference	|
			   ++++++++++++++++++++++++++++++
			   
 * 4. Composition vs Aggregation
 *  a)Composition: without existing container object if there no chance of existing contained objects
 *  	then container and contained objects are strongly associated and this strong
 *  	assotiaion is nothing but composition
 *  	--> university consistes of several departments without existing university
 *  			there is no chance of existing departments hence university and departments
 *  			are strongly associated and this strong association is called composition.
         
           +++++++++++++++++++++++++++++++++++++++++
           |____________               ____________|
           |  CSE dept. |             | ECE dept.  | 
           |------------+             +---+--------|     Contained object
           |                              |________|_____/      
           |____________               ____________|    
           |  EEE dept. |             | MECH dept. | 
           |------------+             +------------| 
           |                                       |
           +++++++++++++++++++++++++++++++++++++++++
 			<--------- University----------------->
 			         container object
 *
 * b)Aggregation: without existing container object if there is chance of exiting contained
 * 					object then container and contained objects are weekly associated
 * 					and this week association is nothing but aggregation.
 *       --> department consists of several professors without existing department there may
 *       		chance of existing professor objects hence department and professor objects
 *       		are weekly associated and this is called aggregation.
 
		     |+++++++|------> P1                          
		     |+++++++|                                    P1,P2,P3 are
		     |+++++++|----->P2                            contained object
		     |+++++++|
		     |+++++++|---------------->P3
		   	Department
		(Container object)
 *
 * Note: a)In composition objects are strongly associated whereas in aggregation objects
 * 		   are weakly associated.
 * 		b)In composition container holds directly contained objects whereas in aggregation 
 * 			container object holds just references of contained object. 
 */
}
