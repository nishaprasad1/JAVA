package _99_certification_11;
/*
Typecasting:

compile time checking-1:
A b = (C) d;
--> we are trying to convert d object to C type and that C type object will be assigned
with A type reference variable. 
	eg1:
		Object o = new String("durga");
		StringBuffer sb = (StringBuffer) o;// valid as StringBuffer is child of Object
		
	eg2:
		String s = new String("durga");
		StringBuffer sb = (StringBuffer) s;//CE: StringBuffer not related to String
		
compile time checking-2:
A b = (C) d;
--> A should be either same or parent of C, otherwise we will get compile time error.
 	eg1:
		Object o = new String("durga");
		StringBuffer sb = (StringBuffer) o;
 	eg2:
		Object o = new String("durga");
		String sb = (StringBuffer) o;//CE: as String is neither parent nor same as StringBuffer
		
runtime checking:
A b = (C) d;
--> The runtime object type of d, must be either same or derived type of C. Otherwise
we will get RuntimeException saying ClassCastException.
	eg1:
		Object o = new String("durga");
		StringBuffer sb = (StringBuffer)o;// no CE but, RE
---

Object o = new String("durga");
String s = (String) o;
System.out.println(s);
---

Q.
class Base1{}
class Base2{}
class Der1 extends Base1{}
class Der2 extends Base1{}
class Der3 extends Base2{}
class Der4 extends Base2{}

class Test{
	public static void main(String[] args) {
		Base2 b = new Der4();
		Object o = (Base2)b;// valid
		Der3 d = (Der3)b;// RE
		Object o = (Base1)b;//CE case1
		Base1 b1 = (Der3)b;//CE case2
		Base2 b2 = (Der4)b;//valid
		Base2 b3 = (Der3)b;//RE
	}
}
---
--> In object type casting no new instance is created, only new reference is created to the 
	same object.
Q.
String s = new String("durga");
Object o = (Object)s;
System.out.println(s==o);// true

Q.
Integer I = new Integer(10);
Number n = (Number)I;
Object o = (Object)n;
System.out.println(I==n);//true
System.out.println(n==o);//true
System.out.println(o==I);//true
---

Q.
class P{
	public void m1() {}
}
class C extends P{
	public void m2() {}
}
class Test{
	public static void main(String[] args) {
		C c = new C();
		//Line-1
	}
}
At Line-1 which of the following method calls are allowed without having any
compile time error?
A) c.m1();
B) c.m2();
C) ((P)c).m1();
D) ((P)c).m2();

answer: A,B,C
Parent reference can be used to hold child class object. But by using that reference
we can call only methods available in the parent class and child specific methods cannot
be called.
---

Q.
class A{
	public void m1() {
		System.out.print("A");
	}
}
class B extends A{
	public void m1() {
		System.out.print("B");
	}
}
class C extends B{
	public void m1() {
		System.out.print("C");
	}
}
class Test{
	public static void main(String[] args) {
		C c = new C();
		c.m1();
		((B)c).m1();
		((A)((B)c)).m1();
	}
}
o/p: CCC
---

Q.
class A{
	public static void m1() {
		System.out.print("A");
	}
}
class B extends A{
	public static void m1() {
		System.out.print("B");
	}
}
class C extends B{
	public static void m1() {
		System.out.print("C");
	}
}
class Test{
	public static void main(String[] args) {
		C c = new C();
		c.m1();
		((B)c).m1();
		((A)((B)c)).m1();
	}
}
o/p: CBA
---

Q.
class A{
	int x = 777;
}
class B extends A{
	int x = 888;
}
class C extends B{
	int x = 999;
}
class Test{
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.x);
		System.out.println(((B)c).x);
		System.out.println(((A)((B)c)).x);
	}
}
o/p:
999
888
777
--> variable resolution is always takes care by compiler based on reference type.
	60 start
 */
public class _35_Object_level_typeCasting {public static void main(String[] args) {}}