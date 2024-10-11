package creationalPattern.abstractFactoryPattern.sample1.concreteProducts;

import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiWeapon;

public class LaserGun implements ISciFiWeapon {

    @Override
    public void fire() {
        System.out.println("Firing the Laser Gun!   ");
    }
}
