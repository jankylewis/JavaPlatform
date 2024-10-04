package structural.decorator.decorators;

import structural.decorator.base.IMilkTea;
import structural.decorator.base.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {

    public BlackSugar(IMilkTea innerMilkTea) {
        super(innerMilkTea);
    }

    @Override
    public double cost() {
        return 2d + super.cost();
    }
}
