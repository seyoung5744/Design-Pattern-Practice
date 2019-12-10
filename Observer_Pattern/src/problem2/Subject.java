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
	
	public void notifyObservers() { // ConcreteSubject의 정보 변화틑 각 ConcreteObserver에게 통보
		for(Observer o:observers)
			o.update();
	}	
}





