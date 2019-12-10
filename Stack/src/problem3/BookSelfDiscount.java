package problem3;

public class BookSelfDiscount implements PricePolicy{
	@Override
	public int priceDiscount(int price, int n) {
		return (int)(price*n*0.7);
	}
}
