package problem5;

public class Money {
	private int money = 0;
	
	
	public int getMoney() { // 현재 돈이 얼마인지 얻기
		return money;
	}
	
	public void insertMoney(int money) { // 넣은 돈을 합한다.
		this.money += money;
	}
	
	public void diepenseMoney(int money) { // 음료를 뽑으면 총 액수에서 음료 가격을 뺀다.
		this.money -= money;
	}
	
	public int returnMoney() { // 돈을 반환한다.
		int temp = money;
		money = 0;
		return temp;
	}
}
