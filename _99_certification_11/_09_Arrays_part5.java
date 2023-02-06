package _99_certification_11;

/*
Arrays variable Assignments:

Q.
int[] a = {10,20,30};
char ch = {'a','b','c'};

s1: int[] b = a;
s2: int[] c = ch;

A) only s1 is valid.
B) only s2 is valid.
C) both s1 and s2 are valid.
D) both s1 and s2 are invalid.

answer: A
----

Q. which of the following conversion will be performed automatically?
A) char --> int
B) char[] --> int[]
C) int --> long
D) int[] --> long[]
E) double --> float
F) double[] --> float[]
G) String --> Object
H) String[] --> Object[]

answer: A,C,G,H

explanation: Element level promotions are not applicable at array level.
for example, char can be promoted to int type but char[] cannot be promoted
to int[] type.
But in case of object type arrays, child type array can be promoted to
parent type arrays.

eg: String[] s = {"A", "B", "C"};
	Object[] o = s;
---

Q.
public static void main(String[] args) {
		Object[] o = new String[3];
		o[0] = new Object();// this will compile fine, 
						   // but at runtime will give java.lang.ArrayStoreException
	}
---

Q. consider:	Object[] o = new String[3];
then in which of the following assignments will cause compile time error?

A) a[0] = new Object();
B) a[1] = new Integer();
C) a[2] = new StringBuffer("durga");
D) None of these

answer: D
explanation: compiler always consider only reference type, but at runtime JVM
will always consider 'runtime object' type.
---

Q.
class Test{
	public static void main(String[] args) {
		Object[] a = new String[3];
		a[0] = new Object();//Line-1
		a[1] = new String("durga");//Line-2
	}
}		
	
which is valid?
A) At Line-1 we will get compile time error.
B) At Line-2 we will get compile time error.
C) An runtime exception is thrown at Line-1.
D) An runtime exception is thrown at Line-2.

answer: C
---

Q.
int[] a = {10,20,30,40,50};
int[] b = {60,70};

which of the following assignments are valid?
s1: a = b;
s2  b = a;

answer: both s1 and s2 are valid.
explanation: whenever we are assigning one array to another array, internal elements
won't be copied, just reference variables will be reassigned. Hence sizes are not 
required to match, but types must be matched.
---

Q.
class Test{
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		int[] b = {60,70};
		b = a;
		for(int x : b) {
			System.out.print(x+"-");
		}
		
	}
}

A) compilation fails
B) An exception thrown at runtime
C) 60-70-
D) 10-20-30-40-50-

answer: D
---

Q. 
int[][] a = new int[3][];

 which of the following assignments are valid?
A) a[0]= new int[4][5];
B) a[0]= 10;
C) a[0]= new int[4];
D) None of these

answer: C
explanation: whenever we are assigning one array to another array, dimensions
must be matched.
a[0] = null; is also valid.
---

Q.
class Test{
	public static void main(String[] args) {
		String[] argh = {"A", "B"};
		args=argh;
		for(int i=0; i<=args.length;i++) {
			System.out.print(args[i]);
		}
	}
}

==> java Test X Y Z

whats will be the result?
A) Compilation fails.
B) An exception is thrown at runtime.
C) XYZ
D) AB

answer: B, as index 2 will give array index out of bound exception.
---

Q.
class Test{
	public static void main(String[] args) {
		String[] argh = {"A", "B"};
		args=argh;
		for(int i=0; i<args.length;i++) {
			System.out.print(args[i]);
		}
	}
}

==> java Test X Y Z

whats will be the result?
A) Compilation fails.
B) An exception is thrown at runtime.
C) XYZ
D) AB

answer: D
---

Q.
class Test{
	public static void main(String[] args) {
		String[] argh = {"A", "B"};
		args=argh;
		System.out.print(args.length);
		System.out.print(argh.length);
	}
}

==> java Test X Y Z

whats will be the result?
A) Compilation fails.
B) An exception is thrown at runtime.
C) 22
D) 33

answer: C
---

Q.
int[][] a = new int[3][2];
a[0]= new int[3];
a[1]= new int[4];
a = new int[4][3];

Total how many objects created and how many objects are eligible for garbage
collection?
Note: If an object not having any reference variable then it is eligible for
garbage collection.

answer: 11, 6

explanation:
				int[][] a = new int[3][2];
				
step-1		a	[-------------------------> Object-1
					{0,0},----------------> Object-2
					{0,0},----------------> Object-3
					{0,0}-----------------> Object-4
				]

					
step-2			a[0]= new int[3];
					
			a	[-------------------------> Object-1
					{0,0,0}---------------> Object-5
					{0,0},----------------> Object-3
					{0,0}-----------------> Object-4
				]

step-3			a[1]= new int[4];
					
			a	[-------------------------> Object-1
					{0,0,0}---------------> Object-5
					{0,0,0,0}-------------> Object-6
					{0,0}-----------------> Object-4
				]
				
step-4			a = new int[4][3];
				[--------------------------> Object-7
					{0,0,0}----------------> Object-8
					{0,0,0}----------------> Object-9
					{0,0,0}----------------> Object-10
					{0,0,0}----------------> Object-11
				]
				
before Object-7 all will be eligible for grabage collection
 */
public class _09_Arrays_part5 {
	public static void main(String[] args) {
		Object[] o = new String[3];
		o[0] = new Object();
	}
}