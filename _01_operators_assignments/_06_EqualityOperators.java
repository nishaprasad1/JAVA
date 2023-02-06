package _01_operators_assignments;

public class _06_EqualityOperators {
//	Equality operators ==, !=
	
	public static void main(String[] args) {
		
		/**
		 * we can apply equality operator for every primitive type including boolean
		 */
		System.out.println(10 == 20);
		System.out.println('a' == 'b');
		System.out.println('a' == 97.0);
		System.out.println(false == false);
		
		System.out.println("****************************************");
		
		/**
		 * for object r1,r2 
		 *  r1== r2 is true only if both r1,r2 pointing to the same objects
		 */
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = t1;
		
		//here total 2 objects and 3 reference variables
		
		System.out.println(t1 == t2); // false
		System.out.println(t1 == t3); // true
		
		System.out.println("****************************************");
		/**
		 * if we apply equality operator for object types then compulsory there should be some 
		 * relation b/w object types either parent-> child, child -> parent or same type
		 * else we get incomparable type compile type error
		 */
		
		Thread t = new Thread();
		String s = new String();
		Object o = new Object();
		
		System.out.println(s ==  o);
		System.out.println(t ==  o);
//		System.out.println(t == s); error:Incompatible operand types Thread and String
		
//		System.out.println(new A1() == new B1()); error:Incompatible operand types A1 and B1
		
//		System.out.println(new A11() == new B11()); error:Incompatible operand types A11 and B11
		
		System.out.println(new A11() == new A1());// valid  child == parent
		
		System.out.println("****************************************");
		
		/**
		 * difference b/w  == operator & .equals() method
		 * 
		 *    ==  	is used for reference comparison
		 * .equal() is used for content comparison
		 */
		
		String s1 = new String("durga");
		String s2 = new String("durga");
		
		System.out.println(s1 == s2);// false as different reference
		System.out.println(s1.equals(s2)); //true content same
		
		System.out.println("****************************************");
		/**
		 * for any object r, r == null is always false
		 *  but null == null is always true 
		 */
		
		String s3= new String("durga");
		String s4 = null;
		System.out.println(s3 == null);// false
		System.out.println(s4 == null);// true
		System.out.println(null == null);// true
	}
}

interface I1{
	
}

class A1 implements I1{
	
}
class B1 implements I1{
	
}
class A11 extends A1{
	
}
class B11 extends A1{
	
}