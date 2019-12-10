package problem2;

// 자동차의 기본 가격/설명을 정의한 클래스
public class BasicCar extends CarComponent {
	private int price;
	
	public BasicCar(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
	
	@Override
	public String getCarinfo() {
		return "Car";
	}
}


