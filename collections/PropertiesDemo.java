package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		
		p.setProperty("Brand", "Dell");
		p.setProperty("Processor", "i7");
		p.setProperty("OS", "Windows10");
		p.setProperty("Model", "Latitude");
		
		System.out.println(p);
		
		p.storeToXML(new FileOutputStream("/Users/sourabhraje/my_new_file.xml"), "Laptop");

		p.loadFromXML(new FileInputStream("/Users/sourabhraje/my_new_file.xml"));
	}

}
