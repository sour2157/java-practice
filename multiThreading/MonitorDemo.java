package multiThreading;

class MyData {
	//we can use synchronized method with display method
	//like this - synchronized void display(String str)
	void display(String str) {
		//for using monitor, inbuilt in java
		synchronized (this) {
			for(int i=0; i<str.length(); i++) {
				System.out.println(str.charAt(i));
			}
		}
	}
}

class Thread1 extends Thread {
	MyData d;
	Thread1(MyData dat) {
		d = dat;
	}
	
	public void run() {
		d.display("Hello World ");
	}
}

class Thread2 extends Thread {
	MyData data;
	Thread2(MyData dat) {
		data = dat;
	}
	
	public void run() {
		data.display("Welcome");
	}
}

public class MonitorDemo {

	public static void main(String[] args) {
		MyData m = new MyData();
		Thread1 t1 = new Thread1(m);
		Thread2 t2 = new Thread2(m);
		
		t1.start();
		t2.start();

	}

}
