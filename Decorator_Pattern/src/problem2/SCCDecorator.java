package problem2;

// SCC 옵션 추가
public class SCCDecorator extends CarOptionDecorator {
	private int sccPrice;
	
	public SCCDecorator(CarComponent decoratedCar, int sccPrice) {
		super(decoratedCar);
		this.sccPrice = sccPrice;
	}
	
	public int getPrice() {
		return super.getPrice() + getSCCPrice();
	}

	public String getCarinfo() {
		return super.getCarinfo() + " with SCC";
	}
	
	private int getSCCPrice() {
		return sccPrice;
	}
}
