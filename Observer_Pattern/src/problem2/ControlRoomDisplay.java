package problem2;

//중앙통제실에서 엘리베이터의 위치를 출력
public class ControlRoomDisplay implements Observer{
	private ElevatorController controller;
	
	public ControlRoomDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	
	@Override
	public void update() {
		int curFloor = controller.getCurFloor();
		System.out.println("ControlRoom Display : " + curFloor);
	}
}

