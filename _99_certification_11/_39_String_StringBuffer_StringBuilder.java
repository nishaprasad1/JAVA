package _99_certification_11;
/*
String, StringBuffer and StringBuilder:

-->String is immutable object. Once we create a string object we cannot perform any changes
in that object. If we are trying to perform any changes with those changes a new object 
will be created. This behaviour is nothing but immutability.
-->StringBuilder is mutable. Once we create StringBuilder object, we can perform all
changes in the existing object only.
Q.
class Test{
	public static void main(String[] args) {
		String s = new String("durga");
		s.concat("soft");
		s=s.concat("durga");
		System.out.println(s);
	}
}
What is the result?
A) durgasoftdurga
B) durgasoft
C) durga
D) durgadurga
E) Compilation fails

answer: D
---

Q.
class Test{
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("durga");
		s.append("soft");
		s=s.append("durga");
		System.out.println(s);
	}
}
What is the result?
A) durgasoftdurga
B) durgasoft
C) durga
D) durgadurga
E) Compilation fails

answer: A
----

Q.
class Test{
	public static void main(String[] args) {
		String s1= new String("durga");
		String s2= new String("durga");
		System.out.print((s1==s2)+":");
		System.out.print(s1.equals(s2));
	}
}

A) false:true
B) false:false
C) true:false
D) true:true

answer: A

== operator always meant for reference comparison. ie, if two reference pointing to the
same object then only == operator returns true.

In string class .equals() method is overridden for content comparison. Hence if the 
content is the same then equals() method returns true.
---

Q.
class Test{
	public static void main(String[] args) {
		StringBuilder sb1= new StringBuilder("durga");
		StringBuilder sb2= new StringBuilder("durga");
		System.out.print((sb1==sb2)+":");
		System.out.print(sb1.equals(sb2));
	}
}

A) false:true
B) false:false
C) true:false
D) true:true

answer: B
== operator always meant for reference comparison. ie, if two reference pointing to the
same object then only == operator returns true.

In string class .equals() method is not overridden for content comparison. Hence Object class
equals() method will be executed which is always meant for reference comparison.
ie, if two reference pointing to the same object then only == operator return true.
---

Q.
class Test{
	public static void main(String[] args) {
		String s1= new String("durga");
		StringBuilder s2= new StringBuilder("durga");
		System.out.print((s1==s2)+":");//Line-1
		System.out.print(s1.equals(s2));//Line-2
	}
}
What is the result?
A) false:false
B) false:true
C) Compilation fails at Line-1
D) Compilation fails at Line-2
E) Compilation fails at both Line-1 and Line-2

answer: C
explanation: If there is no relation between argument types(either parent to child or child
to parent or same type) then == operator always causes compile time error.

But if the arguments types are different, equals() method won't raise any
compile time or runtime error, simply returns false.
---

Q.
class Test{
	public static void main(String[] args) {
		String s1= new String("Spring");
		s1.concat("Fall");
		String s2 = s1.concat("Winter");
		s2.concat("Summer");
		System.out.print(s1);
		System.out.print(s2);
	}
}
A) SpringFallSpringFallWinterSummer
B) SpringSpringWinter
C) SpringFallWinterSummer
D) SpringWinter
answer: B
---

Q. Which of the following class objects re immutable?
A) String
B) StringBuilder
C) Integer
D) Double

answer: A,C,D
===============

String API:
A) constructors
	1. String s = new String();
	2. String s = new String(<String literal>);
	3. String s = new String(StringBuffer sb);
	4. String s = new String(StringBuilder sb);
	5. String s = new String(char[] ch);
			char[] ch = {'a', 'b', 'c', 'd'};
			String s = new String(ch);
			System.out.println(s);// abcd
	6. String s = new String(byte[] b);
			byte[] b = {100, 101, 102, 103};
			String s = new String(b);
			System.out.println(s);//defg
			
B) Methods:
	1. public char charAt(int index);
			StringIndexOutOfBoundsException
	2. public String concat(String s);
	3. equals(Object o)===> content comparison
	4. equalsIgnoreCase(String s)
	5. lenght()====> no. of characters
	6. replace(char oldChar, char newChar)
	7. public String substring(int beginIndex)
			return substring from begin index to end of the string.
	8. public String substring(int begin, int end)
			return substring from begin index to end-1 index.
	9. toLowerCase()
   10. toUpperCase()
   11. trim()
   			remove blank spaces present at begin and end of the string but not middle
   			blank spaces.
   12. public int indexOf(char ch)
      		return the index of first occurrence of specified character, if it
      		is not available then we will get -1.
   13. public int lastIndexOf(char ch)

Q.
class Test{
	public static void main(String[] args) {
		String s1= new String("S1A9D7B8S6");
		System.out.println(s1.replace('S', 'X'));//X1A9D7B8X6
		System.out.println(s1.replaceAll("[0-9]", "-digit-"));//S-digit-A-digit-D-digit-B-digit-S-digit-
	}
}
---

Q.
class Test{
	public static void main(String[] args) {
		String s = "clearing ocjp is very easy";
		int i1= s.indexOf("ocjp");
		s.substring(i1+2);
		int i2= s.indexOf("ocjp");
		System.out.println(i1+i2);
	}
}

A) 18
B) 16
C) 22
D) 17
answer: A
---

Q.
class Test{
	public static void main(String[] args) {
		String s = "clearing ocjp is very easy";
		int i1= s.indexOf("ocjp");
		s= s.substring(i1+2);
		int i2= s.indexOf("ocjp");
		System.out.println(i1+i2);
	}
}
answer: 8
---

Q.
class Test{
	public static void main(String[] args) {
		String s = "durgasoft";
		String s1= s.substring(3);
		String s2= s.substring(3, 100);//Line-1
		System.out.println(s1.length()+s2.length());
	}
}
CE at Line-1
Exception in thread "main"
java.lang.StringIndexOutOfBoundsException: begin 3, end 100, length 9
---

Q.
class Test{
	public static void main(String[] args) {
		String s = "durgasoft";
		String s1= s.substring(3);
		String s2= s.substring(3, 9);
		System.out.println(s1.length()+s2.length());
	}
}
what is the result?
A) 12
B) 6
C) StringIndexOutOfBoundsException is thrown at runtime.
D) Compilation error.
answer: A 
---

Q.
class Test{
	public static void main(String[] args) {
		String s = "abcabcabc";
		String s1= s.replace('a', 'x');
		System.out.println(s1);
	}
}
o/p: xbcxbcxbc
---

Q.
class Test{
	public static void main(String[] args) {
		String s = "abcabcabc";
		String s1= s.replace("bc", "xx");
		System.out.println(s1);
	}
}
o/p: axxaxxaxx
---

Q.
class Test{
	public static void main(String[] args) {
		String s1 = new String("durga");
		String s2 = new String("durga");
		String s3 = "durga";
		String s4 = "durga";
		System.out.println((s1==s2)+":"+(s3==s4));
	}
}
o/p: false:true
---

Q.
class Test{
	public static void main(String[] args) {
		String s1 = new String("durga");
		String s2 = new String("durga");
		String s3 = "durga";
		String s4 = "durga";
		String s5 = s1.intern();
		String s6 = s2.intern();
		System.out.println((s1==s2)+":"+(s3==s4)+":"+(s3==s5)+":"+(s4==s6));
	}
}
answer: false:true:true:true
explanation: By using heap object reference, if we want to get the corresponding scp object,
then we should go for intern() method.
intern() method always returns object from scp only.
=====

 Character class:
 Character.isDigit(ch);
 
 Q.
 class Test{
	public static void main(String[] args) {
		String s = "A7b8c9Y5";
		int result=0;
		for(int i=0; i< s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				result+=1;
			}
			if(Character.isAlphabetic(s.charAt(i))) {
				result+=2;
			}
			if(Character.isLowerCase(s.charAt(i))) {
				result+=3;
			}
			if(Character.isUpperCase(s.charAt(i))) {
				result+=4;
			}
		}
		System.out.println(result);
	}
}
o/p: 26
---

Q.
class Test{
	public static void main(String[] args) {
		String s = args[0];
		int index = s.indexOf("abc");
		if(s.endsWith("abc")) {
			s = s.substring(0, index);
		}
		System.out.println(s);
	}
}
==> java Test durgaabc
what is the result?
A) durga
B) durg
C) Compilation error
D) An StringIndexOutOfBoundsException is thrown at runtime.

answer: A
---

Q.
class Test{
	public static void main(String[] args) {
		String s ="    ";
		System.out.println(s.length()+":"+s.trim().length());
	}
}

answer: 4:0
---

Q.
class Test{
	public static void main(String[] args) {
		String s = "XX";
		s.concat("YY");
		s=s.concat("ZZ");
		s.replace('X', 'A');
		s=s.replace('Y', 'B');
		System.out.println(s.length()+"-"+s);
	}
}
A) 4-XXZZ
B) 4-AAZZ
C) 4-BBZZ
D) 4-AABB

answer: A
====

--> The purpose of trim() method is to remove blank spaces present at beginning and
ending of the string, but not middle blank spaces.

Q.
class Test{
	public static void main(String[] args) {
		String s = "   Durga Soft   ";
		s=s.trim();
		System.out.println(s+":"+s.length());
	}
}
answer=>  Durga Soft:10
---

Q.
class Test{
	public static void main(String[] args) {
		String s1 = "Durga";
		String s2 = new String("Durga");
		if(s1==s2) {
			System.out.print("Reference-");
		}
		if(s1.equals(s2)) {
			System.out.print("Content-");
		}
		if(s1.toLowerCase() == s2.toLowerCase()) {
			System.out.print("Case-");
		}
		if(s1.toLowerCase().equals(s2.toLowerCase())) {
			System.out.print("equal");
		}
	}
}
answer==> Content-equal
---

Q.
class Test{
	public static void main(String[] args) {
		String s1 = "DURGA";
		String s2 = s1+"SOFT";
		String s3 = "DURGASOFT";
		System.out.println(s2==s3);
	}
}
answer: false,
explanation: s1+"SOFT" will be resolved at runtime and every runtime object is created
in heap area, while s3="DURGASOFT" is resolved at compile time hence will be created in
scp, so both are referencing to different object.
---

Q.
class Test{
	public static void main(String[] args) {
		final String s1 = "DURGA";
		String s2 = s1+"SOFT";
		String s3 = "DURGASOFT";
		System.out.println(s2==s3);
	}
}
answer==> true
explanation: as s1 is final, hence s2= s1+"SOFT" will be resolved at compiletime and
stored in scp, and same for s3.
--> every final variable will be replaced by value at compile time.
--> If both arguments are complie time costants, then that operation will be
performed at compile time.
--> If atleast one argument is normal variable but not constant then that operation
should be performed at runtime only.
---

Q.
class Test{
	public static void main(String[] args) {
		String s1 = "  DURGA SOFT";
		int i1= s1.indexOf(" ");
		s1= s1.trim();
		int i2 = s1.indexOf(" ");
		System.out.println(i1+i2);
	}
}

A) 5
B) 6
C) 4
D) 0
answer: 5
---

--> whenever we are trying to print any object reference , internally toString() method
will be called.
--> In String, StringBuffer, StringBuilder and in all wrappper classes, toString() method
is overridden to return its content directly.
But in our TestString class toString() method is not overridden and hence Object class
toString() method will be executed, which returns the string in the 
 		class_Name@hashcode_in_hexa_decimal_form
---

Q.
class TestString{
	String s;
	TestString(String s){
		this.s=s;
	}
	public String toString() {
		return s;
	}
}
class Test{
	public static void main(String[] args) {
		String s1= new String("Durga");
		StringBuilder s2= new StringBuilder("Durga");
		TestString s3 = new TestString("Durga");
		System.out.println(s1+":"+s2+":"+s3);
	}
}

o/p==>  Durga:Durga:Durga
---

Q.
class TestString{
	String s;
	TestString(String s){
		this.s=s;
	}
	public String toString() {
		return s;
	}
}
class Test{
	public static void main(String[] args) {
		TestString s1 = new TestString("Durga");
		String s2="Durga";
		System.out.println(s1.s==s2);
	}
}

answer: true
---

StringBuffer:
--> If the content keep on changing, never recommended to use String. As String
is immutable, for every change a new object will be created.

--> The main advantage of StringBuffer is that all changes will be performed in the
same object only because it is mutable.

 StringBuffer==> Synchronized, and it is thread safe.
 StringBuilder==> non-Synchronized... and it is not thread safe.
 
================
	
	constructors in StringBuffer:
1. StringBuffer sb = new StringBuffer();
Creates an empty stringbuffer object with default initial capacity 16.
		capacity= (cc+1)*2
		
Q.
class Test{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());//16
		sb.append("abcdefghijklimop");
		System.out.println(sb.capacity());//16
		sb.append("q");
		System.out.println(sb.capacity());//34
		sb.append("abcdefghijklimop");
		sb.append("q");
		System.out.println(sb.capacity());//34
		sb.append("r");
		System.out.println(sb.capacity());//70
	}
}
---

class Test{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());//16
		sb.append("abcdefghijklimop");
		System.out.println(sb.capacity());//16
		sb.append("q");
		System.out.println(sb.capacity());//34
		sb.append("abcdefghijklimop");
		sb.append("q");
		System.out.println(sb.capacity());//34
		sb.append("r");
		System.out.println(sb.capacity());//70
	}
}
---
2. StringBuffer sb = new StringBuffer(int capacity);

class Test{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(1000);
		System.out.println(sb.capacity());//1000
		sb.append("abcdefghijklimop");
		System.out.println(sb.capacity());//1000
		sb.append("q");
		System.out.println(sb.capacity());//1000
		sb.append("abcdefghijklimop");
		sb.append("q");
		System.out.println(sb.capacity());//1000
		sb.append("r");
		System.out.println(sb.capacity());//1000
	}
}
---

3. StringBuffer sb = new StringBuffer(String s);
	capacity= 16 + s.length();
	
			eg:
			StringBuilder sb = new StringBuilder("durga");
			System.out.println(sb.capacity());//21
4. StringBuffer sb = new StringBuffer(CharSequence cs);

CharSequence is an interface whose implementations are: String, StringBuffer, StringBuilder.

Methods:
 1. length()
 2. capacity()
 3. charAt(int index)
			if the index out of range, StringIndexOutOfBoundsException
 4. public void setCharAt(int index, char ch)
			character replacement
 5. public StringBuffer append(String s)			
 5. public StringBuffer append(int i)			
 5. public StringBuffer append(float f)			
 5. public StringBuffer append(double d)			
 5. public StringBuffer append(boolean b)			
 5. public StringBuffer append(char c)
			
			class Test{
				public static void main(String[] args) {
					StringBuilder sb = new StringBuilder();
					sb.append("PI value is: ");
					sb.append(3.14);
					sb.append(". It is exactly ");
					sb.append(true);
					System.out.println(sb);
				}
			}
			o/p:  PI value is: 3.14. It is exactly true

 6. public StringBuffer insert(int index, String s)
 6. public StringBuffer insert(int index, int i)
 6. public StringBuffer insert(int index, float f)
 6. public StringBuffer insert(int index, double d)

	eg:
		StringBuilder sb = new StringBuilder("abcdefgh");
		sb.insert(2, "xyz");
		System.out.println(sb);//abxyzcdefgh
	
 7. public StringBuffer delete(int begin, int end)
		from begin index to end -1 index
 8. public StringBuffer deleteCharAt(int index)
 9. public StringBuffer reverse()
10. public void setLength(int length)
 		eg:
 			StringBuilder sb = new StringBuilder("AishwaryaAbhi");
			sb.setLength(8);
			System.out.println(sb);//Aishwary
11. ensureCapacity(int capacity)
			eg:
				StringBuilder sb = new StringBuilder();
				System.out.println(sb.capacity());//16
				sb.ensureCapacity(1000);
				System.out.println(sb.capacity());//1000
12. trimToSize()
			eg:
				StringBuilder sb = new StringBuilder(1000);
				System.out.println(sb.capacity());//1000
				sb.append("xyz");
				sb.trimToSize();
				System.out.println(sb.capacity());//3
----

Q.
class Test{
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("durga");
		String s2="durga";
		if(s1.equals(s2)) {
			System.out.print("A");
		}
		if(s2.equals(s1.toString())) {
			System.out.print("B");
		}
	}
}
What is the result?
A) AB
B) A
C) B
D) No output

answer: C
---

Q. Consider the following code:
		StringBuilder s1 = new StringBuilder("durga");
		String s2="durga";
Which of the following expressions returns true?
A) s1 == s2
B) s1.toString() == s2.toString()
C) s1.equals(s2)
D) s1.toString().equals(s2)
E) (new String(s1)).equals(s2)

answer: D,E
---

Q. Assume we are developing masking application. The requirement is to mask all digits
of Customer Account number except last 2-digits. Account number contains 16 digits
in the following format
sample account number: 1234-5678-7860-2345
After masking the required output is: XXXX-XXXX-XXXX-XX45
Which of the following coding snippet can perform this operation?

A) 
String accountNumber ="1234-5678-7860-2345";
String s = "XXXX-XXXX-XXXX-XX";
String maskResult= s + accountNumber.substring(17,19);

B)
StringBuilder accountNumber =new StringBuilder("1234-5678-7860-2345");
String s = "XXXX-XXXX-XXXX-XX";
accountNumber.substring(17, 19);
String maskResult= s + accountNumber;
System.out.println(maskResult);

C)
StringBuilder accountNumber =new StringBuilder("1234-5678-7860-2345");
String s = "XXXX-XXXX-XXXX-XX";
String s1 = accountNumber.substring(17, 19);
String maskResult= s + s1;
System.out.println(maskResult);

D)
String accountNumber =new String("1234-5678-7860-2345");
StringBuilder s = new StringBuilder("XXXX-XXXX-XXXX-XX");
String maskResult= s.append(accountNumber, 17,19).toString();
System.out.println(maskResult);

answer: A,C,D
---

Q. Consider the following code:
class Test{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("durga");
		//Line-1
	}
}
Which of the following code be inserted at Line-1 to make StringBuilder
contents empty?
A) sb.clear();
B) sb.deleteAllCharacters();
C) sb.removeAllCharacters();
D) sb.delete();
E) sb.delete(0, sb.capacity());
F) sb.delete(0, sb.size());
G) sb.delete(0, sb.length());
H) sb.setLength(0);

answer: G,H
---

StringBuilder replace(int start, int end, String str)
Replace the characters in a substring of this sequence
with characters in the specified String.

Q.
class Test{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("DURGASOFT");
		sb.replace(2, 5, "XXXXXXXX");
		System.out.println(sb);
	}
}
o/p: DUXXXXXXXXSOFT
---

Q.
class Test{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("DURGASOFT");
		sb.replace(sb.indexOf("R"), sb.indexOf("O"), "X");
		System.out.println(sb);
	}
}
answer: DUXOFT
---

Q.
class Test{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("HI");
		sb.append(new StringBuilder("HELLO"));
		sb=sb+"HEY";//Line-1
		sb.append("OYE");
		System.out.println(sb);
	}
}
CE at Line-1
---

Q.
class Test{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("HI");
		sb.append(new StringBuilder("HELLO"));
		sb.append("HEY");
		sb.append("OYE");
		System.out.println(sb);
	}
}
answer: HIHELLOHEYOYE
---

Q.
class Test{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(7);
		sb.append("DURGA");
		sb.replace(2, 4, "XX");
		sb.insert(0, 'Y');
		sb.insert(5, "CAT");
		sb.delete(1, 6);
		System.out.println(sb);
	}
}
answer: YATA

 */
public class _39_String_StringBuffer_StringBuilder {public static void main(String[] args) {}}
