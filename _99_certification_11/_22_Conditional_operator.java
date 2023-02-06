package _99_certification_11;
/*
 Conditional operator(?:)
 
 ++x====> unary operator
 a+b====> binary
 ?: ====> Ternary operator
-----------

Q.
class Test{
	public static void main(String[] args) {
		int x = (10>20)?30:40;
		System.out.println(x);
	}
}
 
answer: 40  
---

Q.
class Test{
	public static void main(String[] args) {
		int x = (10>20)?30:(40>50)?60:70;
		System.out.println(x);
	}
}

answer: 70

Note: Nesting of ternary operator is possible.
---------

Q.
class Test{
	static double price=10.5;
	public static void main(String[] args) {
		double price=20.6;
		if(checkPrice()) {
			System.out.println("It is too costly");
		}else {
			System.out.println("It is not costly");
		}
	}
	
	private static boolean checkPrice() {
		boolean result = price>15?true:false;
		return result;
	}
}

A) Compilation fails.
B) "It is too costly" printed to console.
C) "It is not costly" printed to console.
D) Runtime exception

answer: C
---

Q.
class Test{
	static double price=10.5;
	public static void main(String[] args) {
		double price=20.6;
		if(checkPrice(price)) {
			System.out.println("It is too costly");
		}else {
			System.out.println("It is not costly");
		}
	}
	
	private static boolean checkPrice(double price) {
		boolean result = price>15?true:false;
		return result;
	}
}

A) Compilation fails.
B) "It is too costly" printed to console.
C) "It is not costly" printed to console.
D) Runtime exception

answer: B
---

Q.
class Test{
	public static void main(String[] args) {
		int a=10, b=20, c=30, d=40;
		int result= (a<b)?c:(c<d)?d:(a<b)?(a+b);
		System.out.println(result);
	}
}
what is the result?
A) 30
B) 20
C) 10
D) Compilation fails

answer: D, 
it is not proper declaration of ternary operator.
---

Q.
class Test{
	public static void main(String[] args) {
		int a,b,c;
		a = b = c = 20;
		a+=(b+=c)/10;
		System.out.println(a+":"+b+":"+c);
	}
}

A) 24:40:20
B) 42:22:2
C) 20:20:20
D) compilation fails
answer: A
---

Q.
class Test{
	public static void main(String[] args) {
		int i=0;
		i+= i++ + ++i + i++ + ++i;
		System.out.println(i);
	}
}

A) 4
B) 16
C) 8
D) Compilation fails

answer: C
---

Q.
class Test{
	public static void main(String[] args) {
		int i=10;
		i= ++i;
		i= ++i;
		i= ++i;
		i= ++i;
		System.out.println(i);
	}
}
A) 10
B) 12
C) 14
D) Compilation fails

answer: C
---

Q.
class Test{
	public static void main(String[] args) {
		int i=10;
		i= i++;
		i= i++;
		i= i++;
		i= i++;
		System.out.println(i);
	}
}
A) 10
B) 12
C) 14
D) Compilation fails.

answer: 10

explanation: x = x++;
1. consider x value for assignment(10)
2. increment x value (x=11)
3. perform assignment with old considered value
	x=10
----

Q.
class Test{
	public static void main(String[] args) {
		int x=10;
		int y=10;
		y= x++;
		y= x++;
		y= x++;
		y= x++;
		System.out.println(x+":"+y);
	}
}

A) 14:14
B) 10:10
C) 14:13
D) 13:13

answer: C
explanation:
int x=10;
int y=10;

y=x++;
x=11
y=10

y=x++;
x=12
y=11

y=x++;
x=13
y=12

y=x++;
x=14
y=13

 */
public class _22_Conditional_operator {
	public static void main(String[] args) {

	}
}