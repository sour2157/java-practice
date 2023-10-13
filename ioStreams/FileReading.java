package ioStreams;

import java.io.FileInputStream;

public class FileReading {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("/Users/sourabhraje/my_new_file.txt")) {
			byte b[] = new byte[fis.available()];
			fis.read(b);
			
			String str = new String(b);
			
			System.out.println(str);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
