package creationalPattern.abstractFactoryPattern.sample2.factions.alienFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IWeapon;

public class AlienWeapon implements IWeapon {

    @Override
    public void take() {
        System.out.println("Alien Warrior weapon firing bio-plasma projectiles!     ");
    }
}
