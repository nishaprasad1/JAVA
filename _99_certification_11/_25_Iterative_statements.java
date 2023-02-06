package _99_certification_11;
/*
Iterative statements:
1. while
2. do-while
3. for
4. for-each
===========

1. while
---> The argument to while loop should be of the boolean type.

Q.
class Test{
	public static void main(String[] args) {
		while(1) {
			System.out.print("Hello");
		}
		System.out.print("Hii");
	}
}

A) It will print Hello infinite number of times.
B) HelloHi
C) Compilation fails
D) An exception is thrown at runtime.

answer: C, while need only boolean types
---
Q.
class Test{
	public static void main(String[] args) {
		int n =5;
		while(n>0) {
			System.out.print(n--+" ");
		}
	}
}

answer: 5 4 3 2 1
---

Q.
coding snippet-1:
while(true)
	System.out.println("Hello");

---
coding snippet-2:
while(true);
	System.out.println("Hello");

---
coding snippet-3:
while(true)
	int x=10;

---
coding snippet-4:
while(true){
	int x=10;
}
In which of the following coding snippets, we will get compilation error?
answer: coding snippet-3

---> curly braces are optional and without curly braces, only one statement
 is allowed under while, but should not be declarative statement.
 
---
Q.
coding snippet-1:
while(true){
	System.out.println("Hello");
}
	System.out.println("Hii");//Line-1

result: Line-1 is unreachable code hence CE 	
---
coding snippet-2:
while(false){
	System.out.println("Hello");
}
	System.out.println("Hii");
	
result: the while loop body is unreachable hence CE	
---
coding snippet-3:
int a=10, b=20;
while(a<b){
	System.out.println("Hello");
}
	System.out.println("Hii");
	
result: a and b are normal variables, compiler don't know the result of a<b
o/p
Hello
Hello
.
.

---
coding snippet-4:
int a=10, b=20;
while(a>b){
	System.out.println("Hello");
}
	System.out.println("Hii");
	
o/p:
Hi
---
coding snippet-5:
final int a=10, b=20;
while(a<b){
	System.out.println("Hello");
}
	System.out.println("Hii");//Line-1
	
result: as a,b are final, hence their value will be placed and expression will be
		evaluated at compile time, hence a<b===> true, and Line-1 will be unreachable code.
CE		 	
---
coding snippet-6:
final int a=10, b=20;
while(a>b){
	System.out.println("Hello");
}
	System.out.println("Hii");

result: as a,b are final, hence their value will be placed and expression will be
		evaluated at compile time, hence a>b ===> false, and while-loop body will
		be unreachable ie,CE
		
In which of the above coding snippet we get CE?
A) Coding snippet-1		
B) Coding snippet-2		
C) Coding snippet-3		
D) Coding snippet-4		
E) Coding snippet-5		
F) Coding snippet-6

answer: A,B,E,F
=====================
2. do-while loop:
If we want to execute loop body atleast once then we should go for do-while.

do{
	//body
}while(condition);

Q. which are TRUE?
A) It the case of while loop, the loop body can be executed zero number of times.
B) It the case of do-while loop, the loop body will be executed atleast once.
C) It the case of do-while loop, the loop body can be executed zero number of times.
D) It the case of while loop, the loop body will be executed atleast once.
 
answer: A,B

--> curly braces are optional. whithout curly braces only one statement is allowed
between do and while, which should not be declarative statement.

Q.
coding snippet-1:
do
	System.out.println("Hello");
while(true);

result: in this case "Hello" will be printed infinite number of times.  
---

coding snippet-2:
do;
while(true);

result: in this case ; will be executed infinite number of times, but we wont get
any output.
---

coding snippet-3:
do
while(true);

result: we are not defining loop body, hence invalid.
---

coding snippet-4:
do
	int x=10;
while(true);

result: single declarative statement is invalid.
---

coding snippet-5:
do{
	int x=10;
}	
while(true);

result: valid

valid cases: 3,4 ===> causes compile time error. 

Q.
class Test{
	public static void main(String[] args) {
		do while(true)//Line-1
			System.out.println("hello");//Line-2
		while(false);//Line-3
	}
}

A) compilation fails because we are not taking any statement between do and 
while at Line-1.
B) compilation fails because we are not taking ; at Line-1.
C) compilation fails as Line-2 is unreachable statement.
D) compilation fails as Line-3 is unreachable statement.
E) It will print "Hello" infinite number of times.

answer: E
---

Q.
coding snippet-1:
do{
	System.out.println("Hello");
}while(true);
System.out.println("Hi");//Line-1

result: invalid, Line-1 unreachable statement
---

coding snippet-2:
do{
	System.out.println("Hello");
}while(false);
System.out.println("Hi");

result: valid,
 o/p:
 Hello
 Hi
---

coding snippet-3:
int a=10, b=20;
do{
	System.out.println("Hello");
}while(a<b);
System.out.println("Hi");

result: valid
o/p
Hello
Hello
Hello
...infinite times
---

coding snippet-4:
int a=10, b=20;
do{
	System.out.println("Hello");
}while(a>b);
System.out.println("Hi");

result: valid
o/p:
Hello
Hi
---

coding snippet-5:
final int a=10, b=20;
do{
	System.out.println("Hello");
}while(a>b);
System.out.println("Hi");

result: valid
o/p:
Hello
Hi
---

coding snippet-6:
final int a=10, b=20;
do{
	System.out.println("Hello");
}while(a<b);
System.out.println("Hi");// Line-1

result: invlid, Line-1 unreachable

we will get CE in 1,5
---

Q.
class Test{
	public static void main(String[] args) {
		final int a=10, b=20;// Line-1
		do{
			System.out.println("Hello");
			// Line-2
		}while(a<b);
		System.out.println("Hi");// Line-3
	}
}
which of the following modifications required independently to compile this
Test class?

A) Remove final keyword at Line-1.
B) use break statement at Line-2.
C) remove line-3.
D) None of these.

answer: A,B,C
=============

3. for loop:

Q. consider the for-loop syntax:
for(initialization_section; conditional_check; increment/decrement){
	body;
}

which of the following are valid?
A) initialization_section will be executed for every iteration.
B) initialization_section will be executed only once.
C) conditional_check will be performed for every iteration.
D) body will be executed for every iteration.

answer: B,C,D

==> Initialization section:

Q. In the initialization_section, which of the variable declarations are
allowed?
A) int i=0;
B) int i=0,j=0;
C) int i=0, String s="durga";
D) int i=0, int j=0;

answer: A,B
In initilization section it is not possible to declare multiple variables of
different data types.
---

Q.
class Test{
	public static void main(String[] args) {
		int i=0;
		for(System.out.print("Hello");i<3;i++) {
			System.out.print("Hi");
		}
	}
}
A) Compiltion fails
B) HelloHi
C) HelloHiHi
D) HelloHiHiHi

answer: D
explnation: It the initilization section we can take any valid java statement
including sop() statement.

===> conditional check:
-> we can take any expression but it should be boolean type.
-> It is optional. If we are not writing this expression, then the compiler
 	will place true value.
 	
Q. 
class Test{
	public static void main(String[] args) {
		for(int i=0;;i++) {
			System.out.print(i+",");
		}
	}
}
what is the result?
A) compilation fails.
B) It will print 1,2,3,4.... infinite times.
C) It will print 0,1,2,3.... infinite times.
D) An exception is thrown at runtime.

answer: C 
---

Q.
class Test{
	public static void main(String[] args) {
		for(byte i=0;;i++) {
			System.out.print(i+",");
		}
	}
}
What is result?
A) Compilation fais.
B) It will print 1,2,3,4,... 127
C) It will print 0,1,2,3,....127
D) It will print 0,1,2,3,... infinite times but all values within
the byte range only.

answer: D 
--

Q.
class Test{
	public static void main(String[] args) {
		for(byte b=0;;b=b+1) {
			System.out.print(b+",");
		}
	}
}
What is result?
A) Compilation fais.
B) It will print 1,2,3,4,... 127
C) It will print 0,1,2,3,....127
D) It will print 0,1,2,3,... infinite times but all values within
the byte range only.

answer: A, as b=b+1 will of int type 
---

Q.
class Test{
	public static void main(String[] args) {
		int i=0;
		for(System.out.print("Hello"); i<3; System.out.print("Hi")) {
			i++;
		}
	}
}

A) Compilation fails.
B) HelloHi
C) HelloHiHi
D) HelloHiHiHi

answer: D
explanation: Increment/ decrement section can take any valid java statement
including sop() statement.
---

Q.
coding snippet-1
for(;;){
	System.out.println("Hello");
}
--

coding snippet-2
for(;;);

which of the above are valid?
A) coding snippet-1 causes compile time error.
B) coding snippet-2 causes compile time error.
C) coding snippet-1 prints Hello infinite number of times.
D) coding snippet-2 raises runtime exception.
E) coding snippet-2 compiles fine and runs fine but won't produce
	any output.
	
answer: C,E
---

Q.
coding snippet-1:
class Test{
	public static void main(String[] args) {
		for(int i=0; true; i++) {
			System.out.println("Hello");
		}
		System.out.println("Hii");//Line-1
	}
}

CE: Line-1 unreachable
--

coding snippet-2:
class Test{
	public static void main(String[] args) {
		for(int i=0; false; i++) {//Block-1
			System.out.println("Hello");
		}
		System.out.println("Hii");
	}
}

CE: block-1 unreachable
--

coding snippet-3:
class Test{
	public static void main(String[] args) {
		for(int i=0; ; i++) {
			System.out.println("Hello");
		}
		System.out.println("Hii");//Line-1
	}
}

CE: Line-1 unreachable
--

coding snippet-4:
int a=10, b=20;
class Test{
	public static void main(String[] args) {
		for(int i=0; a<b; i++) {
			System.out.println("Hello");
		}
		System.out.println("Hii");
	}
}

==>valid
--

coding snippet-5:
int a=10, b=20;
class Test{
	public static void main(String[] args) {
		for(int i=0; a>b; i++) {
			System.out.println("Hello");
		}
		System.out.println("Hii");
	}
}
==> valid
--

coding snippet-6:
final int a=10, b=20;
class Test{
	public static void main(String[] args) {
		for(int i=0; a<b; i++) {
			System.out.println("Hello");
		}
		System.out.println("Hii");//Line-1
	}
}

CE: Line-1 unreachable, as a and b are final constant hence a<b is true at compile time.
--

coding snippet-7:
final int a=10, b=20;
class Test{
	public static void main(String[] args) {
		for(int i=0; a>b; i++) {//Bolck-1
			System.out.println("Hello");
		}
		System.out.println("Hii");
	}
}
Which are valid?
answer: 4,5 
=====

for-each loop or enhanced for loop:
1.5 version
to retrieve elements of arrays and collections.

Q. Consider the array:
int[] a={10,20,30,40};
which of the following are valid ways to retrieve elements of array?

A) for(int i=0; i<a.length;i++){
		System.out.println(a[i]);
   }
   
B) for(int x : a){
		System.out.println(x);
   }
   
C) for(int i=0; i<=a.length;i++){
		System.out.println(a[i]);
   }
   
D) for(int x : int[] a){
		System.out.println(x);
   }   

E) for(var x : a){
		System.out.println(x);
   }

answer: A,B,E
---

Q. Consider 2-D array:
	int[][] x = {{10,20,30},{40,50,60}};

Which of the following are valid to retrieve array elements?

A) 
for(int i=0; i<x.lenght; i++){
	for(int j=0; j<x[i].length; i++){
		System.out.println(x[i][j]);
	}
}

B)
for(int[] x1: x){
	for(int x2: x1){
		System.out.println(x2);
	}
}

C) 
for(var i=0; i<x.lenght; i++){
	for(var j=0; j<x[i].length; i++){
		System.out.println(x[i][j]);
	}
}

D)
for(var x1: x){
	for(var x2: x1){
		System.out.println(x2);
	}
}

answer: A,B,C,D
---

Q.
int [][][] x= {{{10,20},{30,40}}, {{11,12},{13,14}}};

A)		
for(int[][] x1 : x) {
	for(int[] x2 : x1) {
		for(int x3 : x2) {
			System.out.println(x3);
		}
	}
}

B)		
for(var x1 : x) {
	for(var x2 : x1) {
		for(var x3 : x2) {
			System.out.println(x3);
		}
	}
}

answer: A,B
==================

--> Enhanced for loop is not general purpose loop ant it is applicable only for
arrays and collections.
--> By using normal for loop we can retrieve elements either in original order 
or in reverse order.
--> By using enhanced for loop we can retrieve elements only in original order
but not in reverse order.

Q.
class Test{
	public static void main(String[] args) {
		String x="-";
		for(var s : args) {
			System.out.print(s+x);
			x+=x;
		}
	}
}
Consider the command invocation:
java Test Python Java Devops
What is the reult?

A)Python-Java--Devops---
B)Compilation fails
C)An exception thrown at runtime.
D)Python-Java--Devops----

answer: D
---

Q. Consider the following code
class Test{
	static public void main(String... durgaStrings) {
		for(var string : durgaStrings) {
			//body
		}
	}
}

What is the type local variable string?
A) String
B) String[]
C) No type will be assigned.
D) String...

answer: A
---

Q. Consider the array:
int[] x={10,20,30,40,50,60};

To print process all array elements in the original order, which of the following
loop can be used?

A) standard for loop
B) enhanced loop
C) Both A and B
D) None of thses

answer: C
---

Q. Consider the array:
int[] x={10,20,30,40,50,60};

To print process all array elements in the reverse order, which of the following
loop can be used?

A) standard for loop
B) enhanced loop
C) Both A and B
D) None of thses

answer: A
---

Q. Consider the array:
int[] x={10,20,30,40,50,60};

To print process alternate array elements in the original order, which of the following
loop can be used?

A) standard for loop
B) enhanced loop
C) Both A and B
D) None of thses

answer: A
===================

Iterable:
for(eachitem x : traget){
	
}
target can be either array or collection.
In for-each loop the target element should be iterable object.
java.lang.Iterable interface 1.5V
public Iterator iterator()
All array related classes and collection related classes already implements
Iterable interface. 
===================

Transfer statements:
1. break
2. continue
3. assert
4. try-catch-finally

----
1. break
--> inside switch statement to stop fall through
	int x=10;
		switch(x) {
		case 10: 
			System.out.println(10);
			break;
		case 20:
			System.out.println(20);
		case 30:
			System.out.println(30);
		}

--> inside loops to break loop execution

for(int i=0; i<10;i++) {
			if(i==5)
				break;
			System.out.print(i);
}

--> inside labeled block.

int x=10;
l1:{
	System.out.println("Begin");
	if(x==10)
		break l1;
	System.out.println("End");
}
System.out.println("Outside of Labeled block");

result:
Begin
Outside of Labeled block
---

Q.
class Test{
	static public void main(String... durgaStrings) {
		int x=10;
		if(x == 10) {
			System.out.print("Hello-");
			break;//CE:break cannot be used outside of a loop or a switch
		}else 
			System.out.print("Hi-");
		System.out.println("HelloHi");
	}
}

result: CE:break cannot be used outside of a loop or a switch
=========

2. continue
To skip remaining statements in the current iteration and continue for
the next iteration.

Q.
class Test{
	static public void main(String... durgaStrings) {
		for(int i=0; i<10; i++) {
			if(i%2!=0)
				continue;
			System.out.println(i);
		}
	}
}

o/p: 02468
---

Q.
class Test{
	static public void main(String... durgaStrings) {
		int x=10;
		if(x==10) {
			System.out.print("Hello-");
			continue;//CE:continue cannot be used outside of a loop
		}else {
			System.out.print("Hi-");
		}
		System.out.print("HelloHi-");
	}
}

result: CE, we can use continue statements only inside loops.
=====================

Labeled break and continue statements:
In the nested loops to break or continue a particular loop, then we should go
for labeled break and continue statements.

Q.
class Test{
	static public void main(String... durgaStrings) {
			for(int i=0;i<3;i++) {
				for(int j=0; j<3; j++) {
					if(i==j)
						break;
					System.out.println(i+":"+j);
				}
			}
	}
}
o/p:
1:0
2:0
2:1
---

Q.
class Test{
	static public void main(String... durgaStrings) {
			for(int i=0;i<3;i++) {
				for(int j=0; j<3; j++) {
					if(i==j)
						continue;
					System.out.println(i+":"+j);
				}
			}
	}
}

o/p:
0:1
0:2
1:0
1:2
2:0
2:1
----

Q.
class Test{
	static public void main(String... durgaStrings) {
		l1:	
			for(int i=0;i<3;i++) {
				for(int j=0; j<3; j++) {
					if(i==j)
						break l1;
					System.out.println(i+":"+j);
				}
			}
	}
}

answer: it won't print anything on console.
---

Q.
class Test{
	static public void main(String... durgaStrings) {
		l1:	
			for(int i=0;i<3;i++) {
				for(int j=0; j<3; j++) {
					if(i==j)
						continue l1;
					System.out.println(i+":"+j);
				}
			}
	}
}

o/p:
1:0
2:0
2:1
---

Q.
class Test{
	static public void main(String... durgaStrings) {
		int x=0;
		do {
			x++;
			System.out.print(x);
			if(++x<5)
				continue;
			x++;
			System.out.print(x);
		}while(++x<10);
	}
}

answer: 146810
---

Q.
class Test{
	static public void main(String... durgaStrings) {
		int x=10;
		for(int j=0; j<3; j++) {
			if(x==10) {
				break;
				System.out.print("Hello-");//Line-1
			}
			System.out.print("Hi-");
		}
		System.out.print("HelloHi");
	}
}

CE: Line-1 is unreachable
---

Q.
class Test{
	static public void main(String... durgaStrings) {
		String[] vowels= {"a","e","i","o","u"};
		int i=0;
		String output="";
		for(String v : vowels) {
			i++;
			if(i==4)
				break;
			output+=v;
		}
		System.out.println(output);
	}
}

answer: aei
---

Q.
class Test{
	static public void main(String... durgaStrings) {
		int marks=100;
		if(marks<100)
			marks+=10;
		else if(marks>100)
			marks-=10;
		else
			marks=200;
		System.out.println(marks);
	}
}

answer: 200
---

Q.
class Test{
	static public void main(String... durgaStrings) {
		int marks=100;
		if(marks<=100)
			marks+=10;
		else if(marks>100)
			marks-=10;
		else
			marks=200;
		System.out.println(marks);
	}
}

anwer: 110
---

Q.
class Test{
	static public void main(String... durgaStrings) {
		int i=10;
		do {
			i=i+10;
			if(i==20)
				continue;
			System.out.print(i);
		}while(i<10);
	}
}

answer: no output
---

Q.
class Test{
	static int result=100;
	public static int calculate() {
		for(int i=0; i<3; i++) {
			result+=i;
		}
		return result;
	}
	static public void main(String... durgaStrings) {
		int result = calculate();
		calculate();
		result= calculate();
		System.out.println("The result: "+result);
	}
}

A) 103
B) 104
C) 101
D) 109
E) 106
F) Compilation fails.

answer: D
---

Q.
class Test{
	static public void main(String... durgaStrings) {
		String[] fruits= {"Apple","Banana","Orange"};
		for(int i=0; i<fruits.length; i++) {
			switch(fruits[i]) {
			case "Apple":
				System.out.println("Apple");
				continue;
			case "Banana":
				System.out.println("Banana");
				i=i-1;
				continue;
			case "Orange":
				System.out.println("Orange");
				i=i+1;
				break;
			default: 
					System.out.println("Fruits are bad");
			}
		}
	}
}

A)
Apple
Banana
Orange

B)
Apple
Banana

C)
Apple
Banana
Banana
Banana
... infinite times

D) It won't print anything to the console.
E) Compilation fails

answer: C
---

Q.
class Test{
	static public void main(String... durgaStrings) {
		int[][] x= {{10,20},{40,50},{70}};
		for(int i=0; i<3;i++) {
			for(int j=0; j>i+3;j++) {
				x[i][j]=0;
			}
		}
		//Line-1
	}
}
At Line-1 the content of the array is:
A) x= {{10,20},{40,50},{70}};
B) x= {{0,0},{0,0},{0}};
C) x= {{0,20},{40,50},{70}};
D) x= {{0,0},{40,50},{70}};

answer: A
---

Q. consider the code:

int i=10;
while(i>10){
	System.out.print(i);
	i-=3;
}
Which of the following will produce the same result?

A)
for(int i=10; i>0; i=i-3){
	System.out.print(i);
}

B) 
int i=10;
do{
	System.out.print(i);
	i-=3;
}while(i>0);	

C) 
int i=10;
do{
	i-=3;
	System.out.print(i);
}while(i>0);

D)
for(int i=10;i>0;i++){
	System.out.print(i);
	i-=4;
	if(i<0){
		break;
	}
}

answer: A,B,D
all these loops will produce same result: 10741
---

Q.
public class _25_Iterative_statements {
	public static void main(String[] args) {
		String[] s = new String[4];
		s[1]="Durga";
		s[2]="Bunny";
		s[3]="Chinny";
		for(var s1: s) {
			System.out.print(s1.length());
		}
	}
}
what is the result?
A) An ArrayIndexOutOfBoundsException is thrown at runtime.
B) A NullPointerException is thrown at runtime.
C) Compilation fails.
D) 556
E) 0556

answer: B
---

Q. Consider the code:
class Test{
	public static void main(String[] args) {
		String[] s = {"Sunny", "Bunny", "Chinny"};
		//Line-1
	}
}

Which code should be inserted at Line-1 to print ChinnyBunnySunny to console?

A)
for(String s1: s){
	System.out.print(s1);
}
B)
for(int i=0; i< s.length; i++){
	System.out.print(s[i]);
}
C)
for(int i=s.length -1; i>=0; i--){
	System.out.print(s[i]);
}
D)
int i= s.length-1;
while(i>=0){
	System.out.print(s[i]);
	i--;
}
E)
int i= s.length-1;
do{
	System.out.print(s[i]);
}while(--i>=0);

answer: C,D,E
---

Q. Consider the code:
class Test{
	public static void main(String[] args) {
		String[] s = {"Sunny", "Bunny", "Chinny"};
		//Line-1
	}
}

Which code should be inserted at Line-1 to print SunnyBunnyChinny to console?

A)
for(String s1: s){
	System.out.print(s1);
}
B)
for(int i=0; i< s.length; i++){
	System.out.print(s[i]);
}
C)
for(int i=s.length -1; i>=0; i--){
	System.out.print(s[i]);
}
D)
int i= s.length-1;
while(i>=0){
	System.out.print(s[i]);
	i--;
}
E)
int i= s.length-1;
do{
	System.out.print(s[i]);
}while(--i>=0);

answer: A,B
---

Q.
class Test{
	public static void main(String[] args) {
		String[][] s = {{"A","B"},{"C","D"}};
		for(int i= s.length-1; i>=0;i--) {
			for(int j=0; j<s[i].length;j++) {
				System.out.print(s[i][j]);
			}
		}
	}
}

A) CDAB
B) ABCD
C) DCBA
D) DCAB
answer: A
---

Q.
class Test{
	public static void main(String[] args) {
		String[][] s = {{"A","B"},{"C","D"}};
		for(int i= s.length-1; i>=0;i--) {
			for(int j=s[i].length-1; j>=0;j--) {
				System.out.print(s[i][j]);
			}
		}
	}
}
A) CDAB
B) ABCD
C) DCBA
D) DCAB
answer: C
---

Q.
class Test{
	public static void main(String[] args) {
		String[][] s = {{"A","B"},{"C","D"}};
		for(int i= 0; i< s.length;i++) {
			for(int j=s[i].length-1; j>=0;j--) {
				System.out.print(s[i][j]);
			}
		}
	}
}

A) ABCD
B) DCBA
C) CDAB
D) BADC
answer: D
---

Q.
class Test{
	public static void main(String[] args) {
		int x=0;
		if(x++<1) {
			x+=10;
		}else {
			x+=20;
		}
		System.out.println("The result: "+x);
	}
}

A) The result: 11
B) The result: 20
C) The result: 10
D) The result: 21

answer: A
---

Q.
class Test{
	public static void main(String[] args) {
		int i=10;
		int j=10;
		if(i++ < ++j) {
			i+=10;
		}else {
			j+=20;
		}
		System.out.println(i+":"+j);
	}
}
What is the result?
A) 11:11
B) 11:21
C) 21:11
D) 21:31

answer: C
 */
public class _25_Iterative_statements {
	public static void main(String[] args) {
		
	}
}