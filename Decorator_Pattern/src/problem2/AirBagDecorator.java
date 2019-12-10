package problem2;

// AirBag 옵션 추가 기능
public class AirBagDecorator extends CarOptionDecorator {
	private int airBagPrice;
	
	public AirBagDecorator(CarComponent decoratedCar, int airBagPrice) {
		super(decoratedCar);
		this.airBagPrice = airBagPrice;
	}
	
	public int getPrice() {
		return super.getPrice() + getAirBagPrice();
	}
	
	public String getCarinfo() {
		return super.getCarinfo() + " with AirBag";
	}
	
	private int getAirBagPrice() {
		return airBagPrice;
	}
}



