package iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleToFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("abc.txt");
		int k;
		System.out.println("To stop reading type '@'");
		while((k=System.in.read())!='@') {
			fos.write(k);
		}
	}

}
