package problem2;

//엘리베이터 위치를 건물 내부의 엘리베이터 층 표시 장치에 출력
public class FloorDisplay implements Observer{
	private ElevatorController controller;
	
	public FloorDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	@Override
	public void update() {
		int curFloor = controller.getCurFloor();
		System.out.println("Floor Display : " + curFloor);
	}
}



