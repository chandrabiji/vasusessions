package multithreading;

public class ThreadDemo extends Thread {
	
	public void run() {
		for(int i=6;i<=10;++i) {
			System.out.println("Inside run method : "+i+" "+Thread.currentThread().getPriority());
		}
	}
	
	public void start() {
	
		System.out.println("--start method--");
		super.start();
	}

	public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();
		obj.setPriority(MAX_PRIORITY);
		obj.start();
		for(int i=1;i<=5;++i) {
			System.out.println("Inside main Method : "+i+" "+Thread.currentThread().getPriority());
		}

	}

}
