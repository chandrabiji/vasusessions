package exceptions;

public class Test {

	public static void main(String[] args) {
		System.out.println("first line");
		try {
		System.out.println(10/0);
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			System.err.println("Some Error");
			
		}catch(Exception e){
			
		}finally {
			//System.exit(0);
			System.out.println("finally");
		}
		System.out.println("last line");

	}

}
