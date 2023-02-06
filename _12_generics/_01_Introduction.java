package _12_generics;
/*
Generics:
--> The main objectives of generics are to provide type safety and to resolve
type-casting problems.

case-1: Type-safety
--> Arrays are type-safe, ie we can give gaurentee for the type of elements present 
inside array
	for eg: if our programming requirement is to hold only String objects, we can choose
			string array. By mistake if we are trying to add any other type of objects we
			will get CE.
			
			String[] s = new String[10000];
			s[0]="durga";
			s[1]="ravi";
		  //s[2]= new Integer(10);----> CE: incompatible types
			 							found: Integer
			 							required: String
			s[2]="shiva"---> valid
hence string array can contain only string type of objects, due to this we can give
the gaurentee for the type of elements present inside array. Hence Arrays are safe to
use w.r.t. to type ie, array are type safe.
		But collections are not type safe, ie we cannot give the gaurentee for the
	type of elements present inside collections, for eg if our programming requirement is 
	to hold only string type of objects, and if we choose ArrayList, by mistake if we are
	trying to add any other type of object we wont get any CE, but the program may fail
	at Runtime.
	ArrayList l = new ArrayList();
	l.add("durga");
	l.add("Ravi");
	l.add(new Integer(10));
	
	String name1= (String)l.get(0);
	String name2= (String)l.get(1);
	String name3= (String)l.get(2);--> RE: ClassCastException
	hence we cannot give gaurentee for the type of elements present inside collection
	due to this collections are not safe to use w.r.t to types, ie collections are
	not type-safe
~~~~~~~~

case-2: Type casting
-->In the case of arrays at the time of retrival it is not required to perform type-casting
because there is gaurentee for the type of elements present inside array.
   	String[] s =new String[10000];
   	s[0]="durga";
   	
   	String name1= s[0];---> type-casting is not required
   	
but in the case of collection at the time retrival compulasory we should perfrom type-casting
because there is no gaurentee for the type of elements present inside collection.
   	ArrayList l = new ArrayList();
   	l.add("durga");
   	
   	String name1= l.get(0);---> CE: incompatible types
	 							found: Integer
	 							required: String 
   	String name1=(String)l.get(0);---> type-casting is mandatory
Hence type casting is bigger headache in collection.

   	To over come above problems of colletion sun people introduced generic concept in
   	1.5V
   	hence the main objective of generic are:
   	1. to provide type safety
   	2. to resolve type casting problems

--> for example to hold only String type of objects we can create generic version
of ArrayList objects as follows:
	
		ArrayList<String> l = new ArrayList<String>();

--> for this arraylist we can add only string type of objects, by mistake if we are trying
to add any other type then we will get CE,
		l.add("durga");
		l.add("Ravi");
	  //l.add(new Integer(0));----> CE
	   	l.add("shiva");
hence through generic we are getting type-safety.

--> At the time of retrival we are not required to perform type-casting	  
		ArrayList<String> l = new ArrayList<String>();
		l.add("durga");
		
		String name1= l.get(0);---> type-casting is not required
hence through generic we can solve type-casting problem.
--------------------------------------------------
		ArrayList l = new ArrayList();
1. It is a non-generic version of ArrayList object. 	
2. for this AL we can add any type of object and hence it is not type-safe
3. At the time of retrival compulsory type-casting is required.		
--------------------------------------------------
		ArrayList<String> l = new ArrayList<String>();
1. It is a generic version of ArrayList object.	
2. for this AL we can add only string type of object and hence it is type-safe.
3. At the time of retrival we are not required to perform type-casting.

Conclusion:
1. Polymorphism(Usage of parent reference to hold child object) concept applicable 
   only for the base type but not for parameter type.

		        ArrayList<String> l = new ArrayList<String>();
		             |       |
		             |       +----> parameter type
		             +---> Base type 
				
				List<String> l = new ArrayList<String>();
				Collection<String> l = new ArrayList<String>();
				ArrayList<Object> l = new ArrayList<String>();--> CE: incompatible type
																found: AL<String>
																required: AL<Object>
																
2. for the type parameter we can provide any class or interface name but not
primitives, if we are trying to provide primitive then we will get CE.
																
       		ArrayList<int> l = new ArrayList<int>();
       		CE: Unexpected type
       		found: int
       		required: reference
	
 */
public class _01_Introduction {public static void main(String[] args) {}}
