package _99_certification_11;
/*

lenght vs length():

int[] x = new int[3];
System.out.println(x.length);// 3

String s = "durga";
System.out.println(x.length());// 5

length: arrays but not for Strings
length(): for Strings but not for arrays.
-----------

Q.
int[][] x = new int[6][3];
System.out.println(x.length);

A) 6
B) 3
C) 9
D) 18

answer: 6
-----

Q.
String[] s = {"A", "AA", "AAA"};

A) System.out.println(s.length);//3
B) System.out.println(s.length());// CE
C) System.out.println(s[0].length);//CE
D) System.out.println(s[0].length());//1
----


Anonymous Arrays:
array without name is called anonymous arrays

new int[]{10,20,30};// valid
new int[3]{10,20,30};// invalid

new int[][]{{10,20}, {30,40,50}};
--------------

Q. which of the following array created and initialized with default
values?
A) int[] x = new int[];
B) int[] x = new int[3];
C) int[] x = new int[3]{10,20,30};
D) int[] x = new int[]{10,20,30};

answer: B
---

Q. which will give CE?
A) int[] x = new int[];
B) int[] x = new int[3];
C) int[] x = new int[3]{10,20,30};
D) int[] x = new int[]{10,20,30};

answer: A,C
================================================

Array Element Assignment:
case-1: primitive arrays

int[] x = new int[10];
x[0]=100;
x[1]='a';
x[2]=10L;

float[] f = new float[10];
f[0]=10;
f[1]='a';
f[2]=10L;
f[3]=10.5L;
f[3]=10.5;

--> In the case of primitive type arrays, as array elements we can
provide any type, which can be implicitly promoted to declared type.


case-2: Object type arrays:
Object[] a = new Object[10];
a[0]= new Object();
a[1]= new Integer(10);
a[2]= new String("Durga");

--> In case of Object types arrays, as array elements we can provide 
either declared type or its child class objects.
--> In case of abstract class type arrays, as array elements we can 
provide its child class object.

Number[] n = new Number[10];
n[0] = new Integer(10);// valid
n[1] = new String("durga");// invalid 


case-3: Interface type arrays:
Runnable[] r = new Runnable[10];
r[0]= new Thread();


Q. which are valid?
A) Runnable r = new Runnable();
B) Runnable[] r = new Runnable[10];
C) List l = new List();
D) List[] l = new List[10];

answer: B,D
----

Q. which of these is valid?
A. we can create arrays of primitive type but not object type.
B. we can create only concrete class type arrays but not abstract 
		class type arrays.
C. we can create only class type arrays but not interface type 
		arrays.
D. None of these.

answer: D
----

Q. we are representing tic tac game table by using 2-D array.
Currenty table looks like:

 String[][] tictac = new String[3][3];
 
 O O X
 X X _
 _ O _
 
 To get 3 consecutive X's which of the following declarations required
 to win the game?
 
 A) tictac[2][0]="X";
 B) tictac[2][1]="X";
 C) tictac[1][2]="X";
 D) tictac[2][2]="X";
 
 answer: C

 */
public class _08_Arrays_part4 {
	public static void main(String[] args) {
	}
}
