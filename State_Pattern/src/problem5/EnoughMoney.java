package problem5;

// 돈이 충분해서 음료를 살 수 있을 때.
public class EnoughMoney implements State{
	private VendingMachine machine;
	
	public EnoughMoney(VendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insert_money(int money) {
		machine.getMoney().insertMoney(money);
		System.out.println(money + "원을 넣었습니다.");
		System.out.println("현재 금액은 " + machine.getMoney().getMoney() + "원 입니다.");
	}
	
	@Override
	public void button_pushed(int price) {
		machine.getMoney().diepenseMoney(price); // 음료 가격만큼 돈에서 제외
		machine.getDrinking().dispenseStock(); // 재고 하나 빠짐
		System.out.println("음료가 나왔습니다.");
		
		if(machine.getDrinking().getStock() == 0) { // 음료가 나오고 재고가 없으면
			machine.setState(machine.getSoldOut()); // 머신의 상태를 재고없는 상태
		}
		
		if(machine.getMoney().getMoney() < machine.getDrinking().getPrice()) { // 남아있는 돈이 음료 가격보다 적으면
			machine.setState(machine.getNoEnoughMoney());
		} 
		else if(machine.getMoney().getMoney() == 0) {
			machine.setState(machine.getNoMoney());
		}		
	}
	@Override
	public void return_money() {
		int r = machine.getMoney().getMoney();
		System.out.println(r +"원이 반환되었습니다.");
		machine.setState(machine.getNoMoney());  // 돈을 반환하면 머신은 돈이 없는 상태
	}
}
