package _00_language_fundamentals;

public class _02_Identifiers {
/*
1. Identifiers:
A name in java program is called identifier, which can be used for
  				identification purpose. It can be method name, variable name or 
  				class name or lable name.
  				
  				class Test{
					public static void main(String[] args) {
						int x =10;
					}
				}
				
here identifiers are: Test, main, String, args, 'x'

--> Rules for defining java identifiers
	a) the only allowed characters in java identifiers are:
			a to z
			A to Z
			0 to 9
			$
			_
		if we are using any other character we will get CE,
		eg: total_number     --------> valid
			total#           --------> invalid
	b) identifiers cannot start with digit
		eg: total123         --------> valid
			123total         --------> invalid
	c) java identifiers are case sensitive, ofcourse java language itself
		is treated as case-sensitive programming language.
		eg: 
		class Test{
			int number=10
			int Number=10
			int NUMBER=10
		}
		these are all different variables
	d) there is no length limit for java identifiers, but it is not recommended to
		take too lengthy identifiers.
	e) we cannot use reserved words as identifiers.
		eg: int x=10;	----> valid
			int if=20;  ----> invalid
	g) All pre-defined java class names and interface names we can use as identifiers.
			class Test{
				public static void main(String[] args) {
					int String =888;
					System.out.println(String);  // op---> 888
					
					int Runnable =999;
					System.out.println(Runnable); // op---> 999
				}
			}
	even though it is valid, but its not a good programming practice because it
	reduces readability and creates confusion.
	
Q) which of the following are valid identifiers?
(i)total_number         ------->valid
(ii)total#        		------->invalid
(iii)123total           ------->invalid
(iv)total123            ------->valid
(v)ca$h                 ------->valid
(vi)_$_$_$_$_$_         ------->valid
(vii)all@hands          ------->invalid
(viii)Java2Share        ------->valid
(ix)Integer             ------->valid
(x)Int                  ------->valid
(xi)int                 ------->invalid

 */
}
