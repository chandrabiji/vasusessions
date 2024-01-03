package exceptions;

import java.util.Scanner;

class TooYoungException extends RuntimeException{
	
	TooYoungException(String msg){
		super(msg);
	}
}
class TooOldException extends RuntimeException{
	public TooOldException(String msg) {
		super(msg);
	}
}
public class CustomExceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age ?");
		int age = sc.nextInt();
		if(age<18) {
			System.out.println("-1--");
			throw new TooYoungException("You have to wait some more time for vote");
			
		}else if(age>60) {
			throw new TooOldException("You have to take care.");
		}

	}

}
