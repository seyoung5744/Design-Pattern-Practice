package problem2;

// ESC 옵션 추가
public class ESCDecorator extends CarOptionDecorator {
	private int escPrice;
	
	public ESCDecorator(CarComponent decoratedCar, int escPrice) {
		super(decoratedCar);
		this.escPrice = escPrice;
	}
	
	public int getPrice() {
		return super.getPrice() + getESCPrice();
	}
	
	public String getCarinfo() {
		return super.getCarinfo() + " with ESC";
	}
	
	private int getESCPrice() {
		return escPrice;
	}
}


