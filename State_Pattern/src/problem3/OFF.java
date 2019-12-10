package problem3;

public class OFF implements State{
	private static OFF off = new OFF();  // OFF Ŭ������ �ν��Ͻ��� �ʱ�ȭ
	private OFF() {}
	
	public static OFF getInstance() { // �ʱ�ȭ�� OFF Ŭ������ �ν��Ͻ��� ��ȯ
		return off;
	}
	
	@Override
	public void off_button_pushed(Light light) { // Off ������ ��  Off��ư�� ������ ��ȭ ����
		System.out.println("��ȭ ����");
		
	}
	@Override
	public void on_button_pushed(Light light) { // Off ������ �� On ��ư�� ������  On ����
		System.out.println("Light On!!");
		light.setState(ON.getInstance());
	}
}
