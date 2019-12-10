package problem1;

public class PremiumNaviFactory extends NaviFactory {
	public GPS createGPS() {
		return new ExpensiveGPS();
	}

	public Screen createScreen() {
		return new HDScreen();
	}

	public Map createMap() {
		return new LargeMap();
	}

	public PathFinder createPathFinder() {
		return new FastPathFinder();
	}
}

