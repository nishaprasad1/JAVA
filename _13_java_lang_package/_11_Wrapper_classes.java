package _13_java_lang_package;
/*
	Wrapper Classes:
--> The main objectives of wrapper classes are:
	a) To wrap primitive into object form, so that we can handle primitives also just like
		objects.
	b) To define several utility methods which are required for primitives.
	
--> Almost all wrapper classes contains two constructors one can take corresponding primitive
	as argument and another can take string as argument
example:
	1) Integer I = new Integer(10);
	   Integer I = new Integer("10");
	   
	2) Double D = new Double(10.5);
	   Double D = new Double("10.5");
	   
--> If string argument not representing a number then we will get runtime exception
	 saying NumberFormatException.
	eg: Integer i = new Integer("ten");//java.lang.NumberFormatException
	
--> Float class contains three constructors with float, double, string type of arguments.
example:
		Float f1 = new Float(10.5f);
		Float f2 = new Float("10.5f");
		Float f3 = new Float(10.5);
		Float f4 = new Float("10.5");
		
--> Character class contains only one constructor which can take char argument
example:
		Character c1 = new Character('a');
		Character c2 = new Character("a");//CE:The constructor Character(String) is undefined
		
--> Boolean class contains twi constructors one can take primitive as argument and other can
	take string as argument.
	i) if we pass boolean primitive as argument the only allowed values are true or false
	 were case and content both are important.
example:
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean(false);
		Boolean b3 = new Boolean(True);//True cannot be resolved to a variable
		Boolean b4 = new Boolean(durga);//durga cannot be resolved to a variable

--> If we are passing string type as argument then case and content both are not important.
--> If the content is case insensitive String of "true" then it is treated as true otherwise
	it is treated as false.
example:
	Boolean b1 = new Boolean("true");//true
	Boolean b2 = new Boolean("Ture");//true
	Boolean b3 = new Boolean("TRUE");//true
	Boolean b4 = new Boolean("malaika");//false
	Boolean b5 = new Boolean("kareena");//false
	
	code:-
		public static void main(String ... arg) {
			Boolean X = new Boolean("yes");
			Boolean Y = new Boolean("no");
			System.out.println(X);//false
			System.out.println(Y);//false
			System.out.println(X.equals(Y));//true
		}
		
  +-------------------+--------------------------------------+
  | wrapper class     |   Correponding constructor arguments |
  +-------------------+--------------------------------------+
  | Byte              | byte or String                       |
  +-------------------+--------------------------------------+  
  | Short             | short or String                      |
  +-------------------+--------------------------------------+  
  | Integer           | int or String                        |
  +-------------------+--------------------------------------+  
  | Long              | long or String                       |
  +-------------------+--------------------------------------+  
  | Float             | float or String or double            |
  +-------------------+--------------------------------------+  
  | Double            | double or String                     |
  +-------------------+--------------------------------------+  
  | Character         | char                                 |
  +-------------------+--------------------------------------+  
  | Boolean           | boolean or String                    |
  +-------------------+--------------------------------------+  
	
	
Note: In all wrapper classes toStrin() method is overridden to return content
		directly.
	  In all wrapper classes .equals() method is overridden for content comparison.
====================

	  Utility methods:
	  1) valueOf()
	  2) xxxValue()
	  3) parseXxx()
	  4) toString()
	  
1. valueOf() 
--> we can use valueOf() methods to create wrapper object for given primitive or String.
--> every wrapper class except Character class contains a static valueOf() method to create
	wrapper object for the given String.
	
Form-1:	
	+------------------------------------+
    | public static T valueOf(String s)  |
	+------------------------------------+
example:	
	Integer i = Integer.valueOf("10");//10
	Double d = Double.valueOf("10.5");//10.5
	Boolean b = Boolean.valueOf("durga");//false
	  
Form-2
109 01:15  
 */
public class _11_Wrapper_classes {
	public static void main(String ... arg) {
	}
}
