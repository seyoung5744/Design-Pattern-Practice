package problem5;

public class SoldOut implements State{
	private VendingMachine machine;
	
	public SoldOut(VendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insert_money(int money) {
		System.out.println("��� �����ϴ�.");			
	}
	
	@Override
	public void button_pushed(int price) {}
	
	@Override
	public void return_money() {
		int r = machine.getMoney().getMoney();
		System.out.println(r +"���� ��ȯ�Ǿ����ϴ�.");
		machine.setState(machine.getNoMoney());  // ���� ��ȯ�ϸ� �ӽ��� ���� ���� ����
	}
}
