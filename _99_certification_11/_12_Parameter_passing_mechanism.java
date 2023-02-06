package _99_certification_11;
/*
Parameter Passing Mechanism:

Q.
class Test{
	public void m1(int i, int j) {
		i=i+10;
		j=j+20;
		System.out.println("Inside Method:"+i+":"+j);
	}
	public static void main(String[] args) {
		int i=100;
		int j=200;
		Test t = new Test();
		t.m1(i, j);
		System.out.println("After completing method:"+i+":"+j);
	}
	
}

answer:
Inside Method:110:220
After completing method:100:200
----

Q. o/p?
class Demo{
	int x;
	Demo(int x){
		m1(x);
	}
	public void m1(int x) {
		this.x= 3*x;
	}
	public static void main(String[] args) {
		int x=10;
		Demo d = new Demo(x);
		System.out.println(x);
	}
}

answer: 10
---

Q.
class Demo{
	int x;
	Demo(int x){
		m1(x);
	}
	public void m1(int x) {
		this.x= 3*x;
	}
	public static void main(String[] args) {
		int x=10;
		Demo d = new Demo(x);
		System.out.println(d.x+":"+x);
	}
}

answer:
30:10
----

Q.
class Demo{
	int x;
	public void m1(int x) {
		this.x= x+x*x;
	}
	public static void main(String[] args) {
		int x=10;
		Demo d = new Demo();
		d.m1(x);
		d.m1(x);
		d.m1(x);
		System.out.println(d.x+x);
	}
}

answer: 120
---

Q.
class Demo{
	int x;
	public int m1(int x) {
		this.x= this.x+x*x;
		return x;
	}
	public static void main(String[] args) {
		int x=10;
		Demo d = new Demo();
		System.out.println(d.m1(x));
		System.out.println(d.m1(x));
		System.out.println(d.x+x);
	}
}

answer:
10
10
210
---

Q.
class Demo{
	int x;
	int y;
}
class Test{
	public void m1(Demo d) {
		d.x=888;
		d.y=999;
		System.out.println("Inside method:"+d.x+":"+d.y);
	}
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.x=10;
		d1.y=20;
		
		Test t = new Test();
		t.m1(d1);
		System.out.println("After completing method:"+d1.x+":"+d1.y);
	}
}

answer:
Inside method:888:999
After completing method:888:999
--------

Q.
class Book{
	int pages;
	double cost;
	Book(int pages, double cost){
		this.pages=pages;
		this.cost=cost;
	}
}
class Test{
	public void updateBook(Book b, double newCost) {
		b.pages=400;
		b.cost=b.cost+newCost;
	}
	public static void main(String[] args) {
		Book b = new Book(264, 100.0);
		Test t = new Test();
		double newCost=200.0;
		t.updateBook(b, newCost);
		t.updateBook(b, newCost);
		System.out.println(b.pages+":"+newCost);
	}
}

answer: 400:200.0
----

 */
public class _12_Parameter_passing_mechanism {
	public static void main(String[] args) {
		
	}
}