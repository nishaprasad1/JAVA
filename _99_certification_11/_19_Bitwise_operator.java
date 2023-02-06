package _99_certification_11;
/*
Bitwise operators:
 &---> AND==> if both operands are true then results in true else false.
 |---> OR===> if atleast one argument is true then true.
 ^---> XOR===> if both operands different then true else false.

Q.
class Test{
	public static void main(String[] args) {
		System.out.println(true & false);//false
		System.out.println(true | false);//true
		System.out.println(true ^ false);//true
	}
}
---

Q.
class Test{
	public static void main(String[] args) {
		System.out.println(4 & 5);// 4
		System.out.println(4 | 5);// 5
		System.out.println(4 ^ 5);// 1
	}
}
===================

bitwise complement operator(~):
---> applicable only for integral values but not for boolean values.

Q.
class Test{
	public static void main(String[] args) {
		System.out.println(~4);// -5
	}
}
==================

Boolean complement operator(!):

Q.
class Test{
	public static void main(String[] args) {
		System.out.println(!true);
	}
}

answer: false
===============
Note: applicable for both integral values and boolean values
&
|
^
------
~ applicable for integral values
! only for boolean
=====================

Short circuit operators:
&&, ||

Q.
class Test{
	public static void main(String[] args) {
		int x=10, y=15;
		if(++x<10 & ++y>15) {
			++x;
		}else {
			++y;
		}
		System.out.println(x+":"+y);//11:17
	}
}
----

Q.
class Test{
	public static void main(String[] args) {
		int x=10, y=15;
		if(++x<10 && ++y>15) {
			++x;
		}else {
			++y;
		}
		System.out.println(x+":"+y);//11:16
	}
}
----

Q.
class Test{
	public static void main(String[] args) {
		System.out.println(true & false);//Line-1
		System.out.println(true | false);//Line-2
		System.out.println(10 & 20);//Line-3
		System.out.println(10 | 20);//Line-4
		System.out.println(true && false);//Line-5
		System.out.println(true || false);//Line-6
		System.out.println(10 && 20);//Line-7
		System.out.println(10 || 20);//Line-8
	}
}
At which line we will get compile time error?
answer: Line-7, Line-8
---

Q.
class Test{
	public static void main(String[] args) {
		int x=10;
		if(++x<10 && (x/0>10)) {
			System.out.println("Hello");
		}else {
			System.out.println("Hii");
		}
	}
}

what is the result?
A) Compilation fails
B) ArithmeticException is thrown at runtime.
C) Hello
D) Hii

answer: D
---

Q.
class Test{
	public static void main(String[] args) {
		int x=10;
		if(++x<10 & (x/0>10)) {
			System.out.println("Hello");
		}else {
			System.out.println("Hii");
		}
	}
}

what is the result?
A) Compilation fails
B) ArithmeticException is thrown at runtime.
C) Hello
D) Hii

answer: B
 */
public class _19_Bitwise_operator {
public static void main(String[] args) {}
}