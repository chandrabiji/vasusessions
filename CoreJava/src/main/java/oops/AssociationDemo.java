package oops;

class Course{
	public int cid;
	public String cname;
	public Course(int cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}

}
class Student{
	public int sid;
	public String sname;
	public Course course;
	public Student(int sid, String sname, Course course) {
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}
	
}
public class AssociationDemo {

	public static void main(String[] args) {
		Course c1 = new Course(1,"Java");
		Student s1 = new Student(100,"abc",c1);
		System.out.println("Student Id : "+s1.sid);
		System.out.println("Student Name: "+s1.sname);
		System.out.println("Course Name : "+s1.course.cname);

	}

}
