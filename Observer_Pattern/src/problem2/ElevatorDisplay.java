package problem2;

//엘리베이터의 현재 층 위치를 엘리베이터 내부에 출력
public class ElevatorDisplay implements Observer{
	private ElevatorController controller;
	
	public ElevatorDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	
	@Override
	public void update() {
		int curFloor = controller.getCurFloor();
		System.out.println("CurFloor : " + curFloor);
	}
}

