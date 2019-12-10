package problem2;

public class Client {
	public static void main(String[] args) {
		ElevatorController controller = new ElevatorController();
		
		ElevatorDisplay elevatorDisplay = new ElevatorDisplay(controller);
		FloorDisplay floorDisplay = new FloorDisplay(controller);
		VoiceNotice voiceNotice = new VoiceNotice(controller);
		ControlRoomDisplay roomDisplay = new ControlRoomDisplay(controller);
		
		controller.attach(elevatorDisplay);
		controller.attach(voiceNotice);
		controller.attach(floorDisplay);
		controller.attach(roomDisplay);
		
		controller.gotoFloor(5);
		System.out.println("==================");
		controller.gotoFloor(10);
	}
}



