package _99_certification_11;
/*
Q.
class Test{
	public static void main(String[] args) {
		//Line-1
		s[0]="Sunny";
		s[1]="Bunny";
		s[2]="Chinny";
		System.out.println(s[0]+"-"+s[1]+"-"+s[2]);
	}
}

To print Sunny-Bunny-Chinny, at Line-1 which code we have to write?
A. String[] s = new String[3];
B. String[] s;
	s=String[3];
C. String s = new String[3];
D. String[3] s;

answer: A
---------

Q.
class Test_{
	public static void main(String[] args) {
		double[] d = new double[3];
		int j =3;
		for(int i=0;i>j;i++) {
			d[i]=i;
		}
		for(double d1 : d) {
			System.out.print(d1+",");
		}
	}
}

A) 0.0,1.0,2.0,
B) 0.0,0.0,0.0,
C) Compilation fails
D) An exception is thrown at runtime

answer: B
-----------------

Q.
class Test_{
	public static void main(String[] args) {
		double[] d = new double[3];
		int j =3;
		for(int i=0;i<j;i++) {
			d[i]=i;
		}
		for(double d1 : d) {
			System.out.print(d1+",");
		}
	}
}

A) 0.0,1.0,2.0,
B) 0.0,0.0,0.0,
C) Compilation fails
D) An exception is thrown at runtime

answer: A
--------------

Q.
class Course{
	String name;
	double fee;
	Course(String name, double fee){
		this.name=name;
		this.fee=fee;
	}
	public static void main(String[] args) {
		Course[] c = new Course[3];
		c[0] = new Course("Java", 10_000);
		c[2] = new Course("Python", 20_000);
		for(Course c1: c) {
			System.out.println(c1.name+":"+c1.fee);	
		}
	}
}

A)
Java:10000.0
null:0.0
Python:20000.0

B)
Java:10000.0
Python:20000.0

C) Compilation fails
D) ArrayIndexOutOfBoundException is thrown at runtime
E) NullPointerException is thrown at runtime

answer: E
------

Q.
class Test_{
	public static void main(String[] args) {
		int[][] evenodd = new int[2][2];
		
		for(int i=0; i<4&i%2==0;i++) {
			for(int j=0;j<3;j++) {
				evenodd[i][j]=i;
			}
		}
	}
}

answer: ArrayIndexOutOfBoundException
--------
Q.
class Test_{
	public static void main(String[] args) {
		int[][] evenodd = new int[2][2];
		
		for(int i=0; i<2&i%2==0;i++) {
			for(int j=0;j<3;j++) {
				evenodd[i][j]=i;
			}
		}
		
		for(int i=0; i>2& i%2!=0;) {
			for(int j=0;j<2;j++) {
				evenodd[i][j]=i;
			}
		}
	}
}

what will be evenodd array content?
answer: all index will have 0
=======================================================

int[] a; ====> Declaring an array
a = new int[3]; =====> Creating array

a[0]=10; ---+
a[1]=20; ---+---> initialization
a[2]=30; ---+


Declaration, creation and initialization in a single line:
int[] a = {10, 20, 30};
int[][] a = {{10,20,30},{40,50}};

Note: this shortcut notation is valid only in one line,
ie
int[] a;
a={10,20,30};
this is invalid.
==================================

Q.
class Test_{
	static int[] x;
	public static void main(String[] args) {
		x = {10,20,30};// invalid
		x = new int[3];// valid
		x = new int[3] {10,20,30};// invalid
		x = new int[] {10,20,30};// valid
	}
}
 */


public class _07_Arrays_part3 {
}
