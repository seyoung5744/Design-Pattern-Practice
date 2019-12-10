package problem3;

// 건물 내부에서 버튼을 눌렀을 때 여러 엘리베이터에서 선택한 엘리베이터를 해당 층으로 이동
public class ElevatorRequestCommand implements Command{
	private int destination; // 버튼이 눌린 층
	private Direction direction; // 요청 방향, 위 or 아래
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




