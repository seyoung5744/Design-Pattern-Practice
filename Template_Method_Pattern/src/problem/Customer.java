package problem;

import java.util.List;

public class Customer {
	private String name; // °í°´ÀÇ ÀÌ¸§
	private int point; // °í°´ÀÇ Á¡¼ö
	
	public Customer(String name, int point) {
		this.setName(name);
		this.setPoint(point);
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}


