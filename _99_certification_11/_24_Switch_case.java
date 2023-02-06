package _99_certification_11;
/*
Q.
class Test{
	public static void main(String[] args) {
		int x= Integer.valueOf(args[0]);
		System.out.println(m1(x));
	}
	public static String m1(int x) {
		if(x<0)
			return "It is small number";
		else
			return "It is large number";
	}
}
which of the following code replaces if-else inside m1() method?
A) return (x<10)?"It is small number":"It is Big number";
B) return if(x<10)?"It is small number":"It is Big number";
C) return (x<10):"It is small number"?"It is Big number";
D) return (x>10)?"It is Big number":"It is small number";
E) return (x>=10)?"It is Big number":"It is small number";

answer: A,E
---

Q.
class Test{
	public static void main(String[] args) {
		int x= Integer.valueOf(args[0]);
		System.out.println(m1(x));
	}
	public static String m1(int x) {
		String result;
		if(x<5)
			result= "RED";
		else if(x==5)
			result= "ORANGE";
		else
			result= "GREEN";
		return result;
	}
}
which of the following code replaces if-else ladder present in m1() method?
A) result=(x<5)? "RED": (x==5)?"ORANGE":"GREEN";
B) result=(x>5)? "GREEN": (x<5)?"RED":"ORANGE";
C) result=(x==5)? "ORANGE": (x<5)?"RED":"GREEN";
D) All of the above.

answer: D
=================

switch statement:

switch(x){
	case 1: ---
			break;
	case 2: ---
			break;
	default: sop("this is default case")
}

The argument types:
allowed==> byte,short,char,int

not allowed==>long,float,double

-2147483648 to 2147483647 is int limit, hence long not allowed
0 to 1===> float and double can have infinite values hence not allowed
true,false===> boolean is not allowed

Q. which of the following types are allowed for switch argument type?
Byte,Short,Character,Integer===> allowed

Boolean,Long,Float,Double===>Not allowed

1.5V
Enum==> a group of constants

1.7V
String type also allowed.
While comparing with case labels it will always use equals() method which is meant
for content comparison.


byte,short,char,int,Byte,Short,Character,Integer,enum,String

---> for switch curly brackets are mandatory.
---> try-catch-finally curly brackts are mandatory.
---> if-else,loops curly brackets are optional.
---> inside switch case and default are optional.


enum Beer{
	KF,KO,RC,FO;
}
class Test{
	public static void main(String[] args) {
		Beer b = Beer.KF;
		switch(b) {
		case KF:
			System.out.println("It is too light");
			break;
		case KO:
			System.out.println("It is not that much kick");
			break;
		case RC:
			System.out.println("It is children's brand");
			break;
		case FO:
			System.out.println("Buy one get one free");
			break;
		default:
			System.out.println("Other brands not recommended");
		}
	}
}
---

Q. Consider the following coding snippets
Snippet-1:
int x=10;
switch(x){
	case 10:
		System.out.println(10);
}
--
Snippet-2:
int x=10;
switch(x){
	default:
		System.out.println("default");
}
--
Snippet-3:
int x=10;
switch(x){
	
}
Which of the following snippets causes compilation fails?
A) Only coding snippet-1
B) Only coding snippet-2
C) Only coding snippet-3
D) None of these

answer: D
---
Note: every statement inside switch under some case or default.
		ie, independent statements are not allowed inside switch.

--> Every case label should be constant expression. ie, normal variables
	are not allowed for case labels.
class Test{
	public static void main(String[] args) {
		int x=10;
		int y=20;
		switch(y) {
		case 10:
				System.out.println(10);
				break;
		case y://CE: case expressions must be constant expressions
				System.out.println(20);
		}
	}
}
--
class Test{
	public static void main(String[] args) {
		int x=10;
		final int y=20;
		switch(y) {
		case 10:
			System.out.println(10);
			break;
		case y:
			System.out.println(20);
		}
	}
}
answer: 20, if variable is final it is constant itself hence can be used as case label.
---

Q.
class Test{
	public static void main(String[] args) {
		int x=10;
		switch(x+1) {
		case 10://Line-1
			System.out.println(10);
			break;
		case 10+20+30://Line-2
			System.out.println(20);
		}
	}
}
which of the following is valid?
A) Compilation fails at Line-1 because expressions are not allowed
	for swicth arguments.
B) Compilation fails at Line-2 because expressions are not allowed
	for the case label.
C) Compilation fails because matched case is not available.
D) Compilation fails because default case is not available.
E) Compiles and runs fine but no output.

answer: E
---

Q. Consider the code
class Test{
	public static void main(String[] args) {
		byte b=10;
		switch(b) {
		case 10:
			System.out.println(10);
		case 100:
			System.out.println(100);
		case 1000:
			System.out.println(1000);
		}
	}
}
what is the result?
A) 10
B) 101001000
C) Compilation fails because byte type is not allowed for switch argument
 	type.
D) Compilation fails because case label 1000 is not allowed value for
	byte type.

answer: D
---

Q. Consider the code
class Test{
	public static void main(String[] args) {
		byte b=10;
		switch(b+1) {
		case 10:
			System.out.println(10);
		case 100:
			System.out.println(100);
		case 1000:
			System.out.println(1000);
		}
	}
}
what is the result?
A) 10
B) 101001000
C) Compilation fails because byte type is not allowed for switch argument
 	type.
D) Compilation fails because case label 1000 is not allowed value for
	byte type.
E) Compiles and runs fine but no output.

answer: E
explanation: b+1==> is 11 of type int hence all these values are allowed. 
---

Q.
class Test{
	public static void main(String[] args) {
		int x='a';//Line-1
		switch(x) {
		case 97:
			System.out.println(10);
		case 98:
			System.out.println(100);
		case 99:
			System.out.println(1000);
		case 'a':
			System.out.println('a');
		}
	}
}

A) 979899a
B) a
C) Compilation fails at Line-1, because we cannot assign 'a' to int 
	variable.
D) Compilation fails because 97 and 'a' are duplicate case labels.

answer: D
---

Q. Which of the following are valid about case label inside switch 
statement?
A) It can be expression but should be constant expression.
B) The value should be in the range of switch argument type.
C) Duplicate case labels are not allowed.
D) All of these.

answer: D
---

Q.
class Test{
	public static void main(String[] args) {
		String s="1234";
		switch(s) {
		case "1234": 
			System.out.println(1234);
		case 10:
			System.out.println(10);
		}
	}
}
What is the result?
A) 1234
B) 123410
C) Compilation fails
D) compiles and runs fine but no o/p

answer: C
explanation: Type mismatch: cannot convert from int to String
---

Q.
class Test{
	public static void main(String[] args) {
		int i=10;
		switch(i) {
		case 0: 
			System.out.print(0);
		case 1:
			System.out.print(1);
			break;
		case 2:
			System.out.print(2);
		default: System.out.print("default");

		}
	}
}
What is the result?
A) 0
B) 01
C) 012
D) 012default

answer: B

--> within the switch statement if any case is matched, from that case 
onwards all statements will be executed until break or end of switch 
statement. This is called fall through inside switch statement.

---

Q.
class Test{
	public static void main(String[] args) {
		int i=10;
		switch(i) {
		case 0: 
			System.out.print(0);
		case 1:
			System.out.print(1);
		case 2:
			System.out.print(2);
		default: System.out.print("default");

		}
	}
}
What is the result?
A) 0
B) 01
C) 012
D) 012default

answer: D
---

Q.
class Test{
	public static void main(String[] args) {
		int i=10;
		switch(i) {
		case 1: 
		case 2: 
		case 3: 
			System.out.print("Q-4");
			break;
		case 4: 
		case 5: 
		case 6: 
			System.out.print("Q-1");
			break;
		case 7: 
		case 8: 
		case 9: 
			System.out.print("Q-2");
			break;
		case 10: 
		case 11: 
		case 12: 
			System.out.print("Q-3");
			break;
		
		default: System.out.print("default");

		}
	}
}
---

==> Default case:
--> can write atmost one time.

Q.
public class _24_Switch_case {
	public static void main(String[] args) {
		int x=0;
		switch(x) {
		default:
			System.out.print("default");
		case 0:
			System.out.print(0);
			break;
		case 1:
			System.out.print(1);
		case 2:
			System.out.print(2);
		}
	}
}

answer: 0
---

Q.
public class _24_Switch_case {
	public static void main(String[] args) {
		int x=1;
		switch(x) {
		default:
			System.out.print("default");
		case 0:
			System.out.print(0);
			break;
		case 1:
			System.out.print(1);
		case 2:
			System.out.print(2);
		}
	}
}

answer: 12
---

Q.
public class _24_Switch_case {
	public static void main(String[] args) {
		int x=3;
		switch(x) {
		default:
			System.out.print("default");
		case 0:
			System.out.print(0);
			break;
		case 1:
			System.out.print(1);
		case 2:
			System.out.print(2);
		}
	}
}
answer: default0
---

Q. Which of the following are TRUE about default case inside switch
statement?
A) We can define default case at most once.
B) We can place default case anywhere.
C) default case will be executed if and only if no other case matched.
D) default case should be last case.
E) we can define multiple default case inside same switch statement.

answer: A,B,C
---

Q.Consider the code:
class Test {
	public static void main(String[] args) {
		//Line-1
		switch(x) {
		
		}
	}
}
To compile this code successfully, which of the following lines can be placed
at Line-1
A) int x =10;
B) byte x =10;
C) short x =10;
D) Integer x =new Integer(10);
E) String x = "10";
F) boolean x = true;
G) long x = 10;
H) double x = 10.0;
 
answer: A,B,C,D,E 
---

Q.
public class Test {
	public static void main(String[] args) {
		String[] beers= {"KF","KO","RC","FO"};
		double price=0;
		for(var beer : beers) {
			switch(beer) {
			case "KF":
			case "KO":
				price+=150.0;
			case "RC":
			case "FO":
				price+=75;
			}
		}
		System.out.println("Total price:"+price);
	}
}

What is the result?
A)Total price:450.0
B)Total price:600.0
C)Total price:900.0
D)Total price:650.0
E)Total price:300.0

answer: B 
---

Q.
public class Test {
	public static void main(String[] args) {
		String[] beers= {"KF","KO","RC","FO"};
		double price=0;
		for(var beer : beers) {
			switch(beer) {
			case "KF":
			case "KO":
				price+=150.0;
				break;
			case "RC":
			case "FO":
				price+=75;
			}
		}
		System.out.println("Total price:"+price);
	}
}

What is the result?
A)Total price:450.0
B)Total price:600.0
C)Total price:900.0
D)Total price:650.0
E)Total price:300.0
answer: A
---

Q.
public class Test {
	public static void main(String[] args) {
		String[] beers= {"KF","KO","RC","FO"};
		double price=0;
		for(var beer : beers) {
			switch(beer) {
			case "KF":
			case "KO": RC:
				price+=150.0;
			case "FO":
				price+=75;
			default:
				price+=60;
			}
		}
		System.out.println("Total price:"+price);
	}
}

A) compilation fails
B) Total price:495.0
C) Total price:585.0
D) Total price:525.0
E) An exception is thrown at runtime.

answer: B
---

Q.
public class Test {
	public static void main(String[] args) {
		String s="";
		char ch ='f' - 'a';
		switch(ch) {
		case 4|5:
			s+="Apple-";
		case 4&5:
			s+="Banana-";
		case 4^5:
			s+="Orange";
		}
		System.out.println(s);
	}
}

A) Compilation fails.
B) An exception is thrown at runtime.
C) Apple-Banana-Orange
D) Banana-Orange
C) Apple-Orange
E) Apple-

answer: C
explanation: 		char ch ='f' - 'a'; ===> 102-97===>5
					4|5===> 5
					4&5===> 4
					4^5===> 1
					fall through
 */
public class _24_Switch_case {
}