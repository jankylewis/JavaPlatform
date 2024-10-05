package structuralPattern.decoratorPattern.decorators;

import structuralPattern.decoratorPattern.base.IMilkTea;
import structuralPattern.decoratorPattern.base.MilkTeaDecorator;

public class EggPudding extends MilkTeaDecorator {

    public EggPudding(IMilkTea innerMilkTea) {
        super(innerMilkTea);
    }

    @Override
    public double cost() {
        return 3d + super.cost();
    }
}
