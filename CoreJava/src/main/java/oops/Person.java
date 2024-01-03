package oops;
//class = common(variables + methods)
public class Person {
	
	//common variables
	public String name;
	public int age;
	
	//common methods
	public void eat() {
		System.out.println("eat nice food");
	}
	public void sleep() {
		System.out.println("Mr.  "+name+" sleep well");
	}

	public static void main(String[] args) {
		Person boy = new Person();//Object = Instance of a class
		boy.name="Charan";
		boy.age = 12;
		boy.eat();
		boy.sleep();

	}

}
