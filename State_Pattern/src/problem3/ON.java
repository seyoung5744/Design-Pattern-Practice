package problem3;

public class ON implements State{
	private static ON on = new ON(); // ON Ŭ���� �ν��Ͻ��� �ʱ�ȭ
	private ON() {}
	
	public static ON getInstance() {  // �ʱ�ȭ�� ON Ŭ������ �ν��Ͻ� ��ȯ
		return on;
	}
	
	@Override
	public void off_button_pushed(Light light) { 
		System.out.println("Light Off!!");
		light.setState(OFF.getInstance());
	}
	@Override
	public void on_button_pushed(Light light) { // ON ������ �� On ��ư�� ������ SLEEPING ���·� ��.
		System.out.println("SLEEPING~~");
		light.setState(SLEEPING.getInstance());
	}
}
