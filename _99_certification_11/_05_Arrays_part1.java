package _99_certification_11;
/*
Array:
multiple values by using single variable.

int[] x = new int[10];

limitations:
1. homogeneous elements
2. size fixed

--> An array is an indexed collection of fixed number
of homogeneous data elements.
======================================

declration:
int[] a;
int []a;
int a[];


int[5]a;------> invalid
int[] a = new int[5];----> valid (size is not required at declaration but required at
								initialization).
=======================================

declaration of 2-D arrays:

int[][] a;
int a[][];
int [][]a;

int[] []a;
int[]  a[];
int []a[];
========================================
3-D arrays:

int[][][] a;
int  [][][]a;
int  a[][][];
int[][]  []a;
int[][]  a[];
int[]   [][]a;
int[]  []a[];
int[]  a[][];
int    [][]a[];
int    []a[][];
========================================

int[] a,b;   a-1,b-1
int[] a[],b;  a-2,b-1
int[] []a,b;   a-2,b-2
int[] a,[]b;   ----> CE    [] before the variable is possible only with 1st variable.
=======================================

Array construction:
-->Every array in java is an object.

int[] a = new int[3];

                class name
int[] 		---> [I
int[][] 	---> [[I
double[]    ---> [D

int[][] x = new int[1][2];
System.out.println(x.getClass().getName());// o/p:  [[I

byte[] b = new byte[3]; ---> [B

boolean[]b= new boolean[4];---> [Z

String[] s = new String[3];---> [L java.lang.String;

Student[] s = new Student[10];---> [L Student;
================================================

Rules:
1.
	int[] x = new int[];//invalid
	int[] x = new int[5];//valid
	
2. 
	int[] x = new int[0];
	x[0]=10;-----------> RE as zero size array wont have any index. 0 index means size is
							atleast 1.
							
3.
	int[] x = new int[-3];---> RE
compiler will always check: syntax
							Types
							here the array size should be integer which is correct in this
							case, hence compilation is success.
							But at Runtime (-)ve memory cannot be assigned hence RE.
							
4. 
	int[] x = new int['a'];
the size expects int type hence we can give byte,short,char,int.							





 */
public class _05_Arrays_part1 {
	public static void main(String[] args) {
		
	}
}
