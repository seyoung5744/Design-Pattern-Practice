package example;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject { // �߻�ȭ�� ���� ���� ��� ������
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
