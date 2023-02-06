package _04_interface;

public class _08_adapter_classes {
/*
 * 1. adapter class is simple java class that implements an interface 
 * 		with only empty implementation
 		eg:-
 		interface Interf{
			void m1();
			void m2();
			void m3();
			void m4();
			void m5();
			void m6();
			void m7();
			void m8();
			void m9();
			void m10();
		}
		abstract class AdapterX implements Interf{
			public void m1() {	}
			public void m2() {	}
			public void m3() {	}
			public void m4() {	}
			public void m5() {	}
			public void m6() {	}
			public void m7() {	}
			public void m8() {	}
			public void m9() {	}
			public void m10() {	}
		}
 --- if we implement interface for each and every method of that interface 
 		compulsory we should provide implementation whether it is required or not.
 		eg:-
 		class MyImpli implements Interf{
			public void m3() {	
				System.out.println("My requirement is only this");
			}
			//-----Below is not required but mandatory to implement------ //
			public void m1() {	}
			public void m2() {	}
			public void m4() {	}
			public void m5() {	}
			public void m6() {	}
			public void m7() {	}
			public void m8() {	}
			public void m9() {	}
			public void m10() {	}
		}
 	--> the problem in this approach is it increases the length of the code and
 	 		reduces readability, we can solve this problem using adapter classes.
 	--> instead of implementing interface if we extend adapter class we have to 
 	 		provide implementation only for required methods and we are not responsible
 	 		to provide implementation for each and every method of the interface so
 	 		that length of the code will be reduced.
 	 		eg:-
 	 		interface Interf{
				void m1();
				void m2();
				void m3();
				void m4();
				void m5();
				void m6();
				void m7();
				void m8();
				void m9();
				void m10();
			}
			abstract class AdapterX implements Interf{
				public void m1() {	}
				public void m2() {	}
				public void m3() {	}
				public void m4() {	}
				public void m5() {	}
				public void m6() {	}
				public void m7() {	}
				public void m8() {	}
				public void m9() {	}
				public void m10() {	}
			}
			class Test extends AdapterX{
				public void m3() {
					System.out.println("My m3 implementation");
				}
			}
			class Sample extends AdapterX{
				public void m7() {
					System.out.println("My m7 implementation");
				}
			}
			class Demo extends AdapterX{
				public void m10() {
					System.out.println("My m10 implementation");
				}
			}
------
eg:- we can develop a servlet in the following 3 ways
1) By implementing Servlet(I)
2) By extending GenericServlet(AC)
3) By extending HttpServlet(AC)
if we implement Servlet interface for each and every method of the interface we should
provide implementation, it increases length of the code and reduces readability.
  			instead of implementing Servlet interface directly if we extend generic servlet
  			we have to provide implementation only for service method and for all remaining
  			methods we are not required to provide implementation, hence more or less generic
  			servlet acts as adapter class for servlet interface.
  			
 *
 * 2. Marker interface and adapter classes simplifies complexity of programming and these
 * 		best utilities to the programmer, and programmers life will become simple
 */
}
interface Interf{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	void m6();
	void m7();
	void m8();
	void m9();
	void m10();
}
abstract class AdapterX implements Interf{
	public void m1() {	}
	public void m2() {	}
	public void m3() {	}
	public void m4() {	}
	public void m5() {	}
	public void m6() {	}
	public void m7() {	}
	public void m8() {	}
	public void m9() {	}
	public void m10() {	}
}
class Test extends AdapterX{
	public void m3() {
		System.out.println("My m3 implementation");
	}
}
class Sample extends AdapterX{
	public void m7() {
		System.out.println("My m7 implementation");
	}
}
class Demo extends AdapterX{
	public void m10() {
		System.out.println("My m10 implementation");
	}
}
class MyImpli implements Interf{
	public void m3() {	
		System.out.println("My requirement is only this");
	}
	//-----Below is not required but mandatory to implement------ //
	public void m1() {	}
	public void m2() {	}
	public void m4() {	}
	public void m5() {	}
	public void m6() {	}
	public void m7() {	}
	public void m8() {	}
	public void m9() {	}
	public void m10() {	}
}