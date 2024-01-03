package oops;
class Parent{
	public void m1() {
		System.out.println("Parent m1 method");
	}
     void m3() {
		System.out.println("Parent private m3 method");
	}
}
class Child extends Parent{
	public void m2() {
		System.out.println("Child m2 method");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();

	}

}
