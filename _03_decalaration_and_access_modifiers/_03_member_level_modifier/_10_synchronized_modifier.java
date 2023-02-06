package _03_decalaration_and_access_modifiers._03_member_level_modifier;

public class _10_synchronized_modifier {
/*
 * 1. synchronized is a modifier applicable for methods and blocks but not for 
 * 		classes and variables
 * 2. if multiple threads trying to operate simultaneously on the same java object then
 * 		there may be a chance of data inconsistency problem this is called race condition
 * 		we can overcome this problem by using synchronized keyword.
 * 			if a method or block declared as synchronized then at a time only one thread
 * 			is allowed to execute that method/block on the give object so that data inconsistency
 * 			problem  is resolved, the main disadvantage of synchronized keyword is it increases
 * 			waiting time of thread and creates performance problem, hence if there is no specific 
 * 			requirement not recommended to use.
 * 
 *  3. synchronized method should compulsory contain implementation whereas abstract method 
 *  	doesn't contain any implementation hence abstract synchronized is illegal combination
 *  	of modifiers for methods.
 */
}
