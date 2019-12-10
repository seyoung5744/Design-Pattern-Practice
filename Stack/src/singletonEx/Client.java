package singletonEx;

class UserThread extends Thread{
	public UserThread(String name) {
		super(name);
	}
	
	public void run() {
		Printer printer = Printer.getInstance();
		printer.print(Thread.currentThread().getName() + " print using " + printer.toString());
	}
}

class Printer{
	private static Printer printer = new Printer();
	private Printer() {}
	
	public static Printer getInstance() {
//		if(printer == null) {
//			try {
//				Thread.sleep(1);
//			}catch(InterruptedException e) {}
//			printer = new Printer();
//		}
		return printer;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
}
public class Client {
	private static final int USER_NUM = 5;
	
	public static void main(String[] args) {
		UserThread[] user = new UserThread[USER_NUM];
		for(int i = 0; i < USER_NUM; i++) {
			user[i] = new UserThread((i + 1) + "- thread");
			user[i].start();
		}
	}
}
