package _11_inner_classes;
/*
--> various combinations of nested classes and interfaces:
case-1: class inside a class
	--> without existing one type of object if there is no chance of existing another 
	 	type of object then we can declare a class inside a class.
	 	
	eg:- university consists of several departments, without existing university 
			there is no chance of existing department, hence we have to declare
			department class inside university class.
			
			 class University{
			 	class Department{
			 	
			 	}
			 }

case-2: interface inside a class
--> inside a class if we require multiple implementations of an interface and all
these implementaions are related to a particular class, then we can define interface
inside a class.
		
		class VehicleTypes{
			interface Vehicle{
				public int getNoOfWheels();
			}
			class Bus implements Vehicle{
				public int getNoOfWheels() {
					return 6;
				}
			}
			class Auto implements Vehicle{
				public int getNoOfWheels() {
					return 3;
				}
			}
		}

case-3: interface inside interface
--> we can declare interface inside interface
eg: a map is a group of key-value pair and each key-value pair is called an entry.
 without existing map object there is no chance of existing entry object, hence interface
 entry is defined inside map interface.
 
 interface Map{
 	interface Entry{
 
 	}
 }
 
 --> every interface present inside interface is always public and static whether we
 are declaring or not. Hence we can implement inner interface directly without implementing
 outer interface. Similary whenever we are implementing ouer interface we are not required
 to implement inner interface. ie, we can implement inner and outer interfaces independently.
 
 interface Outer{
	void m1();
	interface Inner{
		void m2();
	}
}
class Test1 implements Outer{
	public void m1() {
		System.out.println("Outer interface method implementation");
	}
}
class Test2 implements Outer.Inner{
	public void m2() {
		System.out.println("Inner interface method implementation");
	}
}
class Test{
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.m1();//Outer interface method implementation
		
		Test2 t2 = new Test2();
		t2.m2();//Inner interface method implementation
	}
}

case-4: class inside interface
--> If a functionality of a class is closely associated with interface, then it is
highly recommended to declare class inside interface.

interface EmailService{
	public void sendEmail(EmailDetails e);
	
	class EmailDetails{
		String to_List;
		String cc_List;
		String subject;
		String body;
	}
}
--> In the above example EmailDetails is required only for EmailService and we are not
using anywhere else, hence EmailDetails class is recommended to declare inside
EmailService interface.

--> we can also implement a class inside interface to provide default implementation
for that interface.

 interface Vehicle{
	int getNoOfWheels();
	class DefaultVehicle implements Vehicle{
		public int getNoOfWheels() {
			return 2;
		}
	}
}
class Bus implements Vehicle{
	public int getNoOfWheels() {
		return 6;
	}
}
class Test{
	public static void main(String[] args) {
		Vehicle.DefaultVehicle v1 = new Vehicle.DefaultVehicle();
		System.out.println(v1.getNoOfWheels());//2
		
		Bus v2 = new Bus();
		System.out.println(v2.getNoOfWheels());//6
	}
}
--> In the above example default vehicle is the default implementation of vehicle
interface, whereas Bus is customized implementation of Vehicle interface.

Note: The class which is declared inside interface is always public static whether we
declare or not hence we can create class object directly without having outer interface
type object.

Conclusions:
1. Among classes and interfaces we can declare anything inside anything.
class A{
	class B{
	}
}
--
class A{
	interface B{
	}
}
--
interface A{
	interface B{
	}
}
--
interface A{
	class B{
	}
}
all are valid

2. the interface which is declared inside interface is always public and static whether
	we are declaring or not.
3. the class which is declared inside interface is always public and static whether
	we are declaring or not.
4. the interface which is declared inside a class is always static but need not be public.	
 */
interface Vehicle{
	int getNoOfWheels();
	class DefaultVehicle implements Vehicle{
		public int getNoOfWheels() {
			return 2;
		}
	}
}
class Bus implements Vehicle{
	public int getNoOfWheels() {
		return 6;
	}
}
class Test{
	public static void main(String[] args) {
		Vehicle.DefaultVehicle v1 = new Vehicle.DefaultVehicle();
		System.out.println(v1.getNoOfWheels());//2
		
		Bus v2 = new Bus();
		System.out.println(v2.getNoOfWheels());//6
	}
}
public class _02_nested_class_and_interface {public static void main(String[] args) {}}
