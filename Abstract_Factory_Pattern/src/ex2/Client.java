package ex2;

public class Client {
	public static void main(String[] args) {
		   System.out.println("setA力前篮");
	        MachineFactory setA = new MachineFactoryA();
	        setA.getCakeMachine().process();
	        setA.getBeverageMachine().process();
	         
	        System.out.println("setB力前篮");
	        MachineFactory setB = new MachineFactoryB();
	        setB.getCakeMachine().process();
	        setB.getBeverageMachine().process();
	}
}
