package _05_loopholes_interface_abstract_class;

public class _01_new_vs_constructor {
/*
 * 1. the main objective of new operator is to create an object,the main purpose
 * 		 of constructor is to initialize object. First the object is created by using 'new'
 * 		operator and then initialization will be performed by constructor.
 */
	public static void main(String[] args) {
		Student s = new Student("Chandrakesh", 23);
	}
}
class Student{
	private String name;
	private int rollNo;

	Student(){
	}
	Student(String name, int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
}