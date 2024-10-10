package structuralPattern.decoratorPattern.decorators;

import structuralPattern.decoratorPattern.base.IMilkTea;
import structuralPattern.decoratorPattern.base.AMilkTeaDecorator;

public class BlackSugar extends AMilkTeaDecorator {

    public BlackSugar(IMilkTea innerMilkTea) {
        super(innerMilkTea);
    }

    @Override
    public double cost() {
        return 2d + super.cost();
    }
}
