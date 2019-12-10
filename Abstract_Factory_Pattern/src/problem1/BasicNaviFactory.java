package problem1;

public class BasicNaviFactory extends NaviFactory {
	public GPS createGPS() {
		return new CheapGPS();
	}

	public Screen createScreen() {
		return new SDScreen();
	}

	public Map createMap() {
		return new SmallMap();
	}

	public PathFinder createPathFinder() {
		return new SlowPathFinder();
	}
}


