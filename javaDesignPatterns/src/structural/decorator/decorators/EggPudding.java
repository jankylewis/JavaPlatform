package structural.decorator.decorators;

import structural.decorator.base.IMilkTea;
import structural.decorator.base.MilkTeaDecorator;

public class EggPudding extends MilkTeaDecorator {

    public EggPudding(IMilkTea innerMilkTea) {
        super(innerMilkTea);
    }

    @Override
    public double cost() {
        return 3d + super.cost();
    }
}
