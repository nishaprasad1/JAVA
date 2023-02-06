package _99_certification_11;
/*
Note:
-->Relational operators applicable for any primitive types except boolean.
--> we cannot apply relational operators on object types.

Equality Operators:
==, !=
-->applicable everywhere

Q.
class Test{
	public static void main(String[] args) {
		System.out.println(10==20);//false
		System.out.println('a'==97.0);//true
		System.out.println(10.0==10.5);//false
		System.out.println(false==false);//true
	}
}
===================

r1==r2 returns true iff both are pointing to same object.
reference comparison/ address comparison is same.

Q.
class Test{
	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3=t1;
		System.out.print(t1==t2);
		System.out.print(t1==t3);
	}
}

A)truetrue
B)truefalse
C)falsetrue
D)falsefalse

answer: C
explanation: t1 and t3 are pointing to the same object.
In java it is not possible to get address of object.
It does not mean object not having address.
=======================

Note: to use equality operators between object reference, compulsory
there should be some relation between argument types(either parent
to child or child to parent or same type). If there is no relation
then we will get compile time error.

Q.
class Test{
	public static void main(String[] args) {
		Object o = new Object();
		Thread t = new Thread();
		String s = new String("durga");
		System.out.print(o==t);//Line-1
		System.out.print(t==s);//Line-2
		System.out.print(s==o);//Line-3
	}
}

A)falsefalsefalse
B)falsefalsetrue
C)compilation fails at Line-1
D)compilation fails at Line-2
E)compilation fails at Line-3

answer: D
----

class Test{
	public static void main(String[] args) {
		Object o = new Object();
		Thread t = new Thread();
		String s = new String("durga");
		StringBuffer sb = null;
		System.out.print(o==null);//Line-1
		System.out.print(t==null);//Line-2
		System.out.print(s==null);//Line-3
		System.out.print(sb==null);//Line-4
		System.out.print(null==null);//Line-5
	}
}

answer: falsefalsefalsetruetrue
======================

Difference between == operator and equals() method:
In general we can use equals() method for content comparison.

Q.
class Test{
	public static void main(String[] args) {
		String s1= new String("durga");
		String s2= new String("durga");
		System.out.print(s1==s2);
		System.out.print(s1.equals(s2));
	}
}
answer:falsetrue
-----------

Note: Object class: equals() method is used for reference comparison.
	String class: equals() method is overridden for content comparison.
	StringBuffer/Builder class: equals method is not overridden hence Object 
				class equals() method is called which will compare reference and not content.
				
Q.
class Test{
	public static void main(String[] args) {
		StringBuilder s1= new StringBuilder("durga");
		StringBuilder s2= new StringBuilder("durga");
		System.out.print(s1==s2);
		System.out.print(s1.equals(s2));
	}
}
answer: falsefalse
explanation: In StringBuilder equals() method is not overridden for content
comparison. Hence Object class equals() method will be executed which is
meant for reference comparison.
================

Note: XXXX hashcode() means address of object is wrong thinking XXXX
In string class hashcode() method is overridden based on content. Hence
if the content of two String objects is same then their hashcodes are 
same.

Q.
class Test{
	public static void main(String[] args) {
		String s1= new String("durga");
		String s2= new String("durga");
		System.out.print(s1==s2);
		System.out.print(s1.hashCode() == s2.hashCode());
	}
}
answer: falsetrue
---

Q.
class Test{
	public static void main(String[] args) {
		StringBuilder s1= new StringBuilder("durga");
		StringBuilder s2= new StringBuilder("durga");
		System.out.print(s1==s2);
		System.out.print(s1.hashCode() == s2.hashCode());
	}
}
answer: falsefalse
=========================

Note: whenever we are overridding equals() method, it is highly recommended
to override hashcode() method such that two equivalent objects should
have same hashcode().

In String class equals() method is overridden based on content and
hence hashcode() method is also overridden based on content.

In StringBuffer and StringBuilder classes, equals() method is not overridden
and hence hashcode() method is also not overriden.

 Q.
 class Test{
	public static void main(String[] args) {
		StringBuilder s1= new StringBuilder("durga");
		StringBuilder s2= new StringBuilder("durga");
		System.out.print(s1==s2);
		System.out.print(s1.hashCode() == s2.hashCode());
	}
}
answer: falsefalse
===========================

Note:
If arguments are different types, then equals() method returns false,
and won't raise any error.

If there is no relation between argument types, then == operator
will raise compile time error.

Q.
class Test{
	public static void main(String[] args) {
		String s= new String("durga");
		StringBuilder sb= new StringBuilder("durga");
		System.out.print(s.equals(sb));//Line-1
		System.out.print(s==sb);//Line-2
	}
}

A) Compilation fails at Line-1
B) Compilation fails at Line-2
C) falsefalse
D) truefalse

answer: B
 */
public class _17_equality_operators {
	public static void main(String[] args) {
		
	}
}