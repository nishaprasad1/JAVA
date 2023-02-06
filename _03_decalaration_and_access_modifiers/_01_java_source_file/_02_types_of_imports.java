package _03_decalaration_and_access_modifiers._01_java_source_file;

import static java.lang.Math.*;
public class _02_types_of_imports {
/*
 * types of imports:
 * 	1.explicit class import
 * 		a) eg:- import java.util.ArrayList;
 * 		b) it is highly recommended to use explicit import as it improves readability
 * 			of the code
 * 	2.implicit class import
 * 		a) eg:- import java.util.*;
 * 		b) not recommended as reduces readability of code
 * *****************************************************************
 	import java.util.*;
 	import java.sql.*;
 	class Test{
 		psvm(){
 			Date d = new Date();// error: reference to Date is ambiguous
 			 				   //  as both util and sql hv Date in it.
 		}
 	}
 	
 	similarly List is also present in java.util, java.awt
*********************************************************************
* while resolving class name compiler will always give precedence in following order
	1)Explicit class import
	2)classes present in current working directory(default package)
	3)Implicit class import
	
	import java.util.Date;
	import java.sql.*;
	class Test{
 		psvm(){
 			Date d = new Date();// util package date is considered here
 		}
 	}
***********************************************************************
whenever we are importing a java package all classes and interface present in that package
by default available, but not sub-package classes/interface. If we want to use these classes
or interface then we must write import till sub-package level
  		
 java---|
 		|--util
			 |---regex
			 	   |---Pattern
1) import java.*;
2) import java.util.*;
3) import java.util.regex.*;-------> correct
4) no import required;
************************************************************************
we are not required to write import statement for:-
	1)java.lang
	2)default package(cwd)
************************************************************************
 import statement is totaly compile time related concept,
 	if more no. of imports more will be compile time, there is no effect on runtime
*************************************************************************************
difference b/w c language #include<stdio.h> and java language import
 	--in the case of c language #include all i/p o/p header file will
 	 	be loaded at begining only, hence it is static include
 	--but in the case of java import statement no class is loaded in begining
 		whenever we are use java class then only corresponding .class file is 
 		loaded, this is called as dynamic include or load on fly or load on demand
*************************************************************************************
1.5V features
1)for-each loop
2)var-args methods
3)autoboxing and unboxing
4)Generics
5)co-varient return type
6)Queue
7)Annotations
8)Enum
9)Static imports 	
 *************************************************************************************
 Static import
 
 class Test{
 sopln(Math.sqrt(4));
 sopln(Math.max(4,9));
 sopln(Math.random());
 }
 */
	
	public static void main(String[] args) {
		case1();
	}

	private static void case1() {
		System.out.println(sqrt(4));
		System.out.println(max(4,10));
		System.out.println(random());
	}
}