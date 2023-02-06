package _06_OOP;

public class _10_Overloading_loopholes {
/*
 * 1. Automatic promotion in overloading:
 * 		while resolving overloaded methods if exact macth method is not
 * 	available then we wont get CE immediately first it will promote the
 * 	argument to next level and check whether matched method available or not
 *  if match method is available then it will be considered, if the match method
 *  is not available then the compiler promotes the argument once again to next
 *  level this process will be continued until all possible promotions, still
 *  if the matched method is not available then we will get CE.
     
     (MIN)                                       (MAX)
	 	byte---> short --\ 
		 				int --> long --> float --> double
	               char--/
	    
--->case1)class Test{
			private void m1(int i) {
				System.out.println("int-arg");
			}
			private void m1(float f) {
				System.out.println("float-arg");		
			}
			public static void main(String[] args) {
				Test t = new Test();
				t.m1(10);----------> int-arg
				t.m1(10.5f);---------->float-arg
				t.m1('a');---------->int-arg
				t.m1(15l);--------->float-arg
				
		//		t.m1(10.5);//CE: The method m1(int) in the type Test 
				          //is not applicable for the arguments (double)
			}
		}

----> case2) compiler will always give precedence for child type argument when compared
 				with parent type argument;
			class Test{
				public void m1(String s) {
					System.out.println("String version");
				}
				public void m1(Object o) {
					System.out.println("Object version");
				}
				public static void main(String[] args) {
					Test t = new Test();
					t.m1(new Object());//---->Object version
					t.m1("apple");//---->String version
					t.m1(null);//--->String version
				}
			}

----> case3)
		class Test{
			public void m(String s) {
				System.out.println("String version");
			}
			
			public void m(StringBuffer s) {
				System.out.println("StringBuffer version");
			}
			
			public static void main(String[] args) {
				Test t = new Test();
				t.m("apple");//--->String version
				t.m(new StringBuffer("apple"));//--->StringBuffer version
		//		t.m(null);//CE: The method m(String) is ambiguous for the type Test
			}
		}

---> case4)
		class Test{
			public void m(int i, float f) {
				System.out.println("int-float version");
			}
			
			public void m(float f, int i) {
				System.out.println("float-int version");
			}
			
			public static void main(String[] args) {
				Test t = new Test();
				t.m(10, 10.5f);
				t.m(10.5f, 10);
		//		t.m(10, 10);//CE:The method m(int, float) is ambiguous for the type Test
				
		//		t.m(10.5f, 10.5f);//CE:The method m(float, int) in the type Test 
		                     	 //is not applicable for the arguments (float, float)
			}
		}
		
---> case5) In general var-arg method will get least priority, if not other method matched
			then only var-arg method will get chance. It is exactly same as default case
			inside switch.
					class Test{
						public void m(int i) {
							System.out.println("General method");
						}
						public void m(int... i) {
							System.out.println("var-arg method");
						}
						public static void main(String[] args) {
							Test t = new Test();
							t.m();//---------------->var-arg method
							t.m(10,20);//----------->var-arg method
							t.m(10);//-------------->General method
						}
					}
 *
 *---> case6)In overloading method resolution always take care by compiler based on
 *			reference type,In overloading run time object wont play any role.

 					class Animal{
						
					}
					class Monkey extends Animal{
						
					}
					class Test{
						public void m(Animal a) {
							System.out.println("Animal version");
						}
					
						public void m(Monkey m) {
							System.out.println("Monkey version");
						}
						public static void main(String[] args) {
							Test t = new Test();
					
							Animal a = new Animal();
							t.m(a);//--->Animal version
							
							Monkey m = new Monkey();
							t.m(m);//--->Monkey version
							
							Animal a1 = new Monkey();
							t.m(a1);//--->Animal version
						}
					}
 */
	public static void main(String[] args) {	}
}
