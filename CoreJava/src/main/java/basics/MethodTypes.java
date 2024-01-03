package basics;

public class MethodTypes {
    //Instance Method & void method
	public void hello() {
		System.out.println("Hello...");
		test();
	}
	//static method
	public static void test() {
		System.out.println("from static method");
	}
	//final method
	public final void finalMethod() {
		System.out.println("from final method");
	}
	//synchronized method
	public synchronized void bookTicket() {
		System.out.println("from book Ticket");
	}
	private void privateMethod() {
		System.out.println("from private method");
	}
	public void varargsDemo(int ...i) {
		System.out.println("This is var args method");
	}
	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();//Instance or object
		obj.hello();
		test();
		obj.finalMethod();
		obj.bookTicket();
		obj.privateMethod();
		obj.varargsDemo();
		obj.varargsDemo(1);
		obj.varargsDemo(1,2);
		obj.varargsDemo(1,2,3);
		Student s1 = new Student();
		s1.setName("Krishna");
		System.out.println(s1.getName());
		
		
		
		

	}

}
