package _99_certification_11;
/*
1. simple
		
2. platform independent
		-->write once run anywhere (WORA)
3. Architecture neutral
		--> if we upgrade OS or any hardware then also the same code will without out 
			any change.
4. portable
		--> we can transfer code from one OS/ system to  other and it will run same on
			all.
5. secure
		--> we can download *.class file easily because its JVM(byte code verifier) which
		 	will verify	if authenticty.
6. object-oriented
7. multithreaded
		-->it is programming enhancement for parallel process of independent task.
8. robust
		--> the chance of failing java is very less.
		--> java is typed language hence any issue with data type is detected on
				compile time only.
		-->Garbge Collector, hence space issue is handled.
		--> Exception Handling, try catch finally
9. distributed
		-->
10. complied and interpreted
		--> java code is compiled first then interpreted so that most of the issues
				are resolved at compile time.
		--> compiler: syntax related issues
		--> interpreter: Interpret and execute.(read each line, translate it and then execute)
11. High performance
		--> HOTSPOT JVM (1.2V)
		--> form 1.3V bydefault
		--> JVM with JIT compiler is called HOTSPOT JVM
		--> inside JVM, profiler is responsible to check method count and hence to check
				hotspot.
				
12. Dynamic
		--> only when requied then only class will be loaded. similary even if we write
			import statement the class will not be loaded, the specific class will be loaded
			only if we actually use it.
			
--------------------
conclusion about bytecode:
1. it is with .class extension
2. it is platform independent
3. it won't run on all platforms automatically. To run bytecode on
	any platform, compulsory JRE(JVM) for that platform should be
	available.
4. serialization of the bytecode is possible.

-----------------------
java technology:
java libraries which can be used to develop applications.

------------------------
JDK vs JRE vs JVM

JDK(java development kit)
developer:
==> write code --> compile that code --> run that code

JRE(java runtime environment)
deliver developed application to the client
==> just run the application

JVM(java virtual machine)
to run the byte code

------------------------
IDE (integrated development environment)
=============================================================

Q1. consider the following statements:

S1: Java automatically converts code from sequential execution into
	parallel execution.
S2: Java provides libraries, by using those we have to write code for
	parallel execution.
	
which of the above statements are TRUE?

A) only S1.
B) only S2.                 (correct)
C) Both S1 and S2
D) None of S1 and S2.
----

Q2. consider the following statements:

 S1: Java has high performance because of java (HOTSPOT JVM) always monitors
 	 and optimizes the code which is frequently executed.
 S2: Java has high performance because of Garbage Collector.
 
  which of the above statements are TRUE?

A) only S1.                 (correct)
B) only S2.                 
C) Both S1 and S2
D) None of S1 and S2.

Explanation: Hotspot JVM concept introduced in Java 1.2 version and made it
by default available from java 1.3 version onwards. Inside JVM, JIT compiler
always identifies the code which is frequently executed. This code is called
HOTSPOT. Instead of translating this code every time into machine code, it will
translate only once and use that native code every time.
Hence,

Java has high performance because of java (HOTSPOT JVM) always monitors
 	 and optimizes the code which is frequently executed.
 	 
Garbage collector is responsible to destroy useless objects automatically
which prevents Memory problems and no way related to performance.
----

Q3. which of the following helps java to achieve high performance?

A) Garbage Collector
B) JIT compiler                          (correct)
C) Java compiler
D) Automatic Parallel processing by JVM

explanation:

Garbage collector is responsible just to destroy useless objects. it is no way related
to performance improvements.

Inside JVM, JIT compiler always identifies the code which is fequently executed. this code 
is called as HOTSPOT. Instead of translating this code every time into machine code, it
will translate only once and use that native code every time. It will optimize that 
code also for performance improvements. Hence JIT compiler is the reason for Java's 
High Performance.

Java compiler just translates *.java files to  *.class file and no way related to runtime
performance.

Parallel processing won't be done automatically by JVM. We have to write the code 
explicitly.
---

Q4. which of the following is not java feature?

A) High performance
B) Dynamic
C) Platform Independent
D) Centralized.             (correct)

explanation: Java is distributed but not centralized. Java provides inbuilt support
for distributed programming with RMI,EJB etc.

The following are various features(Buzzwords) of java
1. Simple
2. Platform Independent
3. Architecture neutral
4. Portable
5. Secure
6. Object-oriented
7. Multithreaded
8. Robust
9. Distributed
10. Compiled and interpreted
11. High Performance
12. Dynamic

---

Q5. which of the following are features of java?

A) Object-oriented
B) Multithreaded
C) Portable
D) Distributed
E) Platform Dependent
F) Procedural and Function oriented
G) Compiled into machine executable code.

  answer: A,B,C,D
 explanation:
 Java is platform independent but not dependent
 java is object oriented pragramming language but not procedural oriented.
 Java source code can be compied int byte code but not machine executable code.
 ---
 
 Q6. Consider the following statements:
 
 S1: Java is dynamic because the classes will be loaded on demand whenever required.
 
 S2: Java is static because all required classes will be loaded at the begining and the
 		execution will be started.

  which of the above statements are TRUE?

A) only S1.                 (correct)
B) only S2.                 
C) Both S1 and S2
D) None of S1 and S2.

explanation: In java, class files won't be loaded at the beginning. Whenever a particular
class is required then only it will be loaded on demand. This on demand loading makes 
java dynamic Programming language.
---

Q7. which of the following is TRUE?

A) java is platform independent, Portable, Object-oriented,
 	Multithreaded and Distributed Programming Language.            (correct)
B) Java is Platform dependent, Portable, Object-oriented,
 	Multithreaded and Distributed Programming Language.
C) Java is Platform dependent, Portable, Procedure-oriented, 	
 	Multithreaded and Distributed Programming Language.
D)	Java is Platform dependent, Portable, Object-oriented,
 	Multithreaded and Centralized Programming Language.
---

Q8. consider the following statements:
S1: To run bytecode compulsory Java compiler must be required.
S2: To run bytecode compulsory JRE(JVM) must be required.

  which of the above statements are TRUE?

A) only S1.                 
B) only S2.                 (correct)
C) Both S1 and S2
D) None of S1 and S2.

explanation: Bytecode won't run on all platforms bydefault. To run bytecode on
 	any platform, compulsory JRE(JVM) must be required for that platform. The 
 	platform not require to have java compiler, but JRE must be required.
---

Q9. Choose valid statements regarding byte code?
A) It is with *.java extension.
B) It is with *.class extension.         (correct)
C) it will run on any platform automatically.
D) None of these.
---

Q10. which of the following are true?
A) Java is platform dependent but JVM is platform independent.
B) Java is platform independent but JVM is platform dependent.
C) Java byte code is platform dependent but JVM is 
		platform independent.
D) Java bytecode is platform independent but JVM is platform
		dependent.
		
answer: B,D
explanation: Java follows write once and run anywhere policy (WORA), ie once we
write a java program, we can run on any platform without making any changes.

First java source file will be compiled in bytecode. Bytecode is an intermediate
and machine independent code. JVM will interpret byte code into the corresponding
machine dependent code and executes that machine code.

Hence Java is platform independent
Bytecode is platform independent
But JVM is platform dependent
---

Q11. which of the following must be required to set up java development environment
on our computer?

A. Java compiler
B. Java Runtime Environment(JRE)
C. Java development kit(JDK)                  (correct)
D. Integrated development environment(IDE)

explanation: once we installed JDK, automtically Java compiler, JRE will come.
JRE internally contains JVM. Installing IDE is optional and it is not part of
java development environment setup.
 */




public class _01_features_of_java {
}
