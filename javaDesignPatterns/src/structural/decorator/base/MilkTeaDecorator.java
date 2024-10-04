package structural.decorator.base;

public abstract class MilkTeaDecorator implements IMilkTea {

    private final IMilkTea _milkTea;

    protected MilkTeaDecorator(IMilkTea innerMilkTea) {
        _milkTea = innerMilkTea;
    }

    @Override
    public double cost() {
        return _milkTea.cost();
    }
}
