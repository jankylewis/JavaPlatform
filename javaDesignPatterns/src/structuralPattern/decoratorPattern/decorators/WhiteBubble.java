package structuralPattern.decoratorPattern.decorators;

import structuralPattern.decoratorPattern.base.IMilkTea;
import structuralPattern.decoratorPattern.base.MilkTeaDecorator;

public class WhiteBubble extends MilkTeaDecorator {

    public WhiteBubble(IMilkTea innerMilkTea) {
        super(innerMilkTea);
    }

    @Override
    public double cost() {
        return 1.5 + super.cost();
    }
}
