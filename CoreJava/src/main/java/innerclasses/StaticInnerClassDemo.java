package innerclasses;

public class StaticInnerClassDemo {
	
	private static int data = 40;
	
	private static class StaticInner{
		static  void m1() {
			System.out.println("Data = "+data);
		}
	}

	public static void main(String[] args) {
		StaticInner.m1();

	}

}
