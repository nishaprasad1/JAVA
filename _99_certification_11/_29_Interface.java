package _99_certification_11;

/*
Interfaces:
-->Any Service Requirement Specification(SRS).
-->Any contract between client and service provider acts as interface.

extends vs implements:
--> A class can extend only one class at a time.
--> A class can implement any number of interfaces at a time.
--> An interface can extend any number of interfaces.
--> A class can extend another class and can implement any number of
	interfaces simultaneously.
	
Q. Which of the following are TRUE?
A) A class can extend any number of classes at a time.
B) An interface can extend only one interface at a time.
C) A class can implement only one interface at a time.
D) A class can extend another class or can implement an interface
	but not both simultaneously.
E) An interface can implement any number of interfaces at a time.
F) None of these.

answer: F
----

Q. The concrete class which implementing C interface should provide
	implementation?
interface A{
	public void m1();
}
interface B{
	public void m2();
}
interface C extends A,B{
	public void m3();
}

A) Only for m3()
B) Only for m2() and m3()
C) for all 3 methods m1(),m2() and m3()
D) Not required to implement any method.

answer: C
---

Q. Consider the following syntax:
		X extends Y
For which of the following possibilities of X and Y, the above syntax is valid?

A) Both X and Y should be classes.
B) Both X and Y should be interfaces.
C) Both X and Y should be either classes or interfaces.
D) No restrictions we can take class or interface anywhere.

answer: C
---

Q. Consider the following syntax:
		X extends Y,Z
For which of the following possibilities of X ,Y and Z the above syntax is valid?

A) All X,Y and Z should be interfaces.

answer: A
---

Q. Consider the following syntax:
		X extends Y implements Z
For which of the following possibilities of X ,Y and Z the above syntax is valid?

A) X, Y should be class and Z should be interface

answer: A
---

Q. Consider the following syntax:
		X implements Y extends Z
For which of the following possibilities of X ,Y and Z the above syntax is valid?

A) It is always invalid and raises compile time error.

answer: A
---

Q. Inside interface which of the following method declarations are allowed?
A) public void m1();
B) private void m1();
C) public void m1(){}
D) public static void m1();
E) public abstract void m1();

answer: A,E
========================

Interface variables:
--> Every variable present inside interface by default is 
	public static final
	
interface Interf{
	x =10;
}
			not valid:
public ==> private, protected
static ==> transient
final  ==> volatile

 If the value of a variable keep on changing then for every thread if we want 
 separate copy then we should declare that variable with volatile.
 
Q. Which of the following variable declarations are allowed inside interface?
A) int x =10;
B) public int x =10;
C) private int x =10;
D) protected int x=10;

answer: A,B
---

Q.
interface Interf{
	int x;
}
Which of the following is true?
A) For x, JVM will provide default value.
B) For x, JVM won't provide default value, but we can perform
 	initialization inside static block.
C) For x, JVM won't provide default value, but we can perform
 	initialization inside implementation class.
D) For x, JVM won't provide default value compulsory we should perform
 	initialization at the time of declaration only.
 	
answer: D
---

Q.
interface Interf{
	int x=10;
}
class Test implements Interf{
	public static void main(String[] args) {
		x =888;//CE:The final field Interf.x cannot be assigned
		System.out.println(x);
	}
}

answer: CE
explanation: Interface variables can be accessed from implementation class, but
			we cannot perform reassignment.
---

Q.
interface Interf{
	int x=10;
}
class Test implements Interf{
	public static void main(String[] args) {
		int x =888;
		System.out.println(x);
	}
}

A) we will get compile time error because we are performing reassignment for x.
B) we will get compile time error because x is already available and we cannot 
	declare again
C) 888

answer: C
====================================

Interface method naming conflicts:
--> If two interfaces contain a method with same signature and same return 
	type, then in implementation class we have to provide implementation
	for only one method.
--> If two interfaces contain a method with same name but different argument
	types, then in the implementation class, we have to provide implementation
	for both methods and these methods acts as overloaded methods.
---

Q.
interface Right{
	public void m1();
}
interface Left{
	public void m1();
}
class Test implements Left, Right{
	public void m1() {
	}
}
s1: It is invalid because we provided implementation for only one
	method but not two.
s2: It is invalid because same method in Test class acts as implementation 
	for both interfaces.
	
answer: s2
---

Q.
interface Right{
	public void m1();
}
interface Left{
	public void m1(int i);
}
class Test implements Left, Right{
	public void m1() { }
	public void m1(int i) {	}
}
---

Q.
interface Right{
	public void m1();
}
interface Left{
	public void m1(int i);
}
class Test implements Left, Right{
	public void m1() { }
	public void m1(int i) {	}
}

answer: it is valid
explanation: If two interfaces contain a method with same name but different argument
			types, then in the implementation class, we have to provide implementation
			for both methods and these methods acts as overloaded methods.
---

Q.
interface Right{
	public void m1();
}
interface Left{
	public int m1();
}
class Test implements Left, Right{
	// code goes here
}
To compile this code successfully, in the implementation class,
 which methods we have to implement?
A) public void m1();
B) public int m1();
C) Both	public void m1(); & public int m1();
D) It is impossible to implement both interface simultaneously and it is
 	always compile time error.

answer: D
============================

Covarient return types: 1.5 Version

Q.
interface Right{
	public Object m1();
}
interface Left{
	public String m1();
}
class Test implements Left, Right{
	public String m1() {
		return "";
	}
}
result: it is valid, covarient return types are accepted but in implementation class
 			we need to take child return type among the covarient types.
---

Q.
Q.
interface Right{
	public Object m1();
}
interface Left{
	public String m1();
}
class Test implements Left, Right{
	public Object m1() {
		return "";
	}
} 	

result: invalid

Covarient return types: 1.5 version
The child method return type must be either same or
child type of parent method return type.
---

Q.
import java.io.IOException;
interface Left{
	public void m1() throws IOException;
}
interface Right{
	public void m1() throws Exception;
}
class Test implements Left, Right{
	//Line-1
}
which of the following method declarations are allowed at Line-1
A) public void m1(){}
B) public void m1() throws IOException {}
C) public void m1() throws Exception {}
D) public void m1() throws ArithmeticException {}
E) public void m1() throws InterruptedException {}
answer: A,B,D
explanation: in overriding, if child class method throws any checked exception,
compulsory parent class method should throw the same checked exception
or its parent. There are no restrictions for unchecked exceptions.
================================

interface variable naming conflicts:

Q.
interface Left{
	String s="Left";
}
interface Right{
	String s="Right";
}
class Test implements Left, Right{
	public static void main(String[] args) {
		System.out.println(s);
	}
}
What is the result?
A) Left
B) Right
C) Compilation Fails
D) An exception is thrown at runtime

answer: C, as reference to 's' is ambiguous
If two interfaces contains a variable with the same name, then in the implementation
class we cannot access directly otherwise we will get compile time error because
of ambiguity problem. We should access by using interface name.
---

Q.
interface Left{
	String s="Left";
}
interface Right{
	String s="Right";
}
class Test implements Left, Right{
	public static void main(String[] args) {
		System.out.println(Left.s);
		System.out.println(Right.s);
	}
}
o/p: 
Left
Right
---

Q.
interface Left{
	int x =888; 
}
interface Right{
	int x =999;
}
class Test implements Left, Right{
	public static void main(String[] args) {
		System.out.println(x);//Line-1
		System.out.println(Left.x);//Line-2
		System.out.println(Right.x);//Line-3
	}
}
which line causes compile time error?
A) Line-1
B) Line-2
C) Line-3
D) None of the above

answer: A
=============================

Default methods In interfaces (Java 1.8 version feature):
Until 1.7 V:   methods ==> public and abstract
			   variable==> public,static and final
			   
Form 1.8 version onwards we can declare default concrete methods also
inside interface. Defender methods

Q.
interface Interf{
	default void m1() {
		System.out.println("Default method");
	}
}
class Test implements Interf{
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
o/p: Default method
----

default methods ==> defender method ==> Virtual extension methods
----

Q.
interface Interf{
	default void m1() {
		System.out.println("Default method");
	}
}
class Test implements Interf{
	public void m1() {
		System.out.println("Test implementation");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
o/p: Test implementation
---

Q.
interface Interf{
	default void m1() {
		System.out.println("Default method");
	}
}
class Test implements Interf{
	default void m1() {//Line-1
		System.out.println("Test implementation");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
result: CE, at Line-1 as we cannot reduce the modifier scope of interface method,
 		only allowed is public.
---

Q.
interface Interf{
	default String toString() {//Line-1
		return "Interf Default String";
	}
	default int hashCode() {//Line-2
		return 100;
	}
}
result: CE at Line-1, Line-2
explanation: We cannot override Object class methods as default methods inside interface,
otherwise we will get compile time error.

Q. which of the following are valid about Default methods inside
interface?
A) This concept introduced in Java 8 version.
B) The main objective of default methods is without effecting implementation
	classes, we can add new methods to the interface.
C) we cannot override Object class methods as default methods inside interface
D) All of these.

answer: D
==================================

Default method vs multiple inheritance:

Q.
interface Left{
	default void m1() {
		System.out.println("Left Default Method");
	}
}
interface Right{
	default void m1() {
		System.out.println("Left Default Method");
	}
}
class Test implements Left,Right{
	//Duplicate default methods named m1 with the parameters () and ()
   //are inherited from the types Right and Left
}
result: CE

--> Two interfaces contain default method with same signature, then there may be
chance of ambiguity problem to the implementation class. To overcome this problem,
compulsory we should override default method in the implementation class, otherwise
we will get compile time error.

Q.
interface Left{
	default void m1() {
		System.out.println("Left Default Method");
	}
}
interface Right{
	default void m1() {
		System.out.println("Left Default Method");
	}
}
class Test implements Left,Right{
	public void m1() {
		System.out.println("Test class implementation");
	}
	public static void main(String[] args){
		Test t = new Test();
		t.m1();
	}
}
result: Test class implementation 
---

--> In implementation class, we can provide complete new implementation or
we can call parent interface default method as follows:
		<interfaceName>.super.<methodCall>

Q.
interface Left{
	default void m1() {
		System.out.println("Left Default Method");
	}
}
interface Right{
	default void m1() {
		System.out.println("Right Default Method");
	}
}
class Test implements Left,Right{
	public void m1() {
		Left.super.m1();
		Right.super.m1();
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
o/p:
Left Default Method
Right Default Method
---

Q. Which of the following are valid? 
A) we can declare instance variables inside abstract class but not in interface.
B) We can declare constructor inside abstract class but not in interface.
C) we can declare instance and static block inside abstract class but not
	in interface.
D) we can override Object class method inside abstract class but not in 
 	interface as default methods.
E) All of these. 	

answer: E
---

Q. which of the following coding snippets are valid?
coding snippet-1:
interface Interf{
	default void m1(){}
}
--
coding snippet-2:
interface Interf{
	default void m1();
}
--
coding snippet-3:
abstract class Test{
	default void m1(){}
}
--
coding snippet-4:
class Test{
	default void m1(){}
}

answer: coding snippet-1 is valid
---

Q. which of the following coding snippets are valid?
coding snippet-1:
interface Interf{
	static{
	
	}
}
--
coding snippet-2:
abstract class Test{
	static{
	
	}
}
--
coding snippet-3:
class Test{
	static{
	
	}
}
answer: coding-snippet-2 and coding-snippet-3
---

Q. which of the following coding snippets are valid?
coding snippet-1:
interface Interf{
	public Interf(){
	
	}
}
--
coding snippet-2:
abstract class Test{
	public Test(){
	
	}
}
--
coding snippet-3:
class Test{
	public Test(){
	
	}
}
answer: coding-snippet-2 and coding-snippet-3
======================

static methods inside interface:

Q.
interface Interf{
	public static void sum(int a, int b) {
		System.out.println("The sum:"+(a+b));
	}
}
class Test implements Interf{
	public static void main(String[] args) {
		//Line-1
	}
}
Which of the following is valid way to call sum() method of interface
at Line-1?
A) sum(10,20);
B) Test.sum(10,20);
C) 
Test t = new Test();
t.sum(10,20);
D) Interf.sum(10, 20);

answer: D
explanation: Interface static methods are by default not available to the implementation
classes. We should call interface static methods by using interface name only.

--> interface static methods are available for all classes and need not be for 
	implementation classes because these are general utility methods.
---

Q.
interface Interf{
	public static void sum(int a, int b) {
		System.out.println("The sum:"+(a+b));
	}
}
class Test{
	public static void main(String[] args) {
		Interf.sum(10, 20);
	}
}
s1: we will get compile tim error because Test does not implement interface Interf.
s2: We won't get compile time error because interface static methods available for all
 	classes and need not be for implementation classes.
 	
answer: s2 is valid
---

Q.
interface Interf{
	public static void m1() {
		System.out.println("Interface static method");
	}
}
class Test{
	public static void main(String[] args) {
		System.out.println("Test class static method");
	}
}
It is valid but it is not overriding and method hiding.
---

Q.
interface Test{
	public static void main(String[] args) {
		System.out.println("interface main method");
	}
}
o/p: interface main method
--> from 1.8 Version onwards, inside interface we can declare static methods
including main method. Hence we can run interface directly from command prompt.

As part of interfaces(1.8V):
	1. default methods===> To add new methods to interface without effecting implementation
		classes.
	2. static methods===> to define general utility methods.
	
1.9V ===> private instance method and private static methods.

Q.
interface Interf{
	default void m1() {
		m();
		System.out.println("m1 specific functionality");
	}
	default void m2() {
		m();
		System.out.println("m2 specific functionality");
	}
	private void m() {
		System.out.println("common functionality of default methods");
	}
}
class Test implements Interf{
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
	}
}
o/p:
common functionality of default methods
m1 specific functionality
common functionality of default methods
m2 specific functionality
---

Q.
interface Interf{
	static void m1() {
		m();
		System.out.println("m1 specific functionality");
	}
	static void m2() {
		m();
		System.out.println("m2 specific functionality");
	}
	private static void m() {
		System.out.println("common functionality of static methods");
	}
}
class Test{// please note that static methods not require implementation, use directly
	public static void main(String[] args) {
		Interf.m1();
		Interf.m2();
	}
}
o/p:
common functionality of static methods
m1 specific functionality
common functionality of static methods
m2 specific functionality
---

private static methods and private methods:
1. code reusability
2. we can expose only intended methods to the implementation classes.
----

until 1.7V
interface Interf{
	public static final variables;
	public abstract methods;
}

In 1.8V
interface Interf{
	public static final variables;
	public abstract methods;
	default methods with implementation
	public static methods with implementation
}

In 1.9V
interface Interf{
	public static final variables;
	public abstract methods;
	default methods with implementation
	public static methods with implementation
	private instance methods with implementation
	private static methods with implementation
}
----

Q.
abstract class Course{
	public double fees;
	//Line-1
}
At Line-1, which of the following methods can be inserted?

A) public void printMaterial();
B) public double getCourseFee(){
		return fees;
   }
C) public abstract void teachCourse();
D) public Course getCourse(){
   		return new Course();
   }
   
answer: B,C
explanation: for A, if we are not providing implementation for any method, compulsory
it should be declared as abstract.
for D, cannot create object of abstract class Course.
---

Q.
class Course{
	public double fees;
	//Line-1
}
At Line-1, which of the following methods can be inserted?

A) public void printMaterial();
B) public double getCourseFee(){
		return fees;
   }
C) public abstract void teachCourse();
D) public Course getCourse(){
   		return new Course();
   }

answer: B,D
---

Q.
interface Course{
	public double fees=0.0;
	//Line-1
}
At Line-1, which of the following methods can be inserted?

A) public void printMaterial();
B) public double getCourseFee(){
		return fees;
   }
C) public abstract void teachCourse();
D) public Course getCourse(){
   		return new Course();
   }

answer: A,C
---

Q.
class Sample{
	public static void main(String[] args){
		String[] fruits={"Apple", "Banana", "Orange"};
		String fruit=getSweetestFruit(fruits);
		//code goes here
	}
}
which of the following getSweetestFruit() method declaration are valid
syntactically?
A) public static String getSweetestFruit(String[] fruits)
B) final static String getSweetestFruit(String[] fruits)
C) private String getSweetestFruit(String[] fruits)
D) final String getSweetestFruit(String[] fruits)

answer: A,B
non-static methods cannot be refferenced from static context.
---

Q. which of the following are valid class declarations?
A)
public abstract class Gift{
	public void purchase(Gift g);
	public void pack(Gift g);
}
B)
public abstract class Gift{
	public abstract void purchase(Gift g);
	public abstract void pack(Gift g);
}
C)
public abstract class Gift{
	public abstract void purchase(Gift g){}
	public abstract void pack(Gift g){}
}
D)
public abstract class Gift{
	public final void purchase(Gift g){}
	public abstract void pack(Gift g);
}

answer: B,D
---

Q. which of the following are valid interface declarations?
A)
public abstract interface Gift{
	public void purchase(Gift g);
	public void pack(Gift g);
}
B)
public abstract interface Gift{
	public abstract void purchase(Gift g);
	public abstract void pack(Gift g);
}
C)
public abstract interface Gift{
	public abstract void purchase(Gift g){}
	public abstract void pack(Gift g){}
}
D)
public abstract interface Gift{
	public final void purchase(Gift g){}
	public abstract void pack(Gift g);
}

answer: A,B
---

Q. which of the following are valid class declarations?
A)
public abstract class Gift{
	public void purchase(Gift g);
	public void pack(Gift g);
}
B)
public class Gift{
	public abstract void purchase(Gift g);
	public abstract void pack(Gift g);
}
C)
public abstract class Gift{
	public void purchase(Gift g){}
	public void pack(Gift g){}
}
D)
public class Gift{
	public final void purchase(Gift g){}
	public abstract void pack(Gift g);
}

answer: C
---

Q. Consider the interface:
public interface Interf{
	void m1();
}

Which of the following classes implement Interf syntactically?
A)
public abstract class Test implements Interf{
	public int m1(){ return 10; }
}

B)
public abstract class Test implements Interf{
	public int m1(int i){ return 10; }
}

C)
public abstract class Test implements Interf{
	public void m1(){ }
}

D)
public class Test implements Interf{
	public void m1(){ }
}

answer: B,C,D
---

Q. Consider the interface:
public interface Interf{
	void m1();
}

Which of the following classes implements Interf syntactically?
A)
public class Test{
	public void m1(){ }
}

B)
public class Test implements Interf{
	private void m1(){ }
}

C)
public abstract class Test implements Interf{
	public abstract void m1();
}

D)
public abstract class Test implements Interf{
	abstract void m1();
}

answer: C
---

Q. Which of the following are valid?
A) protected modifier is allowed for interfaces.
B) public modifier is allowed for interfaces.
C) private modifier is allowed for interfaces.
D) abstract modifier is allowed for interfaces.
E) final modifier is allowed for interfaces.

answer: B,D
---

Q. Which of the following are valid?
A) private modifier is allowed for abstract methods.
B) public modifier is allowed for abstract methods.
C) protected modifier is allowed for abstract methods.
D) final modifier is allowed for abstract methods.
E) static modifier is allowed for abstract methods.

answer: B,C
---

Q. Which of the following are valid?
A) Instance variable can be declared with static modifier.
B) Static variable can be declared as instance variable.
C) Local variable can be declared with static modifier.
D) Local variable can be declared with final modifier.
E) Local variable can be declared with public modifier.
answer:D
explanation: the only applicable modifier for local variables is final.
---

Q. Which of the following are valid?
A) Top level class can be declared with public modifier.
B) Inner class can be declared with public modifier.
C) Top level class can be declared with private modifier.
D) Inner class can be declared with private modifier.				
answer: A,B,D
---

Q. Which of the following are invalid?
A) Instance variables are allowed inside interface. 
B) Instance variables are allowed inside Abstract classes.
C) Abstract methods are allowed inside interface. 
D) Abstract methods are allowed inside Abstract classes.
E) Default methods are allowed inside interface. 
F) Default methods are allowed inside Abstract classes.
G) private static methods are allowed inside interface.
H) private static methods are allowed inside Abstract class.
I) private non-static methods are allowed inside interface. 
J) private non-static methods are allowed inside Abstract classes.

answer: A,F
 */
public class _29_Interface {
	public static void main(String[] args) {}
}