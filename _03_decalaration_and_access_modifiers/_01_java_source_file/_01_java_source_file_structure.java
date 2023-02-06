package _03_decalaration_and_access_modifiers._01_java_source_file;

public class _01_java_source_file_structure {
/*========================
 * class A{				||
 * 						||
 * 						||
 * }					||
 * class B{				||
 * 						||
 * 						||
 * }					||
 *class C{				||
 *						||
 *						|| 
 * }                    ||
 * =======================
 * case1. if there is no public class, then we can use any name and there is no 
 * 			restrictions. eg: A.java, B.java, Mango.java.. etc
 * 
 * case2. if class B is public then name of the program should be B.java otherwise
 * 			we will get error.
 * 
 * case3. if class B is public, class C is public and name of program is B.java,
 * 			then we will get compile time error stating class C is public,
 * 			should be declared in program C.java
 * 
 * *******************************************************************************
	class A{
  		psvm(){
  			sopln("A class main method");
  		}
 	}
 	class B{
  		psvm(){
  			sopln("B class main method");
  		}
 	}
 	class C{
 	}
 * if the file name is Durga.java
 * ==> javac Durga.java
 * 			--->A.class, B.class, C.class
 * ==> java A
 * 			--->o/p: A class main method
 * ==> java B
 * 			--->o/p: B class main method
 * ==> java C
 * 			--->error: main method not found
 * ==> java Durga
 * 			--->error: NoClassDefFoundError
 * ****************************************************************
 * <conclusion>
 * 1. when we are compiling a java program for every class present in the program 
 * 		a separate .class file will be generated
 * 2. We can compile a java program(java source file) 
 * 		but we can run a java .class file
 * 3. whenever we are executing a java class the corresponding class main method
 * 		will be executed, if the class doesn't contain main method then we will
 * 		get runtime exception NoSuchMethodError : main
 * 4. if the corresponding .class file not available the we will get runtime exception
 * 		saying NoClassDefFoundError
 * *****************************************************************
 * import statement
 * help to improve readability
 * 
 import java.util.ArrayList;
 class Test{
 	psvm(){
 		ArrayList l = new ArrayList();
 	}
 }
 */

}
