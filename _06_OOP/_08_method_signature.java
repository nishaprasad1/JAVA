package _06_OOP;

public class _08_method_signature {
/*
 * 1. In java method signature consists of method name followed by argument types.
           public static m1(float f, int i){
           
           }
           
        ===> m1(float,int)
        
 * 2. return type is not part of method signature.
 * 
 * 3. Compiler will use method signature to resolve method calls
    												
    												_____Class Test________
      class Test{                                  |                       |
      		public void m1(int i){                 |    m1(int)            |
      		                                       |    m2(String)         |
      		}                                      |                       |
      		public void m2(String s){              |_______________________|
      		                                           method table
      		}                                      
      }
      
      Test t = new Test();
      t.m1(10);-----------> valid
      t.m2("durga");------> valid
      t.m3(10.5);---------> CE
 *
 * 4. within a class two methods with same signature not allowed
			class Test{
				public void m1(int i) {---> CE:Duplicate method m1(int) in type Test
					
				}
				public int m1(int x) {----> CE:Duplicate method m1(int) in type Test
					
				}
			}
 */
}