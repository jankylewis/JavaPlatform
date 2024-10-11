package creationalPattern.abstractFactoryPattern.sample2.factions.humanFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.ICharacter;

public class HumanCharacter implements ICharacter {

    @Override
    public void attack() {
        System.out.println("Human soldier attacking with laser rifles!      ");
    }

    @Override
    public void defend() {
        System.out.println("Human soldier defending with energy shields!        ");
    }

    @Override
    public void gatherResources() {
        System.out.println("Human gathering resources using mining bots!        ");
    }
}
