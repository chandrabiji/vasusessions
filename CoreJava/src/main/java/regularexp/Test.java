package regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// 1st way
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b1 = m.matches();
		System.out.println(b1);
		
		//2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);
		
		//3rd way
		boolean b3 = Pattern.matches(".s", "as");
		System.out.println(b3);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Email Id?");
		String email = sc.next();
		while(!Pattern.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", email)) {
			System.err.println("Please enter correct Email Pattern");
			email = sc.next();
		}
		System.out.println("Correct Email Id : "+email);

	}

}
