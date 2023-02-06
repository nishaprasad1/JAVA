package _04_interface;

public class _05_variables_in_interface {
/*
 * 1. an interface can contain variables the main purpose of interface variable is
 *   to define requirement level constants.
 * 2. every interface variable is public static final whether we are declaring or not.
 			interface Interf{
	|----------int x =10;
	|	    }
    |
    |-------->public: to make this variable available to every implementation class
    |
    |-------->static: without existing object, implementation class can access this variable.
    |
    |-------->final: if one implementation class changes the value then remaining implementation
    						will be effected, to restrict this every variable is final.
    
    	hence within an interface the following variable declarations are equal:
    	int x =10;----------------------------|
    	public int x =10;---------------------|
    	static int x =10;---------------------|
    	final int x=10;-----------------------|-------->EQUAL
    	public static int =10;----------------|
    	public final int =10;-----------------|
    	static final int x =10;---------------|
    	public final static int x =10;--------|

 * 		
 * 3. as every interface variable is public static final we cannot declare with following
 * 		modifier:
 * 		private, protected---> as it is public.
 * 		transient-----> as interface cannot have objects,
 * 						 no serialization hence no need of transient field.
 * 		volatile------> as it is final.
 * 
 * 4. for interface variables compulsory we should perform initialization at the time of 
 * 		declaration otherwise we will get CE
 			interface Interf{
				int x;------------------>CE
			}
			
 * 5. inside an interface which of the following variable declarations are allowed:
 * 		int x;---------------------> invalid
 * 		private int x=10;----------> invalid
 * 		protected int x=10;--------> invalid
 * 		volatile int x=10;---------> invalid
 * 		transient int x=10;--------> invalid
 * 		public static int x=10;----> valid
 * 
 * 6. inside implementation class we can access interface variables but we cannot modify
 * 		values.
 		interface Interf{
			int x =10;
		}
		class Impl1 implements Interf{
			public static void main(String[] args) {
				x = 777;// CE: The final field Interf.x cannot be assigned
				System.out.println(x);
			}
		}
		class Impl2 implements Interf{
			public static void main(String[] args) {
				int x =777;
				System.out.println(x);
			}
		}
 */
}
