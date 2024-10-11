package creationalPattern.abstractFactoryPattern.sample1.concreteProducts;

import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiCharacter;

public class Alien implements ISciFiCharacter {

    @Override
    public void attack() {
        System.out.println("Alien launching a mind blast!   ");
    }
}
