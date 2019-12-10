package problem3;

public class Rental {
	private Member member;
	private Book book;
	private PricePolicy pricePolicy;
	private int n;	// ºô¸° Ã¥ °¹¼ö
	
	public Rental(Member member, Book book, PricePolicy pricePolicy, int n) {
		this.member = member;
		this.book = book;
		this.pricePolicy = pricePolicy;
		this.n = n;
		this.member.setAccPrice(pricePolicy.priceDiscount(book.getPrice(), n));
	}
	
	public int getPricePolicy() {
		return pricePolicy.priceDiscount(book.getPrice(), n);
	}
	
}
