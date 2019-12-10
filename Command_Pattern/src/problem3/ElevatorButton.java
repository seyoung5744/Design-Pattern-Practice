package problem3;

//엘리베이터 내부 또는 층에서 엘리베이터를 이동/요청하는 버튼
public class ElevatorButton {
	private Command command;
	
	public ElevatorButton(Command command) {
		this.command = command;
	}
	
	public void pressed() {
		command.execute();
	}
}


