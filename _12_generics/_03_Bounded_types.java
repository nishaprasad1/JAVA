package _12_generics;
/*
Bounded types:

--> we can bound the type prameter for a particular range, using extends keywords
such types are called bounded types.
	
	class Test<T>{
	
	}
--> as a type parameter we can pass any type and there are no restriction and hence it is
unbounded type.
 	Test<Integer> t1 = new Test<Integer>();
 	Test<String> t1 = new Test<String>();
 	
--> syntax for bounded type:
 	
 	class Test<T extends X>{
 		
 	}
where X can be either class or interface
if X is a class then as type parameter we can pass either X type or its child classes
if X is an interface then as type parameter we can pass either X type or its implementation classes.

eg1:
class Test<T extends Number>{
	
}  	
Test<Integer> t1 = new Test<Integer>();--> valid
Test<String> t2 = new Test<String>();//CE:Bound mismatch: The type String is not a 
	//valid substitute for the bounded parameter <T extends Number> of the type Test<T>
		 	
 	
eg2:
class Test<T extends Runnable>{
	
}
Test<Runnable> t1 = new Test<Runnable>();
Test<Thread> t2 = new Test<Thread>();
Test<Integer> t3 = new Test<Integer>();//CE:Bound mismatch: The type Integer is not a 
									  //valid substitute for the bounded parameter
									 // <T extends Runnable> of the type Test<T>


--> we can define bounded types even in combination also:

	class Test<T extends Number & Runnable>{
		
	}
--> As a type parameter we can take anything which should be child class of number
and should implements Runnable interface.

	class Test<T extends Runnable & Comparable>{}---> valid
	
	class Test<T extends Number & Runnable & Comparable>{}---> valid
	
	class Test<T extends Runnable & Number >{}---> invalid(because we have to 
						take class first followed by interface next)

	class Test<T extends Number & Thread >{}---> invalid(because we cannot extend  
						more than one class simultaneously)
						
Note:
1. we can define bounded types only by using extends keyword, and we cannot use implements
and super keywords but we can replace implements keyword purpose with extends keyword.

	class Test<T extends Number>{}----------> valid
	class Test<T implements Runnable>{}-----> invalid
	class Test<T extends Runnable>{}--------> valid
	class Test<T super String>{}------------> invalid
2. As a type parameter 'T', we can take any valid java identifier but it is
convention to use T
  	class Test<T>{}
  	class Test<X>{}
  	class Test<A>{}
  	class Test<durga>{}
3. based on our requirement we can declare any number of type parameters and
all these type parameter should be separated with ','
  	class Test<A,B>{}
  	class Test<X,Y,Z>{}
  	class HashMp<K,V>{}==> HasMap<Integer,String> hm = new HashMap<Integer,String>();
  				 | |
  				 | +------> key type
  				 +--------> value type
  				 	
 */
public class _03_Bounded_types {public static void main(String[] args) {
	
}}
