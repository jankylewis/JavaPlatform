package creationalPattern.abstractFactoryPattern.sample2.factions.humanFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IWeapon;

public class HumanWeapon implements IWeapon {

    @Override
    public void take() {
        System.out.println("Starting using Plasma Cannon from now on!       ");
    }
}
