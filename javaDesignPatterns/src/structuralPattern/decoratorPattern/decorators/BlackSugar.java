package structuralPattern.decoratorPattern.decorators;

import structuralPattern.decoratorPattern.base.IMilkTea;
import structuralPattern.decoratorPattern.base.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {

    public BlackSugar(IMilkTea innerMilkTea) {
        super(innerMilkTea);
    }

    @Override
    public double cost() {
        return 2d + super.cost();
    }
}
