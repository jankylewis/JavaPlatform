package structuralPattern.decoratorPattern.decorators;

import structuralPattern.decoratorPattern.base.IMilkTea;
import structuralPattern.decoratorPattern.base.AMilkTeaDecorator;

public class Bubble extends AMilkTeaDecorator {

    public Bubble(IMilkTea innerMilkTea) {
        super(innerMilkTea);
    }

    @Override
    public double cost() {
        return 1d + super.cost();
    }
}
