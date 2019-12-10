package problem3;

public class Book {
	private String sign;
	private int year;
	private int price;
	
	public Book(String sign, int publishYear, int price) {
		this.sign = sign;
		this.year = year;
		this.price = price;
	}
	
	public String getSign() {
		return sign;
	}
	
	public int getPulishYear() {
		return year;
	}
	
	public int getPrice() {
		return price;
	}
}
