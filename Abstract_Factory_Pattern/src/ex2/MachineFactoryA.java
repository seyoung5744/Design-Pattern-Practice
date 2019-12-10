package ex2;

public class MachineFactoryA extends MachineFactory{
    @Override
    public CakeMachine getCakeMachine() {
        return new CheeseCakeMachine();
    }
 
    @Override
    public BeverageMachine getBeverageMachine() {
        return new CoffeeMachine();
    }
 
}


