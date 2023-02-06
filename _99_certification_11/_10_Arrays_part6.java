package _99_certification_11;
/*

Local Variable Type Inference(LVTI):
 
Q. In which of the folowing cases we will get compile time error?

A) var x = new int[]{10, 20, 30, 40};
B) var x = new Integer[]{10, 20, 30, 40};
C) var x = {10, 20, 30, 40};
D) var x = [10, 20, 30, 40];
E) var x = (10, 20, 30, 40);

answer: C,D,E
----

Note: Once type is decided for variable, we cannot change the type throughout.
eg:  var i = 10;
		i=true;//CE
----

Q.
class Parent{ }

class Child1 extends Parent{ }

class Child2 extends Parent{ }

class Test{
	public static void main(String[] args) {
		Parent[] p = new Child1[10];
		p[0]= new Child1();//Line-1
		p[1]= new Child2();//Line-2
	}
}

A) Compilation Fails at Line-1		
B) Compilation Fails at Line-2
C) A runtime exception thrown at Line-1		
D) A runtime exception thrown at Line-2

answer: D,  java.lang.ArrayStoreException
========================================================

Types of variables:

Division-1: Based on Type:
1. Primitive variables     int x =10;
2. Reference variables     Student st = new Student();


Division-2:
1. Instance variable
2. Static variable
3. Local variable

1. Instance variable:
--> varied from object to object.
--> separate copy of instance variables will be created.
--> created will object creation and destroyed by GC on object destruction.
--> present in heap area.
--> declared directly within the class.
--> cannot access directly from static area.

class Test{
	int x=10;
	public static void main(String[] args) {
//		System.out.println(x);// cannot refere non-static member from static area.
		Test t = new Test();
		System.out.println(t.x);
		t.m1();
	}
	public void m1() {
		System.out.println(x);
	}
}
-------

class Test{
	
	boolean b;
	String s;
	int i;
	char ch;
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("b="+t.b+",s="+t.s+",i="+t.i+",ch="+t.ch);
		//b=false,s=null,i=0,ch=
	}
}
================

2. Static variables:
--> life is same hai *.class, the variable can be accessed till the .class is present in JVM
		instance.
--> can access from static as well as non static area.
--> stored inside method area.
--> JVM will give default value.
--> can be called with null reference.

class Test{
	
	static int i;
	public static void main(String[] args) {
		System.out.println(i);
	}
	public void m1() {
		System.out.println(i);
	}
}
---
class Test{
	
	static int x=20;
	int y=10;
	public static void main(String[] args) {
		Test t = null;
		System.out.println(t.x);// 20, static variables can be called with null reference
		System.out.println(t.y);// NPE
	}
	
}
---

class Test{
	int x=10;
	static int y=20;
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.x= 888;
		t1.y= 999;
		
		Test t2 = new Test();
		System.out.println(t2.x+":"+t2.y);// 10:999
	}
}	
 */
public class _10_Arrays_part6 {
}
