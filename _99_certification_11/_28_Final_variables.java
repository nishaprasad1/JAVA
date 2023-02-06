package _99_certification_11;
/*
--> stored in heap area.
Q.
class Test{
	int x;
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.x);
	}
}
o/p: 0
---

Q.
class Test{
	final int x;
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.x);
	}
}
result: CE

Rule: for final instance variable, we should perform initialization 
		before constructor completion.

1. At the time of declaration
	class Test{
		final int x =10;
		public static void main(String[] args) {
			Test t = new Test();
			System.out.println(t.x);
		}
	}
	
2. Inside instance block.
	class Test{
		{
			x=10;
		}
		final int x;
		public static void main(String[] args) {
			Test t = new Test();
			System.out.println(t.x);
		}
	}
	
3. Inside constructor:
	class Test{
		Test(){
			x=30;
		}
		final int x;
		public static void main(String[] args) {
			Test t = new Test();
			System.out.println(t.x);
		}
	}
---
Q.
class Test{
	void m1(){
		x=10;//CE: The final field Test.x cannot be assigned
	}
	final int x;//CE:The blank final field x may not have been initialized
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.x);
	}
}
==============
final static vriables:

Q.
class Test{
	static int x;
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.x);
	}
}
o/p: 0
---

Q.
class Test{
	final static int x;
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.x);
	}
}
answer: CE, x needs to initialized
---

--> For final static variables compulsory we should perform initialization
explicitly before class loading completion.
ie,
1. At the time of declaration
		class Test{
			final static int x=10;
			public static void main(String[] args) {
				Test t = new Test();
				System.out.println(t.x);
			}
		}
2. Inside static block.
	class Test{
		static {
			x=40;
		}
		final static int x;
		public static void main(String[] args) {
			Test t = new Test();
			System.out.println(t.x);
		}
	}
---

Q.
class Test{
	final static int x;
	public static void main(String[] args) {
		x=10;//CE:The final field Test.x cannot be assigned
		System.out.println(Test.x);
	}
}
========================

 final local variables:
--> JVM won't provide any default values, compulsory we should perform
initialization explicitly before using that local variable. If we are not using
local variable, then we are not required to perform initialization explicitly.

Even if the local variable is final, rule is same.

Q.
class Test{
	public static void main(String[] args) {
		final int x;
		System.out.println("Hello");
	}
}
result: Hello
--> runs and compiles fine as we are not using final variable x.
----

class Test{
	public static void main(String[] args) {
		final int x;
		System.out.println(x);//CE
	}
}
CE: The local variable x may not have been initialized
----

Q. Consider the following coding snippets:
coding snippet-1
class Test{
	int x;
}
--
coding snippet-2
class Test{
	final int x;
}
--
coding snippet-3
class Test{
	static int x;
}
--
coding snippet-4
class Test{
	final static int x;
}
--
coding snippet-5
class Test{
	public void m1(){
		int x;
	}
}
--
coding snippet-6
class Test{
	public void m1(){
		final int x;
	}
}
In which of the above coding snippet causes compile time error?
A) Coding snippet-1
B) Coding snippet-2
C) Coding snippet-3
D) Coding snippet-4
E) Coding snippet-5
F) Coding snippet-6
answer: B,D
-----

--> The only applicable modifier for local variables is final. If we are using
any other modifier then we will get compile time error.

Q. Inside main method, which of the following declarations are allowed?
A) private int x=10;
B) public int x=10;
C) protected int x=10;
D) transient int x=10;
E) volatile int x=10;
F) final int x=10;
G) static int x=10;

answer: F
---

Q.
class Test{
	public static void main(String[] args) {
		private i =0;
		for(int j=0; j<3; j++) {
			i = i+j;
		}
		System.out.println(i);
	}
}
A) 3
B) 2
C) 0
D) Compilation fails

answer: D
explanation: The only applicable modifier for local variables is final. If we are using
any other modifier then we will get compile time error.
--

Q.
class Test{
	public static void main(String[] args) {
		m1(10,20);
	}
	public static void m1(final int x, int y) {
		x = 100;
		y = 200;
		System.out.println(x+":"+y);
	}
}
A) Compilation fails because we cannot declare formal parameter as final. 
B) Compilation fails because we are calling m1() before declaration.
C) Compilation fails because we are performing reassignment for final
	variable x.
D) The code compiles and runs fine.

answer: C
--> The formal parameters of a method are simply acts as local variables
of that method and local variables can be declared as final. If the 
formal parameter declared as final, then inside that method we cannot perform
reassignment.
---

Q.
class Test{
	public static void main(String[] args) {
		m1(10,20);
	}
	public static void m1(final int x, int y) {//Line-1
		x = 100;//Line-2
		y = 200;
		System.out.println(x+":"+y);
	}
}
consider the modification?
m1: Remove final at Line-1
m2: Comment Line-2

To compile this code successfully which of the following modifications
required independently?

A) Only m1
B) Only m2
C) Both m1 and m2
D) Either m1 or m2

answer: D
=======================

static modifier:
-->we can use static for variables, methods and blocks.
-->we cannot declare top level class with static, but we can declare
inner class as static.
-->In the case of instance variables, for every object a separate copy
will be created. But in the case of static variables, at class level
only one copy will be created and shared by every object of that class.

Q. Which of the following can be declared with static modifier?
A) variables
B) methods
C) blocks
D) top level classes
E) inner classes
answer: A,B,C,E
---

Q.
class Test{
	static int x=10;
	int y=20;
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.x = 888;
		t1.y = 999;

		Test t2 = new Test();
		System.out.println(t2.x+":"+t2.y);
	}
}
A) 888:20
B) 10:20
C) 888:999
D) 10:999

answer: A
---

--> we can access instance variables directly from instance area, but we cannot
	access directly from static area. Non static variables cannot be accessed
	from static context.
--> But static variables can be accessed directly from both static and non-static
	areas.
	
Q. Consider the following 4 declarations:
1) int x =10;
2) static int x =10;
3) 
public void m1(){
	System.out.println(x);
}
4)
public static void m1(){
	System.out.println(x);
}

Within the same class, which of these declarations are allowed
simultaneously?
A) 1 and 3
B) 1 and 4
C) 2 and 3
D) 2 and 4
E) 1 and 2
F) 3 and 4

answer: A,C,D
explanation: * Instance variable and static variable with the same name is not
				allowed.
			 * Two methods with the same signature are not allowed within the same 
			   class.
---
--> Overloading concept applicable for static methods including main method. But JVM will
always call String[] argument mai method only.

Q.
class Test{
	public static void main(String[] args) {
		System.out.println("String[]");
	}
	public static void main(int[] args) {
		System.out.println("int[]");
	}
}

A) String[]
B) int[]
C) Compilation fails
D) An exception is thrown at runtime.

answer: A
---

Q.
Parent.java
-----------
public class Parent{
	public static void main(String[] args) {
		System.out.println("parent main method");
	}
}
class Child extends Parent{
	
}
 whenever we are executing child class
==> java child
 
 A) Parent class main method will be executed.
 B) An exception is thrown at runtime.
 C) Compilation fails.
 D) compiles and run fine but no output.
 
answer: A
explanation: Inheritance concept applicable for static methods including main method.
Hence while executing child class, if child class does not contain main method then Parent
class main method will be executed.

-------

Q.
Parent.java:
-----------
public class Parent{
	public static void main(String[] args) {
		System.out.println("parent main method");
	}
}
class Child extends Parent{
	public static void main(String[] args) {
			System.out.println("child main method");
	}	
}

whenever we are executing child class
==> java child
 
 A) Parent class main method will be executed.
 B) Child class main method will be executed.
 C) Compilation fails.
 D) compiles and run fine but no output.
 
answer: B
if child class does not contain main method then Parent
class main method will be executed. If the child class contains
main method then it will be executed.
---

--> Overriding concept is not applicable for static methods and it is
method hiding.
==============================

--> native modifier:
applicable only for methods. Native method means the method which is implemented
in non-java.

--> synchronized:
applicable only for methods and blocks.
If a method or block declared as synchronized then it will be executed by only
one thread at a time.

--> transient:
At the time of serialization, if we don't want to save the value of a variable
to meet security constraints then we should go for transient.

--> volatile modifier:
for every thread a separate local copy of the variable will be created. 
 */
public class _28_Final_variables {
	public static void main(String[] args) {

	}
}