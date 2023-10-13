package multiThreading;

class Atm {
	synchronized public void checkBalance(String name) {
		System.out.print(name + " checking");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(" balance");
	}
	
	synchronized public void withdraw(String name, int amt) {
		System.out.print(name + " withdrawing ");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(amt);
	}
	
}

class Customer extends Thread {
	String name;
	int amt;
	Atm atm;
	
	public Customer(String n, int a, Atm atm) {
		this.name = n;
		this.amt = a;
		this.atm = atm;
	}
	
	public void useAtm() {
		atm.checkBalance(name);
		atm.withdraw(name, amt);
	}
	
	public void run() {
		useAtm();
	}
}

public class AtmDemo {

	public static void main(String[] args) {
		Atm atm = new Atm();
		Customer c1 = new Customer("Rob", 1000, atm);
		Customer c2 = new Customer("Will", 500, atm);
		
		c1.start();
		c2.start();

	}

}
