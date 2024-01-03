package exceptions;

public class Student {
	
	public int sid;
	public String sname;
	public int marks;
	public Student(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	public String toString() {
		return sid+" "+sname+" "+marks;
	}
	public static void main(String[] args) {
		Student s1 = new Student(100,"abc",98);
		System.out.println(s1);
		System.out.println(s1.getClass().getName());

	}

}
