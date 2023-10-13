package multiThreading;

class MyRun implements Runnable {
	public void run() {}
}

class MyThread2 extends Thread {
	public MyThread2(String name) {
		super(name);
		setPriority(MAX_PRIORITY);
	}
}

public class ThreadMethods {

	public static void main(String[] args) throws Exception {
		Thread t = new Thread(new MyRun());
		MyThread2 mt = new MyThread2("My Thread 1");
		System.out.println(mt.getId());
		System.out.println(mt.getName());
		System.out.println(mt.getPriority());
		mt.start();
		System.out.println(mt.getState());
		System.out.println(mt.isAlive());
	}

}
