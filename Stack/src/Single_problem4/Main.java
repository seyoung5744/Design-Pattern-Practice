package Single_problem4;

import java.util.Random;

class Printer{
	private boolean available = true;
	public boolean isAvailable() {
		return available;
	}
	
	public void print(String name) {
		try {
		Thread.sleep(new Random().nextInt(100));
		System.out.println(name + " is using " + this.toString());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		setAvailable(true);  // 다 사용하고 다시 사용할 수 있게 true로 set
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}
}

class UserThread extends Thread{
	private Printer myPrinter;
	
	public UserThread(String name) {
		super(name);
	}
	
	public void run() {
		PrinterManager mgr = PrinterManager.getPrinterManager();
		myPrinter = mgr.getPrinter();
		myPrinter.print(getName());
	}
}
public class Main {
	private static final int THREAD_NUM = 10;
	public static void main(String[] args) {
		UserThread[] user = new UserThread[THREAD_NUM];
		for(int i = 0; i < THREAD_NUM; i++) {
			user[i] = new UserThread((i+1) + "-thread");
			user[i].start();
		}
	}
}
