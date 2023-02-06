package _04_interface;

public class _01_introduction {
/*
 * definition 1: any service requirement specification (SRS) is considered as interface
 * 		eg:- a)JDBC API acts as requirement specification to develop db driver
 * 				db vendor is responsible to implement jdbc api
 * 					
 								   JDBC API
 								/-----|-------\
 							   /      |        \
 							Oracle   mySQL     DB2
 							driver    driver   driver
 			b)Servlet API acts as requirement specification to develop webserver
 			  webserver vendor is responsible to implement servlet api
 
 * definition 2: from client point of view an interface defines the set of services what he
 * 					is offering hence any contract b/w client and service provider is
 * 					considered as interface
 * 		eg:- through bank ATM GUI screen bank people are highlighting the set of services
 * 				they are offering at the same time the same GUI screen represents the set
 * 				of services what customer is expecting hence this GUI screen acts as contract
 * 				b/w customer and bank people.
 * 
 * definition 3: inside interface every method is always abstract whether we are declaring or
 * 					not hence interface is considered as 100% pure abstract class
 * 
 * summary definition: any service requirement specification or
 * 					   any contract b/w client and service provider or
 * 					   100% pure abstract class is nothing but interface.
 */
}
