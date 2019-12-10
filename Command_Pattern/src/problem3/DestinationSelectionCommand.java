package problem3;

// ���������� ���ο��� ��ư�� ������ �� �ش� ���������ʹ� ������ ������ �̵�
public class DestinationSelectionCommand implements Command{
	private int destination; // �̵��� ��
	private ElevatorController controller; // �̵��Ǵ� ���������Ϳ� ���� ��Ʈ��
	
	public DestinationSelectionCommand(int destination, ElevatorController controller) {
		this.destination = destination;
		this.controller = controller;
	}
	@Override
	public void execute() {
		controller.gotoFloor(destination);
	}
}



