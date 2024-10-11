package creationalPattern.abstractFactoryPattern.sample1.concreteProducts;

import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiWeapon;

public class PlasmaCannon implements ISciFiWeapon {

    @Override
    public void fire() {
        System.out.println("Shooting a Plasma Cannon blast!     ");
    }
}
