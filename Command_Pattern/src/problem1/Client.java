package problem1;

public class Client {
	public static void main(String[] args) {
		TV tv = new TV();
		TwoButtonController rc = new TwoButtonController(new MuteCommand(tv), new PowerCommand(tv));
		
		rc.button1Pressed();
		rc.button2Pressed();
		
		rc.button1Pressed();
		rc.button1Pressed();
		
		rc.button2Pressed();
		rc.button1Pressed();
	}
}
