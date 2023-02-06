package _13_java_lang_package;
/*
StringBuilder:
--> Every method present in StringBuffer is synchronized, and hence only one 
thread is allowed to operate on StringBuffer object at a time, which may create
performance problems to handle this requirement SUN pepole introduced StrinBuilder
concept in 1.5V

--> StringBuilder is exactly same as StringBuffer except the following differences.

----------------------------------------------+----------------------------------------
		StringBuffer                          |			StringBuilder
----------------------------------------------+----------------------------------------
1. every method present in StringBuffer       |	1. Every method present in StringBuilder
	is synchronized.						  |		is non-synchronized.
----------------------------------------------+----------------------------------------
2. at a time only one thread is allowed       |	2. At a time multiple threads are allowed to 
  to operate on StringBuffer object and		  |		operate on StringBuilder object and hence
  hence StringBuffer object is threadsafe.	  |		StringBuilder object is not threadsafe.
----------------------------------------------+-----------------------------------------
3. Threads are required to wait to operate	  |	3. Threads are not-required to wait to opeate
  on StringBuffer object and hence relatively |		on StringBulder object and hence performance
  performance is low.						  |		is relatively high.
----------------------------------------------+----------------------------------------
4. Introduced in 1.0V						  |	4. Introduced in 1.5V  
----------------------------------------------+----------------------------------------


Note: Except the above differences everyting is same, in StringBuffer
 		and StringBuilder including methods and constructors.
===================================================================================

    String vs StringBuffer vs StringBuilder
--> If the content is fixed and won't change frequently then we should go for String.
--> If the content is not fixed and keep on changing but threadsafety is required then
 	we go for StringBuffer.
--> If the content is not fixed and keep on changing and threadsafety is not required then
 	we should go for StringBuilder.
===================================================================================

	Method Chaining:
--> For most of the methods in String,StringBuffer,StringBuilder return types are same type
	hence after applying the method on the result we can call another method which forms
	method chaining.
example:
		sb.m1().m2().m3().m4()......
		
--> In method chaining method calls will be executed from left to right
example:
		StringBuffer sb = new StringBuffer();
		sb.append("durga").append("Software").append("Solutions").insert(1, "XYZ").reverse().delete(2,10);
		System.out.println(sb);
 */
public class _10_StringBuilder {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("durga").append("Software").append("Solutions").insert(1, "XYZ").reverse().delete(2,10);
		System.out.println(sb);
	}
}
