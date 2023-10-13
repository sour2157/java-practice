package lambda;

public class ThreadDemo {

	public static void main(String[] args) {
		
		//using runnable interface and calling run method using lambda
		Runnable r = () -> { 
			for(int i=0; i < 10; i++) {
				System.out.println("Child thread");
			};
		};
		
		Thread t = new Thread(r); // create new thread object that will run runnable interfaces run method
		t.start(); // start the child thread
		
		//main thread will run the following
		for(int i=0; i < 10; i++) {
			System.out.println("Main thread");
		};

	}

}
