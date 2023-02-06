package _99_certification_11;
/*
 
 
 
 
 */
public class _20_Constructor_vs_Clone {
public static void main(String[] args) { }
}
class Student implements Cloneable{
	String name;
	int rollNo;
	Student(String name, int rollNo){
		System.out.println("student constructor called");
		this.name=name;
		this.rollNo=rollNo;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1= new Student("durga", 101);
		Student s2=(Student) s1.clone();
		System.out.println(s2.name+":"+s2.rollNo);
	}
}