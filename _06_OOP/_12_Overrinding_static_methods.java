package _06_OOP;

public class _12_Overrinding_static_methods {
/*
 * 1. we cannot override a static method as non-static otherwise we will get CE.
 			class P{
				public static void m1() {
					
				}
			}
			class C extends P{
				public void m1() {//CE:This instance method cannot override 
			                     //the static method from P
				}
			}
 *
 * 2. similarly we cannot override a non-static method as static
 				
 				class P{
					public void m1() {
						
					}
				}
				class C extends P{
					public static void m1() {//CE:This static method cannot hide the instance method from P
						
					}
				}
 *
 * 3. if both parent and child class methods are static then we wont get any CE, it seems
 * 		overriding concept applicable for static method but it is method hiding.
 				
 				class P{
					public static void m1() {
						
					}
				}
				class C extends P{
					public static void m1() {
						
					}
				}
 *
 * 4. all rules of method hiding are exactly same as overriding except the following:
 		
 		method hiding                          method overriding
 	a)both parent and child methods            a) both parent and child methods
       should be static.                           should be non-static.
    b)compiler is responsible for 			   b) jvm is always responsible for
      method resolution based on				 method resolution based on 
      reference type.							 runtime object.
    c) also known as static polymorphism       c) also known as runtime polymorphism
    	or compile time polymorphism               or dynamic polymorphism
    	or early binding.						   or late binding.

 			class P{
				public static void m1() {
					System.out.println("Parent");
				}
			}
			class C extends P{
				public static void m1() {
					System.out.println("child");
				}
			}
			class Test{
				public static void main(String[] args) {
					P p = new P();
					p.m1();//Parent
					
					C c = new C();
					c.m1();//child
					
					P p1 = new C();
					p1.m1();//Parent
				}
			}
 *
 */
	public static void main(String[] args) {	}
}
/*
class P{
	static void m() {
		
	}
}
class C extends P{
	static int m(int i) {
		return 1;
	}
}*/