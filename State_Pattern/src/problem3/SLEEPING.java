package problem3;

public class SLEEPING implements State{
	private static SLEEPING sleeping = new SLEEPING(); // SLEEPING Ŭ���� �ν��Ͻ��� �ʱ�ȭ
	private SLEEPING() {}
	
	public static SLEEPING getInstance() { // �ʱ�ȭ�� SLEEPING Ŭ������ �ν��Ͻ��� ��ȯ
		return sleeping;
	}
	@Override
	public void off_button_pushed(Light light) { // SLEEPING ������ �� Off ��ư�� ������ Off ����
		System.out.println("Light Off");
		light.setState(OFF.getInstance());
	}
	@Override
	public void on_button_pushed(Light light) { // SLEEPING ������ �� On ��ư�� ������ On ����
		System.out.println("Light On again~~");		
		light.setState(ON.getInstance());
	}
}
