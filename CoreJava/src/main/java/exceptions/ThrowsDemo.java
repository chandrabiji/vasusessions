package exceptions;

public class ThrowsDemo {
	
	public void method()throws ArithmeticException,NullPointerException {
		System.out.println(10/0);
	}

	public static void main(String[] args) {
		ThrowsDemo obj = new ThrowsDemo();
		System.out.println("first line");
		try {
			obj.method();
		} catch (ArithmeticException | NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Last line");
		

	}

}
