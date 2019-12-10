package EX;

public class LaneDecorator extends DisplayDecorator{
	public LaneDecorator(Display decoratorDisplay) {
		super(decoratorDisplay);
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		drawLane();
	}
	
	private void drawLane() {
		System.out.println("\t차선 표시");
	}
}
