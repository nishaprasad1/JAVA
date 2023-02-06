package _06_OOP;

public class _19_Object_typecasting {
/*
 * 1. we can use parent reference parent reference to hold child object,
 * 		eg:-
 * 			Object o = new String("durga");
 * 
 * 2. we can use interface reference to hold implemented class object
 *  	eg:-
 *  		Runnable r = new Thread();
 *  
 *******************************************************        
		          +----------------+         A,C : class/interface name
		 		  |	A b = (C) d;   |         b,d : name of reference variable
		          +----------------+           
 *
 * Rule 1) compile time checking (i)
 * 				type of 'd' and 'C' must have some relation either child to parent or
 * 				 parent to child or same type, otherwise we will get CE saying inconvertible
 * 				 types found 'd' type required 'C'
 * 			eg:- 
					 class Test{
						public static void main(String[] args) {
							Object o = new String("apple");
							StringBuffer sb = (StringBuffer) o;---->valid(as StringBuffer is child of Object class).
					
							String s = new String("apple");
					//		StringBuffer sb1 = (StringBuffer) s;//CE: Cannot cast from String to StringBuffer
						}
					}  
 *
 * Rule 2) compile time checking (ii)
 * 				'C' must be either same or derived type of 'A' otherwise we will get compile time error
 * 					saying incompatible type, found 'C' required 'A'
 			eg:-
 					class Test{
						public static void main(String[] args) {
							Object o = new String("apple");
							StringBuffer sb = (StringBuffer) o;
					
					//		StringBuffer sb2 = (String) o;//CE:Type mismatch: cannot convert from String to StringBuffer
						}
					}
 
 * Rule 3) run time checking (i)
 * 			runtime object of 'd' must be either same or derived type 'C' otherwise we will get runtime exception saying
 * 			ClassCastException
 				eg:-
 					class Test{
						public static void main(String[] args) {
							Object o = new String("apple");
							StringBuffer sb = (StringBuffer) o;//RE:
							//Exception in thread "main" java.lang.ClassCastException:
							   class java.lang.String cannot be cast to class java.lang.StringBuffer 
							   (java.lang.String and java.lang.StringBuffer are in module java.base of loader 'bootstrap')
								at _06_OOP.Test.main(_19_Object_typecasting.java:56)
							
							Object o1= new String("car");
							Object o2= (String) o1;
						}
					}
----------
										Object
										/    \
									   /      \
                                      /        \
                                     /          \
                                    /            \
                                  Base1        Base2  
                                   /\            /\
                                  /  \          /  \ 
                                 /    \       Der3  \      
                                /      \             \
                             Der1     Der2           Der4 
  		
  		Base2 b = new Der4();
  		a)Object o = (Base2) b;-->valid
  		b)Object o = (Base1) b;-->invalid
  		c)Object o = (Der3) b;-->invalid
  		d)Base2 b1 = (Base1) b; -->invalid
  		e)Base1 b1 = (Der4) b;-->invalid
  		e)Base1 b1 = (Der1) b;-->invalid
 *-------------
 * 3. strictly speaking through type casting we are not creating any new object, for the
 * 		existing object we are providing another type of reference variable, ie we
 * 		are performing type casting but not object casting.
 * 		eg:a)
 *         String s = new String("apple");
 *         Object o = (Object)s;
 *      eg:b)
 *      	Integer i= new Integer(10);
 *      	Number  n= (Number) i;
 *      	Object o=(Object) n;
							class Test{
								public static void main(String[] args) {
									Integer i= new Integer(10);
									Number  n= (Number) i;
									Object o=(Object) n;
									System.out.println(i==n);//true
									System.out.println(o==n);//true
								}
							}
 *-------------------------
           
		Note:  A<---------B<------------C
		
		C c = new C();
			(B)c    ======> B b = new C();
		(A)((B)c)   ======> A a = new C();
 *
  eg:- (i)
 
 		P---> m1(){}                 
       /|\                       C c = new C();
        |                          c.m1();----------->valid
        |                          c.m2();----------->valid
        |                          ((P) c).m1();----------->valid
        C---> m2(){}               ((P) c).m2();----------->valid (parent reference can be used to hold child object but
        															by using that reference we cannot call child specific
        															methods and we can call methods only in parent class).
---------------------------------------------       
       (ii)
       
        A---->      m1(){ 
       /|\         	 sopln("A");
        |           }
        |
        |
        |
        B---->      m1(){                      C c = new C(); 
       /|\         	 sopln("B");               c.m1();---------------> C
        |           }                          ((B) c).m1();---------> C
        |                                      ((A)((B) C)).m1();----> C 
        |										
        |													Note: it is overriding and method resolution always based
        C---->      m1(){                                         on runtime object.
                	 sopln("C");
                    }															
-----------------------------------------------
       (iii)
       
        A----> static m1(){ 
       /|\         	   sopln("A");
        |             }
        |
        |
        |
        B----> static m1(){                        C c = new C(); 
       /|\         	   sopln("B");                 c.m1();---------------> C
        |             }                            ((B) c).m1();---------> B
        |                                          ((A)((B) C)).m1();----> A 
        |										
        |													Note: it is method hiding and method resolution always based
        C----> static m1(){                                         on reference type.
                	   sopln("C");
                      }
                      															
-----------------------------------------------
       (iv)
       
        A----> int x = 777; 
       /|\     
        |      
        |
        |
        |
        B----> int x = 888;                          C c = new C(); 
       /|\         	           		                 c.x----------------> 999
        |                                            ((B) c).x;---------> 888
        |                                            ((A)((B) C))x;-----> 777
        |										
        |													Note: variable resolution always based
        C----> int x =999;                                         on reference type and not on runtime object.
                	   
 */
	public static void main(String[] args) {}
}
