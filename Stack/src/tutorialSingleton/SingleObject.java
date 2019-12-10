package tutorialSingleton;

public class SingleObject {
	
	// SingleObject ��ü �����
	private static SingleObject instance = new SingleObject();
	
	// �� Ŭ������ �ν��Ͻ�ȭ �� �� ������ private�� �����ڸ� �����.
	private SingleObject() {}
	
	// �����ϰ� ����� �� �ִ� �� �ϳ��� ��ü�� ��ȯ�Ѵ�.
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Design Pattern!!");
	}
}
