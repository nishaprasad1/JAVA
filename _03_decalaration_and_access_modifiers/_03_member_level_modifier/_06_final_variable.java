package _03_decalaration_and_access_modifiers._03_member_level_modifier;

public class _06_final_variable {
/**
 * 1. final instance variable:-If the value of variable is varied from object to object
 * 		such type of variables are called instance variables.
 * 		-- for every object a separate copy of instance variables will be created.
 * 		-- for instance variables we are required to perform initialization explicitly,
 * 			jvm wil always provide default values.
--------------------------------------------------------- 		
 		class Test{
			int x;
			public static void main(String[] args) {
				Test t = new Test();
				System.out.println(t.x);
			}
		}
----------------------------------------------------------	
	- if the instance variable declared as final then compulsorily we have to perform
		initialization explicitly, and jvm will not provide default values.
		eg:-
		class Test{
			final int x;//CE:The blank final field x may not have been initialized
		} 
	-rule: for final instance variable compulsory we should provide initialization
		before constructor completion.
		following are various places for initialization:-
		1)At the time of declaration:
		eg:- class Test{
				final int x=10;
			}
		2)Inside instance block:
		eg:- class Test{
				final int x;
				{
					x=10;
				}
			}
			
		3)inside constructor
		eg:- class Test{
				final int x;
				public Test(){
					x=10;
				}
			}
	--these are the only places to perform initialization for final instance variables
	  if we are trying to perform initialization anywhere else we will get compile time error.
	  	class Test{
			final int x;//CE:The blank final field x may not have been initialized
			void m() {
				x =10;//CE:The final field Test.x cannot be assigned
			}
		} 
 */
}
