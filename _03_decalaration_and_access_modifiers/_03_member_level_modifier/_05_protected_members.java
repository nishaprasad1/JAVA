package _03_decalaration_and_access_modifiers._03_member_level_modifier;

public class _05_protected_members {
/**
 * 1. if a member declared as protected then we can access that member anywhere within
 * 		the current package and other than that only in child classes.
 * 		protected = <default> + kids
 * 2. we can access protected members within the current package anywhere using either by
 * 		using parent reference or by using child reference but we can access protected
 * 		members in outside package only in child classes and we should use child reference only
 * 		ie, parent reference cannot be used to access protected members outside package.   
 * 		
 * ---------------------in same package---------------------------
 package pack1;
 public class A{
	 public void m1(){
	 	System.out.print("the most miss understood modifier");
	 }
 }
 public class B extends A{
 	psvm(){
 		A a = new A();
 		a.m1();--------------->valid;
 		
 		B b = new B();
 		b.m1();--------------->valid;
 		
 		A a1 = new B();
 		a1.m1();--------------->valid;
 	}
 }
----------------------------outside current package--------------------------------------
package pack1;
public class A {
	protected void m() {
		System.out.println("The most misunderstood modifier");
	}
}
===
package pack2;
import pack1.A;
public class B extends A{
	public static void main(String[] args) {
//		A a = new A();
//		a.m();//error:The method m() from the type A is not visible
		
		B b = new B();
		b.m();
		
//		A a1 = new A();
//		a1.m();//error:The method m() from the type A is not visible
		
	}
}
---------------------------------------------------------------------
 * 3. we can access protected members form outside package only in child classes, and we should
 * 		that child class only.
 * 		for eg:- from child C class if we want to access protected member then we should use
 * 					C class reference only.
---------------------------------------------------------------------------------
package pack1;
public class A {
	protected void m() {
		System.out.println("The most misunderstood modifier");
	}
}
====
package pack2;
import pack1.A;
public class B extends A{
	
}
class C extends B{
	public static void main(String[] args) {
//		A a = new A();
//		a.m();//error:The method m() from the type A is not visible
		
//		B b = new B();
//		b.m();//error:The method m() from the type A is not visible
		
		C c = new C();
		c.m();
		
//		A a1 = new B();
//		a1.m();//error:The method m() from the type A is not visible
		
//		B b1 = new C();
//		b1.m();//error:The method m() from the type A is not visible
		
//		A a2 = new C();
//		a2.m();//error:The method m() from the type A is not visible
		
	}
}
------------------------------------------------------------------------------
4. the most restricted access modifier is private, the most accessible modifier is public.
  		private < default < protected < public
  	- recommended modifier for data member(variable) is private,but recommended modifier for method
  		is public.
  	
 */
}
class Ck{
	protected void m() {
		
	}
}
class Dj extends Ck{
	public static void main(String[] args) {
		Ck c = new Ck();
		c.m();
		Dj d = new Dj();
		d.m();
		Ck c1 = new Dj();
		c.m();
	}
}