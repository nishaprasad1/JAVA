package _04_interface;

public class _03_extends_vs_implements {
/*
 * 1) a class can extends only one class at a time.
 * 2) an interface can extend any number of interface simultaneously.
  		eg:- 
  		interface A{
		
		}
		interface B{
		
		}
		interface C extends A,B{
		
		}
--------------
 * 3) a class can implement any number of interface simultaneously
 * 4) a class can extends another class and can implement any number of interface
 * 		simultaneously.
  		eg:-  
  		class A extends B implements C,D,E{
			
		}
5) 
<Q1> which of the following is valid?
	(I)  A class can extend any no. of classes at a time.-----> invalid
	(II) A class can implement only one interface at a time.----> invalid
	(III) An interface can extends only one interface at a time.---> invalid
	(IV) an interface can implement any number of interface simultaneously.---> invalid
	(V) A class can extends another class or implement an interface but not both 
			simultaneously.---> invalid
	(VI)NOTA
<Q2> consider the following expression 
			X extends Y
	which of the following possibilities are valid?
	a)Both X and Y should be classes.
	b)Both X and Y should be interfaces.
	c)Both X and Y should be either classes or interfaces.-----> correct
	d)no restrictions
<Q3> X extends Y,Z
	answer:	X,Y,Z should be interface
<Q4> X implements Z,Y
	answer: X----> class
			Y,Z--> interface
<Q5> X extends Y implements Z
	answer: X,Y---> class
			Z-----> interface
<Q6> X implements Y extends Z	
	answer: CE 
 */
}