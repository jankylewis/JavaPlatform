package creationalPattern.abstractFactoryPattern.sample1.concreteFactories;

import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiCharacter;
import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiGameFactory;
import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiWeapon;
import creationalPattern.abstractFactoryPattern.sample1.concreteProducts.Alien;
import creationalPattern.abstractFactoryPattern.sample1.concreteProducts.PlasmaCannon;

public class AlienFactory implements ISciFiGameFactory {

    @Override
    public ISciFiCharacter createCharacter() {
        return new Alien();
    }

    @Override
    public ISciFiWeapon createWeapon() {
        return new PlasmaCannon();
    }
}
