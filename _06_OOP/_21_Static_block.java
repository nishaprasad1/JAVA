package _06_OOP;

public class _21_Static_block {
/*
 * 1. static blocks will be executed at the time of class loading, hence at the time of
 * 		class loading if we want to perform any activity we have to define that inside
 * 		a static block.
 * eg: a) At the time of java class loading the corresponding native libraries 
 * 			should be loaded hence we have to define this activity inside static block.
					
					class Test{
						static {
							System.loadLibrary("native library path");
						}
					}
		
		b) after loading every database driver class we have to register driver class with
			driver manager, but inside database driver class there is a static block to perform
			this activity and we are not responsible to register directly.
			
					class DbDriver{
						static {
							//register this driver with drivermanager
						}
					}
 *
 * 2. within a class we can declare any no. of static blocks but all these will be 
 * 		executed from top to bottom fasion. 
 *
 * Q) without writing main method is it possible to print some statements on console?
 * Ans)	yes by using static block
					class Test{
						static {
							System.out.println("yes i can print");
							System.exit(0);
						}
					}
 
 * Q) without writing main method and static block is it possible to print some statements on console?
 * Ans)Yes, there are multiple ways
---------
class Test{
	static int x = m1();
	
	private static int m1() {
		System.out.println("yes i can print");
		System.exit(0);
		return 0;
	}
}
---------
class Test{
	static Test t = new Test();
	
	{
		System.out.println("yes i can print");
		System.exit(0);
	}
}
---------
class Test{
	static Test t = new Test();
	
	Test(){
		System.out.println("yes i can print");
		System.exit(0);
	}
}
Note: from 1.7V main method is mandatory to start a program execution hence from 1.7V without 
		writing main method it is impossible to print statement on console.
 */
	public static void main(String[] args) {}
}
class Test_21{
	static Test_21 t = new Test_21();
	
	Test_21(){
		System.out.println("yes i can print");
		System.exit(0);
	}
}