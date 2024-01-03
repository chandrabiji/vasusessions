package basics;
class Parent{
	Parent(){
		System.out.println("Parent Default Constructor");
	}
	Parent(int i){
		this();
		System.out.println("Parent Parameterized Constructor");
	}
}
public class Child extends Parent{
	
	Child(){
		this(10);
	   System.out.println("Default Child Constructor");	
	}
	
	Child(int i){
		super(10);
		System.out.println("Parameterized Child Constructor");
	}

	public static void main(String[] args) {
		Child c = new Child();

	}

}
