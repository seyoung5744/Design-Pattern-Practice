package tutorialSingleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		// SingleObject object = new SingleObject();
		// The constructor SingleObject() is not visible ��� ���� �߻�		
		 
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}
}
