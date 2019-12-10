package problem2;

public class ElevatorController extends Subject{
	private int curFloor = 1; // 현재 층
	
	public void gotoFloor(int destination) { 
		//목적지를 현재 층으로 설정
		curFloor = destination;
		notifyObservers();
	}
	
	public int getCurFloor() {
		return curFloor;
	}
}



