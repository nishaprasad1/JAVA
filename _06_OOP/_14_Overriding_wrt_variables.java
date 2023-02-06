package _06_OOP;

public class _14_Overriding_wrt_variables {
/*
 *  1. variable resolution always takes care by compiler based on reference type 
 *  	irrespective of whether the variable is static or non-static(overriding concept
 *      applicable for methods but not variables). 
 */
	public static void main(String[] args) {	}
}
class P_{
	int x = 888;
}
class C_ extends P_{
	int x = 999;
}
class Test_{
	public static void main(String[] args) {
		P_ p = new P_();
		System.out.println(p.x);//888
		
		C_ c = new C_();
		System.out.println(c.x);//999
		
		P_ p1 = new C_();
		System.out.println(p1.x);//888
	}
}