package creationalPattern.abstractFactoryPattern.sample2.factions.cyborgFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IWeapon;

public class CyborgWeapon implements IWeapon {

    @Override
    public void take() {
        System.out.println("Using high-frequency railgun!       ");
    }
}
