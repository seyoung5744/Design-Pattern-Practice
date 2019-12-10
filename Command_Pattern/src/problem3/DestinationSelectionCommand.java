package problem3;

// 엘리베이터 내부에서 버튼을 눌렀을 때 해당 엘리베이터는 지정된 층으로 이동
public class DestinationSelectionCommand implements Command{
	private int destination; // 이동될 층
	private ElevatorController controller; // 이동되는 엘리베이터에 대한 컨트롤
	
	public DestinationSelectionCommand(int destination, ElevatorController controller) {
		this.destination = destination;
		this.controller = controller;
	}
	@Override
	public void execute() {
		controller.gotoFloor(destination);
	}
}



