package creationalPattern.abstractFactoryPattern.sample2.factions.alienFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.ICharacter;

public class AlienCharacter implements ICharacter {

    @Override
    public void attack() {
        System.out.println("Alien warrior using psionic abilities to attack!      ");
    }

    @Override
    public void defend() {
        System.out.println("Alien warrior creating a biological forcefield!     ");
    }

    @Override
    public void gatherResources() {
        System.out.println("Alien warrior harvesting biological resources from planets!     ");
    }
}
