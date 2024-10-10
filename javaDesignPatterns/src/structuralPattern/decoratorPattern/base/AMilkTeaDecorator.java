package structuralPattern.decoratorPattern.base;

public abstract class AMilkTeaDecorator implements IMilkTea {

    private final IMilkTea _milkTea;

    protected AMilkTeaDecorator(IMilkTea innerMilkTea) {
        _milkTea = innerMilkTea;
    }

    @Override
    public double cost() {
        return _milkTea.cost();
    }
}
