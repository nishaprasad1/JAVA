package _07_Exception_handling;

public class _01_Introduction {
/*
 * 1. An unexpected unwanted event that disturbes normal flow of the program is
 * 		called exception.
 * 2. it is highly recommended to handle exception and the main objective of 
 * 		exception handling is graceful termination of the program.
 * 3. exception handling does not mean repairing exception, we have to provide alternative
 * 	  way to continue rest of the program normally is the concept of exception handling.
 *    for example our programming requirement is to read data from remote file located
 *    in london, at runtime if london file is not available out program should not be 
 *    terminated abnormally we have to provide some local file to continue rest of the
 *    program normally this way of defining alternative is called exception handling.
 *    
		try{
		 read data from remote file located at london.
		}catch(FileNotFoundException e){
			use local file & continue rest of the program normally
		}
================================================================================
Runtime stack mechanism:
--> for every thread jvm will create a runtime stack.Each and every method call performed by
that thread will be stored in the coressponding stack.
--> each entry in the stack is called stack frame or activation record, after completing every
method call the coressponding entry from the stack will be removed.
--> after completing all method calls the stack will become empty, and that empty stack
will be destroyed by the jvm just before terminating the thread. 

		
		class Test{
			public static void main(String[] args) {
				doStuff();
			}
		
			private static void doStuff() {
				doMoreStuff();
			}
		
			private static void doMoreStuff() {
				System.out.println("hello");
			}
		}
		
|           |		|         |		|          |	|              |		|           |		|           |		|           |	
|           |		|         |		|          |	|doMoreStuff() |		|           |		|           |		|           |	
|           |------>|         |---->|__________|--->|______________|------->|___________|------>|           |------>|           |	
|           |------>|         |---->|doStuff() |--->|doStuff()     |------->|doStuff()  |------>|           |------>|           |	
|           |------>|_________|---->|__________|--->|______________|------->|___________|------>|___________|------>|           |	
|           |		|main()   |		|main()    |	|main()        |		|main()     |		|main()     |		|           |	
|___________|	+-->|_________|		|__________|	|______________|		|___________|		|___________|		|___________|	
Runtime         |                                                                                                       /
stack           |																									   /
for             +---stack frame   																	this empty stack__/
main                    or     																		will be destroyed
thread           activation record   																by JVM
		
Note: this runtime stack is when everything goes fine		
 * 		
 */
}
