package problem3;

public class OrdinaryDiscount implements PricePolicy {
	@Override
	public int priceDiscount(int price, int n) {
		return price*n;
	}
}
