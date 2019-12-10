package problem1;

enum MotorStrategyID { LG, Hyundai }

public class MotorFactory {
	public static Motor getMotor(MotorStrategyID strategyID) {
		Motor motor = null;
		switch(strategyID) {
		case LG:
			motor = new LGMotor();
			break;
		case Hyundai:
			motor = new HyundaiMotor();
			break;
		}
		return motor;
	}
}




