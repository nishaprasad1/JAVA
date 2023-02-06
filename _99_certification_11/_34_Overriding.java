package _99_certification_11;
/*

Q.
class Parent{
	public void marry() {
		System.out.println("Appalamma");
	}
}
class Child extends Parent{
	
	public void marry() {
		System.out.println("Nisha");
	}
}
class Test{
	public static void main(String[] args) {
		Parent p = new Parent();
		p.marry();
		Child c = new Child();
		c.marry();
		Parent p1 = new Child();
		p1.marry();
	}
}
--> we are calling marry() method on p1.
p1 is of type Parent. Compiler will check in Parent class marry() method available
or not. If it is not available then we will get compile time error. If it is
available then the code compiles fine.

--> At runtime, JVM will check whether object is same parent class object or child class
object. It the object is parent object, then parent class method will be executed.
If the object is the child class object, then JVM will check in the child class whether
this method is overriden or not. If it is not overriden then parent class method will
be executed. If it is overridden, then child class method will be executed.

-->In overriding method resolution is always takes care by JVM based on runtime object,
but not based on reference type. Hence overriding is also considered as Dynamic Polymorphism
or runtime polymorphism or late binding.
--> Overriding method resolution is also known as Dynamic Method Dispatch.

Note:
--> overloading method resolution is always takes care by compiler based on reference
type but not based on runtime object.
--> overriding method resolution is always takes care by JVM based on runtime object
but not based on reference type.


Rules for overriding:
1. Method names and argument types(including order) must be matched ie, method
signatures must be same.
2. Return types must be matched.
But from 1.5 version onward co-varient return types also allowed.
The child class method return type need not be same as parent class method return
type. It can be either same or child of parent method return type.

class Parent{
	public Object m1() {
		return null;
	}
}
class Child extends Parent{
	public Object m1() {
		return null;
	}
}
valid
----

class Parent{
	public Object m1() {
		return null;
	}
}
class Child extends Parent{
	public String m1() {
		return null;
	}
}
valid
---
class Parent{
	public String m1() {
		return null;
	}
}
class Child extends Parent{
	public Object m1() {
		return null;
	}
}
invalid
---

class Parent{
	public double m1() {
		return 10.5;
	}
}
class Child extends Parent{
	public int m1() {
		return 10;
	}
}
invalid
co-varient return types concept applicable only for object types but not for
primitive types
=================

private modifier:
overriding concept is not applicable to the private methods because these are not
visible to the child classes.

class Parent{
	private void m1() {
	}
}
class Child extends Parent{
	private void m1() {
	}
}
it is valid, but not overriding.

class Parent{
	private void m1() {
	}
}
class Child extends Parent{
	private void m1() {
	}
}
class Test{
	public static void main(String[] args) {
		Parent p = new Child();
		p.m1();//CE: private method cannot be accessed outside of class
	}
}
----
--> overriding concept not applicable for final methods
class Parent{
	final void m1() {
	}
}
class Child extends Parent{
	final void m1() {//CE:Cannot override the final method from Parent
	}
}
----

--> The following modifiers won't keep any restrictions in overriding:
1. abstract
2. native
3. synchronized
4. strictfp

--> while overriding we cannot reduce scope of access modifiers. But we can
increase the scope.

	private < default < protected < public
			chid class method		
P: public --------------------> public
P: protected------------------> protected or public
P: <default>------------------> <default> or protected or public
P: private--------------------> Any modifier applicable because overriding
								not applicable for private methods.

Q.
class Parent{
	public void m1() {}
}
class Child extends Parent{
	protected void m1() {}//CE:Cannot reduce the visibility of the
						 // inherited method from Parent
}	
----

Q.
class Parent{
	protected void m1() {}
}
class Child extends Parent{
	public void m1() {}
}
valid, as we can increase the scope of access modifier
---

Q.
class Parent{
	private void m1() {}
}
class Child extends Parent{
	public void m1() {}
}

valid, but it is not overriding, as private method not visible to child.
----

Q.
class Parent{
	public void m1() {}
}
class Child extends Parent{
	private void m1() {}//CE:Cannot reduce the visibility of
	                   //the inherited method from Parent
}
invalid
-------

Q.
interface P{
	void m1();
}
class C implements P{
	void m1(){}//Line-1
}
CE at Line-1, Cannot reduce the visibility of the inherited method from P
---

Q.
interface P{
	void m1();
}
class C implements P{
	public void m1(){}
}
valid
======================

Exception handling:
1)
P: public void m1() throws Exception
C: public void m1()

2)
P: public void m1() 
C: public void m1() throws Exception

3)
P: public void m1() throws Exception 
C: public void m1() throws IOException

4)
P: public void m1() throws IOException 
C: public void m1() throws Exception

5)
P: public void m1() throws IOException 
C: public void m1() throws EOFException,FileNotFoundException

6)
P: public void m1() throws IOException 
C: public void m1() throws EOFException,InterruptedException

7)
P: public void m1() throws IOException 
C: public void m1() throws EOFException,NullPointerException

8)
P: public void m1() throws IOException 
C: public void m1() throws AE,NPE,CCE

answer: 1,3,5,7,8
explanation: If child class method throws any "checked" exception, compulsory parent class method
should throw "same checked exception or its parent". violation leads to compile time error.
But no restrictions for unchecked exception.
===========================

overriding wrt static methods:
--> we cannot override static method as non-static method and non-static method as static method.

class P{
	public static void m1() {}
}
class C extends P{
	public void m1() {}
}
CE:This instance method cannot override the static method from P
----

class P{
	public void m1() {}
}
class C extends P{
	public static void m1() {}
}
CE:This static method cannot hide the instance method from P
----

class P{
	public static void m1() {}
}
class C extends P{
	public static void m1() {}
}
valid, but not overriding and it is method hiding.
---

Note:
Method overriding:	-->Both methods should be non-static
					-->Method resolution is always takes care by JVM based on runtime object.
					-->Runtime or Dynamic polymorphism or late binding.

Method hiding: 		-->Both methods should be static.
					-->Method resolution is always takes care by compiler based on reference object.
					-->compile time or static polymorphism or early binding.
					
Q.
class P{
	public static void m1() {
		System.out.println("Parent");
	}
}
class C extends P{
	public static void m1() {
		System.out.println("Child");
	}
}
class Test{
	public static void main(String[] args) {
		P p = new P();
		p.m1();
		C c = new C();
		c.m1();
		P p1 = new C();
		p1.m1();
	}
}
o/p:
Parent
Child
Parent
========================================

overriding wrt var-arg methods:
--> we cannot override var-arg method with normal method. If we are trying to override
it will become overloading but not overriding.
var-arg methods should be overridden with var-arg methods only.
				
Q.
class P{
	public static void m1(int... i) {
		System.out.println("Parent");
	}
}
class C extends P{
	public static void m1(int i) {
		System.out.println("Child");
	}
}
class Test{
	public static void main(String[] args) {
		P p = new P();
		p.m1(10);
		C c = new C();
		c.m1(10);
		P p1 = new C();
		p1.m1(10);
	}
}
o/p:
Parent
Child
Parent
explanation: here it is overloading, hence method resolution is bassed on reference type
			object.
---

Q.
class P{
	public static void m1(int... i) {
		System.out.println("Parent");
	}
}
class C extends P{
	public static void m1(int... i) {
		System.out.println("Child");
	}
}
class Test{
	public static void main(String[] args) {
		P p = new P();
		p.m1(10);
		C c = new C();
		c.m1(10);
		P p1 = new C();
		p1.m1(10);
	}
}
o/p:
Parent
Child			
Parent
explanation: Now it is overriding, were method resolution is done on the runtime object.
----

Q.
class P{
	public static void m1(int... i) {
		System.out.println("Parent");
	}
}
class C extends P{
	public static void m1(int[] i) {
		System.out.println("Child");
	}
}
class Test{
	public static void main(String[] args) {
		P p = new P();
		p.m1(10);
		C c = new C();
//		c.m1(10);// as 10 is not array value
//		c.m1(new int[]{10}); this is valid
		P p1 = new C();
		p1.m1(10);// 10 is suitable for var-arg and not int[] hence it will, no matching
			// will be found in Child class, and it will be matched to Parent
		// by coverting it to new int[]{10}
	}
}
================

Overriding wrt variables:
--> overriding concept applicable only for methods but not for variables. Variable
	resolution is always takes care by compiler based on reference type. The rule
	is same whether static or non-static.

Q.
class P{
	int x = 888;
}
class C extends P{
	int x = 999;
}
class Test{
	public static void main(String[] args) {
		P p = new P();
		System.out.println(p.x);
		C c = new C();
		System.out.println(c.x);
		P p1 = new C();
		System.out.println(p1.x);
	}
}
o/p:
888
999
888
----

Q.
class P{
	static int x = 888;
}
class C extends P{
	static int x = 999;
}
class Test{
	public static void main(String[] args) {
		P p = new P();
		System.out.println(p.x);
		
		C c = new C();
		System.out.println(c.x);
		
		P p1 = new C();
		System.out.println(p1.x);
	}
}
o/p:
888
999
888
-----

Q.
class P{
	static int x = 888;
}
class C extends P{
	 int x = 999;
}
class Test{
	public static void main(String[] args) {
		P p = new P();
		System.out.println(p.x);
		
		C c = new C();
		System.out.println(c.x);
		
		P p1 = new C();
		System.out.println(p1.x);
	}
}
o/p:
888
999
888
---

Q.
class P{
	 int x = 888;
}
class C extends P{
	static int x = 999;
}
class Test{
	public static void main(String[] args) {
		P p = new P();
		System.out.println(p.x);
		
		C c = new C();
		System.out.println(c.x);
		
		P p1 = new C();
		System.out.println(p1.x);
	}
}
o/p:
888
999
888
------

--> In overloading method names must be same and argument types must be
different(atleast number). We are not required to worry about remaining 
things like modifiers, return types, throws etc.

But in overriding we have to consider everything:
--> method names and argument types: same
--> return types: either same or co-varient
--> access modifiers: we cannot reduce the scope
--> private, final, static: cannot be overriden
--> throws clause: rules
---

Q.
class P{
	public void m1(int i) throws IOException{
	
	}
}
class C extends P{

}
In child class which of the following methods are allowed?
A) public void m1(int i){}
B) public static void m1(int i){}
C) public final void m1(int i) throws Exception {}
D) public static int m1() throws Exception { return 10; }
E) public static abstract void m1(double d) { return 10.5; }

answer: A,D
----

Polymorphism:

poly means many
morphs means forms
polymorphism means many forms


overloading:
m1(int i)
m1(double i)
m1(String i)

overriding:
 P: m1(){ subbaluxmi}
 C: m1(){nisha}

List l = new AL();
List l = new LL();
List l = new Vector();
List l = new Stack();

 */
public class _34_Overriding {public static void main(String[] args) {}}