package _99_certification_11;

/*

Local variable type inference(LVTI) in java 10:
--> Based on provided value, automatic identification of the type by
	compiler is called type inference.
--> Until java 9, for local variables we have to declare the type
	explicitly. But from java 10 version onwards, we are not required to
	declare the type explicitly. Based on our provided value, the type
	will be considered automatically. 

eg:
class Test{
	public static void main(String[] args) {
		var s ="Surya";
		System.out.println(s);
		var al = new ArrayList<>();
		System.out.println(al.size());
	}	
}

Advantages of LVTI:
1. we are not required to specify the type multiple times.It reduces
	length of the code and readability will be improved.
2. more convient to the programmer.
===============

where we can use LVTI?
usecase-1: we can use for local variables inside a method:
class Test{
	public static void main(String[] args) {
		var s ="Surya";
		System.out.println(s);
	}	
}
---
usecase-2: we can use for local variables inside static/instance blocks
class Test{
	static {
		var i=10;
		System.out.println(i);
	}
	public static void main(String[] args) {
		System.out.println("main method");
	}	
}
----
usecase-3: as iteration variable inside for-each loop:
class Test{
	public static void main(String[] args) {
		var a = new int[] {10, 20, 30};
		for(var i:a) {
			System.out.print(i+", ");// 10, 20, 30,
		}
	}	
}
--- 
usecase-4: inside loop for index variables:
class Test{
	public static void main(String[] args) {
		var a = new int[] {10, 20, 30};
		for(var i=0;i<a.length;i++) {
			System.out.print(a[i]+", ");
		}
	}	
}
----
usecase-5: to return value inside a method and to store return value of method:
class Test{
	public static int m1() {
		var x=10;
		return x;
	}
	public static void main(String[] args) {
		var y = m1();
		System.out.println(y);
	}	
}
==================

Error cases:
case-1: we can use LVTI only for local variables but not for instance variable
 		and static variables. If we are trying to use for instance and static
 		variables then we will get CE.
---
case-2: we cannot use LVTI for uninitialized local variables.
ie, if local variable is not initialized, then we cannot use var for
that variable.
class Test{
	public static void main(String[] args) {
		var y ;//CE:Cannot use 'var' on variable without initializer
	}	
}
---
case-3: for null value variable we cannot use var.
null is allowed for any object type. hence compiler cannot guess the type
uniquely.
class Test{
	public static void main(String[] args) {
		var y =null;//CE:Cannot infer type for local variable initialized to 'null'
	}	
}
---
case-4: we can't use var for method parameter type, because 
compiler cannot guess the type as values will come at runtime.
class Test{
	public void m1(var i) {//CE:'var' is not allowed here
		
	}
}
---
case-5: for method return types we cannot use var.
class Test{
	public var m1(int i) {//CE:'var' is not allowed here
		
	}
}
---
Q. which of the following are invalid declarations?
A) int[] x={10, 20, 30};
B) var x={10, 20, 30}; *****************
C) var x= new int[]{10,20,30};
D) var x= new int[3]{10,20,30};
E) var x= new int[3];

answer: B,D
===================

Note: var concept applicable only at compile time but not at runtime.
 Hence var is not required to be a keyword in java. Ofcourse it is not
 a keyword.
 
class Test{
	public static void main(String[] args) {
		var var =10;
		System.out.println(var);
	}
}
o/p: 10
---

Q. which of the following declarations are invalid?

A) var var =10;
B) var x = null;
C) var if = 10.5;
D) var x = {"A", "AA", "AAA"};
E) var _ = "Durga";
F) var x;
G) var x;
	x=10;
	
answer: B,C,D,E,F,G
----

Q. which of the following method declarations are valid?
A)public void m1(var x){}
B)public var m1(int x){}
C)	public var m1(int x){
		var x=10;
		return x;
	}
D)  public int m1(int x){
		var x=10;
		return x;
	}
	
answer: D
----

class Test{
	public static void main(String[] args) {
		var x;//CE:Cannot use 'var' on variable without initializer
		x=10;
	}
}
---

Q. consider the code
class Student{
	String name;
	int rollNo;
	Student(String name, int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
}
class Test{
	static var students= new LinkedList<Student>();//Line-1
	public var info() {//Line-2
		var s=new Student("Sunny", 101);//Line-3
		var students= new ArrayList<Student>();//Line-4
		students.add(new Student("Bunny", 102));
		students.add(new Student("Chinny", 103));
		for(var stu: students) {
			System.out.println("Name:"+stu.name+",RollNo:"+stu.rollNo);	
		}
		
	}
	public static void main(String[] args) {
		Test t= new Test();
		t.info();
	}
}

which of the following line causes compile time error?

A)Line-1
B)Line-2
C)Line-3
D)Line-4
E)Line-5

answer: A,B
 */
public class _15_Local_variable_type_inference {
	public static void main(String[] args) {

	}
}
