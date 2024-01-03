package exceptions;

public class IllegalArgumentExceptionDemo {
	
	void method1(int a) {
		System.out.println("A = "+a);
	}

	public static void main(String[] args) {
		IllegalArgumentExceptionDemo obj = new IllegalArgumentExceptionDemo();
		//obj.method1("a");

	}

}
