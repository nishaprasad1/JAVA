package _04_interface;

public class _10_interface_vs_abstract_class {
/*
 * Interface:
 * 1)If we don't know anything about implementation and just we have requirement
 * 		specification then we should go for interface.
 * 2) inside every method is public abstract whether we declaring or not hence
 * interface is considered as pure abstract class.
 * 3)As every interface method is always public and abstract, hence we cannot declare
 * with following modifiers:
 * 	private,protected,static,final,native,synchronised,strictfp
 * 4)every variable present inside interface is always public static final whether we
 * are declaring or not. 
 * 5)As every interface variable is always public static final we cannot declare 
 * 	with following modifiers:
 * private, protected,volatile,transient
 * 6)for interface variables compulsory we should provide initialization at the time
 * of declaration only otherwise we will get CE.
 * 7)Inside interface we cannot declare static and instance blocks.
 * 8)Inside interface we cannot declare constructors.
 * 
 * 
 * 
 * Abstract Class:
 * 1)if we are talking about implementation but not completely(partial implementation)
 * 	 then we should abstract class.
 * 2)every method present inside abstract class need not be public and abstract and we
 * 	 can take concrete methods also.
 * 3)there are no restrictions on abstract class modifiers.
 * 4)every variable inside abstract class need not be public static final.
 * 5) there are no restrictions on abstract class variable modifiers.
 * 6) for abstract class variables we are not required to perform at the time
 * of declaration.
 * 7)Inside abstract class we can declare static and instance blocks.
 * 8)Inside abstract class we can declare constructors
 * ---------------------------------
 * 
 * <Question> any way we cannot create object for abstract class, but abstract class
 * can contain constructor what is the need?
 * <Answer> abstract class constructor will be executed whenever we are creating 
 * 			child class object to perform initialization of child class object.
 * 
 *  ----------
 *  Note:
 *  1. either directly or indirectly we cannot create object for abstract class.
 *  2. anyway we cannot create objects for abstract class and interface but abstract
 *  	class can contain constructor but interface doesn't contain constructor, what
 *  	is the reason?
 * ans--> the main purpose of constructor is to perform initialization of instance variable
 *     			abstract class can contain instance which are required for child object
 *     			to perform initialization of those instance variable constructor is required
 *     			for abstract class.
 *     		
 *     but every variable present inside interface is always public static final whether
 *     we are declaring or not and there is no chance of existing instance variable 
 *     inside interface hence constructor concept not required for interface.
 *  3. whenever we are creating child class object, parent object won't be created just
 *  	parent class constructor will be executed for child object purpose only
      	eg:-
      	class P{
			P(){
				System.out.println(this.hashCode());
			}
		}
		class C extends P{
			C(){
				System.out.println(this.hashCode());
			}
		}
		class Runner{
			public static void main(String[] args) {
				C c = new C();
				System.out.println(c.hashCode());
			}	
		}
 * 4. Inside interface every method is abstract and we can take only abstract methods
 * 		in abstract class,then what is the difference b/w interface and abstract class
 * 		or is it possible to replace interface with abstract class?
 * ans--> we can replace interface with abstract class but its not a good programming
 * 			practice, this is something like recruiting IAS office for sweeping activity
 * 			
 * if everything is abstract then its highly recommended to go with abstract class
 //approach 1: abstract class
  abstract class X{
  
  }
  class Test extends X{
  
  }
  a)while extending abstract class it is not possible to extend any other class
    hence we are missing inheritance benefit.
  b)object creation is costly
    Test t = new Test();
    
------  
 //approach 2: interface
  interface X{
  
  }
  class Test implements X{
  
  }
  a)while implementing interface we can extend some other class and hence we won't
  	miss any inheritance benefit.
  b)object creation is not costly
   Test t = new Test(); 
 * 
 *     
 */
	public static void main(String[] args) {}
}
//approach 1: wihout having constructor in abstract class
//more code, code redundancy
/*class Person{
	String name;
	int age;
	String address;
	Date dob;
}
class Student extends Person{
	int rollNo;
	public Student(String name,int age,String address,Date dob,int rollNo) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.dob = dob;
		this.rollNo = rollNo;
	}
}
class Teacher extends Person{
	String subject;
	public Teacher(String name,int age,String address,Date dob,String subject) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.dob = dob;
		this.subject = subject;
	}
}
class Runner{
	public static void main(String[] args) {
		Student s = new Student("Chandrakesh", 26, "add 1 o39", new Date("23-Aug-1995"), 11);
		
		Teacher t = new Teacher("Geeta V Rao", 56, "Nchc colony", new Date(), "Maths");
	}
}*/

// approach 2: abstract class with constructor
// less code, code reusability
/*
class Person{
	String name;
	int age;
	String address;
	Date dob;
	//this will work as common constructor for each child initialization
	public Person(String name, int age, String address, Date dob) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.dob = dob;
	}
}

class Student extends Person{
	int rollNo;
	public Student(String name,int age,String address,Date dob,int rollNo) {
		super(name, age, address, dob);
		this.rollNo = rollNo;
	}
}

class Teacher extends Person{
	String subject;
	public Teacher(String name,int age,String address,Date dob,String subject) {
		super(name, age, address, dob);
		this.subject = subject;
	}
}
class Runner{
	public static void main(String[] args) {
		Student s = new Student("Chandrakesh", 26, "add 1 o39", new Date("23-Aug-1995"), 11);
		
		Teacher t = new Teacher("Geeta V Rao", 56, "Nchc colony", new Date(), "Maths");
	}
}*/
