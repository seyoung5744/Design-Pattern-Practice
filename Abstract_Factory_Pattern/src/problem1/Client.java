package problem1;

public class Client {
	public static void main(String[] args) {
		NaviFactory test = new TestFactory();
		
		GPS gps = test.createGPS();
		Screen screen = test.createScreen();
		PathFinder pathFinder = test.createPathFinder();
		Map map = test.createMap();
		
		screen.drawMap(map);
		
		Location l1 = gps.findCurrentLocation();
		Location l2 = gps.findCurrentLocation();
		
		pathFinder.findPath(l1, l2);
	}
}


