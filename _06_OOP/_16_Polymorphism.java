package _06_OOP;

public class _16_Polymorphism {
/*
 * 1. one name but multiple forms is the concept of polymorphism.
 * 		eg:- a)method name is the same but we can apply for different types of
 * 			 arguments(method overloading).
 * 				abs(int);
 * 				abs(long);
 * 				abs(float);
 * 			b)method signature is same but in parent class one type of implementation
 * 				but in child class another type of implementation(overriding)
				 class P{
				 	void marry(){
				    	sopln("abcd");
				    }
				 }
				 class C extends P{
				 	void marry(){
				    	sopln("lmnop");
				    }
				 }
 		c) usage of parent reference to hold child object is concept of polymorphism
 			
 			List l =   new AL() / new LL() / new Stack() / new Vector()  
 
 *      d) parent class reference can be used to hold child object but by using that reference
 *      	we can call only the methods available in parent class and we cannot call
 *      	child specific methods. 				 
 				
 				p--> m1(){}                 
 			   /|\                       P p = new C();
 			    |                        p.m1();------->valid
 			    |                        p.m2();-------> CE
 				C--> m2(){}
 *          but by using child reference we can call both parent and child methods
 				C c = new C();
 				c.m1();------>valid
 				c.m2();------>valid
 * Q) when we should go for parent reference?
 * If we dont know exact type of runtime object then we should go for parent reference
 * eg:- the 1st element in ArrayList<?> may be of any type, hence the return type of get method
 * 		is object which can hold any object
 *      Object o = l.get(0);
 *
 *        C c = new C();                              P p = new C();
 * eg:   ArrayList l = new ArrayList();              List l = new Arraylist();
 *     
 *     1.we can use this approach if know         1. we can use this approach if don't
 *     	exact runtime type of object                 know the exact type of runtime object
 *     2.by using child reference we can          2. by using parent reference we can call 
 *     call both parent class and child              only methods available in parent class
 *     class methods(advantage).                      and we cannot call child specific methods.
 *     3. we can use child reference to           3. we can use parent reference to hold any 
 *       hold only particular child class            child class object,(advantage)
 *      object,(disadvantage)
 *
 *                               (security)
                          OOPS-------------------> ENCAPSULATION
                          /  \   
            			 /    \ 
                        /      \    (Reusability)
                       /        \-----------------------> INHERITANCE 
                      /
     (flexibility)   /
                    /              
                POLYMORPHISM
                
                fig: 3 pillars of OOPS
 *
 *<><><><><><><><><><><><><><><>
 *A boy starts love with word FRIENDSHIP,
 * but girl ends love with the same word
 * FRIENDSHIP. Word is the same but attitude
 * is different . This beautiful concept of
 * OOPS is nothing but polymorphism
 */  
}
