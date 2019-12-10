package problem5;

public class Drinking {
	private int price; // 음료 가격
	private int stock; // 재고
	
	public Drinking(int stock, int price) { // 음료 가격이랑 재고 초기화
		this.price = price;
		this.stock = stock;
	}
	
	public void dispenseStock() { // 음료를 뽑으면 재고하나가 빠진다.
		this.stock -= 1;
	}
	public int getPrice() {
		return price;
	}
	
	public int getStock() {
		return stock;
	}
}
