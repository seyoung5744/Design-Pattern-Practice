package problem5;

public class Client {
	public static void main(String[] args) {
		Field field = new Field();
		field.setWalkingStrategy(new walking());
		new Running(field);
	}
}
