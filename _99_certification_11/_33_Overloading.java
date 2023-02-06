package _99_certification_11;
/*
Method signature:

public void m1(int i, String s){}

MS: m1(int, String)
--> compiler will use method signature while resolving method calls.
--> within a class, two methods with same signature are not allowed.
==============

Overloading:
--> both methods having same name but different argument types. In overloading
we won't consider return type, access modifiers, throws keyword.
--> In overloading method resolution is always takes care by compiler based
on reference type(but not based on runtime object).
--> while resolving overloaded methods:
1. Exact match will get high priority.
2. Child class type argument will get more priority that parent class argument type.

public void m1(int i, String j){}
public int m1(int k){ return 10; }

Q.when we say that two methods are said to be overloaded?
A) Both method have same name and same argument types.
B) Both method have same name but different argument types.
C) Both method have same name but different number of arguments.
D) Both method have different name but same argument types.

answer: B,C
---

Q. consider the following method declarations:
1. public void m1(int i, String s){}
2. public void m1(int i){}
3. public void m1(String s, int i){}
4. public void m1(int k, String m){}

Which of above methods are overloaded?
A) Only 1,2 and 3
B) Only 1 and 2
C) Only 1 and 3
D) 1,2,3,4

answer: A
----

Q.
class Test{
	public void m1() {
		System.out.println("no-args");
	}
	public void m1(int i) {
		System.out.println("int-args");
	}
	public void m1(double d) {
		System.out.println("double-args");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m1(10);
		t.m1(10.5);
	}
}
o/p:
no-args
int-args
double-args
---

Q.
class Test{
	public void m1() {
		System.out.println("no-args");
	}
	public void m1(double d) {
		System.out.println("double-args");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1(10);
	}
}

o/p
double-args
---

Q.
class Test{
	public void m1() {
		System.out.println("no-args");
	}
	public void m1(int i) {
		System.out.println("int-args");
	}
	public void m1(float i) {
		System.out.println("float-args");
	}
	public static void main(String[] args) {
		Test t = new Test();
		//Line-1
	}
}

At Line-1, which of the following method calls can be placed without causing compile
time error?
A) t.m1();
B) t.m1(10);
C) t.m1(10.5f);
D) t.m1('a');
E) t.m1(10L);
F) t.m1(10.5);
answer: A,B,C,D,E
o/p:
A)no-arg
B)int-arg
C)float-arg
D)int-arg
E)float-arg
F)CE
---

Q.
class Test{
	public void m1(Object o) {
		System.out.println("object version");
	}
	public void m1(String s) {
		System.out.println("string version");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1(new Object());//object version
		t.m1("durga");//string version
		t.m1(null);//string version
	}
}
o/p:
object version
string version
string version

explanatio: --> while resolving overloaded methods:
1. Exact match will get high priority.
2. Child class type argument will get more priority that parent class argument type.
---

Q.
class Test{
	public void m1(StringBuilder o) {
		System.out.println("StringBuilder version");
	}
	public void m1(String s) {
		System.out.println("string version");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1(null);//CE:The method m1(StringBuilder) is ambiguous for the type Test
	}
}

result: CE
---

Q.
class Test{
	public void m1(int... i) {
		System.out.println("var-arg method");
	}
	public void m1(int i) {
		System.out.println("int method");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();//var-arg method
		t.m1(10,20);//var-arg method
		t.m1(10);//int method
	}
}
o/p:
var-arg method
var-arg method
int method

explanation: It no other method matched then only var-arg method will get the chance.
ie, var-arg method always has least priority.
---

Q.
class Test{
	public void m1(int i, float f) {
		System.out.println("int-float method");
	}
	public void m1(float f, int i) {
		System.out.println("float-int method");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1(10, 10.5f);
		t.m1(10.5f,10);
		t.m1(10,10);//CE: ambiguity
		t.m1(10.5f, 10.5f);//CE: no match
	}
}
----

Q.
class Animal{
}
class Monkey extends Animal{
}
class Test{
	public void m1(Animal a) {
		System.out.println("Animal version");
	}
	public void m1(Monkey m) {
		System.out.println("Monkey version");
	}
	public static void main(String[] args) {
		Test t = new Test();
		Animal a = new Animal();
		t.m1(a);//Animal version

		Monkey m = new Monkey();
		t.m1(m);//Monkey version

		Animal a1 = new Monkey();
		t.m1(a1);//Animal version
	}
}
o/p:
Animal version
Monkey version
Animal version
explanation: In overloading, method resolution is always takes care by compiler based on
reference type(but not based on runtime object). Hence overloading is also considered
as compile time polymorphism or static polymorphism or early binding.
 */
public class _33_Overloading { public static void main(String[] args) {}}
