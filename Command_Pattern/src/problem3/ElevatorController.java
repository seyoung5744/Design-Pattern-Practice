package problem3;

public class ElevatorController {
	private int id; // ���������� id
	private int curFloor; // ������������ ���� ��
	
	public ElevatorController(int id) {
		this.id = id;
	}
	
	public void gotoFloor(int destination) { // ������ ������ ���������� �̵�
		this.curFloor = destination;
		System.out.println(id + "�� ������������ ���� �� : " + curFloor);
	}
}



