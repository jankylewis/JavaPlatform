package creationalPattern.abstractFactoryPattern.sample2.factions.cyborgFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.ICharacter;

public class CyborgCharacter implements ICharacter {

    @Override
    public void attack() {
        System.out.println("Cyborg Unit attacking with integrated laser weapons!        ");
    }

    @Override
    public void defend() {
        System.out.println("Cyborg Unit activating heavy armor shielding!       ");
    }

    @Override
    public void gatherResources() {
        System.out.println("Cyborgs using nanobots to mine resources!       ");
    }
}
