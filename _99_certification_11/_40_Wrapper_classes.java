package _99_certification_11;
/*
1.4 version, primitive <--> object

-->To convert primitives into wrapper object so that we can handle primitives also
just like objects.
-->To provide several utility methods which are required for primitives. 

Q. Which of the following is the purpose of wrapper class?
s1: To convert primitives into wrappper objects so that we can handle primitives
	also just like objects.
s2: To provide several utility methods which are required for primitives.

answer: both s1 and s2	
---

Constructors:
byte-------> Byte
short------> Short
int--------> Integer
long-------> Long
float------> Float
double-----> Double
char-------> Character
boolean----> Boolean


Constructors:
Integer i= new Integer(int i);
Integer i= new Integer(String s);
eg:
	Integer i = new Integer(10);
	Integer i = new Integer("10");
---
Double d = new Double(10.5);	
Double d = new Double("10.5");
---
Float f = new Float(float f);	
Float f = new Float(String s);	
Float f = new Float(double d);	
---
character ch = new Character('a');
--> only one constructor char arg
---

Boolean b = new Boolean(true);
Boolean b = new Boolean("true");

Q. Which of the following are valid?
A) Boolean b = new Boolean(true);
B) Boolean b = new Boolean(True);
C) Boolean b = new Boolean("True");
D) Boolean b = new Boolean("sunny");
E) Boolean b = new Boolean("mallika");
F) Boolean b = new Boolean("False");

answer: B
--> If we want to pass boolean primitive as argument to Boolean class
constructor, then only allowed values are true or false. 
--> If we want to pass string as argument to Boolean class
constructor, then both content and case are not important. If the content
is case insensitive string of true, then it is treated as true otherwise
it is treated as false.
---

Q. Consider the following code?
class Test{
	public static void main(String[] args) {
		Boolean X = new Boolean("Sunny");
		Boolean Y = new Boolean("Bunny");
		System.out.println(X+":"+Y);
	}
}
A) Compilation error
B) An exception is thrown at runtime
C) false:false
D) Sunny:Bunny
answer: C
---

Q.
class Test{
	public static void main(String[] args) {
		Boolean X = new Boolean("Yes");
		Boolean Y = new Boolean("No");
		System.out.println((X==Y)+":"+X.equals(Y));//false:true
	}
}

Note:
--> In all wrapper classes toString() method is overridden to return content
directly.
--> In all wrapper classes equals() method is overridden for content comparison.

Q. Which of the following are valid?
A) Integer I = new Integer(10); 
B) Integer I = new Integer("10"); 
C) Integer I = new Integer(10L); 
D) Integer I = new Integer("10L");
answer: A,B

Q. which of the following are valid?
A) Float f = new Float(10.5f);
B) Float f = new Float("10.5f");
C) Float f = new Float(10.5);
D) Float f = new Float("10.5");
answer: A,B,C,D
--> In float class 3 constructors with float,double and String arguments.
---

Q. Which of the following are valid?
A) Character ch = new Character('a');
B) Character ch = new Character('ab');
C) Character ch = new Character("a");
D) Character ch = new Character("ab");
answer: A
--> Character class contains only one constructor with char primitive as argument.

Q. which of the following are valid?
A) Boolean B = new Boolean(true);
B) Boolean B = new Boolean(True);
C) Boolean B = new Boolean(false);
D) Boolean B = new Boolean("False");
answer: A,C,D
================

1. to convert primitives into wrapper objects
2. to provide several utility methods

utility methods:
1. valueOf()==> to create wrapper object for the given primitive or String
2. xxxValue()==> to get primitive value for the given wrapper class object. 
3. parseXxx()==> to get primitive value from String 
4. toString()==> to convert primitve or wrapper object to string 

1. valueOf()==> to create wrapper object for the given primitive or String
Integer i= Integer.valueOf(10)
Integer i= Integer.valueOf("10")
		form-1:(all wrapper classes except Character class)
		public static wrapper valueOf(String s)
		
		Integer I = Integer.valueOf("10");
		Double d = Double.valueOf("10.5");
		Boolean b = Boolean.valueOf("false");
		
		form-2:(only Byte,Short,Integer,Long classes)
		Integer I = Integer.valueOf(String s, int radix)
		--> allowed values for radix from 2 to 36.
		
		form-3:(all wrapper classes)
		public static wrapper valueOf(primitive p)
		
		eg: Integer I = Integer.valueOf(10);
			Double d = Double.valueOf(10.5);
			Character c = Character.valueOf('a');

Q. which of the following are valid?
A) Integer I = Integer.valueOf(10);
B) Integer I = Integer.valueOf("10",2);
C) Integer I = Integer.valueOf("10");
D) Double  D = Double.valueOf("10.5", 3);
E) Character ch = Character.valueOf("a");

answer:A,B,C
==========

 2. xxxValue()==> to get primitive value for the given wrapper class object.

 Integer I = new Integer(130);
 int i = I.intVale();
 byte b = I.byteValue();
 short s = I.shortValue();
 long l = I.longValue();
 float f = I.floatValue();
 double d = I.doubleValue();
 	
 	All number type wrapper classes(B,S,I,L,F,D)
---

Q.
class Test{
	public static void main(String[] args) {
		Double D = Double.valueOf(130.5);
		System.out.println(D.intValue());//130
		System.out.println(D.byteValue());//-126
		System.out.println(D.shortValue());//130
		System.out.println(D.longValue());//130
		System.out.println(D.floatValue());//130.5
		System.out.println(D.doubleValue());//130.5
	}
}
-->we can convert any number type wrapper object to any number type primitive.
--> automatic typecasting

charValue():
Character ch = new Character('a');
char c = ch.charValue();

booleanValue():
Boolean B = Boolean.valueOf("durga");
boolean b = B.booleanValue();
System.out.println(b);//false

Note:
-->below are applicable for Byte,Short,Integer,Long,Float,Double wrapper classes:
byteVlaue(),shortValue(),intValue(),longValue(),floatValue(),doubleValue()

--> charValue() appicable for Character wrapper class.
--> booleanValue() applicable to Boolean wrapper class.
===========================

3. parseXxx()==> to get primitive value from String
		
		form-1(all wrapper except Character class)
		public static primitive parseXxx(String s)
		
		eg:
		int i = Integer.parseInt("10");
		int i = Integer.parseInt(args[0]);
		boolean b = Boolean.parseBoolean("durga")//false
		
		form-2(only for Integer and Long classes)
		int i = Integer.parseInt("1111", 2);
		System.out.println(i);//15
===============

4. toString()==> to convert primitve or wrapper object to string

			form-1:(all wrapper classes including Character class)
			String s = Integer.toString(10);
			String s = Double.toString(10.5);
			String s = Character.toString('a');
			
			form-2:(only for Long, Integer)
			String s = Integer.toString(primitive, radix);
				radix is between 2 to 36
			String s = Integer.toString(10,2);
			String s = Integer.toString(10,2);
			System.out.println(s);//1010
			
			form-3:
			binary
			octal
			hexadecimal
			
			String s = Integer.toString(10,2);
			System.out.println(s);//1010
			System.out.println(Integer.toBinaryString(10));//1010
			System.out.println(Integer.toOctalString(10));//12
			System.out.println(Integer.toHexString(10));//a
			
			System.out.println(Long.toBinaryString(10));//1010
			System.out.println(Long.toOctalString(10));//12
			System.out.println(Long.toHexString(10));//a
			
			form-4:
			Wrapper object to Sting
			Integer I = new Integer(10);
			String s = I.toString();
---

Q.
class Test{
	public static void m1(Long l) {
		System.out.println("Long");
	}
	public static void main(String[] args) {
		int x =10;
		m1(x);
	}
}
What is the result?
A) Long
B) Compilation error
C) An exception is thrown at runtime
D) No output
	
answer: B
--> widening followed by autoboxing won't be performed automatically
but autoboxing followed by widening is allowed
---

Q.
class Test{
	public static void m1(Object l) {
		System.out.println("Object");
	}
	public static void main(String[] args) {
		int x =10;
		m1(x);
	}
}
What is the result?
A) Object
B) Compilation error
C) An exception is thrown at runtime
D) No output
	
answer: A
---

Q. Which of the following assignments are valid?
A) Long l =   10;// invalid int to Long conversion not possible
B) Object o = 10;// valid  int ---> Integer ---> Object
C) long l = 10L;//valid
D) Integer I = 10;//valid by autoboxing
E) Double D =10;//invalid int to Double conversion not possible
F) double d =10;// valid int--> double widening will happen

answer:  B,C,D,F
----

Q.
class Test{
	public static void main(String[] args) {
		Byte b1 = 10;
		Byte b2 = 20;
		Integer I = (int)b1 + b2;
		System.out.println(I);//30
	}
}
A) 30
B) Compilation Error
C) Runtime exception
D) No o/p

answer: A
---

Q.
class Test{
	public static void main(String[] args) {
		Byte b1 = 10;
		Byte b2 = 20;
		String s1 = (String)(b1 + b2);//Line-1
		String s2 = Integer.toString(b1 + b2);//Line-2 
		System.out.println(s1+s2);
	}
}
What is the result?
A) 3030
B) Compilation error at Line-1
C) Compilation error at Line-2
D) An exception is thrown at runtime

answer: B
---

Q.
class Test{
	public static void main(String[] args) {
		Boolean b1 = new Boolean(Boolean.parseBoolean("durga"));
		Boolean b2 = new Boolean(null);
		System.out.println(b1+":"+b2);//false:false
	}
}
---

Q.
class Test{
	public static void main(String[] args) {
		Boolean b1 = new Boolean(Boolean.parseBoolean("TRUE"));
		Boolean b2 = new Boolean("null");
		System.out.println(b1+":"+b2);//true:false
	}
}
---

Q.
class Test{
	public static void main(String[] args) {
		Boolean X = new Boolean(args[0]);
		Boolean Y = new Boolean(args[1]);
		Boolean Z = new Boolean(args[2]);
		System.out.println(X+":"+Y+":"+Z);
	}
}
And the command invocation:
javac Test.java
java Test sunny bunny chinny
what is the result?
A) false:false:false
B) true:true:true
C) Compilation error
D) runtime exception
answer: A
 */
		
public class _40_Wrapper_classes {public static void main(String[] args) {}}