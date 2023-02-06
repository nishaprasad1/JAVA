package _99_certification_11;
/*

Primitive type casting:
1. implicit type casting
2. explicit type casting


implicit:

int x ='a';
sop(x);-------> 97

double d =10;
sop(d);-------> 10.0

1. compiler is responsible
2. smaller data type value to bigger data type variable
3. no loss of information
4. widening or upcasting

===========================

explicit type casting:
programmer
bigger data type value to smaller data type variable
Narrowing or downcasting
----

Q. what type of casting in the following?
A. int to byte-----> explicit
B. byte to int-----> implicit
C. float to double---> implicit
D. double to float----> explicit
---

Q. 
int x =20;
double y =20.0;

x=y;//invalid
y=x;//valid
x=(int)y;//valid
y=(double)x;//valid
---

Q.
float a=123.456f;
double b=123.456;
long c=123L;

a=b; --->invalid
b=c;--->valid
c=a;--->invalid
a=(float)b;--->valid
a=(float)c;--->valid
b=(double)a;--->valid
b=(double)c;--->valid
c=(long)a;--->valid
c=(long)b;--->valid
a=(double)b;--->invalid
a=(long)c;--->valid
=============================

char ch ='a';
byte b =10;

ch=b;--->invalid
b=ch;--->invalid
b=(byte)ch;--->valid
ch=(char)b;--->valid
=============================

char ch='a';
short s =10;

ch=s;--->invalid
s=ch;--->invalid
ch=(char)s;--->valid
s=(short)ch;--->valid
==============================
eg:

byte b = 'A';--------------->valid
System.out.println(b);

char ch ='A';
byte b1 =ch;--------------->invalid
System.out.println(b1);

final char ch1='A';
byte b2=ch1;--------------->valid
System.out.println(b2);


 */

public class _04_Typecasting {
	public static void main(String[] args) {

	}
}
