package ioStreams;

import java.io.FileOutputStream;

public class FileExample {
 
	public static void main(String[] args) throws Exception {
		try(FileOutputStream fo = new FileOutputStream("/Users/sourabhraje/my_new_file.txt")) {
			
			String str = "Learn Java Programming";
			
			fo.write(str.getBytes());
			
			
		}
	}

}
