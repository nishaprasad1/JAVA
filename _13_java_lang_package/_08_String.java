package _13_java_lang_package;

/*

case 1:
String s = new String("durga");				||		StringBuffer sb = new StringBuffer("durga");
s.concat("software");						||		sb.append("software");
System.out.println(s);//durga				||		System.out.println(sb);//durgasoftware
											||
--> Once we create a string object we		||	--> Once we create StringBuffer object we can perform
cannot perform any changes in the existing	||		any change in the existing Object this changeable 
object, if we are trying to perform any		||		behaviour is nothing but mutability on stringbuffer object.
change with those changes a new object will	||
be created. This non-changeable behaviour is||
nothing but immutability of string.			||
==================================================================================================================
											||
case 2:										||
String s1 = new String("durga");			||		StringBuffer sb1 = new StringBuffer("durga");
String s2 = new String("durga");			||		StringBuffer sb2 = new StringBuffer("durga");
System.out.println(s1 == s2);//false		||		System.out.println(sb1 == sb2);//false
System.out.println(s1.equals(s2));//true	||		System.out.println(sb1.equals(sb2));//false
											||
--> In String class .equals() method is		||   --> In StringBuffer class .equals() method is not overriden   
overridden for content comparison and 		||		for content comparison, hence Object class .equals() 
hence even though objects are different		||		method got executed which is ment for reference comparison
if contents are same .equals() returns true	||		(address comparison). Due to this if objects are different
											||       .equals() method returns false even though content is same.
===================================================================================================================
											||
case 3:										||
a)											||
String s = new String("durga");				||		String s = "durga";
--> In this case two objects will be created||	--> In this case only one oject will be created in scp, and s
one in the heap area and the other in scp 	||		is pointing to that object.
and s is always pointing to heap object		||
											||
											||
	heap  		|  scp						||			heap  		|  scp
	area		|							||			area		|
	+------+	|	+------+				||						|		+------+
s-->|durga |	|	|durga |				||						|		|durga |<----s
	+------+	|	+------+				||						|		+------+

Note: 1) Object creation in scp is optional, first it will check is there any object already presentin scp with
 		required content. If object already present then existing object will be reused. If object not already
 		available then only a ne object will be created. But this rule is applicable only for scp but not for
 		heap memory.
 	
 	  2) Garbage collector is not allowed to access scp area hence even though object doestn't content reference
 	  	variable it is not eligible for gc if it is present in scp area. All scp objects will be destroyed automatically
 	  	at the time of jvm shutdown.
 	  	
 	  	
b)
String s1 = new String("durga"); 	  	
String s2 = new String("durga"); 	  	
String s3 = "durga";
String s4 = "durga";

 		
 		heap area    |    scp
 					 |
 		+------+     |	+------+
 s1---> |durga |     |  |durga |<--- s3
 		+------+     |  +------+
 					 |		/|\
 		+------+     |		 |	
 s2--->	|durga |     |       s4
 		+------+     |  
 
--> Whenever we are using new operator compulsory a new object will be created in the heap area, hence
there may be a chance of existing two objects with same content in the heap area but not in scp, ie duplicate
objects are possible in heap area but not in scp. 
 
c)
String s1 = new String("durga");
s1.concat("Software");
String s2 = s1.concat("Solutions");
s1= s1.concat("Soft");
System.out.println(s1);//durgaSoft
System.out.println(s2);//durgaSolutions
 
 		heap area    		|    scp
 					 		|	
 		+------+     		|	+------+
  		|durga |     		|  	|durga |
 		+------+     		|  	+------+
 					 		|		
 	+--------------+		|	+----------+	 	
 	|durgaSoftware |		|   | Software |    
 	+--------------+		|   +----------+
 					 		|		
 		+--------------+	|	+----------+	 	
 s2-->	|durgaSolutions|	|   | Solutions|    
 		+--------------+	|   +----------+
 					 		|		
 		+--------------+	|	+------+	 	
 s1-->	|durgaSoft	   |	|   | Soft |    
 		+--------------+	|   +------+
 
Note: 1) For every String constant one object will be placed in scp area.
	2) Because of some runtime operation if an object is required to create
		that object will be placed only in heap area but not in scp area.
 
String s1 = new String("Spring");
s1.concat("Summer");
String s2 = s1.concat("Winter");
s1= s1.concat("Fall");
System.out.println(s1);//SpringFall
System.out.println(s2);//SpringWinter
 
 		heap area    		|    scp
 					 		|	
 		+-------+     		|	+-------+
  		|Spring |     		|  	|Spring |
 		+-------+     		|  	+-------+
 					 		|		
 	+--------------+		|	+--------+	 	
 	|SpringSummer  |		|   | Summer |    
 	+--------------+		|   +--------+
 					 		|		
 		+--------------+	|	+--------+	 	
 s2-->	|SpringWinter  |	|   | Winter |    
 		+--------------+	|   +--------+
 					 		|		
 		+--------------+	|	+------+	 	
 s1-->	|SpringFall	   |	|   | Fall |    
 		+--------------+	|   +------+
=======================

 Constructors of String Class:
 
 1. String s = new String();
 --> creates an empty String object.
 
 2. String s = new String(String_Literal);
 --> creates a string object on heap for given string literal
 
 3. String s = new String(StringBuffer sb);
 --> creates an equivalent string object for given stringBuffer
 
 4. String s = new String(char[] ch);
 --> creates an equivalent string object for the given char array.
 		eg: char[] ch = {'a','b','c','d','e'};
 			String s = new String(ch);
 			System.out.println(s);//abcde
 
 5. String s = new String(byte[] b);
 --> creates an equivalent string object for the given byte array.
 		eg: byte[] b = {100,101,102,103};
 			String s = new String(b);
 			System.out.println(s);//defg
=======================
 		
Important methods of String class:

1. public char charAt(int index);
	--> returns the character located at specified index. 
	String s = "durga";
	System.out.println(s.charAt(3));//g
	System.out.println(s.charAt(30));//RE: StringIndexOutOfBoundsException

	
2. public String concat(String s)
--> the overloaded + and += operators also meant for concatenation purpose only.

String s = "durga";
s = s.concat("Software");
//s=s+"Software";
//s+="Software"; 
System.out.println(s);//durgaSoftware


3. public boolean equals(Object o)
--> To perform content comparison where case is important.
--> This is overriding version of Object class equals() method


4. public boolean equalsIgnoreCase(String s)
--> To perform content comparison where case is not important.
		String s = "java";
		System.out.println(s.equals("JAVA"));//false
		System.out.println(s.equalsIgnoreCase("JAVA"));//true
--> In general we can use equalsIgnoreCase to validate user email id where 
	case is not important whereas we can use equals method to validate password
	where case is important.
	
5. public String substring(int begin);
--> returns substring from begin index to end of the String

6. public String substring(int begin, int end);
--> returns substring from begin index to 'end-1' index
		String s = "abcdefg";
		System.out.println(s.substring(3));//defg
		System.out.println(s.substring(2,5));//cde
		
7. public int length();
--> returns number of characters present the string.
		String s = "durga";
		System.out.println(s.length);//CE:length cannot be resolved or is not a field
		System.out.println(s.length());//5		
Note: length variable applicable for arrays but not for String objects whereas length() method
		applicable for string objects but not for arrays.
		

8. public String replace(char ch, char newCh);
		eg: String s = "ababa";
		System.out.println(s.replace('a','b'));//bbbbb
	
9. public String toUpperCase();
10. public String toLowerCase();

11. public String trim();
--> to remove blank spaces present at begining and end of the string but not middle blank spaces

12. public int indexOf(char ch);
--> returns index of first occurence of specified character

13. public int lastIndexOf(char ch);
	
	eg: String s = "ababa";
	System.out.println(s.indexOf('a'));//0
	System.out.println(s.lastIndexOf('a'));//4


Note:
--> Because of runtime operation if there is change in the content then with those changes a new
object will be created o the heap.
--> If there is no change in the content then existing object will be reused and a new object won't 
be created.
--> whether the object is pesent in heap or scp the rule is the same.

		String s1 = "durga";
		String s2 = s1.toUpperCase();						heap         |         scp
		String s3 = s1.toLowerCase();						+-----+      |
		System.out.println(s1 == s2);//false			s1->|durga|      |
		System.out.println(s1 == s3);//true				s3->+-----+      |
																		 |
		String s4 = s3.toUpperCase();						+-----+		 |
		String s5 = s4.toUpperCase();					s2->|DURGA|		 |
															+-----+		 |
															+-----+		 |
														s4->|durga|		 |
															+-----+		 |
															+-----+		 |
														s5->|DURGA|		 |
															+-----+		 |


==========

		String s1 = "durga";								heap         |    scp
		String s2 = s1.toString();										 |
		System.out.println(s1==s2);//true					+-------+	 | s1-->+-----+
													   s4-->|DURGA  |	 | s2-->|durga|
		String s3 = s1.toLowerCase();						+-------+	 | s3-->+-----+
		String s4 = s1.toUpperCase();									 |
		String s5 = s4.toLowerCase();						+-----+		 |	
												       s5-->|durga|		 |
		System.out.println(s1==s3);//true					+-----+		 |
		System.out.println(s1==s4);//false
		System.out.println(s1==s5);//false

==========

 How to create oue own immutable class
--> Once we create an object we cannot perform any changes in that object, if
we are trying to perform any change and due to which there is change in the content
then with those changes a new object will be created, if there is no change in the 
content then existing object will be re-used. This behaviour is nothing but immutability.

eg:  														heap memory			
 		String s1 = new String("durga");					
 		String s2 = s1.toUpperCase();                   	+-----+				
 		String s3 = s1.toLowerCase();				   s1-->|durga|
													   s3-->+-----+			
															+-----+
													   s2-->|DURGA|
															+-----+

example:

 final public class Test{
 	private int i;
 	Test(int i){
 		this.i=i;
 	}
 	public Test modify(int i){
 		if(this.i == i)
 			return this;
 		else
 			return new Test(i);
 	}
 }
 
 Test t1 = new Test(10);
 Test t2 = t1.modify(100);
 Test t3 = t1.modify(10);
 System.out.println(t1 == t2);//false
 System.out.println(t1 == t3);//true
 
--> Once we create Test object we cannot perform any change in th existing object, if we
are trying to perform any change and due to which there is change in the content then with
those changes a new object will be created. If there is no change in the content then 
existing object will be reused.
=============

   final vs immutability
 --> final applicable for variables but not for objects where as immutibility applicable 
 for objects but not for variables.
 --> By declaring a reference variable as final we wont get any immutibility nature even though
 reference variable is final we can perform any type of change in the corressponding object, but we 
 cannot perform re-assignment for that variable.
 Hence final and immutable both are different concepts.
 
  example:
			final StringBuffer sb = new StringBuffer("durga");
			sb.append("software");
			System.out.println(sb);//durgasoftware
			sb = new StringBuffer("solutions");//CE:The final local variable sb cannot be assigned.
											  // It must be blank and not using a compound assignment.
 
Q) which of the following are meaningful?
a)final variable-------> valid
b)immutable variable-------> invalid
c)final object-------> invalid
d)immutable object-------> valid 
 
 */
public class _08_String {
	public static void main(String[] args) {}
}
