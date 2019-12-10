package problem5;

// Context ����
public class VendingMachine {
	private NoEnoughMoney noEnoughMoney; // ���� ������� ���� �� 
	private NoMoney noMoney; // ���� ���� ��
	private EnoughMoney enoughMoney; // ���� ����� ��
	private SoldOut soldOut; // ��� ���� ��
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
		
		if(drinking.getStock() > 0) { // ��� ������ �ӽ��� �ʱ���´� ���� ���� ����
			state = noMoney;
		} else { // ��� ���� ���°� �ʱ� ����
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
