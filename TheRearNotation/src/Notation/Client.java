package Notation;

public class Client {
	public static void main(String[] args) {
		Calculate cl = new Calculate("10+9");
		//cl.changeToPostfix();
		cl.print();
	}
}
