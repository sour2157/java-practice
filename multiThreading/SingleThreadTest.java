package multiThreading;

public class SingleThreadTest extends Thread {
	
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+ " Hello");
			i++;
		}
	}

	public static void main(String[] args) {
		SingleThreadTest m = new SingleThreadTest();
		m.start();
		
		int i=1;
		while(true) {
			System.out.println(i+ " World");
			i++;
		}
	}

}
