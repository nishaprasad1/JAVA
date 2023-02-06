package _00_language_fundamentals;

public class _03_Reserved_words {
/*
 2. Reserved words:
 -->In java some words are reserved to represent some meaning or functionality
  	such type of words are called reserved words.
  	
  					    Reserved words(53)
		+---------------------------------------------------------+
		|				                 					      |
	Keywords(50)                                                  |
	  /    \                                              Reserved literals(3)
	 /      \                                                     |
	/        \                                                    |---> true
   /         Unused keywords(2)                                   |---> false
  /	                       |                                      |---> null
 /                         |-->goto 
used keywords(48)          |-->const  
       |
       |--> if
       |--> else
	   |--> .... etc
	   
	                                                              	
-------------------
used keywords:	
													  |	(6) exception |						
 (8) data-types |(11) flow control  | (11) modifiers  |  handling     | (6) class related | (4) object related|  (1) | (3)   |  (1)
----------------+-------------------+-----------------+---------------+-------------------+-------------------+------+-------+-------- 			
byte          	|  if         		| public          | try			  | class             |  new              |	     | true  | enum (1.5V)
short         	|  else       		| private         | catch         | interface         |  instanceof       | void | false | 
int           	|  switch     		| protected       | finally       | extends           |  super            |      | null  | 
long          	|  case       		| static          | throw         | implements        |  this             |      |       |
float         	|  default    		| final           | throws		  | package	          |                   |      |       |
double        	|  while      		| abstract        | assert	(1.4V)| import            |                   |      |
boolean       	|  do         		| synchronized    |               |                   |                   |      |
char          	|  for        		| native          |               |                   |                   |      |
              	|  break      		| strictfp (1.2V) |               |                   |                   |      |
              	|  continue   		| transient       |               |                   |                   |      |
              	|  return     		| volatile        |               |                   |                   |      |
	                                       
--> In java return type is mandatory, if a method wont return anything then we have to declare that method with
	'void' return type.
--> Unused keywords: 
		a) goto:  usage of goto creted several problems in old language 
					and hence sun pepole banned this keyword in java.
		b) const: use final instead of const.
		
Note: goto and const are unused keywords and if we are trying to use we will get CE.

--> Reserved literals: 
		a) true     --------> values for
		b) false    -------->  boolean datatypes
		c) null     ---> default values for object reference
		
--> Conclusion:
a) All 53 reserved words in java contains only lower case alphabet symbols.
b) in java we have only new keyword and there is no delete keyword because destruction
		of useless objects is responsibility of garbage collector.
c) the following are new keywords is java:
 		i) strictfp ----->1.2
 		ii) assert  ----->1.4
 		iii)enum    ----->1.5
 		
d)
strictfp       butnot strictFp
instanceof     butnot instanceOf
synchronized   butnot synchronize
extends        butnot extend
implements     butnot implement
import         butnot imports
const          butnot constant
-----------------
Q) which of the following list contains only java reserved words?
1) new, delete
2) goto, constant
3) break, continue, return, exit
4) final, finally, finalize
5) throw, throws, thrown
6) notify, notifyAll
7) implements, extends, imports
8) sizeof, instanceof
9) instanceOf, strictFp
10) byte, short, Int
11) None of the above---------> correct

Q) which of the following are java reserved words?
1) public      ---> correct
2) static      ---> correct
3) void        ---> correct
4) main        ---> incorrect
5) String      ---> incorrect
6) args        ---> incorrect
 */
}
