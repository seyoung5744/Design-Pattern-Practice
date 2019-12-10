package problem5;

// ��� �־ ���� ������� ���Ե��� �ʾ��� ��
public class NoEnoughMoney implements State{
	private VendingMachine machine;
	
	public NoEnoughMoney(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insert_money(int money) {
		machine.getMoney().insertMoney(money);
		System.out.println(money + "���� �־����ϴ�.");
		
		// ���� ����ϰ� �������� ���� ���¿��� ���Ḧ ��⿡ ����� ���� ������ ���
		if(machine.getMoney().getMoney() >= machine.getDrinking().getPrice()) {
			machine.setState(machine.getEnoughMoney());
		}
		
		System.out.println("���� �ݾ��� " + machine.getMoney().getMoney() + "�� �Դϴ�.");
	}

	@Override
	public void button_pushed(int price) {
		System.out.println("���� ������� �ʽ��ϴ�.");
	}

	@Override
	public void return_money() { 
		int r = machine.getMoney().getMoney();
		System.out.println(r +"���� ��ȯ�Ǿ����ϴ�.");
		machine.setState(machine.getNoMoney());  // ���� ��ȯ�ϸ� �ӽ��� ���� ���� ����
	}
	
	
}
