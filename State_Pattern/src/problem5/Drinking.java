package problem5;

public class Drinking {
	private int price; // ���� ����
	private int stock; // ���
	
	public Drinking(int stock, int price) { // ���� �����̶� ��� �ʱ�ȭ
		this.price = price;
		this.stock = stock;
	}
	
	public void dispenseStock() { // ���Ḧ ������ ����ϳ��� ������.
		this.stock -= 1;
	}
	public int getPrice() {
		return price;
	}
	
	public int getStock() {
		return stock;
	}
}
