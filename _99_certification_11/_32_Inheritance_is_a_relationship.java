package _99_certification_11;
/*
Inheritance:
--> It is known as IS-A Relationship.
--> By using extends keyword we can implement IS-A relationship.
--> Code reusability. We can extend existing functionality with some more
	extra functionality then we should go for inheritance.

Q.
class P{
	public void m1() {
		System.out.println("Parent");
	}
}
class C extends P{
	public void m2() {
		System.out.println("Child");
	}
}
class Test{
	public static void main(String[] args) {
		P p = new P();
		p.m1();//Line-1
		p.m2();//Line-2
	}
}
result: Line-1 is valid, but Line-2 will give CE as child specific method not 
 		available to Parent reference.
---

Q.
class P{
	public void m1() {
		System.out.println("Parent");
	}
}
class C extends P{
	public void m2() {
		System.out.println("Child");
	}
}
class Test{
	public static void main(String[] args) {
		C c = new C();
		c.m1();
		c.m2();
	}
}
o/p:
Parent
Child
---

Q.
class P{
	public void m1() {
		System.out.println("Parent");
	}
}
class C extends P{
	public void m2() {
		System.out.println("Child");
	}
}
class Test{
	public static void main(String[] args) {
		P p = new C();
		p.m1();//Line-1
		p.m2();//Line-2
	}
}
result:
Line-1 is valid,
Line-2 CE, as Parent reference can be used to hold child object, but by using tht reference
we can call only methods available in Parent class and we cannot call child specific methods.
----

class P{
	public void m1() {
		System.out.println("Parent");
	}
}
class C extends P{
	public void m2() {
		System.out.println("Child");
	}
}
class Test{
	public static void main(String[] args) {
		C c = new P();//Line-1
	}
}
CE at Line-1, Parent reference can be used to hold child class object, but Child class
reference cannot be used to hold Parent class object.
================

multiple inheritance:

public class _32_Inheritance_is_a_relationship {}
interface A{
	default void m() { }
}
interface B{
	default void m() { }
}
interface C extends A,B{
	//Duplicate default methods named m with 
   //the parameters () and () are inherited from the types B and A
}
CE
---------

Q.--> to resolve above CE
interface A{
	default void m() { }
}
interface B{
	default void m() { }
}
interface C extends A,B{
	default void m() {}
}

---

Q.
interface A{
	default void m() { }
}
interface B{
	default void m() { }
}
class C implements A,B{
	//Duplicate default methods named m with
   //the parameters () and () are inherited from the types B and A
}
----

Q. --> to resolve
interface A{
	default void m() { }
}
interface B{
	default void m() { }
}
class C implements A,B{
	public void m() {
		//any implementation
		// or
		// call A's default method: A.super.m(); or
		// call B's default method: B.super.m();
	}
}
----

Q.
class A{

}
class B extends A{

}
s1: class B extending A class and Object class directly. Hence multiple inheritance
supported in classes also.

s2: class B extending A class directly and extending Object class indirectly. It is
multi level inheritance.

answer: only s2
-----

Q.
class A extends A{

}

answer: CE, cyclic inheritance not allowed in java.
---

Q.
class B extends A{
}
class A extends B{
}
answer: CE, cyclic inheritance not allowed in java.
 */

public class _32_Inheritance_is_a_relationship {}