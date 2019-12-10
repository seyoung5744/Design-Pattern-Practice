package EX;

public class DisplayDecorator extends Display{
	private Display decoratorDisplay;
	
	public DisplayDecorator(Display decoratorDisplay) {
		this.decoratorDisplay = decoratorDisplay;
	}
	
	@Override
	public void draw() {
		decoratorDisplay.draw();
	}
}
