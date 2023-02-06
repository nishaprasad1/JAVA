package _99_certification_11;
/*

Identifiers: names in java programs.
eg- variable name, method name, class name,lable name

Rules to define identifiers:
1. the allowed characters in identifiers are:
	a to z
	A to Z
	0 to 9
	$,_
2. identifiers should not start with digits
3. we cannot use keywords as identifiers.
4. identifiers are case sensitive.
5. all predefined class names and interface names can be used as
		identifiers.(not recomended)
6. no length restriction.
7. from java 9 onwards '_' is keyword, hence cannot be used as identifier. 
class Test{
	public static void main(String[] args) {
		int _x =10;
		System.out.println(_x);
		int __x =100;
		System.out.println(__x);
		int _ =1000;//CE:'_' is a keyword from source level 9 onwards, cannot be used as identifier
		System.out.println(_);
	}
}


Q. which of the following are valid declarations in java?

1. int int = 10;               invalid
2. int Int = 10;				valid
3. String string = "durga";		valid
4. String String = "durga";		valid
5. int #count =10;				invalid
6. int 123total = 100;			invalid
7. class class= Test.class		invalid
8. int total = 20;				valid
9. int _total = 30;				valid
------------------------------------------------------

Data types:
 
byte              float          char
short			  double         boolean
int
long


byte:   -128 to 127
		size: 1 byte (8 bits)
		
short:  -32768 to 32767
		size: 2 bytes (16 bits)

int:  -2147483648 to 2147483647
		size: 4 bytes (32 bits)
		
long: -2^63 to 2^63 -1
		size: 8 bytes (64 bits)
------

float: size 4 bytes
		5 to 6 decimal places of accuracy
		range: -3.4e38 to 3.4e38
		
double: size 8 bytes
		14 to 15 decimal places of accuracy
		-1.7e308 to 1.7e308
-------

boolean: true, false
			size: not applicable
			range: not applicable
			
char: data type
char ch ='a';
size: 2 bytes
range: 0 to 65535
 */
public class _02_Identifiers_and_primitive_data_types {}
