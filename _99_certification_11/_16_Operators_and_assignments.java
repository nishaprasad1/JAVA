package _99_certification_11;
/*
Operators and Assignments:

1. Increment and decrement operators

Increment:
			pre increment: y= ++x;
			post increment: y= x++;
			
Decrement:			
			pre decrement: y= --x;
			post decrement: y= x--;
			
int x=10;
int y= ++x;
result: x-->11, y-->11

int x=10;
int y= x++;
result: x-->11, y-->10

int x=10;
int y= --x;
result: x-->9, y-->9

int x=10;
int y= x--;
result: x-->9, y-->10
----------

--> we can use increment and decrement operators only for variables but
not for constant values.

Q.
class Test{
	public static void main(String[] args) {
		int x=10;
		int y=++x;//Line-1
		int z=++10;//Line-2
		System.out.println(x+":"+y+":"+z);
	}
}

A) It prints 10:11:11
B) Compilation fails at Line-1
C) Compilation fails at Line-2
D) it throws an exception at runtime

answer: C
---

Q.
class Test{
	public static void main(String[] args) {
		int x=10;
		int y=++(++x);//Line-1
		System.out.println(x+":"+y);
	}
}
answer: CE at Line-1
explanation: nesting of increment and decrement operators not allowed.
---

Q.
class Test{
	public static void main(String[] args) {
		final int x=10;
		++x;//Line-1
		System.out.println(x);
	}
}
CE: we cannot use increment and decrement operators for final variables.
---

class Test{
	public static void main(String[] args) {
		var ch='a';
		System.out.println(++ch);
		var d=10.5;
		System.out.println(d++);
		var b=true;
		System.out.println(b++);//Line-1
	}
}
-->CE at Line-1 as increment/decrement not applicable for boolean types.
---

 Q.
class Test{
	public static void main(String[] args) {
		var ch='a';
		System.out.print(++ch);
		var d=10.5;
		System.out.print(++d);
	}
}

o/p: b11.5
--> we can use increment/decrement operator for every primitive type except boolean.
---

Q.
class Test{
	public static void main(String[] args) {
		byte b=127;
		System.out.print(++b);
	}
}

--> ++b ==> (byte)(b+1)==> (byte)(128)==> -128
-------

Q.
class Test{
	public static void main(String[] args) {
		byte b=127;
		b+=1;
		System.out.print(b);
	}
}

--> in compound statements also internal type casting is happen.
==============================

Arithmetic Operators:
+,-,*,/

a+b
max(int, type of a, type of b)

byte+byte==> int
byte+short==> int
short+short==>int
char+char==>int
int+long==>long
float+int==>float
double+float==>double

Q.
class Test{
	public static void main(String[] args) {
		byte a=10;
		byte b=20;
		byte c=a+b;//Line-1
		System.out.print(c);
	}
}

--> at Line-1 we will get CE as a+b will give int type result, we can fix it
	by type casting it to byte
	ie, byte c=(byte)a+b;
----

Q.
class Test{
	public static void main(String[] args) {
		final byte a=10;
		final byte b=20;
		byte c=a+b;
		System.out.print(c);
	}
}
--> o/p: 30, for final variables direct value is substituted hence 
it is like: byte c=10+20;==> c=30
----

Q.
class Test{
	public static void main(String[] args) {
		System.out.print('a'+'b');//195
		System.out.print(10+'b');//207
	}
}
o/p: 195
============

sop(10/0) ==> RE: ArithmeticException: / by zero
sop(10.0/0)==> infinity

sop(0/0)==> RE: ArithmeticException: / by zero
sop(0.0/0)===> NaN
=========

Q. consider the following lines of code:
A) System.out.print(10/0);
B) System.out.print(10.0/0);
C) System.out.print(-10.0/0);
D) System.out.print(0/0);
E) System.out.print(0.0/0);
F) System.out.print(-0/0.0);

How many of the above lines will cause Runtime exception saying
java.lang.ArithmeticException:

answer: A,D
-----

Q. Consider the lines of code:
A) System.out.println(10 > Float.NaN);
B) System.out.println(10 < Float.NaN);
C) System.out.println(10 >= Float.NaN);
D) System.out.println(10 <= Float.NaN);
E) System.out.println(10== Float.NaN);
F) System.out.println(Float.NaN == Float.NaN);

How many of the above lines will print true?
answer:- all will print false.
----

Q.
class Test{
	public static void main(String[] args) {
		System.out.println(10 != Float.NaN);
		System.out.println(Float.NaN != Float.NaN);
	}
}

whats is the result?
answer:
true
true
----

Q. which of the following is TRUE about ArithmeticException?
A) It is a Runtime Exception, but not compile time error.
B) It will be raised only in integral arithematic but not in floating
	point arithmetic.
C) The only operators which cause ArithmeticException are / and %
D) All of these.

answer: D
=====================================

String Concatenation Operator(+):
-->The only overloaded operator in java is + operator.
-->if both arguments are numbers then only + acts as 
arithmetic operator.
-->If atleast one argument is string type, then + operator
acts as concatenation operator.

 
Q.
class Test{
	public static void main(String[] args) {
		String a="durga";
		int b=20,c=30,d=40;
		System.out.println(a+b+c+d);//durga203040
		System.out.println(b+a+c+d);//20durga3040
		System.out.println(b+c+a+d);//50durga40
		System.out.println(b+c+d+a);//90durga
	}
}
----

Q. Consider the code:
String a="durga";
int b=10,c=20,d=30;
which of the following lines are valid?

A) a = 	b+c+d;
B) b = 	a+c+d;
C) a = 	a+c+d;
D) d = 	b+c+d;

answer: C,D
---

Q.
class Test{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("a+b="+a+b);//a+b=1020
		System.out.println("a+b="+(a+b));//a+b=30
		System.out.println("a+b="+(a)+(b));//a+b=1020
	}
}
---

Q.
class Test{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a+b+"=a+b="+a+b);//30=a+b=1020
		System.out.println((a)+(b)+"=a+b="+a+b);//30=a+b=1020
		System.out.println((a)+(b)+"=a+b="+(a+b));//30=a+b=30
	}
}
===========================

Relational operators:
>, >=, <, <=

Q.
class Test{
	public static void main(String[] args) {
		System.out.println(10<20);//true
		System.out.println('a'>'b');//false
		System.out.println(100>'a');//true
		System.out.println(10<10.0);//false
		System.out.println(false<true);//CE
	}
}
------

Note: we cannot apply relational operators for object types.
System.out.println("durga"<"soft");//CE
System.out.println("durga".length()<"soft".length());// valid
---

Note: nesting of relationl operators not allowed.
System.out.println(10<20<30<40);//CE

 */
public class _16_Operators_and_assignments {
	public static void main(String[] args) {
		
	}
}