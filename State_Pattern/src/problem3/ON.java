package problem3;

public class ON implements State{
	private static ON on = new ON(); // ON 클래스 인스턴스로 초기화
	private ON() {}
	
	public static ON getInstance() {  // 초기화된 ON 클래스의 인스턴스 반환
		return on;
	}
	
	@Override
	public void off_button_pushed(Light light) { 
		System.out.println("Light Off!!");
		light.setState(OFF.getInstance());
	}
	@Override
	public void on_button_pushed(Light light) { // ON 상태일 때 On 버튼을 누르면 SLEEPING 상태로 됨.
		System.out.println("SLEEPING~~");
		light.setState(SLEEPING.getInstance());
	}
}
