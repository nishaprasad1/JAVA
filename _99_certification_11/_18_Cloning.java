package _99_certification_11;
/*
Shallow cloning and Deep cloning:
--> clone() method present in Object class meant for shallow cloning.
If we want deep cloning for our object, we required to override clone
method in our class. 

--> Deep cloning: The process of creating completely independent duplicate
object is called deep cloning.

--> Shallow cloning: The process of creating exaclty duplicate copy of original
object, if original object contains any reference variables then duplicate
copies won't be created for the contained object, just duplicate reference 
variable will be created.
 
Q.
class Test{
	public static void main(String[] args) {
		int[][] x = {{10,20,30},{40,50,60}};
		int[][] y = x.clone();
		int[] z = x[0].clone();
		System.out.println(x==y);//false
		System.out.println(x[1]==y[1]);//true
		System.out.println(x[0]==y[0]);//true
		System.out.println(x[0]==z);//false
		System.out.println(x.equals(y));//false
	}
}
--> refer image cloning01 for understanding.  
---

Q.
class Test{
	public static void main(String[] args) {
		int[][] x = {{10,20,30},{40,50,60}};
		int[][] y = x.clone();
		x[0][1]=7777;
		x[1][2]=9999;
		System.out.println(y[0][1]+":"+y[1][2]);
	}
}
A) 20:60
B) 7777:9999
C) Compilation fails
D) An Exception is thrown at Runtime

---

Q.
class Test{
	public static void main(String[] args) {
		int[][] x = {{10,20,30},{40,50,60}};
		int[][] y = x.clone();
		x[0]= new int[] {1,11,111};
		x[0][1]=7777;
		x[1][2]=9999;
		System.out.println(y[0][1]+":"+y[1][2]);
	}
}

A) 20:60
B) 7777:9999
C) 20:9999
D) Compilation fails
E) An exception is thrown at runtime

answer: C
----

Q.
class Test{
	public static void main(String[] args) {
		int[][] x = {{10,20,30},{40,50,60}};
		int[][] y = x.clone();
		System.out.println(x==y);//false
		System.out.println(x.equals(y));//false
		System.out.println(x[0]==y[0]);//false
		System.out.println(x[0].equals(y[0]));//false
	}
}

 */
public class _18_Cloning {
	public static void main(String[] args) {

	}
}