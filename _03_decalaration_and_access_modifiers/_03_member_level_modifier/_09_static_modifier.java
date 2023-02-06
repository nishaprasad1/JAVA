package _03_decalaration_and_access_modifiers._03_member_level_modifier;

public class _09_static_modifier {
/**
 * 1. static is a modifier applicable for methods and variables but not for classes.
 * 		we cannot declare top level class as static but we can declare inner class
 * 		as static (such type of inner classes are called static nested classes)
 * 	--in the case of instance variable for every object a separate copy will be created
 * 		but is the case of static variable a single copy will be created and share by every
 * 		object of that class.
  		eg:-
  				class Test{
					static int x =10;
					int y=20;
					public static void main(String[] args) {
						Test t1 = new Test();
						t1.x= 888;
						t1.y= 999;
						Test t2 = new Test();
						System.out.println(t2.x+"..."+t2.y);
					}
				}
--------------------------------------------------------------------------------
	-- we can't access instance members directly from static area, but we can access
		from instance are directly.
		we can access static members both from instance and static area directly.
		consider the following declarations:-
		(I) 	int x = 10;
		(II) 	static int x =10;
		(III)	public void m(){
					sopln(x);
				}
		(IV)	public static void m(){
					sopln(x);
				}
	Q) which of the above declaration we can take simultaneously
	a> (I) & (III) 
	b> (I) & (IV) 
	c> (II) & (III) 
	d> (II) & (IV)
	e> (I) & (II)
	f> (III) & (IV)
	
	   valid--> a, c, d
	 invalid--> b (non static variable x cannot be referenced from a static context),
	 			e (variable x is already defined in class Test)
	 			f (m() is already defined in class Test)
--------------------------------------------------------------------------------
 case 1: overloading concept appicable for static methods including main method,
 			but jvm will call psvm(String[] arg) method only,other overloaded method we need
 			call just like a normal method call.
 			
 			class Test{
				public static void main(String[] args) {
					System.out.println("String[]");
				}
				public static void main(int[] args) {
					System.out.println("int[]");
				}
			}
	
	case 2: inheritance concept applicable for static methods including main method, hence 
	 		while executing child class if child class doesn't contain main method then
	 		parent class main method will be executed
	 		---Test.java----<file name>
	 		class P{
				public static void main(String[] args) {
					System.out.println("Parent main");
				}
			}
			class C extends P{
			}
	 		javac Test.java ----> (P.class and C.class)
	 		
	 		java P <---|
	 		o/p: Parent main
	 		
	 		java C <---|
	 		o/p: Parent main
	 		
	case 3: for static methods its method hiding but not overriding
	 			ie, for static methods overloading, inheritance concepts are applicable but
	 			overriding concepts is not applicable but instead method hiding is applicable.
			class P{
				public static void main(String[] args) {
					System.out.println("Parent main");
				}
			}
			class C extends P{
				public static void main(String[] args) {
					System.out.println("Child main");
				}
			}
-----------------------
	case 4: inside method implementation if we using at least one instance variable then that method
	  		talks about a particular object hence we should declare method as instance method.
	  		inside method implementation if we are not using any instance variable then this method no where
	  		related to a particular object and we have to declare such method as static method irrespective of 
	  		whether we are using static variables or not.  
			
			class Student{
				private String name;
				private int rollNo;
				private int marks;
				static private String clgName;
				
				String getStudentInfo(){
					return name+" ..."+marks;
				}
				
				static String getCollegeInfo(){
					return clgName;
				}
				
				static double getAvarage(int x, int y){
					return (x+y)/2d;
				}
				
				 String getCompleteInfo(){
				return name+".."+rollNo+".."+marks+".."+clgName;	
				}
			}
-------------------
		case 5: for static methods implementation should be available whereas for abstract methods implementation is not
		 			available hence abstract static combination is illegal for methods
 * 
 */
	public static void main(String[] args) {

	}
}

