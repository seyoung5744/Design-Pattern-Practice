package problem5;

// ���� ���� ��
public class NoMoney implements State{
	private VendingMachine machine;
	
	public NoMoney(VendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insert_money(int money) {
		machine.getMoney().insertMoney(money);
		System.out.println(money + "���� �־����ϴ�.");
		
		if(money >= machine.getDrinking().getPrice()) { // ���� ����� ���ԵǸ�
			machine.setState(machine.getEnoughMoney()); // ���� ����� ���·� ��ȯ
		}else { // ����� ���� ���Ե��� �ʾ�����
			machine.setState(machine.getNoEnoughMoney()); // ���� ������� ���� ����
		}
		
		System.out.println("���� �ݾ��� " + machine.getMoney().getMoney() + "�� �Դϴ�.");		
	}
	
	@Override
	public void button_pushed(int price) {
		System.out.println("���� �־��ּ���.");		
	}
	
	@Override
	public void return_money() {
		System.out.println("��ȯ�� ���� �����ϴ�.");
	}
}
