package structural.decorator.decorators;

import structural.decorator.base.IMilkTea;
import structural.decorator.base.MilkTeaDecorator;

public class Bubble extends MilkTeaDecorator {

    public Bubble(IMilkTea innerMilkTea) {
        super(innerMilkTea);
    }

    @Override
    public double cost() {
        return 1d + super.cost();
    }
}
