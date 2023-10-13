package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class CopyDataFromTwoFiles {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("/Users/sourabhraje/my_new_file.txt");
		FileInputStream fis2 = new FileInputStream("/Users/sourabhraje/my_new_file_1.txt");
		FileOutputStream fo = new FileOutputStream("/Users/sourabhraje/destination.txt");
		
		SequenceInputStream seq = new SequenceInputStream(fis, fis2);
		
		int b;
		
		while((b=seq.read()) != -1) {
			fo.write(b);
		}
		
		
		fo.close();
		fis.close();
		fis2.close();

	}

}
