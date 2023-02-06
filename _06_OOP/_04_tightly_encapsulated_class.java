package _06_OOP;

public class _04_tightly_encapsulated_class {
/*
 * 1. A class is said to be tightly encapsulated if and only if each and every 
 * 		variable as private, whether class contains coressponding getters and setters
 * 		or not and whether these methods are declared as public or not thses things
 * 		we are not required to check.
 			eg:-
 			class Account{
				private double balance;
				public double getBalance() {
					return balance;
				}
			}
 *
 * 2. which of the following class are tightly encapsulated:-
  	(a)
  	class A{
		private int x=10;
	}
	class B extends A{
		int y=20;
	}
	class C extends A{
		private int z=30;
	}
---> A,C are tightly encapsulated.

	(b)
	class A{
		int x=10;
	}
	class B extends A{
		private int y=20;
	}
	class C extends B{
		private int z=30;
	}
---> none of the above	
 *
*NOTE:- if the parent class is not tightly encapsulated then no child is tightly encapsulated. 
 */
}
