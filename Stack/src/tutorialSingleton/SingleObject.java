package tutorialSingleton;

public class SingleObject {
	
	// SingleObject 객체 만들기
	private static SingleObject instance = new SingleObject();
	
	// 이 클래스가 인스턴스화 할 수 없도록 private로 생성자를 만든다.
	private SingleObject() {}
	
	// 유일하게 사용할 수 있는 단 하나의 객체를 반환한다.
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Design Pattern!!");
	}
}
