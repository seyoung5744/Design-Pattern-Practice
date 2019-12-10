package problem2;

enum CarStateID { NORMAL, LIMP }

public class CarStateFactory {
	public static CarState getState(CarStateID stateID, Car car) {
		CarState state = null;
		switch(stateID) {
		case NORMAL:
			state = NormalState.getInstance(car);
			break;
		case LIMP:
			state = LimpState.getInstance(car);
			break;		
		}
		
		return state;
	}
}

