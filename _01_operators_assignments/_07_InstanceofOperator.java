package _01_operators_assignments;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class _07_InstanceofOperator {
	//	instanceof operator
	//	we use instanceof operator to check the object is of give type or not

	public static void main(String[] args) {

		List list= new ArrayList();
		list.add("Chandrakesh");
		list.add(new Date());
		list.add(23);
		list.add(new Student_07());

		for(Object o : list) {
			if(o instanceof Date)
				System.out.println(o+" is date");
			if(o instanceof String)
				System.out.println(o+" is string");
			if(o instanceof Integer)
				System.out.println(o+" is integer");
			if(o instanceof Student_07) {
				Student_07 s = (Student_07)o;
				System.out.println(o+" is student");
			}
		}
		
		System.out.println("****************************************");
		
		/**
		 * Syntax: r instanceof X
		 * r is object reference
		 * X is class/interface name
		 */

//		1.
		Thread t = new Thread();
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Runnable);

		System.out.println("****************************************");
		
		/**
		 * to use instanceof operator there should be some relation between
		 * arguments type parent-> child or child->parent or same type
		 */
//		2.
		Thread t1 = new Thread();
//		System.out.println(t1 instanceof String);error:Incompatible conditional operand types Thread and String
		
		System.out.println("****************************************");
//		3.
		/**
		 * for any class/interface X, null instanceof X is false
		 */
		System.out.println(null instanceof Thread); //false
		System.out.println(null instanceof Object); //false
		System.out.println(null instanceof Runnable);//false

	}

}
class Student_07{}
