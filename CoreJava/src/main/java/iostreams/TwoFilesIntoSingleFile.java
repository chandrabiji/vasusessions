package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TwoFilesIntoSingleFile {

	public static void main(String[] args)throws IOException {
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		FileInputStream fis1 = new FileInputStream("abc.txt");
		FileInputStream fis2 = new FileInputStream("pqr.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		int k;
		System.out.println("Reading Started...");
		while((k=sis.read())!=-1) {
			fos.write(k);
		}
		System.out.println("Writing Completed...");
		

	}

}
