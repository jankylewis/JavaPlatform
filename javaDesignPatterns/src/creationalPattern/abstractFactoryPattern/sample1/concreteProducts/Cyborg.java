package creationalPattern.abstractFactoryPattern.sample1.concreteProducts;

import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiCharacter;

public class Cyborg implements ISciFiCharacter {

    @Override
    public void attack() {
        System.out.println("Cyborg attacking with precision!    ");
    }
}
