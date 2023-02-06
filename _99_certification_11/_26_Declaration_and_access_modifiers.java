package _99_certification_11;
import static java.lang.System.out;
/*
Declaration and Access Modifiers:

==> Java Source File Structure
1. A java source file can contain any number of classes.
2. The source file name should be same as class name which contains
 	main method.
3. A Java source file can contain atmost one public class.
4. The name of the source file name should be same as public class name.  	

Q. Consider the following code which is saved with the name
Durga.java

class A{
}
public class B{
}
class C{
}
class D{
}

Which of the following is TRUE?
s1: The code compiles fine because any name we can use for the java source
	file.
s2: The code won't compile because the name of the public class is not
	same as source file name.
	
A) only S1	
B) only S2
C) Niether S1 nor S2
D) Both S1 and S2

answer: B
---

Q. Consider the following code which is saved with the name B.java

class A{
}
public class B{
}
public class C{
}
class D{
}

answer:
---

 Q.
 
 class A{
	public static void main(String[] args) {
		System.out.println("A class main method");
	}
}
class B{
	public static void main(String[] args) {
		System.out.println("B class main method");
	}
}
class C{
	public static void main(String[] args) {
		System.out.println("C class main method");
	}
}
class D{
}

A) The code compiles fine.
B) The code won't compile.
C) Upon compilation 4 *.class files will be generated.

answer: A,C
---

Import statements:

Q. Consider the following code:

class Test{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();//Line-1
	}	
}
To compile this code, which of the following changes are required independently?
A) Replace Line-1 with
 	java.util.ArrayList l = new java.util.ArrayList();
 	
B) Add import statement at beginning of the source file.
	import java.util.*; 

C) Add import statement at beginning of the source file.
	import java.util.ArrayList;
	
D) Any of these

answer: D
-------------

2 types of import:
--> explicit class import
		import java.util.ArrayList;
--> implicit class import
		import java.util.*;
 
 Q. which of the following import statements are meaningful?
 A) import java.util;
 B) import java.util.ArrayList.*;
 C) import java.util.*;
 D) import java.util.ArrayList;
 
 answer: C,D
 ---
 
 Q. Consider the following code:
 class MyArrayList extends java.util.ArrayList{
 }
 and consider the following statements
 s1: The code won't compile because we are not using import
 		statement.
 s2: The code compiles fine even we are not using import statement
 		because we used fully qualified name.
anser: s2

==> whenever we are using fully qualified name we are not required to use import
	statement. Whenever we are using import statement we are not required to use
	fully qualified name.
---

Q.
import java.util.*;
import java.sql.*;
class Test{
	public static void main(String[] args) {
		Date d = new Date();
	}	
}

A) the code compiles fine and java.util.Date will be considered.
B) the code compiles fine and java.sql.Date will be considered.
C) Compilation fails.
D) An exception is thrown at runtime.
 
answer: C
---

==> while resolving class name, compiler will always give precedence in the
	following order:
	1. Explicit class import.
	2. Classes present in current working directory.
	3. Implicit class import.
	
Q.
import java.util.Date;
import java.sql.*;
class Test{
	public static void main(String[] args) {
		Date d = new Date();//Line-1
	}	
}

What is the result?
A) java.util.Date class will be considered at Line-1
B) java.sql.Date class will be considered at Line-1
C) The compilation fails.
D) An exception is thrown at runtime.

 answer: A
---

Q.
import java.util.Date;
import java.sql.*;
class Test{
	public static void main(String[] args) {
		Date d = new Date();//Line-1
	}	
}
Assume our current working directory also contains our own customized
Date class.
What is the result?
A) java.util.Date class will be considered at Line-1
B) java.sql.Date class will be considered at Line-1
C) The compilation fails.
D) An exception is thrown at runtime.

answer: A
---

Q. Pattern class present in java.util.regex package. To use Pattern class in
our program which of the following import statements can be used independently?

A) import java.*;
B) import java.util.*;
C) import java.util.regex.*;
D) import java.util.regex.Pattern;

answer: C,D
---

Q. Consider the following code:
A.java
""""""""
package pack1.pack2;
public class A{
}

B.java
""""""""
package pack3;
//Line-1
public class B{
	A a = new A();

}
To compile B class successfully which import statement is required
at Line-1 independently?
A) import pack1.*;
B) import pack1.pack2;
C) import pack1.pack2.A;
D) import pack1.pack2.*;

answer: C,D
---
==> package that are not required to import are:
1. java.lang
2. default package ie, current working directory(cwd)

Q. consider the following two statements:

 s1: whenever we are using any class from java.lang package, it is not
 		required to write import statement for that class.
 s2: whenever we are using any class from default package (current working
 		directory), it is not required to write import statement for that
 		class.
 which of the above statements is true?
 A) only s1
 B) only s2
 C) Neither s1 nor s2
 D) Both s1 an s2
 
 answer: D
---

Q.
class Test{
	public static void main(String[] args) {
		Date d = new Date();//Line-1
	}	
}
Assume our current working directory also contains our own customized
Date class.
To compile this code successfully which of the following
changes are required?

A) Add import statement for java.lang package
B) Add import statement for Date class.
C) add import statements for both java.lang package and Date class.
D) No changes are required.

answer: D
---

Every class hai a static variable called as class.
class Test{
static Class class;
psvm(){}
}
---

Q. Assume we are writing a program to display all method names present in Test class.
For this requirement we have to use method class present in java.lang.reflect package.
To use Method class which of the following import statements are required independently?

A) import java.lang.*;
B) import java.lang.reflect.*;
C) import java.lang.reflect.Method;
D) No import is required because java.lang package classes are by default 
	available to every program.
	
answer: B,C

class Test{
	public static void m1() {
	}
	public static void m2() {
	}
	public static void main(String[] args) {
		java.lang.reflect.Method[] m = Test.class.getDeclaredMethods();
		for(var m1 :m) {
			System.out.println(m1.getName());
		}
	}	
}
o/p:
main
m2
m1
---

Q. consider the following statements
s1: It more number of import statements then more will be compile time but no effect 
		on execution time(runtime).
s2: if more number of import statements then more will be execution time(runtime) but
		no effect on compile time.

answer: s1
---

Q.
class Test{
	public static void main(String[] args) {
		final int a=10, b=20; //Line-1
		do {
			System.out.println("Hello");
			//Line-2
		}while(a<b);
		System.out.println("Hi");//Line-3
	}	
}

which of the following modifications required independently to compile 
Test class? 

A) Remove final keyword at Line-1
B) use break statement at Line-2
C) remove Line-3
D) None of these

answer: A,B,C
===========================

static imports:
--> Usually we can access static members by using class name. But if we write static import
then it is not required to use class name, we can access static members directly.

import static java.lang.Math.sqrt;
class Test{
	public static void main(String[] args) {
		System.out.println(sqrt(4));
	}	
}
what is the result?
A) compilation fails
B) 2
C) 2.0
D) 4

answer: C
the return type of Math class sqrt() method is double.
---

class System{
	static PrintStream out=....;
}

System.out.println();
--> System is a java class
--> out is a static variable in system class of the type PrintStream println()
	is the method present in PrintStream class.
----

Q.
import static java.lang.Math.out;
class Test{
	public static void main(String[] args) {
		out.print("Hello-");
		out.print("Hii");
	}	
}
What is the result?
A) Compilatin fails
B) Hello-Hi
C) An exception is thrown at runtime.
D) It won't print anything to the console.

answer: B
---

Q.
import static java.lang.Integer.*;
import static java.lang.Byte.*;
class Test{
	public static void main(String[] args){
		System.out.println(MAX_VALUE);
	}
}
what is the result?
A) Integer class MAX_VALUE will be considered.
B) Byte class MAX_VALUE will be considered.
C) Compilation fails.
D) an exception is thrown at runtime.
answer: C, reference to MAX_VALUE is ambiguous
---

Q.
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;
class Test{
	public static void main(String[] args){
		System.out.println(MAX_VALUE);
	}
}
what is the result?
A) Integer class MAX_VALUE will be considered.
B) Byte class MAX_VALUE will be considered.
C) Compilation fails.
D) an exception is thrown at runtime.
answer: A, explicit class imports get preference.
---

Q.
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;
class Test{
	static int MAX_VALUE=999;
	public static void main(String[] args){
		System.out.println(MAX_VALUE);
	}
}
what is the result?
A) Integer class MAX_VALUE will be considered.
B) Byte class MAX_VALUE will be considered.
C) Our Test class MAX_VALUE will be considered.
D) Compilation fails.
E) an exception is thrown at runtime.

answer: C
explanation:
while resolving static members compiler will always gives precedence in the
following order?
1. Current class static members
2. Explicit static imports members
3. Implicit static imports members
---

Q.
A) import java.lang.Math.*;
B) import static java.lang.Math.*;
C) import java.lang.Math;
D) import static java.lang.Math;
E) import static java.lang.Math.sqrt.*;
F) import java.lang.Math.sqrt;
G) import static java.lang.Math.sqrt();
H) import static java.lang.Math.sqrt;

answer: valid==> B,C,H
explanation:

normal import:
import <package>.*;
import <package>.class_name;

static import:
import static package.classname.*;
import static package.classname.static_member;
========

package statement:
--> a group of related things.
--> It is an encapsulation mechanism to group related classes and interfaces
	into a single unit.
--> In any java source file, we can take atmost one package statement.
 ie, we cannot take more than one package statement.
--> In java source file the first non-comment statement should be package
	statement if it is available.
	
Q.
package pack1;
package pack2;
class Test{
	public static void main(String[] args) {
		System.out.println("Package Demo");
	}	
}

javac -d . Test.java
which of the following is true?
A) The code compiles fine and generated *.class file will be placed
	inside both pack1 and pack2.
B) The code won't compile because more than one package statement is
 	not allowed.
C) The code won't compile because compiler unable to decide where to
	place generated *.class, filer either in pack1 or pack2.
D) An exception is thrwon at runtime.

answer: B
---

Q.
import java.util.*;
package pack1;
class Test{
	public static void main(String[] args) {
		System.out.println("Package Demo");
	}	
}

answer: CE, pacakge statement should be in first line.
---

==> The following is the correct order of statements in java source 
	file:
	1. package statement (Atmost once)
	2. import statement (any number)
	3. class or interface or enum declarations. (any number)
	
Q. In java source file which of the following is correct order of statements?

A) package, import, class
B) package, import, interface
C) import, package, interface
D) import, package, class
E) package, import, enum
F) class, package, import

answer: A,B,E
---

Q. In java source file which of the following is correct order of statements?
A) class,interface,enum
B) interface,class,enum
C) enum,class,interface
D) class,enum,interface

answer: A,B,C,D
---

Q. Consider the following java source files?
A)
Test1.java
-----------
package pack1;

B)
Test2.java
-----------
import java.util.*;

C)
Test3.java
-----------
package pack1;
import java.util.*;

D)
Test4.java
-----------
public class test4{

}

Which of the java source files can be compiled successfully?
A) Test1.java
B) Test2.java
C) Test3.java
D) Test4.java

answer: A,B,C,D
Note: An empty file is a valid java program.
 */
public class _26_Declaration_and_access_modifiers {
	public static void main(String[] args) {

	}
}