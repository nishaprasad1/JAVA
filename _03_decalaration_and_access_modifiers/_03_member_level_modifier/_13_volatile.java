package _03_decalaration_and_access_modifiers._03_member_level_modifier;

public class _13_volatile {
/*
 * 1. volatile is a modifier applicable only for variables and we cannot apply 
 * 		anywhere else.
 * 2. if the value of the variable keep on changing by multiple threads then there may be a chance
 * 		of data consistency problem we can solve this problem by using volatile modifier.
 * 		- if a variable defined as volatile then for every thread jvm will create a separate local
 * 			copy. every modification performed by the thread will takes place in local copy
 * 			so that there is no effect on remaining thread.
 * 3. main advantage is we can overcome data inconsistency problem but the disadvantage
 * 		is creating and maintaining a separate copy for every thread increases complexity
 * 		and performance problem hence if there is no specific requirement it is never
 * 		recommended to use volatile keyword.
 * 4.final variable means the value never changes whereas volatile variable means the value keeps on
 * 		changing hence volatile final is illegal combination for variables.
 * 
 */
}
