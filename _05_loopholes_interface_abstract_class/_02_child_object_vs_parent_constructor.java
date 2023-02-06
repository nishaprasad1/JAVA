package _05_loopholes_interface_abstract_class;

public class _02_child_object_vs_parent_constructor {
/*
 * whenever we are creating child class object automatically parent constructor
 * will be executed to perform initialization for the instance variable which are 
 * inheriting form parent.

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
class _Student extends Person{
	int rollNo;
	int marks;
	public _Student(String name, int age, int rollNo, int marks) {
		super(name, age);
		this.rollNo = rollNo;
		this.marks = marks;
	}
} 
 ---> in the above program both parent and child constructor executed for child object
   		initialization only.
============================================================
when ever we are creating child class object parent constructor will be executed but
parent object won't be created

  class P{
		P(){
			System.out.println(this.hashCode());//1072591677
		}
	}
	class C extends  P{
		C(){
			System.out.println(this.hashCode());//1072591677
		}
	}
	class Runner{
		public static void main(String[] args) {
			C c = new C();
			System.out.println(c.hashCode());//1072591677
		}
	}
-- in the above example we just created child class object but both parent and
child constructors executed for that child class object.
 */
	public static void main(String[] args) {
		_Student s = new _Student("chandrakesh", 26, 101, 67); 
	}
}
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
class _Student extends Person{
	int rollNo;
	int marks;
	public _Student(String name, int age, int rollNo, int marks) {
		super(name, age);
		this.rollNo = rollNo;
		this.marks = marks;
	}
}