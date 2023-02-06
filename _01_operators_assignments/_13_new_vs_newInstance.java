package _01_operators_assignments;

import java.util.Scanner;

public class _13_new_vs_newInstance {
	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * we can use 'new' operator to create object if we know class name at beginning
	 * eg: Student st = new Student();
	 * 
	 * newInstance() is a method present in Class class 
	 * we can use newInstance method to create object if we don't the class
	 * name at beginning and name is given dynamically at run time
	 * 
	 */
	public static void main(String[] args) throws Exception {
		Animal a1 = new Animal();
		System.out.println("using new keyword "+ a1.getClass().getSimpleName());
		
		System.out.println("****************************************");
		System.out.println("Enter full qualified class name");
		String s = scanner.nextLine();
		System.out.println(s);
		Object o = Class.forName(s).newInstance();
		System.out.println("using newInstance method "+ o.getClass().getSimpleName());
		
		/**
		 * using 'new' operator we can call any constructor
		 */
		Animal a2 = new Animal();
		Animal a3 = new Animal(101);
		Animal a4 = new Animal("Cow");
		
		/**
		 * but newInstnace internally calls no-arg constructor,
		 * to use newInstance() the corresponding class should have
		 * no-arg constructor 
		 */
//		Class.forName("_01_operators_assignments.Hero").newInstance(); error:java.lang.InstantiationException
		
		System.out.println("****************************************");
		
		/**
		 * while using 'new' keyword if the hardcoded class, is not found at 
		 * runtime then we will get runtime exception called NoClassDefFoundError
		 */
//		Mango m = new Mango(); error:NoClassDefFoundError
		
		/**
		 * while using newInstance() if the dot class file is not found at
		 * runtime exception we get ClassNotFoundException
		 */
		
//	               new              	  ||   newInstance()
//	1.It is an operator in java		  	  ||   1.it is a method present in java.lang.Class
//	2.used when class name known in	      ||   2.used when class name is given dynamically 
//		beginning.                        ||
//	3.to use new operator no-arg          ||   3.to use newInstance() no-arg constructor is 
//		constructor is not mandatory      ||	   mandatory.
//	4.at runtime if *.class file not      ||   4.at runtime if *.class file not found then
//		found then NoClassDefFoundError   ||		ClassNotFoundException is thrown
//		is thrown						  ||	
	}
}

class Animal{
	public Animal() {
		System.out.println("no-arg constructor");
	}
	public Animal(int i) {
		System.out.println("int-arg constructor");
	}
	public Animal(String name) {
		System.out.println("string-arg constructor");
	}
}

class Hero{
	public Hero() {
		System.out.println("Hero no arg constructor");
	}
	public Hero(int i) {
		
		System.out.println("Hiii");
	}
}
