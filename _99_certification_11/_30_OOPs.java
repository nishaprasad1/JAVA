package _99_certification_11;
/*
 Object Oriented Programming(OOPs):
 
1. Data Hiding:
--> Hiding of our data.
--> Outside person should not access our data directly.
--> Our internal data should not go out directly.
--> By using private modifier we can implement, data hiding.

class Account{
	private double balance;
	public double getBalance() {
		//verification process
		return balance;
	}
}

--> recommended modifier for data members: private

2. Abstraction:
--> hide implementation details.
--> Just highlight only services what we are providing.
--> hiding our internal implementation details.

advantages:
1.security
2.enhancement will become very easy
3.Maintainability of application
4.modularity of application

--> by using abstract classes and interfaces we can implement abstraction.

3. Encapsulation:
--> The process of binding data and corresponding methods into single unit.
	Encapsulation = Data hiding + abstraction

advantages:
1.security
2.enhancement will become very easy
3.Maintainability of application
4.modularity of application
====================

 */
public class _30_OOPs {
	public static void main(String[] args) {

	}
}

class Account{
	private double balance;
	public double getBalance() {
		//verification process
		return balance;
	}
}