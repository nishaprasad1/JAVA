package _04_interface;

public class _04_methods_in_interface {
/*
 * 1. every method present inside interface is always public and abstract
 * 		whether we declare or not.
  		interface Intref{
	|-------void m();
	|	}
	|
	|---->public: to make this method available to every implementation class
	|
	|---->abstract: Implementation class is responsible to provide implementation
	
	 hence inside interface the following method declarations are equal:
	 void m();---------------------------|
	 public void m();--------------------|______\ EQUAL
	 abstract void m();------------------|      /
	 public abstract void m();-----------|
	
 * 2. As every interface method is always public and abstract we cannot declare 
 * 		interface with following modifiers
 *     private, protected ---> as it is public
 *     static, final, synchronized, strictfp, native--> as it is abstract
 
 *<Q1> which of the following declaration is allowed inside interface
   	public void m1(){}-----------------------> invalid
   	private void m1();-----------------------> invalid
   	protected void m1();---------------------> invalid
   	static void m1();------------------------> invalid
   	public abstract native void m1();--------> invalid
   	abstract public void m1();---------------> valid
   	
 */
}
