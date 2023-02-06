package _06_OOP;

public class _11_Overriding {
/*
 * 1.Overriding: whatever methods parent has by default available to child through
 * 					inheritance, if child class not satified with parent class
 * 					implementation then child is allowed to redefined that method
 * 					based on requirement, this is called overriding.
 * 					the parent method which is overriden is call overridden method and
 * 					the child class method which is overriding is called overriding method.
 				eg:-
 				class P{
					public void property() {
						System.out.println("cash,land,gold");
					}
					public void marriage() {
						System.out.println("subha lakshmi");
					}
				}
				class C extends P{
					public void marriage() {
						System.out.println("katrina/dipika/yami");
					}
				}
 *
 * 2. In overriding method resolution always takes by jvm based on runtime
 * 		object and hence overriding is also called as runtime polymorphism or
 * 			dynamic polymorphism or late binding.
 					class P{
						public void property() {
							System.out.println("cash,land,gold");
						}
						public void marriage() {
							System.out.println("subha lakshmi");
						}
					}
					class C extends P{
						public void marriage() {
							System.out.println("katrina/dipika/yami");
						}
					}
					class Test{
						public static void main(String[] args) {
							P p = new P();
							p.marriage();//-->subha lakshmi
							
							C c = new C();
							c.marriage();//-->katrina/dipika/yami
							
							P p1 = new C();
							p1.marriage();//-->katrina/dipika/yami
						}
					}
 
 *
 * 2. Rules for overriding:
 * 		a) in overriding method names and argument types must be matched, 
 * 			method signaturs must be same.
 * 		b) in overriding the return types must be same but this is applicable 
 * 			until 1.4V only, from 1.5V we can take co-variant return types
 * 			according to this child class retun type need not be same as parent
 * 			class return type, child class can have child type as return type.
  				eg:-
  				class P{
					public Object m() {
						return null;
					}
				}
				class C extends P{
					public String m() {---> invalid in 1.4V but valid from 1.5V
						return null;
					}
				}
				
                    <-----------Co-variant types----------->
parent class method        (Valid)           (Valid)          (InValid)     (Invalid)
return type                Object            Number             String        double
                             |					|  				  |				|
			                 |					|				  |             |
                             |					|                 |             |
child class method           |					|                 |             |
return type             Object/String/		 Number/Integer     Object         int
					    StringBuffer...        Float..

---> Covariant return type concept is applicable only for Object types but not for
	primitive types.
	 
	   c) Parent class private methods not availble to child and hence overriding
	    concept not applicable for private methods.
	    based on our requirement we can define exactly same private method in child
	    class, it is valid but not overriding.
	    
					     class P{
							private void m1() {
						
							}
						}
						class C extends P{
							private void m1() {---> not overriding
								
							}
						}
 *   
 *     d) we cannot override parent class final methods in child classes, it we are trying
 *     		to override we will get CE.
		 				class P{
							final public void m1() {
						
							}
						}
						class C extends P{
						//	public void m1() {//CE:Cannot override the final method from P
						//		
						//	}
						}
 *    
 *     e)we should override parent class abstract methods in child class to provide 
 *     		implementation.
	 					
	 					abstract class P{
							 public abstract void m1(); 
						
						}
						class C extends P{
							public void m1() {
								
							}
						}
 *
 *    f) we can override non abstract method as abstract.The main advantage of
 *    	this approach is we can stop the availability of parent method implementation
 *    	to the next level child classes.
		 
		     		class P{
						 public void m1() {
							 
						 }
					}
					abstract class C extends P{
						public abstract void m1(); 
					}
 *
 *    g) In overriding the following modifiers wont keep any restriction.
 *    		synchronized,native,strictfp

                  (Invalid)         (valid)       (valid)      (valid)
 parent method
 modifier         final             non-final    abstract     synchronized(same for native/strictfp)
                     |             		|          |  /|\        /|\    |
                     |					|          |   | 		  |     |
 child method        |					|         \|/  |          |    \|/
 modifier         final/non final      final   non-abstract   non-synchronized
 					
 
 *
 *    h) while overriding we cannot reduce scope of access modifier but we can increase
 *    		the scope. The reason is for P p = new C(); let say m() in parent is public
 *    		and we have overriden m() and declared it as default(narrowing the scope)
 *    		now at runtime m() will be called from C(child class) but as we have reduced the
 *    		scope only allowed to call from same package only.
 			eg:-
 				class P{
					public void m() {
						
					}
				}
				class C extends P{
				//	void m() {//CE:Cannot reduce the visibility of the inherited method from P
				//		
				//	}
				}
*             ____________________________________________ 
             |     private < default < protected < public |
             +____________________________________________+ 
 parent class
 method              public    protected           <default>          private
 					   |		  |                   |                 |
 					   |          |                   |                 |
 child class		   |	      |                   |                 |
 method              public     protected/public    <default>/      overriding concept 
  													protected/       not valid for
  													public			private parent method
  													                    	
 *
 *     i) if child class method throws any checked exception then compulsory parent class
 *     		method should throw the same checked exception or its parent exception otherwise
 *     		we will get error but there are no restrictions for unchecked exceptions.
 			
 			class P{
				public void m() throws IOException{
					
				}
			}
			class C extends P{
			//	public void m()
			//			throws IOException,InterruptedException{//CE:Exception InterruptedException 
			//		                                           //is not compatible with throws clause in P.m()
			//		
			//	}
			}
 ---
class P{--------->valid
	void m() throws Exception {
		
	}
}
class C extends P{
	void m() {
		
	}
}
---
class P{----> invalid
	void m() {
		
	}
}
class C extends P{
	void m() throws Exception {
		
	}
}
---
class P{
	void m() throws Exception {
		
	}
}
class C extends P{
	void m() throws IOException{
		
	}
}
---
class P{---> invalid
	void m() throws IOException {
		
	}
}
class C extends P{
	void m() throws Exception{
		
	}
}
---
class P{--->valid
	void m() throws IOException {
		
	}
}
class C extends P{
	void m() throws FileNotFoundException,EndOfFileException{
		
	}
}
---
class P{---> invalid
	void m() throws IOException {
		
	}
}
class C extends P{
	void m() throws EndOfFileException,InterruptedException{
		
	}
}
---
class P{--->valid
	void m() throws IOException {
		
	}
}
class C extends P{
	void m() throws ArithmeticException,NullPointerException{
		
	}
}
 *
 */ 			
	public static void main(String[] args) {	}
}
