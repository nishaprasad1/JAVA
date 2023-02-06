package _03_decalaration_and_access_modifiers._02_class_level_modifier;

public class _04_strictfp_class {
/*
 * 1.strict floating point(1.2V)
 * 2.we can use stricfp for classes and methods but not for variables.
 * 3. usually the result of floating point arithmetic is varied from platform to platform
 * 		if we want platform independent arithmetic result then we can go for strictfp.
 * 4. strictfp method:-if a method declared as strictfp all floating point calculation has
 * 						to IEEE 754 standards so that we will get platform independent results.
 *   				  -abstract modifier never talks about implementation whereas strictfp method
 *   					always talks about implementation hence abstract strictfp is illegal
 *   					for methods.
 * 5. strictfp class:-if a class declared as strictfp then every floating point calculation
 * 						present in every concrete method has to follow ieee 754 standards so that
 * 						we get platform independent results.
 * 					-we can declare abstract strictfp combination for classes,
 * 					 ie abstract strictfp combination is legal for classes but illegal for methods.
  				eg:-
  				abstract strictfp class A{-->valid
				}
				
				abstract strictfp class A{
					abstract strictfp public void m();--> illegal combination of modifier	
				}
 */
	public static void main(String[] args) {
		myDiv();
		myDiv1();
	}

	private static void myDiv() {
		System.out.println(10/3.0d);	
	}
	strictfp private static void myDiv1() {
		System.out.println(10/3.0d);	
	}
	
}