package _99_certification_11;
/*
Local variables:
--> variables inside methods, blocks or constructors.
--> stored in stack area.
--> default values not provided by JVM.

Q.
public class Test {
	public static void main(String[] args) {
		int i=0;
		for(int j=0;j<3;j++) {
			i=i+j;
		}
		System.out.println(i+":"+j);
	}
}

answer: CE, as j is local to for-loop hence cannot be accessed
at line 14.
----

Q.
class Test{
	public static void main(String[] args) {
		try {
			int x = Integer.parseInt("ten");
		}catch(NumberFormatException e) {
			x=10;
		}
		System.out.println(x);
	}	
}

answer: CE at line 28,30. variable 'x' is local to try-block.
----

Note: for instance and static variables, JVM will provide default values.
But for local variables, JVM won't provide default values, compulsory
we should perform initialization explicitly before using that variable. If
we are not using local variable, then we are not required to perform
initialization explicitly.
----

Q. o/p?

class Test{
	public static void main(String[] args) {
		int x;
		System.out.println("Hello");
	}	
}

answer: Hello
---

Q. o/p?
class Test{
	public static void main(String[] args) {
		int x;
		System.out.println("Hello:"+x);//CE:The local variable x may not have been initialized
	}	
}
answer: CE
---

Q.
class Test{
	public static void main(String[] args) {
		int x;
		if(args.length > 0) {
			x=10;
		}
		System.out.println(x);//CE:The local variable x may not have been initialized
	}	
}
answer: CE
---

Q.
class Test{
	public static void main(String[] args) {
		int x;
		if(args.length > 0) {
			x=10;
		}else {
			x=20;
		}
		System.out.println(x);
	}	
}
answer: compile success and o/p depends on runtime value
---

Q.
class Test{
	public static void main(String[] args) {
		int i;
		int j=10;
		if(j<5) {
			j=j++;	
		}else {
			j=j++;
			i=j--;
		}
		System.out.println(i+":"+j);
	}	
}

answer: CE:The local variable i may not have been initialized
---

Q.
class Test{
	static int i;
	public static void main(String[] args) {
		int j=10;
		if(j<5) {              	   ---> 10<5 ie, false
			j=++j;
		}else {
			j=++j;            			i=0,j=11
			i=--j;                		j=10, i=10
		}
		System.out.println(i+j);        10+10
	}	
}

answer: 20
---

Q. Inside a method, which of the following declarations are valid?

A) public int x=10;
B) static int x=10;
C) final int x=10;
D) private int x=10;
E) protected int x=10;

answer: C
---

Note: the only applicable modifier for local variables is final.

 */
public class _11_local_and_static_variables {
	public static void main(String[] args) {
		
	}
}