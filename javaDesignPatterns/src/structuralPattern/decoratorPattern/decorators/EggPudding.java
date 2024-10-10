package structuralPattern.decoratorPattern.decorators;

import structuralPattern.decoratorPattern.base.IMilkTea;
import structuralPattern.decoratorPattern.base.AMilkTeaDecorator;

public class EggPudding extends AMilkTeaDecorator {

    public EggPudding(IMilkTea innerMilkTea) {
        super(innerMilkTea);
    }

    @Override
    public double cost() {
        return 3d + super.cost();
    }
}
