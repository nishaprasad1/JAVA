package _03_decalaration_and_access_modifiers._03_member_level_modifier;

public class _11_native_modifier {
/*
 * 1. native is a modifier is a modifier applicable only for methods and we cannot 
 * 		apply anywhere else.
 * 2. the methods which are implements in non java(mostly C or C++) are called native methods
 * 		or foreign methods.
 * 3. the main objectives of native keyword are 
 * 		a) to improve performance of system
 * 		b) to achieve machine level or memory level communication
 * 		c) to use already existing legacy non java code
 * 
 * 4. Pseudo code to use native keyword in java
 * 5. native method implementation is present in non java language hence we are not responsible
 * 		to provide implementation hence native method declaration ends with semi-colon.
  			class Test{
				native void m1();
				native void m2() {//CE:Native methods do not specify a body
				}
			}
 * 6. for native methods implementation is already available in old languages but for 
 * 		abstract methods implementation should not be available, hence we cannot declare
 * 		naive methods as abstract ,ie native abstract combination combination is illegal
 * 7. we cannot declare naive methods as strictfp because there is no guarantee that old language 
 * 		follow IEEE 754 standards hence native strictfp is illegal combination for methods.
 * 8. the main advantage of native keyword is the performance will be improved but the main 
 * 		disadvantage is it breaks platform independent nature of java 
 * 	  
 * 
 */
}
