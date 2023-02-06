package _03_decalaration_and_access_modifiers._02_class_level_modifier;

public class _03_abstract_class {
/*
 * 1.abstract is modifier applicable for classes and methods but not variable.
 * a) abstract method:-
 * 					even though we dont't know about implementation of method we
 * 		can still declare the method ie, for abstract method only declaration is
 * 		available but not implementation hence abstract method declaration should
 * 		end with semi-colon
 		eg:- 
 		public abstract class A{

	 		public abstract void m1();---> valid
			public abstract void m12() {
			};//error:Abstract methods do not specify a body
 		
 		}
	-child class is responsible to provide implementation for parent class abstract methods
--------------------------------------------------------------------------------	
		abstract class Vehicle{
			abstract public int getNoOfWheels(); 
		}
		class Bus extends Vehicle{
			@Override
			public int getNoOfWheels() {
				return 7;
			}
		}
		class Auto extends Vehicle{
			@Override
			public int getNoOfWheels() {
				return 3;
			}
		}
--------------------------------------------------------------------------------
	- by declaring abstract methods in parent class we can provide guidelines to child
	classes such that which method compulsory child has to implement
	- abstract method never talks about implementation,if any modifier talks about
	 implementation then it forms illegal combination with abstract modifier
	-following are illegal combination of modifiers for abstract method:
	  	abstract final
	  	abstract native
	  	abstract synchornized
	  	abstract static
	  	abstract private
	  	abstract strictfp
	 -eg:
	 	public final abstract void m();---> invalid	
--------------------------------------------------------------------------------
	b) abstract class:for any java class if we are not allowed to create object(because of
		  	partial implementation) such type of class we have to declare with
		  	abstract modifier. That is for abstract classes instantiation is not possible
		  	
		  	abstract class A{
				public static void main(String[] args) {
					A a = new A();//error:Cannot instantiate the type A
				}	
			}
	c) abstract class VS abstract method
		1) if a class contains at least one abstract method then compulsory we should
			declare class as abstract, otherwise we will get compile time error
			-if a class contains at least one abstract method then implementation is not
			complete and hence it is not recommended to create object,to restrict object 
			instantiation compulsory we should declare class as abstract.
		2)even though class doesn't contains any abstract method still we can declare class
		as abstract if we don't want instantiation that is abstract class can contain zero
		no. of abstract methods.
		eg:- <i>HttpServlet is abstract but doesn't contain any abstract methods.
		 	<ii>every adapter class is recommended to declare as abstract but it doesn't contain
		 		abstract method.
--> if we are extending any abstract class then for each and every abstract method of
 	parent class we should provide implementation otherwise declare child class as abstract.
-------------------------------------------------------------------------------------------
d) final VS abstract
 	 1) abstract method compulsory need to override and implemented but final method cannot
 	 	be overridden hence final abstract method is invalid
 	 2) abstract class forces to be inherited, whereas final class cannot be extended
 	  	hence final abstract class is invalid
 	 3)abstract class can contain final method,
 	  whereas final class cannot contain abstract method
 	  
 	  abstract class A{---> valid
		final public void m() {	}
	  }
	  
	  final class B{--->invalid
			abstract public void m();//The abstract method m in type B
							//can only be defined by an abstract class
	  }
 */
	
}
/*
class A{
	public void m();//error: missing method body or declare abstract
}
*/
/*
abstract class  A{
	public abstract void m() {}//error:Abstract methods do not specify a body
}*/

/*
class  A{
	public abstract void m();//The abstract method m in type A can only be defined by an abstract class
}*/

/*
abstract class A{
	public abstract void m1();
	public abstract void m2();
}
class B extends A{//The type B must implement the inherited abstract method A.m2()
	public void m1() {}
	
}
*/