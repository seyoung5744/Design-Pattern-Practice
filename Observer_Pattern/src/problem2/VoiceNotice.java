package problem2;

//엘리베이터의 위치를 엘리베티어 내부에서 음성으로 안내
public class VoiceNotice implements Observer{
	private ElevatorController controller;
	
	public VoiceNotice(ElevatorController controller) {
		this.controller = controller;
	}
	
	@Override
	public void update() {
		int curFloor = controller.getCurFloor();
		System.out.println("Voice Notice : " + curFloor);
	}
}


