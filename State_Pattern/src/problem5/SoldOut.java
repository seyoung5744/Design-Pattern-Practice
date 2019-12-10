package problem5;

public class SoldOut implements State{
	private VendingMachine machine;
	
	public SoldOut(VendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insert_money(int money) {
		System.out.println("재고가 없습니다.");			
	}
	
	@Override
	public void button_pushed(int price) {}
	
	@Override
	public void return_money() {
		int r = machine.getMoney().getMoney();
		System.out.println(r +"원이 반환되었습니다.");
		machine.setState(machine.getNoMoney());  // 돈을 반환하면 머신은 돈이 없는 상태
	}
}
