package problem3;

import java.util.ArrayList;

public class ElevatorManager {
	private ArrayList<ElevatorController> controllers; // ���� ���������� ����
	
	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<>(controllerCount);
	}
	
	public void addController(ElevatorController controller) {
		controllers.add(controller);
	}
	
	public void requestElevator(int destination, Direction direction) { 
		// ���������� ����
		int selectElevator = selectElevator(destination, direction);
		
		//���õ� ���������� �̵�
		controllers.get(selectElevator).gotoFloor(destination);
	}
	
	// ���������� �����ϱ�.
	private int selectElevator(int destination, Direction direction) {
		return 0;
	}
}



