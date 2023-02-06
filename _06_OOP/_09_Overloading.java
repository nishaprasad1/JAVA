package _06_OOP;

public class _09_Overloading {
/*
 * 1. two methods are said to be overloaded if and only both methods having
 * 		same name but different argument types.
 * 
 * 2. in C language method overloading concept is not available hence we cannot declare
 *     but diffrent argumnet types, if there is change in argument type compulsory
 *     we should go for new method name which increases complexity of programming.
 *     abs(int);
 *     labs(long);
 *     fabs(float);
 *     
 *     but in java we can declare multiple methods with same name but different argument
 *     types such methods are called overloaded methods.
 *     abs(int);	
 *     abs(long);
 *     abs(float);
 *     having overloading concept in java reduces complexity of programming.
 *
 * 3. In overloading method resolution always take care by compiler based on reference type
 * 		hence overloading is also termed as compiletime polymorphism or static polymorphism
 * 			or early binding.
 		
 		class Test{
			public void m1() {
				System.out.println("no-arg");
			}
			public void m1(int i) {
				System.out.println("int-arg");
			}
			public void m1(double d) {
				System.out.println("double-arg");
			}
			public static void main(String[] args) {
				Test t = new Test();
				t.m1();//no-arg
				t.m1(10);//int-arg
				t.m1(10.d);//double-arg
			}
		}
		
 */
	public static void main(String[] args) {	}
}
