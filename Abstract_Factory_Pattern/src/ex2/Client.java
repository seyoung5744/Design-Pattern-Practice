package ex2;

public class Client {
	public static void main(String[] args) {
		   System.out.println("setA��ǰ��");
	        MachineFactory setA = new MachineFactoryA();
	        setA.getCakeMachine().process();
	        setA.getBeverageMachine().process();
	         
	        System.out.println("setB��ǰ��");
	        MachineFactory setB = new MachineFactoryB();
	        setB.getCakeMachine().process();
	        setB.getBeverageMachine().process();
	}
}
