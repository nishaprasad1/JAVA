package _12_generics;

/*
Generic methods and wild-card charactes(?):

1. m1(ArrayList<String> l)
--> we can call this metod by passing ArryaList of only string type
--> But within the method we can add only string type of object to the list,
		by-mistake if we are trying to add any other type then we will get CE.
		
		 eg: m1(ArrayList<String> l){
		 		l.add("A");-->valid
		 		l.add(null);-->valid
		 		l.add(10);--> invalid, CE
		 	 }

2. m1(ArrayList<?> l)
--> we can call this method by passing ArryaList of any type
--> But within the method we cannot add anything to the list except null, because we
 	do not know the type exactly.
--> null is allowed because it is valid value for any type.
 	
 		eg: m1(ArrayList<?> l){
 				l.add(10.5);---> invalid
 				l.add("A");---> invalid
 				l.add(10);---> invalid
 				l.add(null);---> valid
 			}
--> this type of methods are best suitable for read-only operation.

3. m1(ArrayList<? extends X> l)
--> X can be either class or interface
--> if X is a class then we can call this method by passing arraylist of either X type
	or its child types.
--> If X is an interface then we can call this method by passing arraylist of either X type
	or its implementation classes.
--> But within the method we cannot add anything to the list except null, because we do not
  	know the type exactly.
--> this type of methods are best suitable for read-only operation.

4. m1(ArrayList<? super X> l)
--> X can be either class or interface
--> if X is a class then we can call this method by passing arraylist of either X type or its
	super classes
--> if X is an interface then we can call this method by passing arraylist of either X type or 
	super class of implementaion class of X
--> But within the method we can add X types of objects and null to the list 
 
ArrayList<String> l = new ArrayList<String>();
ArrayList<?> l2 = new ArrayList<String>();
ArrayList<?> l3 = new ArrayList<Integer>();
ArrayList<? extends Number> l4 = new ArrayList<Integer>();
ArrayList<? extends Number> l5 = new ArrayList<String>();//CE: implementation to Number required
ArrayList<? super String> l6 = new ArrayList<Object>();
ArrayList<?> l7 = new ArrayList<?>();//CE: class or interface required without bounds, on right side ? is not allowed
ArrayList<?> l8 = new ArrayList<? extends Number>();//CE: class or interface required without bounds, on right side ? is not allowed
 */
public class _04_Wild_card {public static void main(String[] args) {}}
