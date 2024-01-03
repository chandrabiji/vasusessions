package p1;

public class A {
    //instance variables
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d =40;
	//static variable
	static int e = 50;
	public static void main(String[] args) {
		int f = 60;//Local variable
		A obj = new A();//instance or object
		System.out.println("A = "+obj.a);
		System.out.println("B = "+obj.b);
		System.out.println("C = "+obj.c);
		System.out.println("D = "+obj.d);
		System.out.println("E = "+e);

	}
	public void m1() {
		System.out.println("E = "+e);
	}

}
