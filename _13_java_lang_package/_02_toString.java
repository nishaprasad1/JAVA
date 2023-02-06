package _13_java_lang_package;

/*

1. toString()
--> we can use toString() to get string representation of an object.
		           +-----+
		String s = | Obj |.toString();
                   +-----+
--> whenever we are trying to print Object reference internally toString() method
    will be called.
    
    eg: Student s = new Student();
    	System.out.println(s);  ==>  System.out.println(s.toString());
                   
--> If our class doesn't contain toString() method then object class toString() method
    will be executed.

		class Student{
			String name;												 +----------+	
			int rollNo;												s1-->| Durga    | 
			Student(String name, int rollNo){                            | 101      |
				this.name=name;                                          +----------+
				this.rollNo=rollNo;
			}															  +---------+
			public static void main(String[] args) {                 s2-->| Ravi    |
				Student s1= new Student("Durga",101);                     | 102     |
				Student s2= new Student("Ravi",102);                      +---------+
				
				System.out.println(s1);//Student@75a1cd57
				System.out.println(s1.toString());//Student@75a1cd57
				System.out.println(s2);//Student@515f550a
			}
		}
--> In the above example Object class toString() method got executed which is
implemented as follows:

	public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

ie, classname@hashCode_in_hexadecimal_form

--> Based on our requirement, we can override toString() method to provide
our own string representation,
 for example whenever we are trying to print Student object reference to print
 his name and rollNumber we need to override toString() method as follows:
 
	 	public String toString() {
			return name+"..."+rollNo;
		}
 
--> In all wrapper classes, in all Collection classes, String class, StringBuffer/StringBuilder
 classes toString() method is overridden for meaningful object representation, hence it is
 highly recommended to override toString() in our class also.


		class Test{
			public String toString() {
				return "test";
			}
			public static void main(String[] args) throws ClassNotFoundException {
				String s = new String("durga");
				System.out.println(s);// durga
				
				Integer i = new Integer(10);
				System.out.println(i);//10
				
				ArrayList l = new ArrayList();
				l.add("A");
				l.add("B");
				System.out.println(l);//[A, B]
				
				Test t = new Test();
				System.out.println(t);//test
			}
		}
 */
public class _02_toString {}