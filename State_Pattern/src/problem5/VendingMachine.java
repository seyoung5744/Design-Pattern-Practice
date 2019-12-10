package problem5;

// Context 역할
public class VendingMachine {
	private NoEnoughMoney noEnoughMoney; // 돈이 충분하지 않을 때 
	private NoMoney noMoney; // 돈이 없을 때
	private EnoughMoney enoughMoney; // 돈이 충분할 때
	private SoldOut soldOut; // 재고가 없을 때
	private State state;
	
	private Money money;
	private Drinking drinking;
	
	public VendingMachine(int stock, int price) {
		noEnoughMoney = new NoEnoughMoney(this);
		noMoney = new NoMoney(this);
		enoughMoney = new EnoughMoney(this);
		soldOut = new SoldOut(this);
		
		money = new Money();
		drinking = new Drinking(stock, price);
		
		if(drinking.getStock() > 0) { // 재고가 있으면 머신의 초기상태는 돈이 없는 상태
			state = noMoney;
		} else { // 재고가 없는 상태가 초기 상태
			state = soldOut;
		}
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void insertMoney(int money) {
		state.insert_money(money);
	}
	
	public void pushedButton() {
		int price = drinking.getPrice();
		state.button_pushed(price);
	}
	
	public void returnMoney() {
		state.return_money();
	}

	public NoEnoughMoney getNoEnoughMoney() {
		return noEnoughMoney;
	}

	public NoMoney getNoMoney() {
		return noMoney;
	}

	public EnoughMoney getEnoughMoney() {
		return enoughMoney;
	}

	public SoldOut getSoldOut() {
		return soldOut;
	}

	public Money getMoney() {
		return money;
	}

	public Drinking getDrinking() {
		return drinking;
	}
}
