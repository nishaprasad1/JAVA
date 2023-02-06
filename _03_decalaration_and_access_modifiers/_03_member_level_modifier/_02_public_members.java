package _03_decalaration_and_access_modifiers._03_member_level_modifier;

public class _02_public_members {
/*
 * 1. if a member declared as public, we can access it from anywhere but coressponding
 * 		class should be visible ie, before checking member visibility we have to check
 * 		class visibility.
 -------------------------------------
 package pack1;
 class A{
	 public void m1(){
	 	System.out.println("A class m1");
	 }
 }
 
 package pack2;
 import pack1.A;
 class B{
	 public static void main(String ... ag){
	 	A a = new A();//CE: A is of default scope
	 	a.m1();
	 }
 }
 here even though m1() is public but we cannot access as A is not public, ie if
 both class n method are public then only we can access everywhere.
 */
}
