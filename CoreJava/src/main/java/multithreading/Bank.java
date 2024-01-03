package multithreading;

class Customer {
	public double balance = 10000;

	public synchronized void deposit(double damount) {
		balance = balance + damount;
		System.out.println("Successfully Deposit Completed");
		System.out.println("Updated balance = " + balance);
		notify();
	}

	public synchronized void withdraw(double wamount) throws InterruptedException {
		if (balance >= wamount) {
			System.out.println("Current Account Balance = " + balance);
			balance = balance - wamount;
			System.out.println("Successfully Withdraw Completed");
			System.out.println("Updated Account Balance = " + balance);
		} else {
			System.out.println("Your Account Balance is Low. Please deposit and continue");
            wait();
            balance = balance - wamount;
			System.out.println("Successfully Withdraw Completed");
			System.out.println("Updated Account Balance = " + balance);
		}
	}
}

public class Bank {

	public static void main(String[] args) {
		final Customer c = new Customer();
		Thread t1 = new Thread() {
			public void run() {
				try {
					c.withdraw(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				c.deposit(10000);
			}
		};
		t2.start();
	}

}
