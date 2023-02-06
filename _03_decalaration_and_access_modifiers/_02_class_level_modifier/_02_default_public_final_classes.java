package _03_decalaration_and_access_modifiers._02_class_level_modifier;

public class _02_default_public_final_classes {
/**
 * 1. if a class declared as public then we can access it from anywhere
 * 
 * ***************
   package pack1;
   class A{
  
   }
   ****************
   package pack2;
   import pack1.A;
   class B{
 	psvm(){
 		A a = new A();// error: pack1.A is not public in pack1
 	}
   }
   *******************
 * 2. if a class declared as default then we can access that class only in current package,
 * 	  from outside package we cannot access,
 * 	  default access is also known as package level access.
 * ****************************************************************************************
 * 3. final is a modifier applicable for classes,methods, variables.
 * 		a)final method: whatever method parent have by default available to child through
 * 			inheritance, if the child not satisfied with parent method implementation then 
 * 			child is allowed redefined to that method, this is called process is called overriding
 * 		-if the parent class method is declared as final then we cant't override in child class
 * 			because its implementation is final in parent class.
  			class A{
				public final void m() {
				}
			}
			class B extends A{
				public void m() {// error:Cannot override the final method from A
				}
			}  
 *		
 *		b)final class:if a declared as final, we cant extend functionality that class ie we can't
 *			create child class for that class hence inheritance is not possible for final classes
 			
 			final class A{
			}
			class B extends A{
				// error:The type B cannot subclass the final class A
			}
		-every method present inside final class is final by default, but every variable present
			in final class need not be final.
		-the advantage of final keyword is we can achieve security and we can provide unique implementation
			but the disadvantage is we are missing key features such as inheritance(final class),
			polymorphism(final methods) hence if there is no specific requirement then it is not recommended
			to use final keyword. 
		
 */
}

