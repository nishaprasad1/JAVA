package _04_interface;

public class _06_interface_naming_conflicts {
/*
 * <============>1. METHOD NAMING CONFLICTS:<===================>
 * 		case 1: if two interfaces contains a method with same signature and same return type
 * 				then in the implementation class we have to provide implementation for only
 * 				one method.
 *					interface Left{
						void m1();
					}
					interface Right{
						void m1();
					}
					class Test implements Left,Right{
						public void m1() {
							
						}
					}		
 *		case 2: if two interfaces contain a method with same name but different argument types then
 *					in the implementation class we have to provide implementation for both the methods
 *					and these methods act as overloaded methods.
   					
   					interface Left{
						void m1();
					}
					interface Right{
						void m1(int i);
					}
					class Test implements Left,Right{
						public void m1() {----------------------|
																|
						}										|-----> overloaded methods
																|
						public void m1(int i) {-----------------|
							
						}
					}
 *
 *      case 3: if two interfaces contains a method with same signature but different return types(not covariant) 
 *      			then it is impossible to implement both interface simultaneously.
 					interface Left{
						void m1();
					}
					interface Right{
						int m1(int i);
					}
 *  			--- we cannot write any java class which implements both interface simultaneously.
 *  
 *  Question> is a java class implement any number of interface simultaneously?
 *  Answer: Yes, except a particular case, if two interface contains a method with same signature but 
 *  			different return types.
 *
 *<============> 2. VARIABLE NAMING CONFLICTS:<===================>
 *		case 1: two interfaces can contain a variable with the same name and there may be chance
 *					of variable naming conflicts but we can solve this problem using interface 
 *					names.
 						interface Left{
							int x =777;
						}
						interface Right{
							int x =888;
						}
						class Test implements Left,Right{
							public static void main(String[] args) {
						//		System.out.println(x);//CE:The field x is ambiguous
								System.out.println(Left.x);  777
								System.out.println(Right.x); 888
							}
						}
 *
 */
}
