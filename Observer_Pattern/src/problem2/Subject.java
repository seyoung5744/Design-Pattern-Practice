package problem2;

import java.util.ArrayList;

public abstract class Subject {
private ArrayList<Observer> observers = new ArrayList<>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() { // ConcreteSubject�� ���� ��ȭ�z �� ConcreteObserver���� �뺸
		for(Observer o:observers)
			o.update();
	}	
}





