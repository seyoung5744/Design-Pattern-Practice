package problem2;

// ConcreteDecorator 클래스의 공통 기능을 제공하는 클래스
public class CarOptionDecorator extends CarComponent {
	private CarComponent decoratedCar;
	
	public CarOptionDecorator(CarComponent decoratedCar) {
		this.decoratedCar = decoratedCar;
	}
	
	@Override
	public int getPrice() {
		return decoratedCar.getPrice();
	}
	
	@Override
	public String getCarinfo() {
		return decoratedCar.getCarinfo();
	}
}

