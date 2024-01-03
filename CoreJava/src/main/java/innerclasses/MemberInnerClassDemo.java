package innerclasses;

public class MemberInnerClassDemo {
	
	private int data = 10;
	
	class Member{
		public void m1() {
			System.out.println("Data = "+data);
		}
	}
	public void display() {
		Member m = new Member();
		m.m1();
	}

	public static void main(String[] args) {
		MemberInnerClassDemo obj = new MemberInnerClassDemo();
		obj.display();
		MemberInnerClassDemo.Member mObj = new MemberInnerClassDemo().new Member();
		mObj.m1();

	}

}
