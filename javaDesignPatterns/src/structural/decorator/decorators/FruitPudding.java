package structural.decorator.decorators;

import structural.decorator.base.IMilkTea;
import structural.decorator.base.MilkTeaDecorator;

public class FruitPudding extends MilkTeaDecorator {

    public FruitPudding(IMilkTea innerMilkTea) {
        super(innerMilkTea);
    }

    @Override
    public double cost() {
        return 3d + super.cost();
    }
}
