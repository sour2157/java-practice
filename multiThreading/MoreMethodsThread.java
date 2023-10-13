package multiThreading;

class MyThread3 extends Thread {
	public void run() {
		int count = 1;
		
		while(true) {
			System.out.println(count++ + "My Thread");
		}
	}
}

public class MoreMethodsThread {

	public static void main(String[] args) throws Exception {
		MyThread3 mt = new MyThread3();
		mt.setDaemon(true); 
		mt.start();
		Thread mainThread = Thread.currentThread();
		mainThread.join();
		
//		try {
//			Thread.sleep(100);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

	}

}
