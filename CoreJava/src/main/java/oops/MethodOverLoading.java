package oops;
//Method Overloading = within the class same method with different parameters is nothing 
//method overloading.
public class MethodOverLoading {
	
	public int add(int i, int j) {
		return i+j;
	}
	public int add(int i, int j,int k) {
		return i+j+k;
	}

	public static void main(String[] args) {
		MethodOverLoading ml = new MethodOverLoading();
		System.out.println(ml.add(10, 20));
		System.out.println(ml.add(10, 20, 30));

	}

}
