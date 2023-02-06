package _06_OOP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;

public class _26_ways_to_create_objects_in_java {
/*
 * Q) In how many ways we can create object in java?
 * 					 or
 *    In how many ways we can create get object in java?
 *
 * 
 * 		Test_26 t = new test();
 */
}
class Test_26{
	public static void main(String[] args) {
//		1. By using new operator:
		Test_26 t1 = new Test_26();
		
//		2. By using newInstance() method
		try {
			Test_26 t2 = (Test_26) Class.forName("_06_OOP.Test_26").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
//		3. By using factory method   63 41:44
		Runtime r = Runtime.getRuntime();
		DateFormat df = DateFormat.getInstance();
		
//		4. By using clone() method
		Test_26 t5 = new Test_26();
		try {
			Test_26 t15 = (Test_26) t5.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
//		5. By using deserialization
		try {
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog d = (Dog) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
class Dog{
	
}