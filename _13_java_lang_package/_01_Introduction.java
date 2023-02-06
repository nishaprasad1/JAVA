package _13_java_lang_package;

/*

--> for writing any java program, whether it is simple or
complex the most commonly required classes and interfaces are
grouped into separate package which is nothing but java.lang 
package.

--> we are not required to import java.lang package explicitly
because all classes and interfaces present in lang package by default
available to every java program.
-----------------

 1. java.lang.Object
 --> the most commonly required methods for every java class(whether it
 is predefined or customized class) are defined in a separate class which is
 nothing but Object class.
 
 --> every class in java is child class of object either directly or indirectly
 so that object class methods by default available to every java class.
 	Hence Object is considered as root of all java classes.
 
 --> If our class doesn't extend any other class then only our class is direct
 child class of object.
 
			 class A{                             Object
			                                       /|\
			 }                                      | 
                                                    |
                                                    A
 
 --> If our class extends any other class, then our class is indirect child class
 of object.
 
			 class B extends A{                   Object
			                                       /|\
			 }                                      |
                                                    |
                                                    B
                                                   /|\
                                                    |
                                                    A
 												(multi-level inheritance)
 												
Conclusion:
 --> either directly or indirectly java won't provide support for multiple inheritance
 		w.r.t classes.
=======

--> Object class defines following 11 methods:
1.  public String toString()
2.  public native int hashCode()
3.  public boolean equals(Object o)
4.  protected native Object clone() throws CloneNotSupportedException 
5.  protected void finalize() throws Throwable
6.  pulbic final Class getClass()
7.  public final void wait() throws InterruptedException
8.  public final native void throws wait(long ms) throws InterruptedException
9.  public final native void throws wait(long ms, int ms) throws InterruptedException
10. public native final void notify()
11. public native final void notifyAll()

--> code to find these all 11 methods:

import java.lang.reflect.Method;
class Test{
	public static void main(String[] args) throws ClassNotFoundException {
		int count=0;
		Class c = Class.forName("java.lang.Object");
		Method m[] = c.getDeclaredMethods();
		for(Method m1: m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("The number of methods: "+count);
	}
}

finalize
wait
wait
wait
equals
toString
hashCode
getClass
clone
notify
notifyAll
The number of methods: 11

--> Strictly speaking Object class contains 12 methods, that extra method is 
		private static native void registerNatives()
		
--> this method internally required by Object class and not available to child 
classes. Hence we are not required to consider this method.

*/
public class _01_Introduction {	public static void main(String[] args) {}
}
