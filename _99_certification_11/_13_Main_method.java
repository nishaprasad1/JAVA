package _99_certification_11;
/*
Main Method:

Q.
class Test{

}

s1: the code won't compile because main method is missing.
s2: the code compiles fine, because main method is optional.

answer: s2 is valid
---

public static void main(String[] args){}

possible variations:
1. static public void main(String[] args){}
2. static public void main(String []args){}
   static public void main(String args[]){}
3. args ---> we can use any valid identifier as name.
4. static public void main(String... args){}----> using var-args method
5. final synchronized strictfp static public void main(String[] args){}

class Test{
	final synchronized strictfp public static void main(String ... ck) {
		System.out.println("Valid main method");
	}
}
----

Q. which of the following main method declarations are valid?
A) public static void main(String args){}
B) public synchronized strictfp final void main(String[] args){}
C) public static void Main(String... args){}
D) public static int main(String[] args){}
E) public static synchronized final strictfp void main(String... args){}
F) public static void main(String... args){}
G) public void main(String[] args){}

answer: E,F
---

Q. Inside a class, which of the following main method declarations will
cause compile time error?
A) public static void main(String args){}
B) public synchronized strictfp final void main(String[] args){}
C) public static void Main(String... args){}
D) public static int main(String[] args){}
E) public static synchronized final strictfp void main(String... args){}
F) public static void main(String... args){}
G) public void main(String[] args){}
H) None of these

answer: H
---

Q. Consider the code
class Test{
	public static void main(String[] args) {
		System.out.println("String[]");
	}
	public static void main(Object[] args) {
		System.out.println("Object[]");
	}
}
what is the result?
A) Compilation fails
B) An exception is thrown a runtime
C) String[]
D) Object[]

answer: String[]
---

Q.
class Test{
	public static void main(String[] args) {
		System.out.println("String[]");
		main(new int[] {10,20,30});
	}
	public static void main(int[] args) {
		System.out.println("int[]");
	}
}

answer:
String[]
int[]
---

Q.
class Test{
	public static void main(String[] args) {
		System.out.print("JAVA ");
		main("OCJA");
	}
	public static void main(String args) {
		System.out.println("OCJP");
	}
}
answer: JAVA OCJP
-------

Q.
File name: Test.java

class Parent{
	public static void main(String[] args) {
		System.out.println("Parent Main method");
	}
}
class Child extends Parent{
	
}
==> javac Test.java
==> java Child

o/p: Parent Main method

explanation: Inheritence concept applicable for main method. Hence while executing
child class, if child class does not contains main method then parent class main
method will be executed.
----

Q. which of the following are TRUE?
A) overloading concept is applicable for main method.
B) Inheritance concept applcable for main method.
C) Main method is mandatory for every java class.
D) If class does not contain main method then we will get 
compile time error.

Answer: A,B
----

Q.
class Test{
	static {
		System.out.println("static block");
	}
}

If we run this code by using the command:
java Test

and consider the following statements
s1: static block will be executed and then we will get error because
	main method is not defined.
s2:	static block won't be executed, because to start program execution
	main method is mandatory.
	
answer: s2
explnation: In old version until 1.6 version s1 is correct.
----

Q.
class Test{
	static {
		System.out.print("static block-");
	}
	public static void main(String[] args) {
		System.out.println("main method-");
	}
}

o/p: static block-main method-


 */
public class _13_Main_method {
	public static void main(String[] args) {

	}
}