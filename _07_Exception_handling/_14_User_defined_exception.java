package _07_Exception_handling;

import java.util.Scanner;

public class _14_User_defined_exception {
/*
 * 1. sometime to meet programming requirement we can define our own exceptions
 * 		such type of exceptions are called customised or user defined exceptions.
 * 		eg:- TooYoungException, TooOldException, InSufficientFundsException
 * 
 * Note: 1) throw keyword is best suitable for user defined or customised exception
 * 			but not for pre-defined exceptions.
 * 		 2) it is highly recommended to define customised exceptions as unchecked
 * 			ie we have to extend RunTimeException but not Exception 
 */
	public static void main(String[] args) {}
}
class TooYoungException extends RuntimeException{
	TooYoungException(String s){
		super(s);//to make description available to default exception handler
	}
	
}
class TooOldException extends RuntimeException{
	TooOldException(String s){
		super(s);//to make description available to default exception handler
	}
}
class CustomException{
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		if(age > 60)
			throw new TooYoungException("plz wait some more time you we get best match soon");
		else if(age <18)
			throw new TooOldException("your age has alredy crossed limit, no chance to get match");
		else
			System.out.println("you will get math details soon by email");
	}
}