package _13_java_lang_package;

/*

5. getClass()

--> we can use getClass() method to runtime class definition of an object

			+--------------------------------+
			| public final Class getClass()  |
			+--------------------------------+


example 1:  by using this Class class object, we can access class level properties
			like fully qualified name of the class, methods information, constructors information etc.
 
			class Test{
				public static void main(String[] args) {
					int count=0;
					Object o = new String("durga");
					Class c = o.getClass();
					System.out.println("Fully Qualified name of the class: "+c.getName());
					Method[] m = c.getDeclaredMethods();
					System.out.println("Method information:");
					for(Method m1: m) {
						count++;
						System.out.println(m1.getName());
					}
					System.out.println("The number of methods: "+count);
				}
			}


example 2:  to display database vendor specific connection interface implemented class
			name.
			
			Connection con = DriverManager.getConnection(.....);
			System.out.println(con.getClass().getName());

Note: 1) after loading every .class file, jvm will create an object of type java.lang.Class
		 in the heap area. Programmer can use this class object to get class level information.
	  2) we can use getClass() method very frequently in reflections.
 */
public class _05_getClass {public static void main(String[] args) {}}