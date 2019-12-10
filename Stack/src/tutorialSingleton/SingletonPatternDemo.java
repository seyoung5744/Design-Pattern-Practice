package tutorialSingleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		// SingleObject object = new SingleObject();
		// The constructor SingleObject() is not visible 라는 오류 발생		
		 
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}
}
