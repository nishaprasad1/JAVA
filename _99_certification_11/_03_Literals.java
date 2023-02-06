package _99_certification_11;
/*
Literals: constant values what we assign to variables.

int x = 10;
here 10 is literal.
-----------

Integral literals:
a)decimal form(base-10)
		0 to 9
		int x =123;
		int y =999;
		
b)octal form(base-8)
		0 to 7
		int x =010;   start with zero and use digits 0-7 only
		int x =0786;-------> invalid
		
c)hexa decial form(base-16)
		0 to 9, a to f(A to F)
		0x or 0X
		
		int x= 0XFace;     start with 0X(or 0x) use 0 to 9, a to f(A to F) only
		int y= 0XBeef;     start with 0X(or 0x) use 0 to 9, a to f(A to F) only
		int z= 0XBeer;---------> invalid

d)binary form(base-2)
		0,1 only
		0b or 0B
		
		int x = 0B1111;
----------------------------------------

Q. which of the following are valid declarations?

A.  int x = 0777;
B.	int x = 0786;
C.	int x =	0XFace;
D. 	int x = 0XBeef;
E.  int x = 0XBeer;
F.	int x = 0Xadda;
G.	int x = 0B0101;

answer: A,C,D,F,G
------------
note: jvm will print data in decimal form only

Q. possible o/p?

class Test{
	public static void main(String[] args) {
		int a = 10;
		int b = 010;
		int c = 0X10;
		int d = 0B10;
		
		System.out.println(a+","+b+","+c+","+d);//10,8,16,2
	}
}

A. 10,8,16,2
B. 10,010,0X10,0B10
C. 10,10,10,10
D. None of the above
------------

Q. which of the following declarations are valid?

int a = 10;
long b = 10L;
long c =10;
int d = 10L;//CE

Bydefault every integral literal is of int type. If suffixed with 'l' or 'L'
then it is treated as long type.

if we are assigning integral literal to byte variable and the value is in the
range of byte type(-128 to 127), then it is automatically considered as byte 
type.
byte b = 127; valid
byte b = 128; invalid
--------

floating piont literals:

which of the following are invalid?
A) float f = 123.456;-------> invalid
B) float f = 123.456F;------->valid
C) double d =123.456;------->valid
D) double d =123.456D;------->valid

answer: A
------------

double d = 123.456;---> valid
double d = 0123.456;---> valid (but will be taken as decimal not octal)
double d = 0X123.456;--> invalid

floating point literal only in decimal form.

double d = 0X123.456---> invalid
double d = 0XFace----> valid
double d = 0777----> valid
double d = 0786---> invalid(octal 0-7)
double d =0786.0--> valid

double d = 10;
double d =10.0;---> invalid

 
 double d = 1.2e3;--->valid
 float f = 1.2e3;--->invalid(by default it is double)
 float f = 1.2e3F;---> valid
 -----------------
 
 usage of '_' symbol i numeric literals:
 
 double d = 1_23_456.789_7;---> these '_' will be removed by compiler.
 int i = 12_34;
 
 double d = 1____23_456.789;---> any number of '_' if allowed.
 ----
 
 '_' is only allowed between digits.
 
 double d = _123.456;---> invalid
 double d = 123_.456;---> invalid
 double d = 123.456_;---> invalid
 -----------
 
 
 boolean literals:
 true or false
 
eg:
int x =1;
if(x) {--------------------------> CE, as only boolean allowed
	System.out.println("Hii");
}else {
	System.out.println("Hello");
}

eg:
while(1)-------------------------> CE, boolean expected 
{
	System.out.println("Hello");
}

========
Q. which of the following declaration are valid?

boolean b = true;----------> valid
boolean b =	0;----------> invalid
boolean b =	False;----------> invalid
--------

char data types:

Q. which of the following declaration are valid?
char ch = 'a';----> valid
char ch = "a";----> invalid
char ch = 'ab';----> invalid
----

for every character unicode value
a---> 97
b---> 98

A---> 65
B---> 66
---

range: 0 to 65535

char ch = 65535;----> valid
char ch = 65536;----> invalid

unicode.org

char ch = '\uXXXX'; where XXXX is 4 digit hexadecimal code

eg: char ch = '\u0061';---------> unicode for a

char ch = '\u0061';---->valid
char ch = '\ubeef';---->valid
char ch = '\uabcd';---->valid
char ch = '\iface';---->invalid
char ch = \u00061;---->invalid


 */


/**
 char ch = '\uXXXX'; where XXXX is 4 digit hexadecimal code
 */
public class _03_Literals {
	public static void main(String[] args) {
		
	}
}