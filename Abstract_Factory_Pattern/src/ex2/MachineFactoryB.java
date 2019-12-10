package ex2;

public class MachineFactoryB extends  MachineFactory{
    @Override
    public CakeMachine getCakeMachine() {
        return new CreamCakeMachine();
    }
    @Override
    public BeverageMachine getBeverageMachine() {
        return new MilkMachine();
    }
}


