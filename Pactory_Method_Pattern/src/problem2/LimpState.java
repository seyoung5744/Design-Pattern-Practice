package problem2;

public class LimpState extends CarState {
	public static final int LIMP_MODE_MAX_SPEED = 60;
	
	private static CarState state;
	
	private LimpState(Car car) {
		super(car);
	}
	
	public static CarState getInstance(Car car) {
		if(state == null)
			state = new LimpState(car);
		return state;
	}

	public void speedUp(int targetSpeed) {
		System.out.println("Speed : " + car.getSpeed());
		if(targetSpeed > car.getSpeed() && targetSpeed < LIMP_MODE_MAX_SPEED)
			car.setSpeed(targetSpeed);
		System.out.println(" ==> " + car.getSpeed());
	}
	
	public void engineFailedDetected() {
		// 이미 림프 모드로 동작 중임
	}

	public void engineRepaired() {
		car.setState(car.getNormalMode());
	}
}

