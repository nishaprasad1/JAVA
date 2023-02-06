package _99_certification_11;
/*

Q. is valid or not?

int[5] x;----------> invalid
int[] []a,[]b;------> invalid

int[] x = new int[];---> invalid

int[] x = new int[0];-----> valid
int[] x = new int[-10];-----> invalid at Runtime

int[] x = new int['a'];-------> valid

int[] x = new int[ char or byte or short or int];

int[] x = new int[2147483647];----> max size of array can be 2147483647, ie max size of int.

double[] d = new double[10];
==============================================

multi dimensional arrays:
Arrays of Arrays/ jagged arrays

Q. which of the following are valid declarations in java?

1. int[] x = new int[];// invalid
2. int[][] x = new int[][];// invalid
3. int[][] x = new int[3][4];
4. int[][] x = new int[3][];
5. int[][] x = new int[][4];// invalid
6. int[][][] x = new int[2][3][4];
7. int[][][] x = new int[2][3][];
8. int[][][] x = new int[2][][];
9. int[][][] x = new int[2][][4];// invalid
================================================

Array initialization:

int[] x = new int[3];
=>System.out.println(x);
 ---> x.toString(), by default it will give className@hashcode_in_hexadecimal_string_form
 ie, [I@1829d
 
=>System.out.println(x[0]);// 0


int[][] x = new int[3][2];
=> System.out.println(x);// [[I@127352
=> System.out.println(x[0]);// [I@1231425
=> System.out.println(x[0][0]);// 0

int[][] x = new int[3][];
=> System.out.println(x);// [[I@127352
=> System.out.println(x[0]);// null
=> System.out.println(x[0][0]);// Null pointer exception
===========================================================

int[] x = new int[4];
x[0]=10;
x[1]=20;
x[2]=30;
x[3]=40;
x[4]=50;// ArrayIndexOutOfBoundException
x[-4]=200;



 */
public class _06_Arrays_part2 {

}
