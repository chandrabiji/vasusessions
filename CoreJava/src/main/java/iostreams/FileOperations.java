package iostreams;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		File f1 = new File("abc.txt");
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.isFile());
		File f3 = new File("Chandra");
		f3.mkdir();
		System.out.println(f3.isDirectory());
		File f2 = new File("Chandra","pqr.txt");
		f2.createNewFile();
		f1.delete();
		//f2.renameTo(f1);
		File f4 = new File("D:\\Angular5am");
		String[] fnames = f4.list();
		for(String name:fnames) {
			System.out.println(name);
		}
		

	}

}
