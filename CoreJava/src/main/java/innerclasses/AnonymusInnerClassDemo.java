package innerclasses;

interface Test{
	public void m1();
}
public class AnonymusInnerClassDemo {

	public static void main(String[] args) {
		Test t = new Test() {
			public void m1() {
				System.out.println("Inner class Implemented");
			}
		};
		t.m1();

	}

}
