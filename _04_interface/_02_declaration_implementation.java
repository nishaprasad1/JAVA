package _04_interface;

public class _02_declaration_implementation {
/*
 * 1. whenever we are implementing an interface for each and every method of that
 * 		interface we have to provide implementation otherwise we have declare class
 * 		as abstract, then next level child class is responsible to provide implementation.
 * 2. every interface method is always public and abstract whether we are declaring or not
 * 		hence whenever we are implementing an interface method compulsory we should declare
 * 		 as public otherwise we will get compile time error.
 		eg:-
 		interface interf{
			void m1();
			void m2();
		}
		abstract class ServiceProvider implements interf{
			public void m1() {
			}
		}
		class SubServiceProvider extends ServiceProvider{
			public void m2() {
			}
		}
 */
}
