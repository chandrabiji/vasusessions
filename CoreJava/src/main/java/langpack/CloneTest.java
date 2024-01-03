package langpack;

public class CloneTest implements Cloneable{
	//instance variable
	public int a = 10;
	public int b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneTest t1 = new CloneTest();
		System.out.println("A = "+t1.a);
		System.out.println("B = "+t1.b);
		CloneTest t2 = (CloneTest) t1.clone();
		System.out.println("Clone Object A value = "+t2.a);
		System.out.println("Clone Object B value = "+t2.b);

	}

}
