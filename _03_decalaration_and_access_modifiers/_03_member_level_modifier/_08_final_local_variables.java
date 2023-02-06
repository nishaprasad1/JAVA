package _03_decalaration_and_access_modifiers._03_member_level_modifier;

public class _08_final_local_variables {
/**
 * 1.sometimes to meet temporary requirement of the programmer we have to declare variables
 * 		inside a method, block or constructor such variables are called local variables or
 * 		temporary variables or stack variables or automatic variables.
 *   -- for local variables jvm will not provide any default values compulsory we should
 *   	perform initialization explicitly before using that local variable, ie if we are not 
 *   	using its not required to perform initialization for local variable
		class Test{
			public static void main(String[] args) {
				int x;---> valid
				System.out.println("Hello");
			}
		}
-------------------------
		class Test{
			public static void main(String[] args) {
				int x;
				System.out.println(x);//CE:The local variable x may not have been initialized
			}
		}
-------------------------
	-- Even though local variable is final before using only we have to perform initialization
	 	that is if we are not using then its not required to perform initialization.
	 	class Test{
			public static void main(String[] args) {
				final int x;
				System.out.println("Hello");
			}
		}
	
	--the only applicable modifier for local variable is final,by mistake if we try any other
		modifier we will get CE.
		class Test{
			public static void main(String[] args) {
		//		public int    x1 =10;//CE:Illegal modifier for parameter x1; only final is permitted
		//		private int   x2 =10;//CE:Illegal modifier for parameter x1; only final is permitted
		//		protected int x3 =10;//CE:Illegal modifier for parameter x1; only final is permitted
		//		static int    x4 =10;//CE:Illegal modifier for parameter x1; only final is permitted
		//		transient int x5 =10;//CE:Illegal modifier for parameter x1; only final is permitted
		//		volatile int  x6 =10;//CE:Illegal modifier for parameter x1; only final is permitted
				final int     x7 =10;
			}
		}
		
	-- if we are not declaring any modifier then it is default but this is application to class
		members.
	--formal parameters of a method simply act as local variable to method, hence can be declared
	  as final.
	  if formal parameters declared as final then we cannot perform reassignment
	  
	   class Test{
			public static void main(String[] args) {
				m(10,20);
			}
			private static void m(int i, final int j) {
				i=200;
		//		j=300;//CE:The final local variable j cannot be assigned.
				     //It must be blank and not using a compound assignment
			}
		}
 */
}