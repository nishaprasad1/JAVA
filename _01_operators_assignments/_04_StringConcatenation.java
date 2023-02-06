package _01_operators_assignments;

public class _04_StringConcatenation {
//string concatenation operator (+)
//	java does not support operator overloading except for
//	(+) which is arithmetic addition as well as string concatenation
	
	public static void main(String[] args) {
		
		String a= "durga";
		int b=10,c=20,d=30;
		
		//---> order of evaluation when all operator of same precedence
		System.out.println(a+b+c+d);
		
		System.out.println(b+c+d+a);
		
		System.out.println(b+c+a+d);
		
		System.out.println(b+a+c+d);
		
		System.out.println("****************************************");
		
//		1.
//		a = b + c + d; error:Type mismatch: cannot convert from int to String
		
//		2.
		a = a + b + c;
		
//		3.
//		b = a + c + d; error:Type mismatch: cannot convert from String to int
		
//		4.
		b = b + c + d;
		
	}

}
