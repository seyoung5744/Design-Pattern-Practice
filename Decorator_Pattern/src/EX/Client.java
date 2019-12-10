package EX;

public class Client {
	public static void main(String[] args) {
		Display display = new LoadDisplay();
		display.draw();
		
		Display laneDisplay = new LaneDecorator(new LoadDisplay());
		laneDisplay.draw();
		
		Display trafficDisplay = new TrafficDecorator(new LoadDisplay());
		trafficDisplay.draw();
	}
}
