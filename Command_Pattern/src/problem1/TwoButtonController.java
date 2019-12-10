package problem1;

public class TwoButtonController {
	private Command command1;
	private Command command2;
	
	public TwoButtonController(Command command1, Command command2) {
		setCommand(command1,command2);
	}
	
	public void setCommand(Command command1, Command command2) {
		this.command1 = command1;
		this.command2 = command2;
	}
	
	public void button1Pressed() { // button1이 눌리면 command1의 execute 실행
		command1.execute();
	}
	public void button2Pressed() { // button2가 눌리면 command2의 execute 실행
		command2.execute();
	}
	
}
