package ex2;

public class Client {
	public static void main(String[] args) {
		   System.out.println("setA제품은");
	        MachineFactory setA = new MachineFactoryA();
	        setA.getCakeMachine().process();
	        setA.getBeverageMachine().process();
	         
	        System.out.println("setB제품은");
	        MachineFactory setB = new MachineFactoryB();
	        setB.getCakeMachine().process();
	        setB.getBeverageMachine().process();
	}
}
