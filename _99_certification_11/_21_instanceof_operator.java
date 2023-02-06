package _99_certification_11;

import java.util.concurrent.Callable;

/*
instanceof operator:
class Test{
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t instanceof Thread);//true
		System.out.println(t instanceof Object);//true
		System.out.println(t instanceof Runnable);//true
	}	
}
---

Q.
class Test{
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t instanceof Thread);//true
		System.out.println(t instanceof Object);//true
		System.out.println(t instanceof Runnable);//true
		System.out.println(t instanceof Comparable);//false
		System.out.println(t instanceof Callable);//false
		System.out.println(t instanceof String);//CE:Incompatible conditional operand types 
											   // Thread and String
	}	
}

Note: To use instanceof operator compulsory there should be some relation
between argument types, otherwise we will get compile time error. But this
rule is not applicable if the argument is interface type.

Q.
class Test{
	public static void main(String[] args) {
		Object o1= new Object();
		System.out.println(o1 instanceof String);//false
		
		Object o2= new String("durga");
		System.out.println(o2 instanceof String);//true
		
	}	
}
-----

Note: For any class or interface X,
null instanceof X is always false

Q.
class Test{
	public static void main(String[] args) {
		System.out.println(null instanceof String);//false
		System.out.println(null instanceof Thread);//false
		System.out.println(null instanceof Runnable);//false
	}	
}
=====================================

Assignment operators:
1. Simple assignment 
	int x = 10;
2. Chained assignment
	a= b= c= d= 20;
3. Compound assignment
	x+=10;
	
Q.
class Test{
	public static void main(String[] args) {
		int a=b=c=d=10;//CE: as b,c,d not defined
		System.out.println(a+":"+b+":"+c":"+d);
	}	
}
----

Q.
class Test{
	public static void main(String[] args) {
		int a,b,c,d;
		a= b= c= d= 10;
		System.out.println(a+":"+b+":"+c+":"+d);
	}	
}
answer: 10:10:10:10
----

Q.
class Test{
	public static void main(String[] args) {
		int x=10;
		x+=20;
		System.out.println(x);
	}	
}
answer: 30
----

Q. Consider the following code snippets:

Snippet-1:
		byte b1=10;
		b1 = b1 +1;//CE
		System.out.println(b1);

Snippet-2:
		byte b2=10;
		++b2;
		System.out.println(b2);
		
Snippet-3:		
		byte b3=10;
		b3+=1;
		System.out.println(b3);

which of the following is true?
A) Code snippets-1,2,3 cause compile time error.
B) Only code snippet-1 cause compile time error.
C) Only code snippet-2 cause compile time error.
D) Only code snippet-3 cause compile time error.

answer: B
---

Q.
class Test{
	public static void main(String[] args) {
		int a,b,c,d;
		a=b=c=d=20;
		a += b -= c *= d /2;
		System.out.println(a+":"+b+":"+c+":"+d);
	}	
}

answer:  -160:-180:200:20
 */
public class _21_instanceof_operator {
	public static void main(String[] args) {
	}
}