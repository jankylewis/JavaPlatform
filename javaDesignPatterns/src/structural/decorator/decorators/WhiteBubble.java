package structural.decorator.decorators;

import structural.decorator.base.IMilkTea;
import structural.decorator.base.MilkTeaDecorator;

public class WhiteBubble extends MilkTeaDecorator {

    public WhiteBubble(IMilkTea innerMilkTea) {
        super(innerMilkTea);
    }

    @Override
    public double cost() {
        return 1.5 + super.cost();
    }
}
