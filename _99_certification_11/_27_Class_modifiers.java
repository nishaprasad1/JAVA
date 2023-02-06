package _99_certification_11;
/*
Class Modifiers:
--> whether this can be accessible from anywhere or not whether child
	class creation is possible or not whether object creation is
	possible or not.
	
Top level class:
public,<default>,final,abstract,strictfp

public: means we can access from anywhere.
final: means child class creation is not possible.
abstract: means we cannot create object.

Q.
private class Test{----> CE: as top level class cannot be private

}
======

Inner class:
public,<default>,final,abstract,strictfp,private,protected,static

Q. which of the following modifiers applicable only for inner classes
	but not for top level classes?
A) private
B) protected
C) static
D) All of these

answer: D
---

Q. which of the following modifiers applicable for top level classes?
A) private
B) protected
C) static
D) None of these

answer: D
---

Q. which of the following modifiers applicable for top level classes?
A) public
B) protected
C) private
D) static

answer: A
---

Q.
private class Test{
	public static void main(String[] args){
		int i=0;
		for(int j=0;j<3;j++){
			i=i+j;
		}
		System.out.println(i);
	}
}

what is the result?
A) 3
B) 6
C) 0
D) Compilation fails.

answer: D
explanation: For top level classes we cannot use private modifier.
---

Q.
	private static class A{
		public void m1() {
			System.out.print("A");
		}
	}
	protected static class B{
		public void m2() {
			System.out.print("B");
		}
	}
	public static void main(String[] args) {
		A a= new A();
		B b= new B();
		a.m1();
		b.m2();
		System.out.println("C");
	}
what is the result?
A) Compilation fails because we cannot declare class A as private.
B) Compilation fails because we cannot declare class B as protected.
C) Compilation fails because we cannot declare class A as private and class B 
	as protected.
D) It will print ABC to the console.

answer: D
explanation: we should assume A and B are inner classes and private,protected and 
			static modifiers are applicable.
---

Q.
s1: every method present inside final class is always final.
s2: every variable present inside final class is always final.

answer: s1
=============
Abstract modifier:
classes, methods===> applicable

abstract methods: it has only declaration but not implementation.
public abstract void m1();

Q.which of the following method declarations are valid in side java class?
A)public void m1();
B)public void m1(){}
C)public abstract void m1();
D)public abstract void m1(){};

answer: B,C
---

Q. abstract modifiers applicable for?
A) only classes
B) only methods
C) only variables
D) only classes and methods
E) only classes and variables

answer: D
---

--> absrtact method never talks about implementation. If any modifier talks
about implementation, then it will become enemy to abstract and that 
combination will become illegal.

--> abstract   invalid combination with-> 
			final
			static
			synchronized
			native
			strictfp
			private

Q.
abstract class P{
	abstract void m1();
}
class C extends P{
	void m1(){}
}

The code compiles fine even though we are declaring abstract as public.

Q. which of the modifiers are allowed for abstract methods?
A)final
B)static
C)synchronized
D)native
E)strictfp
F)private
G)None of these
answer: G
=================

Abstract class: partially implemented class is called abstract class. It can not be
				instantiated.

Abstract class vs Abstract Method:
1. If a class contains atleast one abstract method, then compulsory class should be declared
	as abstract, otherwise we will get compile time error.
2. An abstract class can contain zero number of abstract methods also.

Q. which of the following are TRUE?
A) an abstract class should contain atleast one abstract method.
B) an abstract class can contain both abstract and concrete methods.
C) An abstract class can contain zero number of abstract method.
D) If every method present inside a class is abstract, then only
	we should declare class as abstract.
E) If a class contains atleast one abstract method, then we should declare
	class as abstract.
F) If abstract class does not contains any abstract method, then instantiation 
	is possible for that class.
G) For abstract classes instantiation is not possible irrespective of whether it 
	contains abstract method or not.
answer: B,C,E,G

Q.
class Parent{
	public void m1();
}
For any method if we not providing implementation then we should declare that method as
abstract.
---

Q.
class Parent{
	public abstract void m1(){}
}
If a method declared as abstract, then we cannot define body. Hence abstract method
declaration should ends with semi-colon(;)
---

Q.
class Parent{
	public abstract void m1();
}
If a class contains atleast one abstract method, then tha class should be declared
as abstract.
---

Q.
abstract class Parent{
	public abstract void m1();
}
It is valid.
---

Q.
abstract class Parent{
	public abstract void m1();
	public abstract void m2();
}

class Child extends Parent{
	public void m1(){}
}
child class is responsible to provide implementation for every parent class abstract
method. If child class unable to provide implementation for atleast one abstract method
of the parent class then child class should be declared as abstract. In this case next
level child class is responsible to provide implementation.
---

Q.
Q.
abstract class Parent{
	public abstract void m1();
	public abstract void m2();
}

abstract class Child extends Parent{
	public void m1(){}
}

class SubChild extends Child{
	public void m2(){}
}
It is valid
===========================

final vs abstract:
1. We should override abstract methods in child classes to provide
implementation. But we cannot override final methods. Hence final
and abstract is illegal combination for methods.

2. For abstract class, we should create child class to provide implementation.
But for final classes, child class creation is not possible. Hence abstract
final is illegal combination for classes also.

3. Abstract class can contain final methods.
abstract class Test{
	public final void m1(){}
	public abstract void m2(){}
}

4. final class cannot contain absract method.
final class Test{
	public abstract void m1();---------> CE
}
============

strictfp modifier:
strictfp----> strict floating point
java 1.2 version
--> we can use this modifier for classes and methods but not for variables.
--> the way of representing floating point values is varied from platform
 	to platform.
--> If a method declared with strictfp, then all floating point calculations
 	in that method will follow IEEE 754 standards so that we will get platform
 	independent results.
--> If a class declared as strictfp then every concrete method in that class
 	has to follow IEEE 754 standards so that we will get platform independent
 	results.
 	
--> abstract-final illegal for methods/ classes
======================

 strictfp vs abstract:
 1. strictfp method always talks about implementation. But abstract method never talks
 	about implementation. Hence abstract-strictfp is illegal for methods.
 2. strictfp abstract is legal combination for class. As strictfp applicable for 
 	concrete methods and it is valid is a class(whether normal or abstract) has
 	any number of concrete methods(0 to n).
==========================

 	member modifiers:
public: 	
--> If class and member both are public, then only we can access that member from
outside of package.

default members:
can be accessed only within the current package, but from outside of the package
we cannot access.

Q. Consider the following java source file:

A.java
--------
package pack1;
public class A{
	void m1(){
		System.out.println("It is public method from A class");
}

B.java
--------
package pack2;
import pack1.A;
class B{
	public static void main(String[] args){
		A a = new A();
		a.m1();
	}
}

to compile these source files successfully, which of the following modifications
are required independently?
A) Declare m1() method as public in class A.
B) comment a.m1() inside class B.
C) rename pack2 as pack1 inside file B.java
D) None of these

answer: A,B,C
=============================

private members:
If a member is private then we can access that member withing the same class only.


Q.
A.java
--------
package pack1;
public class A{
	private void m1(){
		System.out.println("It is public method from A class");
	}	
}

B.java
--------
package pack1;
class B{
	public static void main(String[] args){
		A a = new A();
		a.m1();// CE: cannot access private members outside the class.
	}
}
------

Q. why private methods cannot be declared as abstract?
answer: private methods not visible to child class , as abstract methods need to
		overriden in child class hence not possible to fulfill both condition
		ie, private-abstract method not possible in java.
		
==========================

	protected modifier:
--> the most misunderstood modifier in java.
--> If a member declared as protected then we can access that member from
anywhere within the same package and from outside of package only in child
classes.
		protected = <default> + kids
----

Q.
class A{
	protected void m1() {
		System.out.println("protected method");
	}
}
public class B extends A{
	public static void main(String[] args) {
		A a = new A();
		a.m1();//Line-1
		
		B b = new B();
		b.m1();//Line-2
		
		A a1 = new B();
		a1.m1();//Line-3
	}	
}
Which of the following lines causes compile time error?
A) Line-1
B) Line-2
C) Line-3
D) None of these

answer: D
explanation: within the same package we can access protected members either by
			using parent reference or by using child reference.
			But from outside of the package, we can access protected members only in child
			classes and we should use child class reference only.
			ie, to access protected members from outside package, we cannot use
			parent reference.
			But from outside of the package, we can access protected members only in child
			classes and we should use current class reference only.
---

Q.
A.java
-------
package pack1;
class A{
	protected void m1() {
		System.out.println("protected method");
	}
}

C.java
-------
package pack2
import pack1.A;
class B extends A{

}
public class C extends A{
	public static void main(String[] args) {
		A a = new A();
		a.m1();//Line-1
		
		B b = new B();
		b.m1();//Line-2
		
		A a1 = new B();
		a1.m1();//Line-3
		
		A a2 = new C();
		a2.m1();//Line-4
		
		B b1 = new C();
		b1.m1();//Line-5
		
		C c = new C();
		c.m1();//Line-6
	}	
}

answer: only Line-6 is valid, rest all will give CE 
explanation: whithin the same package we can access protected members either by using
			parent reference or by using child reference.
			But from outside of the package, we can access protected members only in child
			classes and we should use child class reference only.
			ie, to access protected members from outside package, we cannot use
			parent reference.
			But from outside of the package, we can access protected members only in child
			classes and we should use current class reference only.
====

---> protected means highly recommended to override. In the worst scenarios only
 	bring this method.
--> abstract means you should override to provide implementation.
=====================================

Q.
class Dog implements Cloneable{

}
class Test{
	public static void main(String[] args)throws Exception{
		Dog d1 = new Dog();
		Dog d2 = (Dog) d1.clone();// Line-1
		
		Test t1 = new Test();
		Test t2 = (Test) t1.clone();//Line-2
	}
}

A) Line-1 causes compile time error
B) Line-2 causes compile time error
C) Line-1 causes runtime exception
D) Line-2 causes runtime exception

answer: A,D
explanation: clone() method inside Object class is protected, class Test and Dog
				are child of Object class hence in child class we can use only
				child reference to call clone() method.
				ie, d1.clone() will give compile time error.
				To call clone() method a class should implement Cloneable interface
				hence Test class give RE at Line-2
---

Q.
class Dog{

}
class Test{
	public static void main(String[] args) throws Throwable{
		Dog d1 = new Dog();
		d1.finalize();//Line-1
		
		Test t1 = new Test();
		t1.finalize();//Line-2
	}
}

answer: Line-1 will give CE as finalize() method in Object class is protected, in Test class
		we can use only Test class reference to call finalize() method.
=====

# clone() protected:
protected means highly recommended to override and in worst case scenarios only
use protected method.
--> Object class clone() method meant for shallow cloning, but most of the
times our requirement is deep cloning.
--> Object class finalize():
		Just before destroying an object, garbage collector calls finalize()
		method to perform cleanup activities.
		Object class finalize() method has empty implementation and hence it is
		highly recommended to override to define our own cleanup activities.
 */
public class _27_Class_modifiers {
	public static void main(String[] args) {}
}