package _99_certification_11;
/*
Operator Precendence:

++x===> unary operator
a+b===> binary
?:====> ternary

()
x++, x--
++x, --x, ~, !
new, type cast

*, /, %
+, -

>>, >>>, <<

<, <=, >, >=, instanceof
==, !=
&
^
|

&&
||

?:

=, +=, *= ...

==========================
Evaluation of operands:
There is operand precedence and we have only operator precedence.
Before applying any operator, all operands will be evaluated from
left to right.

Q.
class Test{
	public static void main(String[] args) {
		System.out.print(m1(1)+m1(2)*m1(3)/m1(4)*m1(5)+m1(6));
	}
	public static int m1(int i) {
		System.out.print(i);
		return i;
	}
}

A) 12345612
B) 23451612
C) 45231612
D) compilation error

answer: A
explanation:
m1(1)+m1(2)*m1(3)/m1(4)*m1(5)+m1(6)
1+2*3/4*5+6
1+6/4 *5+6
1+1*5+6
1+5+6
6+6
12 
===================

Flow control:
-->3 categories:
1. selection statements:
	A) if -else
	B) switch
2. iterative statements:
	A) for
	B) while
	C) do-while
	D) for-each
3. transfer statements:
	A) break
	B) continue
	C) return
	D) try-catch-finally
	E) assert(1.4)
	
	
Q. Consider the following coding snippets:
Snippet-1
int x=0;
if(x){
	System.out.println("Hello");
}else{
	System.out.println("Hi");
}
--
Snippet-2
int x=10;
if(x=20){
	System.out.println("Hello");
}else{
	System.out.println("Hi");
}
--
Snippet-3
int x=10
if(x==20){
	System.out.println("Hello");
}else{
	System.out.println("Hi");
}
--
Snippet-4
int x=false;
if(x= true){
	System.out.println("Hello");
}else{
	System.out.println("Hi");
}
--
Snippet-5
int x=false;
if(x== false){
	System.out.println("Hello");
}else{
	System.out.println("Hi");
}
--
In which of the following cases we will get compile time error?

A) Coding snippet-1
B) Coding snippet-2
C) Coding snippet-3
D) Coding snippet-4
E) Coding snippet-5

answer: A,B
----

Q.
class Test{
	public static void main(String[] args) {
		boolean b =true;
		int i=10;
		int j=20;
		if(b = (i==j)) {
			System.out.println("Hello");
		}else {
			System.out.println("Hii");
		}
	}
}

answer: Hii
---

Q.
Snippet-1:
if(true)
	System.out.println("Hello");
--	
Snippet-2:
if(true);
--	
Snippet-3:
if(true)
	int x=10;
--	
Snippet-4:
if(true){
	int x=10;
}
which of the above snippets are valid?

A) Coding snippet-1
B) Coding snippet-2
C) Coding snippet-3
D) Coding snippet-4

answer: A,B,D
	
 */
public class _23_Operator_precedence {
	public static void main(String[] args) {

	}
}