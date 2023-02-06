package _13_java_lang_package;
/*
 3. equals():
 
--> we can use equals method to check equality of two objects.
	eg: obj1.equals(obj2);
	
--> If our class doesn't contains equals() method, then Object class
	equals method will be executed.

 
			class Student{													+--------+
				String name;										s1--->  | Durga  |
				int rollNo;											s4--->	|  101	 |	
				Student(String name, int rollNo){            				+--------+
					this.name=name;
					this.rollNo=rollNo;
				}													       +-------+
				public static void main(String[] args) {			s2---> |  Ravi |
					Student s1 = new Student("Durga", 101);  			   |  102  |	
					Student s2 = new Student("Ravi", 102);				   +-------+	
					Student s3 = new Student("Durga", 101);
					Student s4 = s1;									   +-------+	
					System.out.println(s1.equals(s2));//false		s3-->  | Durga |
					System.out.println(s1.equals(s3));//false   		   |  101  |	
					System.out.println(s1.equals(s4));//true			   +-------+
				}
			}
--> In the above example Object class equals method got executed which is meant for
	reference comparison(address comparison). ie, if two references pointing to
	same object then only .equals() method returns true.
	
--> Based on our requirement we can override equals() method for content comparison.
		while overriding equals() method for content comparison we have to take care
		about the following:
		1) what is the meaning of equality(ie, whether we have to check only names or only rollNo or both).
		2) If we are passing different type of object, our equals() method should not raise ClassCastException
			ie, we have to handle ClassCastException to return false.
		3) If we are passing null argument then out equals() method should not raise NullPointerException
			ie, we have to handle NullPointerException to return false.
			
--> the following is the proper way of overriding equals() method for Student class content comparison:
	
	public boolean equals(Object obj){
		try{
			String name1= this.name;
			int rollNo1= this.rollNo;
			Student s= (Student) obj;// this line can cause ClassCastException
			 						//	if we pass any other object in equals() method, ie st.equals("Chandrakesh");
			
			String name2= s.name;  // these lines can cause NullPointerException
			int rollNo2= s.rollNo;//  if we pass null in equals() method, ie st.equals(null);
			
			if(name1.equals(name2) && rollNo1==rollNo2)
				return true;
			else
				return false;
		}catch(ClassCastException e){
			return false;
		}catch(NullPointerException e){
			return false;
		}
	}
	
---->

	class Student{
		String name;
		int rollNo;
		Student(String name, int rollNo){
			this.name=name;
			this.rollNo=rollNo;
		}
	
		public boolean equals(Object obj){
			try{
				String name1= this.name;
				int rollNo1= this.rollNo;
				Student s= (Student) obj;// this line can cause ClassCastException
				 						//	if we pass any other object in equals() method, ie st.equals("Chandrakesh");
				
				String name2= s.name;  // these lines can cause NullPointerException
				int rollNo2= s.rollNo;//  if we pass null in equals() method, ie st.equals(null);
				
				if(name1.equals(name2) && rollNo1==rollNo2)
					return true;
				else
					return false;
			}catch(ClassCastException e){
				return false;
			}catch(NullPointerException e){
				return false;
			}
		}
		public static void main(String[] args) {
			Student s1 = new Student("Durga", 101);
			Student s2 = new Student("Ravi", 102);
			Student s3 = new Student("Durga", 101);
			Student s4 = s1;
			System.out.println(s1.equals(s2));//false
			System.out.println(s1.equals(s3));//true
			System.out.println(s1.equals(s4));//true
			System.out.println(s1.equals("durga"));//false
			System.out.println(s1.equals(null));//false
		}
	}
	
	
---> simplified version of equals() method:


	public boolean equals(Object obj){
		try{
			Student s= (Student) obj;
			
			if(name.equals(s.name) && rollNo==s.rollNo)
				return true;
			else
				return false;
		}catch(ClassCastException e){
			return false;
		}catch(NullPointerException e){
			return false;
		}
	}
	
---> more simplified version of equals() method:

		public boolean equals(Object obj){
			if(obj instanceof Student) {
				Student s= (Student) obj;
				if(name.equals(s.name) && rollNo==s.rollNo)
					return true;
				else
					return false;
			}
			return false;
		}
		
Note: to make above equals() method more efficient we have to write
	  at the beginning inside equals() method:
	  
	  +--------------------------------+
	  |		  if(this == obj)          |
	  |		  		return true;       |
	  +--------------------------------+
	  
	  according to this if both the references pointing to the same object
	  then without performing any comparison .equals() method returns true directly.
--------------


String s1= new String("durga");                         StringBuffer sb1 = new StringBuffer("durga");           
String s2= new String("durga");							StringBuffer sb2 = new StringBuffer("durga");
System.out.println(s1==s2);//false			  			System.out.println(sb1 == sb2);//false	
System.out.println(s1.equals(s2));//true			  	System.out.println(sb1.equals(sb2));//false	

-->In String class .equals() method is                  --> In StringBuffer equals() method is not overridden
	overridden for content comparison						for content comparison, hence if objects are different
	hence, even though objects are                          equals() method returns false even though content is 
	different if content is same then						same.
	equals() method returns true. 


 */
public class _04_equals {public static void main(String[] args) {}}