package creationalPattern.abstractFactoryPattern.sample1.concreteFactories;

import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiCharacter;
import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiGameFactory;
import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiWeapon;
import creationalPattern.abstractFactoryPattern.sample1.concreteProducts.Cyborg;
import creationalPattern.abstractFactoryPattern.sample1.concreteProducts.LaserGun;

public class CyborgFactory implements ISciFiGameFactory {

    @Override
    public ISciFiCharacter createCharacter() {
        return new Cyborg();
    }

    @Override
    public ISciFiWeapon createWeapon() {
        return new LaserGun();
    }
}
