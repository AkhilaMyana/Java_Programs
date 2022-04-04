package wiproproject;

import java.io.File;
import java.io.IOException;

public class Code1 {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\file\\file.txt");
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		
	}

}
