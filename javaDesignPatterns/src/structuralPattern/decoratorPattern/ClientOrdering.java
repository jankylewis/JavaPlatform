package structuralPattern.decoratorPattern;

import structuralPattern.decoratorPattern.base.IMilkTea;
import structuralPattern.decoratorPattern.base.MilkTea;
import structuralPattern.decoratorPattern.decorators.*;

public class ClientOrdering {

    public static void main(String[] args) {

        System.out.println();

        IMilkTea firstMilkTea = new EggPudding(
                new FruitPudding(
                        new BlackSugar(
                                new Bubble(
                                        new MilkTea()))));
        
        System.out.println("The first milk-tea's cost: " + firstMilkTea.cost());

        IMilkTea secondMilkTea = new EggPudding(
                new BlackSugar(
                        new WhiteBubble(
                                new MilkTea())));
        System.out.println("The second milk-tea's cost: " + secondMilkTea.cost());
    }
}
