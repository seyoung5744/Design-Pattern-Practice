package problem5;

// 돈이 없을 때
public class NoMoney implements State{
	private VendingMachine machine;
	
	public NoMoney(VendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insert_money(int money) {
		machine.getMoney().insertMoney(money);
		System.out.println(money + "원을 넣었습니다.");
		
		if(money >= machine.getDrinking().getPrice()) { // 돈이 충분히 투입되면
			machine.setState(machine.getEnoughMoney()); // 돈이 충분한 상태로 변환
		}else { // 충분한 돈이 투입되지 않았으면
			machine.setState(machine.getNoEnoughMoney()); // 돈이 충분하지 않은 상태
		}
		
		System.out.println("현재 금액은 " + machine.getMoney().getMoney() + "원 입니다.");		
	}
	
	@Override
	public void button_pushed(int price) {
		System.out.println("돈을 넣어주세요.");		
	}
	
	@Override
	public void return_money() {
		System.out.println("반환할 돈이 없습니다.");
	}
}
