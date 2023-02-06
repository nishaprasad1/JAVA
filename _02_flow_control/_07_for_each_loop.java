package _02_flow_control;

public class _07_for_each_loop {
/*
 * 1.Enhanced for loop(1.5V)
 * 2.Specially designed for arrays and collections
 * 3.Best choice to retrieve elements of arrays/collections but is applicable
 *   for arrays and collection and it is not general purpose loop.
 * 4.By using normal 'for' loop we can iterate in forward/reverse order but 
 * 		in enhanced for loop only forward iteration is possible
 * 5. for(eachitem x : target){
 		
 	  }
 	  
 	  target can be array/collection 
 	  target element should be Iterable object
 	  an object is said to be iterable object only if corresponding class implements
 	   java.lang.Iterable interface, (1.5V) and contains only one method iterator()
 	   public Iterator iterator() 
 	  
 */
	public static void main(String[] args) {
		case1();
		case2();
		case3();
	}

	private static void case1() {
		System.out.println("_07_for_each_loop.case1()");
		int[] a= {1,2,3,4,5};
		//normal for loop
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		//enhanced for loop
		for(int x : a)
			System.out.print(x+" ");
		System.out.println();
	}
	private static void case2() {
		System.out.println("_07_for_each_loop.case2()");
		int[][] a= {{10,20,30},{5,15}};
		//normal for loop
		for(int i=0;i< a.length; i++)
			for(int j=0; j< a[i].length;j++)
				System.out.print(a[i][j]+" ");
		System.out.println();
		//enhanced for loop
		for(int[] x : a)
			for(int i : x)
			System.out.print(i+" ");
		System.out.println();
	}
	
	private static void case3() {
		System.out.println("_07_for_each_loop.case3()");
		int[][][] a= { 
							{
								{1,2,3},{-1,-2,-3}
							},
							{
								{4,5,6},{-4,-5,-6}
							}
					};
		//enhanced for loop
		for(int[][] x : a)
			for(int[] i : x)
				for(int j : i)
				System.out.print(j+" ");
		System.out.println();
	}
}
