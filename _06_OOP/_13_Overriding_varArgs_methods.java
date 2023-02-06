package _06_OOP;

public class _13_Overriding_varArgs_methods {
/*
 * 1. we can override var-arg method with other var-arg method only, if we are trying to 
 * 	override with normal method then it will become overloading but not overriding.
  			class P{
				void m(int... i) {
					System.out.println("parent");
				}
			}
			class C extends P{
				void m(int i) {
					System.out.println("child");
				}
			}
			class Test{
				public static void main(String[] args) {
					P p = new P();
					p.m(10);//parent
					
					C c = new C();
					c.m(10);//child
					
					P p1 = new C();
					p1.m(10);//parent
				}
			}
 in the above program if we replace cild method with var-arg method then it will
  become overriding. the o/p    parent
  								child
  								child
 */
	public static void main(String[] args) { }
}
