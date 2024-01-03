package iostreams;

import java.io.IOException;

public class ConsoleToConsole {

	public static void main(String[] args) {
		int k;
		System.out.println("To Stop reading type '@'");
		try {
			while((k=System.in.read())!='@') {
				System.out.print((char)k);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
