package _99_certification_11;

import java.util.Arrays;

/*
Arrays:

Student[] s = new Student[1000];

1. Fixed size
2. Homogeneous elements

Collections:
1. Not fixed in size
2. Homogeneous and Heterogeneous
3. Method support available----> operations will become very easily.

arrays vs collections:
-->arrays is java's inbuilt concept(language level concept)
-->collection is java's library support(api support)

 Collection Hierarchy:
 If we want to represent a group of objects as a single entity, then we should go for
 collections.
 
 List(I):
 	Duplicate objects are allowed.
 	Insertion order is preserved.

 Set(I):
 	Duplicate objects are not allowed.
 	Insertion order is not preserved.
 	
 Queue(I):
  	Before processing/ prior to processing

 Map(I): Duplicate keys are not allowed but values can be duplicated.
 
 Collection Interface Methods:
 1. boolean add(Object o);
 2. boolean addAll(Collection c);
 3. boolean remove(Object o);
 4. boolean removeAll(Collection c);
 5. boolean retainAll(Collection c);
 6. void clear();
 7. boolean contains(Object o);
 8. boolean containsAll(Collection c);
 9. boolean isEmpty();
10. int size();
11. Object[] toArray();
12. Iterator iterator();

List(I):
Insertion order
Duplicate Objects
index based methods are extra for list

 1. void add(int index, Object o);
 2. boolean addAll(int index, Collection c);
 3. Object get(int index);
 4. Object remove(int index);
 5. Object set(int index, Object newObject);
 6. int indexOf(Object o);====> first occurrence
 7. int lastIndexOf(Object o);===> last occurrence
 8. ListIterator listIterator();
 
 ArrayList:
 Insertion order preserved
 Duplicate objects are allowed
 Heterogeneous objects are allowed
 null insertion is possible
 
  Constructors:
 1. ArrayList l = new ArrayList();
  
  new capacity = (cc*3/2) + 1
  10,16,25,....
 2. ArrayList l = new ArrayList(int capacity);
 3. ArrayList l = new ArrayList(Collection c);
 
 Q.
 class Test{
	public static void main(String[] args) {
		ArrayList l = new ArrayList<>();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);//[A, 10, A, null]
		
		l.remove(2);
		System.out.println(l);//[A, 10, null]
		
		l.add(2,"M");
		l.add("N");
		System.out.println(l);//[A, 10, M, null, N]
	}
}
---

ArrayList l = new ArrayList();//Non-generic version which is not type safe.
ArrayList<Integer> l = new ArrayList<Integer>();// generic version which is type safe.

ArrayList<Integer> l = new ArrayList<Integer>();===> 1.5V
ArrayList<Integer> l = new ArrayList<>();====>1.7V
---

Q.
class Test{
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.remove(2);
		System.out.println(l);
	}
}
o/p: [1, 2]
---

Q.
class Test{
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.remove(new Integer(2));
		System.out.println(l);//[1, 3]
	}
}
---

Q.
class Test{
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("A");
		l.add("D");
		l.remove("A");
		System.out.println(l);//[B, A, D]
	}
}
---

Q.
class Test{
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add(null);
		l.add("B");
		l.add(null);
		l.add("D");
		l.remove(null);
		System.out.println(l);//[B, null, D]
	}
}
---

Q.
class Test{
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.remove(2);
		System.out.println(l);//RE: arrayindexoutofboundexception
	}
}
---

ArrayList<X> l = new ArrayList<>();
--> If X is an interface, then X implementation class object are allowed for this ArrayList.
--> If X is an abstract class, then X child class objects  are allowed for the ArrayList.
--> If X is concrete class, then either X or its child class objects are allowed for
	this ArrayList.
---

Q.
interface A{}
abstract class B{}
class C extends B{}
class D implements A{}
class E extends B implements A{}

Choose wrong statement from the following?
A) Every E type object is by default A type.
B) Every C type object is by default A type.
C) Every C type object is by default B type.
D) Every D type object is by default A type.

answer: B
---

Q. Consider the following:
interface A{}
abstract class B{}
class C extends B{}
class D implements A{}
class E extends B implements A{}

A)
List<A> l = new ArrayList<>();
l.add(new C());

B)
List<B> l = new ArrayList<>();
l.add(new C());

C)
List<A> l = new ArrayList<>();
l.add(new E());

D)
List<B> l = new ArrayList<>();
l.add(new E());

E)
List<E> l = new ArrayList<>();
l.add(new A());
l.add(new B());

Which of the above are invalid?
answer: A,E
---

Q.
class Test{
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		try {
			while(true) {
				l.add("Apple");
			}
		} catch (Exception e) {
			System.out.println("Exception Raised");
		}
	}
}
A) Compilation Fails
B) Exception Raised will be printed to the console
C) OutOfMemoryError thrown at runtime
D) StackOverflowError thrown at runtime

answer: C
---

Q.
class Test{
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		try {
			while(true) {
				l.add("Apple");
			}
		} catch (OutOfMemoryError e) {
			System.out.println("Exception Handled");
		}
	}
}

o/p: Exception Handled
----

Q.
class Test{
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		if(l.remove("C")) {
			l.add("D");
		}
		if(l.remove("C")) {
			l.add(1, "E");
		}
		System.out.println(l);//[A, B, D]
	}
}
---

Q.
class Test{
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		if(l.remove("C")) {
			l.add("D");
		}
		if(l.remove("A")) {
			l.remove(2);
			l.add(1, "E");
		}
		System.out.println(l);
	}
}
RE, indexoutofboundexception
---
Q.
class Test{
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		if(l.remove("C")) {
			l.add("D");
		}
		if(l.remove("A")) {
			l.add(1, "E");
			l.remove(2);
		}
		System.out.println(l);//[B, E]
	}
}
---

Q.
class StudentVO{
	String name;
	int rollno;
	StudentVO(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}
}
class Test{
	public static void main(String[] args) {
		ArrayList<StudentVO> l = new ArrayList<>();
		StudentVO s = new StudentVO("durga", 101);
		l.add(s);
		
		StudentVO s1 = new StudentVO("durga", 101);
		int index = l.indexOf(s1);
		if(index >=0) {
			System.out.println("Student Available");
		}else
			System.out.println("Student not Available");
	}
}
result: Student not Available
---

Q.
class StudentVO{
	String name;
	int rollno;
	StudentVO(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}
}
class Test{
	public static void main(String[] args) {
		ArrayList<StudentVO> l = new ArrayList<>();
		StudentVO s1 = new StudentVO("durga", 101);
		l.add(s1);
		
		StudentVO s2=s1;
		StudentVO s3 = new StudentVO("durga", 101);
		int i1 = l.indexOf(s2);
		int i2 = l.indexOf(s3);
		System.out.println(i1+i2);
	}
}
A) 0
B) -2
C) -1
D) None of these
answer: C
---
==> Unmodifiable collection:
we cannot change like immutable.

Q.
class Test{
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Apple");
		l.add("Banana");
		l.add("Orange");
		l.add("Mango");
		l = Collections.unmodifiableList(l);
		//System.out.println(l);
		l.add("Cat");
	}
}
Exception in thread "main" java.lang.UnsupportedOperationException
at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1062)

--> In java 9 version we can create unmodifiable collection objects very easily.
of() methods

class Test{
	public static void main(String[] args) {
		List<String> l = List.of("Apple", "Banana", "Orange");
		System.out.println(l);
		l.add("Cat");
	}
}
o/p:
[Apple, Banana, Orange]
Exception in thread "main" java.lang.UnsupportedOperationException
	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
	at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
---

Q.
class Test{
	static Map<String,String> map = new HashMap<>();
	static List<String> keys= new ArrayList(List.of("AA","BB","CC","DD"));
	static String[] values= {"Apple", "Banana", "Cat", "Dog"};
	static {
		for(var i=0; i<keys.size();i++)
			map.put(keys.get(i), values[i]);
	}
	public static void main(String[] args) {
		keys.clear();
		values= new String[0];
		System.out.println(map.size()+""+keys.size()+""+values.length);
	}
}
What is the output?
A) 444
B) 400
C) 000
D) Compilation fails.
E) An exception is thrown at runtime

answer: B
----

Q.
class Parent{
	private Collection collection;
	public void m1(Collection collection) {
		this.collection=collection;
	}
}
class Child extends Parent{
	public void m1(Map<String, String> map) {
		//Line-1
	}
}
Which of the following lines can be inserted at Line-1 without causing any compile
time and runtime errors?
A) super.m1(map);
B) m1(map);
C) super.m1(List<Integer> map)
D) super.m1(map.values())
E) m1(map.values())

answer: D,E
---

Q. Consider the following coding snippets:

1.
class Parent{
	public <T> Collection<T> m1(Collection<T> c){ return null;}
}
class Child extends Parent{
	public <T> Collection<T> m1(Stream<T> c){ return null;}
}
--> valid by overloading

2.
class Parent{
	public <T> Collection<T> m1(Collection<T> c){ return null;}
}
class Child extends Parent{
	public <T> Iterable<T> m1(Collection<T> c){ return null;}
}
--> we are trying to override but return types are not co-varient.
 Hence it is invalid.
 
3.
class Parent{
	public <T> Collection<T> m1(Collection<T> c){ return null;}
}
class Child extends Parent{
	public <T> Set<T> m1(Collection<T> c){ return null;}
}
--> we are trying to override and return types are not co-varient.
 Hence it is valid.

4.
class Parent{
	public <T> Collection<T> m1(Collection<T> c){ return null;}
}
class Child extends Parent{
	public <T> Collection<String> m1(Collection<String> c){ return null;}
}
--> name clash b/w Collection<T> and Collection<String>, hence invalid. 

5.
class Parent{
	public List<Number> m1(Set<CharSequence> s){ return null;}
}
class Child extends Parent{
	public ArrayList<Number> m1(Set<Number> s){ return null;}
}
--> name clash b/w Set<Number> and Set<CharSequence>, hence invalid.
---

ArrayList<Integer> l = new ArrayList<Integer>();
List<Integer> l = new ArrayList<Integer>(); 
List<Object> l = new ArrayList<Integer>();

type parameter:
1. we cannot take primitives
2. For the base type, polymorphism concept is appicable. But for parameter type
	polymorphism concept not applicable.
	
 Q.
 	class Parent{
		public List<Number> m1(Set<CharSequence> s){ return null;}
	}
	class Child extends Parent{
		public ArrayList<Number> m1(Set<CharSequence> s){ return null;}
	}	
// by overriding rule it is valid.

 Q.
 	class Parent{
		public List<Number> m1(Set<CharSequence> s){ return null;}
	}
	class Child extends Parent{
		public List<Integer> m1(Set<String> s){ return null;}
	}
--> as overriding name class b/w 	Set<CharSequence> and Set<String>, because at compile time
both will become Set.

 Q.
 	class Parent{
		public List<Number> m1(Set<CharSequence> s){ return null;}
	}
	class Child extends Parent{
		public List<Integer> m1(HashSet<String> s){ return null;}
	}
	
by overloading it is valid.

 Q.
 	class Parent{
		public List<Number> m1(Set<CharSequence> s){ return null;}
	}
	class Child extends Parent{
		public List<Object> m1(Set<CharSequence> s){ return null;}
	}
--> By overriding it is invalid , as List<Number> and List<Object> are not co-variant
====

Q. Consider the following code:
class Test{
	public static void main(String[] args) {
		List<Integer> l = List.of(10,20,30,40);
		l.add(50);
		System.out.println(l);
	}
}
What is the result?
A) [10,20,30,40]
B) [10,20,30,40,50]
C) Compilation fails
D) An exception is thrown at runtime.
answer: D
---

Q.
class Test{
	public static void main(String[] args) {
		List<Integer> l = List.of(20,40,60,80);
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		for(Iterator itr1=l.iterator();itr1.hasNext();)
			System.out.print(itr1.next()+" ");
	}
}
o/p: 20 40 60 80 20 40 60 80
---

Q.
class Test{
	public static void main(String[] args) {
		List<Integer> l = List.of(20,40,60,80);
		{                                      //Block-1
			Iterator itr = l.iterator();
		}
		while(itr.hasNext()) {                 ----> Line-1
			System.out.print(itr.next()+" ");
		}
	}
}
CE: at Line-1 as itr has scope in Block-1 only.
----

Q.
class Test{
	public static void main(String[] args) {
		List<Integer> l = List.of(20,40,60,80);
		{
			Iterator itr = l.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
		}
	}
}
o/p: 20 40 60 80
---

Q. which of the following are valid?
A) ArrayList<String> l = new ArrayList<String>();
B) List<String> l = new ArrayList<String>();
C) ArrayList<String> l = new ArrayList<>();
D) List<Object> l = new ArrayList<String>();
E) ArrayList<StringBuffer> l = new ArrayList<String>();

answer: A,B,C
---

Q.
class Test{
	public static void main(String[] args) {
		ArrayList<int> l = new ArrayList<>();
		l.add(10);
		l.add(20);

		ArrayList<char> l1 = new ArrayList<>();
		l1.add('a');
		l1.add('b');

		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		for(var i= l1.iterator();i.hasNext();)
			System.out.print(itr1.next());
	}
}

A) 1020ab
B) Compilation fails
C) An exception is thrown at runtime
D) NOT

answer: B
--> for the type parameter we cannot use primitives.
===============

Arrays class:
provies several utility methods for arrays.

compare(int[] x,int[] y):
		return 0 if both are equal.
		return -1 if first array element is less than second array element
		return +1 if first array element is greater than second array element
		
Q.
import java.util.Arrays;
class Test{
	public static void main(String[] args) {
		int[] x = {10,20,30,40,50};
		int[] y = {10,20,30,40,50};
		int[] z = {10,20,40,30,50};
		
		int result = Arrays.compare(x, y);
		int result1 = Arrays.compare(x, z);
		System.out.println(result+"..."+result1);
	}
}

answer: 0...-1
====

mismatch(int[] x,int[] y):
		returns the index of the first mismatch.
		It there is no mismatch then returns -1.
		
Q.
class Test{
	public static void main(String[] args) {
		int[] x = {10,20,30,40,50};
		int[] y = {10,20,30,40,50};
		int[] z = {10,20,40,30,50};
		
		int result = Arrays.mismatch(x, y);
		int result1 = Arrays.mismatch(x, z);
		System.out.println(result+"..."+result1);
	}
}
o/p: -1...2		
 */
public class _37_Collection {public static void main(String[] args) {}}