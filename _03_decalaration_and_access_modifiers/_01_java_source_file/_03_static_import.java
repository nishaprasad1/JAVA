package _03_decalaration_and_access_modifiers._01_java_source_file;

import static java.lang.System.out;

public class _03_static_import {

	public static void main(String[] args) {

		out.println("Hello");
		System.out.println(Byte.MAX_VALUE);
	}

}
/*Case 1.
import static java.lang.Integer.*;
import static java.lang.Byte.*;
class Test_01{
	public static void main(String[] args) {
//		System.out.println(MAX_VALUE);//error: The field MAX_VALUE is ambiguous, as present 
//									 //in Integer,Byte class
	}
}
*/

/*Case 2. 
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;
class Test_02{
	final static int MAX_VALUE=999;
	public static void main(String[] args) {
		System.out.println(MAX_VALUE);// 999
	}
}
preference order:-
1)Current class static members
2)Explicit static import
3)Implicit static import
*/

/*Case 3. 
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;
class Test_02{
	public static void main(String[] args) {
		System.out.println(MAX_VALUE);// 2147483647 form Integer class
	}
}
 */

/*Case 4. 
import static java.lang.Byte.*;
class Test_02{
	public static void main(String[] args) {
		System.out.println(MAX_VALUE);// 127 form Byte class
	}
}
 */
/*
two package contains class/interface with same name is very rare and hence ambiguity
problem is also very rare in normal import
two classes/interface contain a method/variable with same name is very common
hence ambiguity problem is very common problem in static import 
*/