package example;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject { // 추상화된 변경 감시 대상 데이터
	private List<Observer> observers = new ArrayList<>();
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void nitifyObserver() {
		for(Observer o : observers)
			o.update();
	}

}
