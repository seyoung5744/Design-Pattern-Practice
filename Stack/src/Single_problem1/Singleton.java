package Single_problem1;

public class Singleton {
	private static Singleton instance = null;
	public Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		
		return instance;
	}
	
	public void doSomething(void) {
		...
	}
}
