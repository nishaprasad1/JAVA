package _06_OOP;

public class _05_Is_A_relationship {
/*
 * 1. it is also known as inheritance.
 * 2. the main advantage is code reusability.
 * 3. by using extends keyword we can implement Is-A relationship.
 * 4. whatever methods parent has by default available to child and hence on child reference
 * 		we can call both parent and child methods
 * 5. whatever method child has by default not available to the parent and hence on parent 
 * 		reference we cannot call child specific methods.
 * 6. Parent reference can be used to hold child reference but using that reference we
 * 		cannot call child specific methods, but we can call methods present in parent
 * 		class.
 * 7. Parent reference can be used to hold child object, but child reference cannot be
 * 		used to hold parent object.
 		class P{
			public void m1() {
				System.out.println("Parent");
			}	
		}
		class C extends P{
			public void m2() {
				System.out.println("Child");
			}	
		}
		class Test{
			public static void main(String[] args) {
				//1.
				P p = new P();
				p.m1();
		//		p.m2();//CE:The method m2() is undefined for the type P
				
				//2.
				C c = new C();
				c.m1();
				c.m2();
				
				//3.*****
				P p1 = new C();
				p1.m1();
		//		p1.m2();//CE:The method m2() is undefined for the type P
				
		//		C c1 = new P();//CE:Type mismatch: cannot convert from P to C
			}
		}
---------- 	
 * 8. the most common methods which are applicable for any type of child, we have to define
 * 		in parent class, the specific methods which are applicable for a particular child
 * 		we have to define in child class.
 * 
 * 9. total java API is implemented based on inheritance concept, the most common methods
 * 		which are applicable for any java object are defined in object class and hence
 * 		every class in java is child class of object either directly or indirectly so
 * 		that object class methods by default available to every java class without re-writing
 * 		due to this object class act as root for all java classes.
 * ---> throwable class defines the most common methods which are required by every exception
 * 		and error classes hence this class act as root for java exception hierarchy. 
 *                         
                           Object(11 methods)
  		 |--------|--------------|---------------------|
         |        |									   |
        \|/		 \|/                                  \|/	
       String   StringBuffer                       Throwable
 					                                 /    \
 					                                /      \
 					                               /        \
 					                              /          \
 					                         Exception      Error
 					                           /|\           /|\ 
------------------
 * 10. Multiple Inheritance: A java class cannot extends more than one class at a time,
 * 		hence java won't provide for multiple inheritance in classes.

 			class A extends B,C{
			XXXXXX-----> CE	
			}
			
 * 11. if our class doestn't extend any other class then only our class is direct child
 * 		class of Object class.
 											 Object
 				class A{                       /|\
											    |
				}                               |
                                                A   
 * 12. if our class extends any other class then our class is indirect child of Object
 * 		class.                                
 										     Object<---|
		 		class A extends B{                     |
					                                   B<----|
				}                                            |
                                                             A
 *													(multilevel inheritance)
 * 13. java will not support multiple inheritance directly on indirectly.
 * 
 * 14. why java doesn't provide support for multiple inheritance?
 * Answer: there may be chance of ambiguity problem hence java won't provide support
 * 			for multiple inheritance.
 			
 		       P1--> m1(){}        P2--> m1(){}
 				   \              /
 					\	         /
 			         \          /
 			          \        /
 			           \      /
 			            \    /
 			             \  /
 			              \/
 			              C
 			              then C.m1() will be ambiguous
 * 15. but interface can extend any number of interface simultaneously hence java provides
 *     support for multiple inheritance with respect to interfaces
  						interface A{
							
						}
						interface B{
							
						}
						interface C extends A,B{
							
						}
 ---> why this ambiguity not there for interface?
 			   PI1--> m1();        PI2--> m1();
 				   \              /
 					\	         /
 			         \          /
 			          \        /
 			           \      /
 			            \    /
 			             \  /
 			              \/
 			              CI--> m1();
 			               |
 			               |
 			              Implementaion class--> m1(){}
 * even though multiple method declarations are available but implemenation is unique and
 * hence there is no chance of ambiguity problem in interfaces.
 * Note:- Strictly speaking through interfaces we won't get any inheritance
 * 
 * 16. Cyclic inheritance is not allowed in java as its not required.
 	eg:-
 	a)
 	class A extends A{ //CE:Cycle detected: the type A cannot extend/implement itself 
					  //	or one of its own member types.
	}
	
	b)
	class A extends B{
		
	}
	class B extends A{//CE:Cycle detected: a cycle exists in the type hierarchy between B and A
		
	}
 */
	public static void main(String[] args) {}
}
