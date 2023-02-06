package _06_OOP;

public class _15_Overloading_vs_Overriding {
/*
 * <property>
 * 
 * <method name>
 * overloading: must be same
 * overriding: must be same
 * 
 * <Argument types>
 * overloading: must be different(atleast order)
 * overriding: must be same(including order)
 * 
 * <Method signatures>
 * overloading: must be different
 * overriding: must be same
 * 
 * <return types>
 * overloading: no restrictions.
 * overriding: must be same until 1.4V, but from 1.5V co-variant return types also allowed
 * 
 * <private, static, final methods>
 * overloading: can be overloaded
 * overriding: cannot be overridden
 * 
 * <access modifiers>
 * overloading: no restrictions
 * overriding: we cannot reduce scope of access modifier but we can increase the scope 
 * 
 * <throw clause>
 * overloading: no restrictions
 * overriding: if child class method throws any checked exception, compulsory
 * 				parent class method should throw same checked exception or it parent exception,
 * 				but no restrictions on unchecked exceptions.
 * 
 * <method resolution>
 * overloading: always takes care by compiler based on reference type
 * overriding: always takes care by jvm based on runtime object 
 * 
 * <it is also known as>
 * overloading: compile time polymorphism, static polymorphism, early binding
 * overriding: runtime polymorphism, dynamic polymorphism, late binding
 * 
 * 
 * Note: in overloading we have to check only method names(must be same) and
 * 		 argument types(must be different), we are not required to check remaining like
 * 			return types, access modifiers etc.
 * 		
 * 		But in overriding everything we have to check like method name, argument types,
 * 		return types, access modifiers, throws class etc.
 * 		
 * Q) consider the following method in parent class:
 *         __________________________________________ 		 
 * 		  |	public void m1(int x) throws IOException |
 * 	      +------------------------------------------+
 *   In the child class which of the following methods we can take
 *   
 *   1) public void m1(int i)--------------------->valid   (overriding)
 *   2) public static int m1(long l)-------------->valid    (overloading)
 *   3) public static void m1(int i)-------------->invalid
 *   4) public void m1(int i) throws Exception---->invalid
 *   5) public static abstract void m1(double d)-->invalid
 */
}
