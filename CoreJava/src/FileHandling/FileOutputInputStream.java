package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputInputStream {
	public static void main(String[] args) throws IOException {
//		String msg = "file handling by file output input stream";
//		FileOutputStream fos = new FileOutputStream("t1.txt");
//		byte b[] = msg.getBytes();
//		fos.write(b);
//		fos.flush();
//		fos.close();
//		System.out.println("file written successfully");
		
		FileInputStream fis = new FileInputStream("t1.txt");
		int i;
		while((i = fis.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
