package basics;
/**
 * 
 * @author Chandra Sekhar
 *
 */
public class Student {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		/*
		 * s1.name = "Charan"; System.out.println(s1.name);
		 */
		
		 s1.setName("Chandra"); 
		 System.out.println(s1.getName());
		 

	}

}
