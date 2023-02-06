package _06_OOP;

public class _17_Coupling {
/*
 * 1. the degree of dependency b/w the components is called coupling.
 * 		if dependency is more then is considered as tightly coupling and
 * 		if dependency is less then it is conidered as loosely coupling.
					
					class A{
						static int i = B.j;
					}
					class B{
						static int j= C.k;
					}
					class C{
						static int k= D.m();
					}
					class D{
						static int m() {
							return 10;
						}
					}
 * the above components are said to be tightly coupled with each other because dependency
 * b/w the components is more.
 * 			thightly coupling is not a good programing practice because it has several serious
 * 			disadvantages:
 * 			a)without affecting remaining components we cannot modify any component and hence
 * 				enhancement will become difficult.
 * 			b)it suppresses reusability.
 * 			c)reduces maintainability of the application
 * hence we have to maitain dependency b/w the coponents as less as possible ie, loosely coupling
 * is good programming practice.
 */
}
