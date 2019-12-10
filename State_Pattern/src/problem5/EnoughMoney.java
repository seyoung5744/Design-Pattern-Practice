package problem5;

// ���� ����ؼ� ���Ḧ �� �� ���� ��.
public class EnoughMoney implements State{
	private VendingMachine machine;
	
	public EnoughMoney(VendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insert_money(int money) {
		machine.getMoney().insertMoney(money);
		System.out.println(money + "���� �־����ϴ�.");
		System.out.println("���� �ݾ��� " + machine.getMoney().getMoney() + "�� �Դϴ�.");
	}
	
	@Override
	public void button_pushed(int price) {
		machine.getMoney().diepenseMoney(price); // ���� ���ݸ�ŭ ������ ����
		machine.getDrinking().dispenseStock(); // ��� �ϳ� ����
		System.out.println("���ᰡ ���Խ��ϴ�.");
		
		if(machine.getDrinking().getStock() == 0) { // ���ᰡ ������ ��� ������
			machine.setState(machine.getSoldOut()); // �ӽ��� ���¸� ������ ����
		}
		
		if(machine.getMoney().getMoney() < machine.getDrinking().getPrice()) { // �����ִ� ���� ���� ���ݺ��� ������
			machine.setState(machine.getNoEnoughMoney());
		} 
		else if(machine.getMoney().getMoney() == 0) {
			machine.setState(machine.getNoMoney());
		}		
	}
	@Override
	public void return_money() {
		int r = machine.getMoney().getMoney();
		System.out.println(r +"���� ��ȯ�Ǿ����ϴ�.");
		machine.setState(machine.getNoMoney());  // ���� ��ȯ�ϸ� �ӽ��� ���� ���� ����
	}
}
