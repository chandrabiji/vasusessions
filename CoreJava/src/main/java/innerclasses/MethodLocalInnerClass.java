package innerclasses;

public class MethodLocalInnerClass {

	private int data = 20;
	
	public void display() {
		class MethodInner{
			public void m1() {
				System.out.println("Data = "+data);
			}
		}
		MethodInner mi = new MethodInner();
		mi.m1();
	}
	public static void main(String[] args) {
		MethodLocalInnerClass obj = new MethodLocalInnerClass();
		obj.display();

	}

}
