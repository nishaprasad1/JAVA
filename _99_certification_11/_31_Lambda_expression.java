package _99_certification_11;
/*
Lambda Expression:
--> the main objective of lamda expression is to bring benefits of procedural
	programming in java.
lambda expression==> Anonymous function(nameless function). The function not having name,
					return type and access modifiers.
					
public void m1(){
	System.out.println("Hello");
}

()-> System.out.println("Hello");
----
public void add(int a, int b){
	System.out.println(a+b);
}

(a,b)-> System.out.println(a+b);
----
public int squareIt(int x){
	return x*x;
}

x-> x*x;

---
Q.
@FunctionalInterface
interface Interf{
	int squareIt(int x);
}
class Test{
	public static void main(String[] args) {
		Interf i = x-> x*x;
		System.out.println(i.squareIt(10));
		System.out.println(i.squareIt(20));
	}
}
---

Q.
@FunctionalInterface
interface Interf{
	boolean isEven(int x);
}
class Test{
	public static void main(String[] args) {
		Interf i = x-> x%2==0;
		System.out.println(i.isEven(10));
		System.out.println(i.isEven(23));
	}
}
 */
public class _31_Lambda_expression { public static void main(String[] args) {}}