package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileToFile {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("abc.txt");
		FileOutputStream fos = new FileOutputStream("pqr.txt");
		int k;
		System.out.println("Reading Started");
		while((k=fis.read())!=-1) {
			fos.write(k);
		}
		System.out.println("Writing completed");
	}

}
