package _11_inner_classes;
/*
Inner Class: sometimes we can declare a class inside another class, such type of 
			class are called inner class.
-->inner classes concept introduced in 1.1v to fix GUI bugs as a part of event handling
	but because of powerful features and benifts on inner classes slowly programmers
	started using in regular programming also.
--> without existing one type of object if there is no chance of exiting another type of 
object then we should go for inner classes.

example 1:
university contains several departments, without existing university there is no chance of
existing department, hence we have to decalare department class inside University class.

class University{-----------------> outer class
	class Department{----> inner class
	
	}
}

example 2:
without existing car object there is no chance of existing engine object, hence we have to
decalare engine class inside car class.
class Car{-----------------> outer class
	class Engine{----> inner class
	
	}
}

exapmle 3:
map is a roup of key-value pirs and each key-value pair is called an entry,
without existing map object there is no chance of existing entry object, hence 
interface entry is defined inside map interface.

interface Map{
	interface Entry{
	
	}
}
================================
Note: 
--> without existing outer class object there is no chance of exiting inner class
	object.
--> The relation b/w outer class and inner clas is HAS-A relationship(Composition/ Aggregation)
================================
Based on position of decalartion and behaviour all inner classes are divided into
4 types:
1)Normal or Regular IC
2)Method or local IC
3)Anonymous IC
4)Static Nested Classes

	
	1)Normal or Regular IC:
--> If we are declaring any named class directly inside a class wihout static modifier
	such type of IC is called Normal or Regular IC.

eg1:
file name:	<Outer.java>
		 	class Outer{
		 		class Inner{
		 		
		 		}
		 	}

javac Outer.java
      --> Outer.class
      --> Outer$Inner.class

java Outer
	--> RE: NoSuchMethodError: main
java Outer$Inner
	--> RE: NoSuchMethodError: main
~~~~~~~~~~~~	
eg2:
file name:	<Outer.java>
		 	class Outer{
		 		class Inner{
		 		
		 		}
		 		public static void main(String[] args){
		 			System.out.println("Outer class main method");
		 		}
		 	}

javac Outer.java
      --> Outer.class
      --> Outer$Inner.class

java Outer
	-->o/p:   Outer class main method
java Outer$Inner
	--> RE: NoSuchMethodError: main
~~~~~~~~~~~~	
eg3: 	
--> Inside inner class we cannot declare any static members, hence we cannot declare
main method and we cannot run Inner class directly from command prompt.
CE: inner class cannot have static declarations
--------------

case-1
--> accessing Inner class code from static area of outer class.
 
class Outer{
	class Inner{
		public void m1() {
			System.out.println("Inner class method");
		}
	}
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
		//or
		Outer.Inner i2 = new Outer().new Inner();
		i2.m1();
		//or
		new Outer().new Inner().m1();
	}
}

case-2:
--> accessing inner class code from instance area of outer class
class Outer{
	class Inner{
		public void m1() {
			System.out.println("Inner class method");
		}
	}
	public void m2() {
		Inner i = new Inner();
		i.m1();
	}
	public static void main(String[] args) {
		Outer o = new Outer();
		o.m2();
	}
}

case-3:
--> accessing inner class code from outside of outer class:
class Outer{
	class Inner{
		public void m1() {
			System.out.println("Inner class method");
		}
	}
}
class Test{
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
		//or
		Outer.Inner i2 = new Outer().new Inner();
		i2.m1();
		//or
		new Outer().new Inner().m1();
	}
}
===========

--> from Normal or regular inner class we can access both static and non-static members of 
outer class directly.

class Outer{
	int x=10;
	static int y=20;
	class Inner{
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
		new Outer().new Inner().m1();
	}
}
o/p:
10
20

--> within the inner class this always refers current inner class object, if we want to refer
current Outer class object, we have to use OuterClassName.this(ie, in this case Outer.this)

class Outer{
	int x=10;
	class Inner{
		int x=100;
		public void m1() {
			int x=1000;
			System.out.println(x);//1000
			System.out.println(this.x);//100
			System.out.println(Inner.this.x);//100
			System.out.println(Outer.this.x);//10
		}
	}
	public static void main(String[] args) {
		new Outer().new Inner().m1();
	}
}

--> the only applicable modifiers for outer classes are
 public,<default>,final,abstract,strictfp
--> But for inner classes applicable modifiers are 
 public,<default>,final,abstract,strictfp,private,protected,static
-------------------

 Nesting Of Inner classes:
 -->Inside inner class we can declare another inner class ie, nesting of inner class 
 is possible.
 
class A{
	class B{
		class C{
			public void m1() {
				System.out.println("Innermost class C");
			}
		}
	}
}
class Test{
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.m1();
		//or
		new A().new B().new C().m1();
	}
}
================

2)Method or local IC
--> Sometimes we can declare a class inside a method, such type of inner classes are called 
method or local IC.
--> the main purpose of method local IC is to define methos specific repeated functionality
--> method local IC are best suited to meet nested method requirements.
--> we can access method local inner classes, only within the method were we declare,
outside of the method we cannot access, because of its less scope method local
inner classes are most rarely used type of inner classes.

class Test{
	public void m1() {
		class Inner{
			public void sum(int x, int y) {
				System.out.println("sum: "+(x+y));
			}
		}
		Inner i = new Inner();
		i.sum(10, 20);
		;;;;;
		i.sum(100, 200);
		;;;;
		i.sum(1000, 2000);
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
o/p:
sum: 30
sum: 300
sum: 3000
-----------------

--> we can declare method local inner class inside both instance and static methods.
--> if we declare inner class inside instance method, then from that method local
inner class we can access both static and non-static members of outer class directly.
--> if we declare inner class inside a static method, then we can access only static
members of outer class direclty from that method local inner class

class Test{
	int x=10;
	static int y=20;
	public void m1() {
		class Inner{
			public void m2() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
o/p:
10
20
---

if we declare m1() method as static then at line-1 we will get 
CE saying non-static variable 'x' cannot be referenced from a static context

class Test{
	int x=10;
	static int y=20;
	public static void m1() {
		class Inner{
			public void m2() {
				System.out.println(x);//Line-1
				System.out.println(y);
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
-----------

--> from method local inner class we cannot access local variables of the
method in which we declare inner class.
--> if the local variable declared as final then we can access.

class Test{
	public void m1() {
		int x=10;
		class Inner{
			public void m2() {
				System.out.println(x);//Line-1
				
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
at Line-1 the variable x is made by compiler effectively final hence no worries,
but we cannot perfom any modification to variable x.
--> if we declare x as final then we wont get any compile time error.

Q.
Conside the following code:
class Test{
	int i=10;
	static int j=20;
	public void m1() {
		int k=30;
		final int m=40; 
		class Inner{
			public void m2() {
				//Line-1
			}
		}
		Inner i = new Inner();
		i.m2();
	}
}
At Line-1 which of the following variables we can access directly
A) i
B) j
C) k
D) m
answer: A,B,D
---

Q.
If we declare m1() method as static then:
class Test{
	int i=10;
	static int j=20;
	public static void m1() {
		int k=30;
		final int m=40; 
		class Inner{
			public void m2() {
				//Line-1
			}
		}
		Inner i = new Inner();
		i.m2();
	}
}
At Line-1 which of the following variables we can access directly
A) i
B) j
C) k
D) m
answer: B,D
---

Q. If we declare m2() method as static then at Line-1, which
varible we can access directly?

class Test{
	int i=10;
	static int j=20;
	public void m1() {
		int k=30;
		final int m=40; 
		class Inner{
			public static void m2() {
				//Line-1
			}
		}
		Inner i = new Inner();
		i.m2();
	}
}
A) i
B) j
C) k
D) m
E) CE
answer: we will get CE, as we cannot declare static members inside inner classes.
----
--> the only applicable modifiers for method local IC are:
final,abstract,strictfp. If we are trying to apply any other modifier we will get CE
==============================

3)Anonymous IC
--> sometimes we can declare IC without name, such type of inner classes
are called anonymous IC.
--> the main purpose of anonymous IC is just for instant use(one time usage).
--> based on declaration and behavious there are 3 types of IC:
1. Anonymous IC that extends a class
2. Anonymous IC that implements an interface
3. Anonymous IC that defined inside arguments


1. Anonymous IC that extends a class:

class Popcorn{
	public void taste() {
		System.out.println("salty");
	}
}
class Test{
	public static void main(String[] args) {
		Popcorn p = new Popcorn() {
			public void taste() {
				System.out.println("spicy");
			}
		};
		p.taste();//spicy
		Popcorn p1 = new Popcorn();
		p1.taste();//salty
		Popcorn p2 = new Popcorn() {
			public void taste() {
				System.out.println("sweet");
			}
		};
		p2.taste();//sweet
		System.out.println(p.getClass().getName());//Test$1
		System.out.println(p1.getClass().getName());//Popcorn
		System.out.println(p2.getClass().getName());//Test$2
	}
}
-->total 4 .class file will be generated
Popcorn.class, Test.class, Test$1.class, Test$2.class
-------------

 1) Popcorn p = new Popcorn();
 2) Popcorn p = new Popcorn(){
  	// we are declaring a class that extends Popcorn wihout a name(Anonymous IC)
	// for that child class we are creating parent reference
  	};
  
 3) Popcorn p = new Popcorn(){
 		public void taste(){
 			System.out.println("spicy");
 		}
  	}
  	--> we are declaring a class that extends Popcorn wihout a name(Anonymous IC), in that
  	 	child class we are overrding taste method.
  	--> for that child class we are creating parent reference.

==> defining a Thread by extending Thread class.

class Test{
	public static void main(String[] args) {
		Thread t = new Thread() {---------------> A.I.C.
			public void run() {
				for(int i=0; i<10; i++)---------> JOB
					System.out.println("child thread");
			}
		};
		t.start();
		for(int i=0; i<10; i++)
			System.out.println("main thread");
	}
}
=============================================

2. Anonymous IC that implements an interface
--> defining a thread by implementing runnable interface

   	 class Test{
		public static void main(String[] args) {
			Runnable r = new Runnable() {
				public void run() {
					for(int i=0; i<10; i++)
						System.out.println("child thread");
				}
			};
			Thread t = new Thread(r);
			t.start();
			for(int i=0; i<10; i++)
				System.out.println("main thread");
		}
	}
=========================================================

3. Anonymous IC that defined inside arguments

	class Test{
		public static void main(String[] args) {
			new Thread(new Runnable() {
				public void run() {
					for(int i=0; i<10; i++)
						System.out.println("child thread");
				}
			}).start();
		
			for(int i=0; i<10; i++)
				System.out.println("main thread");
		}
	}
====================

	Normal java class vs Anonymous Inner class
1. a normal java class can extend only one class at a time, ofcourse anonymous IC
	also can extend only one class at a time.
2. A normal java class can implement any number of interface simultaneously but
	anonymous can implement only one interface at a time.
3. A normal java class can extend a class and can implement any number of interface
 simultaneously but anonymous inner class can extend a class or implement an 
 interface but not both simultaneously.
4. In normal java class we can write any number of constructors, but in anonymous
 	inner classes we cannot write any constructor explicitly(because the name and the 
 	name of constructor must be same but anonymous IC not having any name).

Note: If the requirement is standard and required several times, then we should go for
normal top level class. If the requirement is temporary and only required once(instant use)
then we should go for anonymous inner class.
---
Q. where anonymous inner class best suitable?
--> we can use anonymous IC frequently in GUI based application, to implement
event handling.
=======================================

4)Static Nested Classes
--> sometimes we can declare inner class with static modifier, such type of IC are called
static nested classes.
--> In the case of normal or regular inner class without existing outer class object,there
no chance of existing inner class object. ie, inner class object is strongly associated
with outer class object. But in the case of static nested class object without existing
outer class object there may be a chance of existing nested class object. Hence static
nested class object is not strongly associted outer class object.

 	class Test{
		static class Nested{
			public void m1() {
				System.out.println("static nested class method");
			}
		}
		public static void main(String[] args) {
			Nested n = new Nested();
			n.m1();
		}
	}
--> if we want to create nested class object from outside of Outer class then we 
can create as follows:
	Test.Nested n= new Test.Nested();
--> In normal or regular inner classes we cannot declare any static members, but 
		in static nested classes we can declare static members including main()
		method, hence we can invoke static nested class directly from command prompt.

	class Test{
		static class Nested{
			public static void main(String[] args) {
				System.out.println("static nested class main method");
			}
		}
		public static void main(String[] args) {
			System.out.println("outer class main method");
		}
	}
	javac Test.java
	java Test
			--> o/p: outer class main method
	java Test$Nested
			--> o/p: static nested class main method
			
--> from normal or regular inner classes we can access both static and non-static
members of outer class directly, but from static nested classes we can access 
static members of outer class directly and we cannot access non-static members

class Test{
	int x=10;
	static int y=20;
	static class Nested{
		public static void m1() {
			System.out.println(x);//CE no-static variable x cannot be referenced from static context
			System.out.println(y);//20
		}
	}
}
 */
public class _01_Introduction {public static void main(String[] args) {}}