package iostreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileToConsole {

	public static void main(String[] args)throws IOException {
		FileInputStream fis = new FileInputStream("abc.txt");
		int k;
		while((k=fis.read())!=-1) {
			System.out.print((char)k);
		}

	}

}
