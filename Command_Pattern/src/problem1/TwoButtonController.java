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
	
	public void button1Pressed() { // button1�� ������ command1�� execute ����
		command1.execute();
	}
	public void button2Pressed() { // button2�� ������ command2�� execute ����
		command2.execute();
	}
	
}
