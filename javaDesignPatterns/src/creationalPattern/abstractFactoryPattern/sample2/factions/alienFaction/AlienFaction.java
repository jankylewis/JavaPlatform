package creationalPattern.abstractFactoryPattern.sample2.factions.alienFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.*;

public class AlienFaction implements IFaction {

    @Override
    public ICharacter createCharacter() {
        return new AlienCharacter();
    }

    @Override
    public IWeapon createWeapon() {
        return new AlienWeapon();
    }

    @Override
    public IResource createResource() {
        return new AlienResource();
    }

    @Override
    public String getFactionName() {
        return "Alien Coalition";
    }

    @Override
    public IDiplomaticAILearning getDiplomaticAILearning() {
        return new AlienDiplomaticAILearning(this);
    }

    @Override
    public IResourceManagement getResourceManagement() {
        return new AlienResourceManagement();
    }

    @Override
    public IFactionEconomy getFactionEconomy() {
        return new AlienFactionEconomy(this, getResourceManagement());
    }
}
