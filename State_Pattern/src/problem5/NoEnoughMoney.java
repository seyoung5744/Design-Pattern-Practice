package problem5;

// 재고가 있어도 돈이 충분하지 투입되지 않았을 때
public class NoEnoughMoney implements State{
	private VendingMachine machine;
	
	public NoEnoughMoney(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insert_money(int money) {
		machine.getMoney().insertMoney(money);
		System.out.println(money + "원을 넣었습니다.");
		
		// 돈을 충분하게 투입하지 않은 상태에서 음료를 사기에 충분한 돈을 투입한 경우
		if(machine.getMoney().getMoney() >= machine.getDrinking().getPrice()) {
			machine.setState(machine.getEnoughMoney());
		}
		
		System.out.println("현재 금액은 " + machine.getMoney().getMoney() + "원 입니다.");
	}

	@Override
	public void button_pushed(int price) {
		System.out.println("돈이 충분하지 않습니다.");
	}

	@Override
	public void return_money() { 
		int r = machine.getMoney().getMoney();
		System.out.println(r +"원이 반환되었습니다.");
		machine.setState(machine.getNoMoney());  // 돈을 반환하면 머신은 돈이 없는 상태
	}
	
	
}
