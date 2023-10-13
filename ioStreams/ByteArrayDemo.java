package ioStreams;

import java.io.*;

public class ByteArrayDemo {

	public static void main(String[] args) throws IOException {
		byte b[] = {'a','b','c','d','e','f','g','h'};
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		
		int x;
		
		while((x=bis.read()) != -1) {
			System.out.print((char)x);
			System.out.print(x);
		}
		bis.close();
		System.out.println();
		ByteArrayOutputStream bos = new ByteArrayOutputStream(10);
		bos.write('a');
		bos.write('d');
		bos.write('c');
		bos.write('x');
		
		byte b1[] = bos.toByteArray();
		
		for(byte z:b1) {
			System.out.print((char)z);
			System.out.print(z);
		}
		bos.close();
	}

}
