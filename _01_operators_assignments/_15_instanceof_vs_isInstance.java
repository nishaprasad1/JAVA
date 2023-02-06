package _01_operators_assignments;

import java.util.Scanner;

public class _15_instanceof_vs_isInstance {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
		Thread t = new Thread();
		System.out.println(t instanceof Runnable);
	
		System.out.println("Enter class name");
		boolean flg = Class.forName(scanner.nextLine()).isInstance(t);//forname()-object bana ke deta hai
		System.out.println(flg);
		
	}
}
//isinstance()- is a method(if the class name is given at the run time we use instance because this will happen at run time )
