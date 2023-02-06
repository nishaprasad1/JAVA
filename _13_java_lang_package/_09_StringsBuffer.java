package _13_java_lang_package;
/*
    StringBuffer
--> If the content is fixed and won't change frequently then it is recommended
to go with string.

--> If the content is not fixed and keep on changing then it is not ecommended to
use string, because for every change a new object will be created which affects the
performance of the system. To handle this requirement we should go for StringsBuffer.

--> The main advantage of StringsBuffer over string is, that all required changes 
will be performed in the existing object only

=> Constructors:
1) StringBuffer sb = new StringBuffer();
--> creates an empty StringBuffer object with default initial capacity 16,
once StringBuffer reaches its max capacity a new StringBuffer object will be
created with new capacity equal to ( current_capacity + 1)*2
		+---------------------------------------+
 ie,    | newCapacity = (currentCapacity + 1)*2 |
 		+---------------------------------------+

2) StringBuffer sb = new StringBuffer(int initialCapacity);
--> creates an empty an empty stringbuffer object with specified initial capacity.

3) StringBuffer sb = new StringBuffer(String s);
--> creates a equivalent stringbuffer fo the given string with capacity = s.length() + 16
	example:
		StringBuffer sb = new StringBuffer("durga");
		System.out.println(sb.capacity());//21(ie, 5+16)
==============

Important methods of StringBuffer:
1. public int length();
2. public int capacity();
3. public char charAt(int index);

 eg: 
		StringBuffer sb = new StringBuffer("durga");
		System.out.println(sb.charAt(3));//g
		System.out.println(sb.charAt(30));//RE: java.lang.StringIndexOutOfBoundsException

4. public void setCharAt(int index, char ch); 
--> To replace the character located at specified index with the provided character.

5. pubic StringBuffer append(String s);----------+
 							(int i);-------------|
 							(long l);------------|----> Overloaded methods
 							(char ch);-----------|
 							(boolean b);---------+
 							
example:
		StringBuffer sb = new StringBuffer();
		sb.append("PI value is: ");
		sb.append(3.14);
		sb.append(" It is exactly: ");
		sb.append(true);
		System.out.println(sb);//PI value is: 3.14 It is exactly: true

6. public StringBuffer insert(int index, String s);----------+
 							 (int index, int i);-------------|
 							 (int index, long l);------------|----> Overloaded methods
 							 (int index, char ch);-----------|
 							 (int index, boolean b);---------+ 							
example:
		StringBuffer sb = new StringBuffer("abcdefgh");
		sb.insert(3, "xyz");
		System.out.println(sb);//abcxyzdefgh

7. public StringBuffer delete(int begin, int end);
--> To delete characters located from begin index to end-1 index

8. public StringBuffer deleteCharAt(int index);
--> To delete the character located at specified index.

9. public StringBuffer reverse();
example:
		StringBuffer sb = new StringBuffer("durga");
		System.out.println(sb.reverse());//agrud
	
10. public void setLenght(int length);
example:

		StringBuffer sb = new StringBuffer("AishwaryaAbhi");
		sb.setLength(9);
		System.out.println(sb);//Aishwarya
		
11. public void ensureCapacity(int capacity);
--> to increase capacity on fly based on our requirement.
example:
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());//16
		sb.ensureCapacity(1000);
		System.out.println(sb.capacity());//1000
		
12. public void trimToSize();
--> to deallocate extra memory allocated free memory
example:
		StringBuffer sb = new StringBuffer(1000);
		sb.append("abc");
		sb.trimToSize();
		System.out.println(sb.capacity());//3
		
 */
public class _09_StringsBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(1000);
		sb.append("abc");
		sb.trimToSize();
		System.out.println(sb.capacity());//3
	}
}
