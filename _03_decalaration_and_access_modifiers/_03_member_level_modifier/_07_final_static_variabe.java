package _03_decalaration_and_access_modifiers._03_member_level_modifier;

public class _07_final_static_variabe {
/**
 * 1. static:- if the value of the variable is not varied from object to object such
 * 				type of variables not recommended to declare as instance variables. we have to
 * 				declare those variable at class level by using static modifier
 * 			--in the case of instance variable for every object a separate copy will be created
 * 				but in the case of static variable a single copy is created at class and shared 
 * 				by every object of that class.
 * 			-- for static variables it is not required to perform initialization explicitly,
 * 				jvm will always provide default values.
    			class Test{
					static int x;
					public static void main(String[] args) {
						System.out.println(x);
					}
				}
			--if static variable declared as final then compulsory we should provide initialization
				explicitly otherwise we will CE, and jvm wont provide any default value.
				class Test{
					final static int x;//CE:The blank final field x may not have been initialized
				}
			-- rule: for final static variables compulsory we should provide initialization class
					loading completion
					following are various places for this:
					 1)At the time of declaration
					 class Test{
							final static int x =10;
					 }
					 
					 2)Inside static block
					 class Test{
						final static int x;
						static {
							x = 10;
						}
					 }
					 
 */
}