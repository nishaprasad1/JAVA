package _12_generics;

/*

--> we can declare type parameter either at class level or at method level.

1. Declaring type parameter at class level:
	
	class Test<T>{
		we can use 'T' within this class based on
		our requirement
	}

2. Declaring type parameter at method level:
	we have to declare type parameter just before return type
	
	class Test{
		public <T> void m1(T ob){
			we can use 'T' anywhere within this method
			based on our requirement
		}
	}
	
--> we can define bounded type at method level also:
  	public <T> void m1();
  	public <T extends Number> void m1();
  	public <T extends Runnable> void m1();
  	public <T extends Number & Runnable> void m1();
  	public <T extends Comparable & Runnable> void m1();
  	public <T extends Number & Comparable & Runnable> void m1();
  	public <T extends Runnable & Number> void m1();------> invalid, First we have to take class and then interface
  	public <T extends Number & Thread> void m1();--> invalid, we cannot extend more than one class
  	
===> Comunication with non generic code:
-> If we send generic object to non-generic area, then it starts behaving like non-generic 
	object. Similarly if we send non-generic object to generic area then is starts behaving
	like generic object, ie the location in which object is present based on that behaviour
	will be defined.  
		
		class Test{
			public static void main(String[] args) {
				ArrayList<String> l = new ArrayList<>();
				l.add("durga");
				l.add("Ravi");
		//		l.add(10); CE
				m1(l);
				System.out.println(l);//[durga, Ravi, 10, 10.5, true]
		//		l.add(10.5); CE
			}
			public static void m1(ArrayList l) {
				l.add(10);
				l.add(10.5);
				l.add(true);
			}
		}

Conclusions:
1. the main purpose of generic is to provie type safety and to resolve
  	type casting problems. Type safety and type casting both are applicable
  	at compile time, hence generic concept also applicable only at compile time
  	but not at runtime. At time of compilation as last step generic syntax will
  	be removed and hence for the JVM generic syntax won't be available.
  	
hence the following declarations are equal:
ArrayList l = new ArrayList<String>();
ArrayList l = new ArrayList<Integer>();
ArrayList l = new ArrayList<Double>();
ArrayList l = new ArrayList();

--> the following declarations are equal:
ArrayList<String> l = new ArrayList<String>();
ArrayList<String> l = new ArrayList();
for these AL objects we can add only string type of objects

--> 
Generic is only for compile time, at runtime generic syntax is removed

class Test{
	public void m1(ArrayList<String> l) {}//CE: Erasure of method m1(ArrayList<String>) 
	                                     //is the same as another method in type Test
	
	public void m1(ArrayList<Integer> l) {}//CE: Erasure of method m1(ArrayList<Integer>) 
	                                      //is the same as another method in type Test
}

at compile time:
1. compile code normally by considering generic syntax
2. remove generic syntax
3. compile once again resultant code
 
 */

public class _05_Generic_method {public static void main(String[] args) {}}
