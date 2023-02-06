package _07_Exception_handling;

public class _16_java7_enhancement_exception_handling {
/*
 * 1. as a part of 1.7 version in exception handling following two concepts
 * 		introduced:
 * 					a) try with resources
 * 					b) multi-catch block
==================================================================================== 
 * a) try with resources
 * until 1.6 version it is highly recommended to write finally block to close
 * resources which are open as a part of try block.
--------------------------------------------------------------------------------		
		class Test{
			public static void main(String[] args) throws IOException {
				BufferedReader bufferedReader= null;
				
					try {
						bufferedReader = new BufferedReader(new FileReader("abc.txt"));
						//use bufferedReader based on our requirement

					} catch (FileNotFoundException e) {
						//handling code
					}finally {
						if(bufferedReader!=null)
						bufferedReader.close();
					}
			}
		}
--> the problems in this approach are compulsary programmer is required to close
resources inside finally block, it increases complexity of the program.
--> we have to write finally block compulsary and hence it increases length of 
code and reduces readability.
--------------------------------------------------------------------------------		
		
	>> To overcome above problems sun pepole introduced try with resources in
	   1.7 version.
	>> the main advantage of try with resource is whatever resources we open as 
	 	a part of try block will be closed automatically once control reached
	 	end of try block either normally or abnormally, and hence we are not 
	 	required to close explicitly so that complexity of the program will be
	 	reduced.
	 >> we are not required to write finally block so that lenght of code is
	   	reduced and redability will be improved.
	
class Test{
	public static void main(String[] args) {

		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("abc.txt"));) {
			//use bufferedReader based on our requirement
			// bufferedReader will be closed automatically once the control 
			// reaches end of try block either normally or abnormally and we are 
			// not responsible to close explicitly.
		} catch (IOException e) {

		}

	}
}
====
colclusions:
1. we can declare multiple resources but these resources should be separated
		by semi colon(;) 
							try(R1;R2;R3){
							
							}
							
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("abc.txt"));
		FileWriter fileWriter = new FileWriter("efg.txt");
		FileReader fileReader = new FileReader("goal.txt")) {

		}
		
2. all resources should be autocloseable resources.

3. a resource is said to be autocloseable if and only if coressponding class
	implements java.lang.AutoCloseable interface, all IO related resources,
	database related resources and network related resources are already 
	implemented autoclosable interface being a programmer we are not required
	to do anything just we should aware the point.
	
4. Autocloseable interface came in 1.7V and it contains only one method 
	public void close();
	
5. all resource reference variables are implicitly final, and hence within
   the try block we cannot perform reassignment otherwise we will get 
   compile time error.
   
   	try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {

//			br = new BufferedReader(new FileReader("mlno.txt"));
			//CE:The resource br of a try-with-resources statement cannot be assigned
		} catch (IOException e) {
		}
		
6. until 1.6V try should be associated with either catch or finally but form 1.7V
		 we can take only try with resource without catch or finally.
		 
		 try(R){
		 
		 }

7. the main advantage of try with resource is that we are not required to write
	finally block explicitly because we are not required to close resourcses
	explicitly hence until 1.6V finally block is hero but 1.7V it is dummy 
	and becomes zero.
--------------------------------------------------------------------------------		
================================================================================
b) multi catch block
1. Until 1.6V even though multiple different exceptions having same handling code
 	for every exception type we have to write separate catch block, it increases
 	length of code and reduces readability
 
 		try {
			FileWriter fr= new FileWriter("abc.txt");
			Thread.sleep(100L);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}

--> to overcome this problem sun people introduced multi catch block in 1.7V
--> according to this we can write single catch block that can handle that can
 	handle multiple different type of exceptions.
 	
 		try {
			FileWriter fr= new FileWriter("abc.txt");
			Thread.sleep(100L);
		} catch (ArithmeticException |IOException e) {
			e.printStackTrace();
		}catch(NullPointerException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
--> the main advantage of the code is length of the code will be reduced and
		readability will be improved.
------------		
eg:-   try {
			System.out.println(10/0);
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}
in the above example whether raised exception is either AE or NPE the same catch
block can listen.
-------------

--> in multi catch block there should not be any relation between exception
 types(either child to parent or parent to child or same type) otherwise we will
 get CE.
 
try {
	
} catch (ArithmeticException | Exception e) {//CE:The exception ArithmeticException is already caught by
 											//    the alternative Exception
	e.printStackTrace();
}
================================================================================
 Terminology
 1) Exception propogation: inside a method if exception raised and if we are not
 	handling that exception then exception object will be propogated to caller
 	then caller method is responsible to handle exception this process is 
 	called exception propogation.

 2) Re-throwing exception: we can use this approach to convert one exception type
 			to another type exception.
	try {
		System.out.println(10/0);
	}catch(ArithmeticException e) {
		throw new NullPointerException();
	}
 	
 */
	public static void main(String[] args) {}
}