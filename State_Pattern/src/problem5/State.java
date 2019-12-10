package problem5;

public interface State {
	public void insert_money(int money); // 돈 투입
	public void button_pushed(int price); // 버튼 누름
	public void return_money(); // 거스름돈 반환
}
