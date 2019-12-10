package problem3;

// �ǹ� ���ο��� ��ư�� ������ �� ���� ���������Ϳ��� ������ ���������͸� �ش� ������ �̵�
public class ElevatorRequestCommand implements Command{
	private int destination; // ��ư�� ���� ��
	private Direction direction; // ��û ����, �� or �Ʒ�
	private ElevatorManager em;
	
	public ElevatorRequestCommand(int destination, Direction direction, ElevatorManager manager) {
		this.destination = destination;
		this.direction = direction;
		this.em = manager;
	}
	
	@Override
	public void execute() {
		em.requestElevator(destination, direction);	
	}

}




