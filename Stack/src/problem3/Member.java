package problem3;

public class Member {
	private String name;
	private int accruePrice; // 누적대여금액
	
	public Member(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getAccPrice() {
		return accruePrice;
	}

	public void setAccPrice(int price) {
		this.accruePrice += price;
	}
}
