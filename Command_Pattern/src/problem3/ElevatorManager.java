package problem3;

import java.util.ArrayList;

public class ElevatorManager {
	private ArrayList<ElevatorController> controllers; // 여러 엘리베이터 관리
	
	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<>(controllerCount);
	}
	
	public void addController(ElevatorController controller) {
		controllers.add(controller);
	}
	
	public void requestElevator(int destination, Direction direction) { 
		// 엘리베이터 선택
		int selectElevator = selectElevator(destination, direction);
		
		//선택된 엘리베이터 이동
		controllers.get(selectElevator).gotoFloor(destination);
	}
	
	// 엘리베이터 선택하기.
	private int selectElevator(int destination, Direction direction) {
		return 0;
	}
}



