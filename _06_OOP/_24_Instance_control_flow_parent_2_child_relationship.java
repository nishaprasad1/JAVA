package _06_OOP;

public class _24_Instance_control_flow_parent_2_child_relationship {
/*
 * 1. whenever we are creating child class object the following sequence of event will
 * 		be performed automatically as a part of instance control flow:
 * refer: ./ss_04_instance_control_flow_parent_2_child.png
 * 		a)Identification of instance member form parent to child. [4 to 14]
 * 		b) Execution of instance variable assignments and instance block only in
 * 			parent class. [15 to 19]
 * 		c)Execution of parent constructor. [20]
 * 		d) Execution of instance variable assignments and instance block in
 * 			child class. [21 to 26]
 * 		e)execution of child constructor. [27]

 	
			 	class Parent{
				int i =10;
				{
					m1();
					System.out.println("parent first instance block");
				}
				Parent(){
					System.out.println("consturctor");
				}
				public static void main(String[] args) {
					Parent p = new Parent();
					System.out.println("parent main");
				}
				public void m1() {
					System.out.println("j: "+j);
				}
				int j =20;
			}
			class Child extends Parent{
				int x =100;
				{
					m2();
					System.out.println("child first instance block");
				}
				Child(){
					System.out.println("child consturctor");
				}
				public static void main(String[] args) {
					Child c = new Child();
					System.out.println("child main");
				}
				public void m2() {
					System.out.println("y: "+y);
				}
				{
					System.out.println("child second instance block");
				}
				int y =200;
			}
			
			o/p:
			j: 0
			parent first instance block
			consturctor
			y: 0
			child first instance block
			child second instance block
			child consturctor
			child main

 */
	public static void main(String[] args) {}
}
