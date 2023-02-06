package _99_certification_11;
/*
Command-line arguments:
--> we can customize behaviour of main method.

Q.
class Test{
	public static void main(String[] args) {
		for(int i=0;i<=args.length;i++) {
			System.out.print(args[i]);
		}
	}
}
==> java Test A B C

what is the result?
A) TestABC
B) ABC
C) Compilation fails
D) An Exception is thrown at runtime.
---

Q.
class Test{
	public static void main(String[] args) {
		String[] argh = {"A", "B", "C"};
		args=argh;
		for(String s : args) {
			System.out.print(s);
		}
	}
}

case1: java Test
case2: java Test X Y
case3: java Test X Y Z

answer: in all cases we will get o/p: ABC
---

Q.
class Test{
	public static void main(String[] args) {
		System.out.println(args[0]);
	}
}
==> java Test Sunny Leone

o/p: Sunny
---

Q.
class Test{
	public static void main(String[] args) {
		System.out.println(args[0]+args[1]);
	}
}
==> java Test 10 20
A) 30
B) 1020
C) Compilation fails
D) An exception is thrown at runtime

o/p: B, 1020
---

Q.
class Test{
	public static void main(String[] args) {
		int x= Integer.valueOf(args[0]);
		int y= Integer.valueOf(args[1]);
		System.out.print(args[0]+args[1]);
		System.out.print(x+y);
	}
}
==> java Test 10 20

A) 102030
B) 10201020
C) 3030
D) An exception is thrown at runtime.
---

Q.
class Test{
	public static void main(String[] args) {
		System.out.print("Good Morning: "+args[0]);
	}
}
To print Good Morning: Sunny
which set of commands we required to use?

A)
javac Test.java
java Test Sunny

B) 
javac Test.java Sunny
java Test

C)
java Test.java Sunny
javac Test

D)
javac Test.java
java Test Sunny

answer: D
---

Q.
class Test{
	public static void main(String[] args) {
		System.out.print(args[3]+":"+args[2]+":"+args[0]);
	}
}
==> java Test Learning Java Is Very Easy
whats is the o/p?

answer: Very:Is:Learning
----

Q.
class Test{
	public static void main(String[] args) {
		System.out.print(args[2]+":"+args[0]+":"+args[1]);
	}
}

==> java Test Easy Java

what is the result?
A) Java:Easy
B) ArrayIndexOutOfBoundException is thrown at runtime.

answer: B
----

Q.
class Test{
	public static void main(String[] args) {
		System.out.print(args[2]+args[0]+args[1]);
	}
}

==> java Test Test "Test Test" Test

whats is the result?

o/p: TestTestTest Test
----

Q. Assume that Test.java present in D:\durgaclasses

class Test{

}
and command execution
javac D:\durgaclasses\Test.java

A) The code won't compile because we are not writing main method.
B) The code wont't compile because we are not importing java.lang package.
C) The code won't compile because we are not writing package statement.
D) The code won't compile because while compiling we should not use full
	path like D:\durgaclasses\Test.java
E) None of these.

answer: E
explanation: the code compiles fine. Import and package statement are option.
	Compiler won't check whether class contains main method or not.
	
to run such class, java -cp D:\durgaclasses Test	
---

Q. Assume that Test.java present in D:\durgaclasses

class Test{

}
and command execution
javac D:\durgaclasses\Test.java
java D:\durgaclasses\Test

s1: the code compiles fine and runs fine
s2: the code compies fine but won't run because 'D:\durgaclasses\Test'
 	class file is not available.
 	
answer: only s2.
explanation: "D:\durgaclasses\Test" this total thing is considered as 
				class name.
			java -cp D:\durgaclasses Test , this will work.
 */
public class _14_Command_line_arguments {

}