package problem5;

public class Client {
	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine(3, 1000); // ���� ��� 3��, ���� ���� 1000��
		
		machine.insertMoney(1000);
		machine.insertMoney(500);
		machine.pushedButton();
		machine.pushedButton();
		machine.returnMoney();
		machine.insertMoney(1000);
		machine.insertMoney(1000);
		machine.pushedButton();
		machine.pushedButton();
		machine.returnMoney();
		machine.pushedButton();
	}
}
