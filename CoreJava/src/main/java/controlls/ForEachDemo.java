package controlls;

public class ForEachDemo {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("---Normal for Loop---");
		for(int i=0;i<arr.length;++i) {
			System.out.println(arr[i]);
		}
		System.out.println("--forEach Loop--");
		for(int k:arr) {
			System.out.println(k);
		}

	}

}
