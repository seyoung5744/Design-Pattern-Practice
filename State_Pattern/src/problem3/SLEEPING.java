package problem3;

public class SLEEPING implements State{
	private static SLEEPING sleeping = new SLEEPING(); // SLEEPING 클래스 인스턴스로 초기화
	private SLEEPING() {}
	
	public static SLEEPING getInstance() { // 초기화된 SLEEPING 클래스의 인스턴스를 반환
		return sleeping;
	}
	@Override
	public void off_button_pushed(Light light) { // SLEEPING 상태일 때 Off 버튼을 누르면 Off 상태
		System.out.println("Light Off");
		light.setState(OFF.getInstance());
	}
	@Override
	public void on_button_pushed(Light light) { // SLEEPING 상태일 때 On 버튼을 누르면 On 상태
		System.out.println("Light On again~~");		
		light.setState(ON.getInstance());
	}
}
