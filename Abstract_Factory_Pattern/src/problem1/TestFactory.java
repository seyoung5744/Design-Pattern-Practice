package problem1;

public class TestFactory extends NaviFactory {
	public GPS createGPS() {
		return new GPSSimulator();
	}
	
	public Screen createScreen() {
		return new TestScreen();
	}
	
	public Map createMap() {
		return new TestMap();
	}
	
	public PathFinder createPathFinder() {
		return new TestPathFinder();
	}
}


