package multithreading;
class A{
	
}
public class RunnableDemo extends A implements Runnable{

	@Override
	public void run() {
		for(int i=6;i<=10;++i) {
			System.out.println("Inside run method : "+i+" "+Thread.currentThread().getPriority()+" "+Thread.currentThread().getName());
		}
		
	}
	public static void main(String[] args) {
		RunnableDemo obj = new RunnableDemo();
		Thread t1 = new Thread(obj);
		t1.setName("One");
		Thread t2 = new Thread(obj);
		t2.setName("Two");
		t2.setPriority(10);
		Thread t3 = new Thread(obj);
		t3.setName("Three");
		t3.setPriority(4);
		t1.start();
		t2.start();
		t3.start();
		for(int i=1;i<=5;++i) {
			System.out.println("Inside main Method : "+i+" "+Thread.currentThread().getPriority()+" "+Thread.currentThread().getName());
		}

	}

	

}
