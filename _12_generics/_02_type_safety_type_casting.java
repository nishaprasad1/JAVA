package _12_generics;
/*
Generic Classes:

--> until 1.4v a non-generic version of arraylist is declared as folows:

		class ArrayList{
			add(Object obj);
			Object get(int index);
		}
		
--> the argument to add() method is object and hence we cn add any type of object to the
ArrayList due to this we are missing type-safety.
--> the return type of get(int) method is Object and hence at the time of retrival
we have to perform type-casting.

--> But in 1.5v a generic version of ArrayList class is declared as follows:
									
			class ArrayList<T>{-------------> where T is type parameter
					add(T t);
				 T  get(int index);	
			}
based on our runtime requirement T will be replaced with our provided type

 --> for example to hold only string type of objects a generic version of AL object
 can be created as follows:
 	ArrayList<String> l = new ArrayList<String>();
 	for this requirement compiler considered verison AL is as follows
 	
		 	class ArrayList<String>{
		 			add(String s);
		 	String  get(int index);
		 	}
--> the argument to add() method is String type, hence we can add only string type of
objects, by-mistake we are trying to add any other type we will get CE.
		 	l.add("durga");--> valid
		 	l.add(new Integer(10));---> CE: cannot find symbol
		 								symbol: method add(java.lan.Integer)
		 								location: class ArrayList<String>
hence through generic we are getting type-safety
--> return type of get(int) method is string and hence at time of retrival we are 
not required to perform type-casting
		 	String name1= l.get(0);---> type-casting is not required
		 	
--> In generics we re associating a type parameter to the class such type of prameterised
classes are nothing but generic classes or template classes.
--> based on our requirement we can define our own generic classes also.

		 	class Account<T>{
		 	
		 	}
		 	Account<Gold> a1 = new Account<Gold>();
		 	Account<Platinum> a1 = new Account<Platinum>();

eg:

class Gen<T>{
	T ob;
	Gen(T ob){
		this.ob=ob;
	}
	public void showType() {
		System.out.println("The type of ob: "+ ob.getClass().getName());
	}
	public T getOb() {
		return ob;
	}
}
class GenDemo{
	public static void main(String[] args) {
		Gen<String> g1 = new Gen<String>("durga");
		g1.showType();
		System.out.println(g1.getOb());

		Gen<Integer> g2 = new Gen<Integer>(10);
		g2.showType();
		System.out.println(g2.getOb());

		Gen<Double> g3 = new Gen<Double>(10.5);
		g3.showType();
		System.out.println(g3.getOb());
	}
}
 */
class Gen<T>{
	T ob;
	Gen(T ob){
		this.ob=ob;
	}
	public void showType() {
		System.out.println("The type of ob: "+ ob.getClass().getName());
	}
	public T getOb() {
		return ob;
	}
}
class GenDemo{
	public static void main(String[] args) {
		Gen<String> g1 = new Gen<String>("durga");
		g1.showType();
		System.out.println(g1.getOb());

		Gen<Integer> g2 = new Gen<Integer>(10);
		g2.showType();
		System.out.println(g2.getOb());

		Gen<Double> g3 = new Gen<Double>(10.5);
		g3.showType();
		System.out.println(g3.getOb());
	}
}

public class _02_type_safety_type_casting {public static void main(String[] args) {}}
