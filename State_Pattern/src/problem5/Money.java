package problem5;

public class Money {
	private int money = 0;
	
	
	public int getMoney() { // ���� ���� ������ ���
		return money;
	}
	
	public void insertMoney(int money) { // ���� ���� ���Ѵ�.
		this.money += money;
	}
	
	public void diepenseMoney(int money) { // ���Ḧ ������ �� �׼����� ���� ������ ����.
		this.money -= money;
	}
	
	public int returnMoney() { // ���� ��ȯ�Ѵ�.
		int temp = money;
		money = 0;
		return temp;
	}
}
