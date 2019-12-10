package problem2;

// Navi 옵션 추가
public class NaviDecorator extends CarOptionDecorator {
	private int naviPrice;
	
	public NaviDecorator(CarComponent decoratedCar, int naviPrice) {
		super(decoratedCar);
		this.naviPrice = naviPrice;
	}

	public int getPrice() {
		return super.getPrice() + getNaviPrice();
	}
	
	public String getCarinfo() {
		return super.getCarinfo() + " with Navi";
	}
	
	private int getNaviPrice() {
		return naviPrice;
	}
}

