package ioStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


//copy file contents from one file to another and change to lowercase
public class FileCopyContents {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream fis = new FileInputStream("/Users/sourabhraje/my_new_file.txt")) {
			byte b[] = new byte[fis.available()];
			fis.read(b);
			
			String str = new String(b);
			
			FileOutputStream fo = new FileOutputStream("/Users/sourabhraje/my_new_file_1.txt");
			
			fo.write(str.toLowerCase().getBytes());
			
			fo.close();
			fis.close();
		}

	}

}
