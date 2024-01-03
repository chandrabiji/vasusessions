package basics;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size ?");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Elements ?");
		for(int i=0;i<size;++i) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are:");
		int sum = 0;
		for(int k:arr) {
			sum +=k;//sum =sum+k;
			System.out.println(k);
		}
		System.out.println("Total  = "+sum);
		Arrays.sort(arr);
		System.out.println("After sorting Array Elements are:");
		for(int k:arr) {
			System.out.println(k);
		}
		System.out.println("min value = "+arr[0]);
		System.out.println("max value = "+arr[size-1]);
		System.out.println("2nd Highest value = "+arr[size-2]);
		

	}

}
