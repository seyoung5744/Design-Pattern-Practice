package problem3;

public class ElevatorController {
	private int id; // 엘리베이터 id
	private int curFloor; // 엘리베이터의 현재 층
	
	public ElevatorController(int id) {
		this.id = id;
	}
	
	public void gotoFloor(int destination) { // 목적지 층으로 엘리베이터 이동
		this.curFloor = destination;
		System.out.println(id + "번 엘리베이터의 현재 층 : " + curFloor);
	}
}



