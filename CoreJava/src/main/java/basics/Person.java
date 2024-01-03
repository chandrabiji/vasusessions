package basics;

public class Person {

	public int pid;
	public String pname;
	public String city;
	
	
	public Person(int pid, String pname, String city) {
		this.pid = pid;
		this.pname = pname;
		this.city = city;
	}
	
	public void greet() {
		System.out.println("Welcome to Mr. "+pname);
	}


	public static void main(String[] args) {
		Person p1 = new Person(100,"abc","Hyderabad");
		p1.greet();
	}

}
