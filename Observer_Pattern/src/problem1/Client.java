package problem1;

public class Client {
	public static void main(String[] args) {
		Battery battery = new Battery();
		
		BatteryLevelDisplay batteryDisplay = new BatteryLevelDisplay(battery);
		LowBatteryWarning lowBatteryWarning = new LowBatteryWarning(battery);
		
		battery.attach(batteryDisplay);
		battery.attach(lowBatteryWarning);
		
		battery.consume(20);
		battery.consume(50);
		battery.consume(10);
	}
}


