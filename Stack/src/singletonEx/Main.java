package singletonEx;

//class User{
//	private String name;
//	public User(String name) {
//		this.name = name;
//	}
//	
//	public void print() {
//		Printer printer = Printer.getInstance();
//		printer.print(this.name + " print using " + printer.toString());
//	}
//}
//
//class Printer { // 싱글턴으로 생선
//	private static Printer printer = null;
//	private Printer() {}
//	public static Printer getInstance() {
//		if(printer == null)
//			printer = new Printer();
//		
//		return printer;
//	}
//	
//	public void print(String str) {
//		System.out.println(str);
//	}
//	
//}
public class Main {
	private static final int USER_NUM = 5;
	
	public static void main(String[] args) {
//		User[] user = new User[USER_NUM];
//		for(int i = 0; i < USER_NUM; i++) {
//			user[i] = new User((i + 1) + "-user");
//			user[i].print();
//		}
	}
}
