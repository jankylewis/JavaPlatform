package creationalPattern.abstractFactoryPattern.sample2.factions.humanFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.*;

public class HumanFaction implements IFaction {

    @Override
    public ICharacter createCharacter() {
        return new HumanCharacter();
    }

    @Override
    public IWeapon createWeapon() {
        return new HumanWeapon();
    }

    @Override
    public IResource createResource() {
        return new HumanResource();
    }

    @Override
    public String getFactionName() {
        return "Human Alliance";
    }

    @Override
    public IDiplomaticAILearning getDiplomaticAILearning() {
        return new HumanDiplomaticAILearning(this);
    }

    @Override
    public IResourceManagement getResourceManagement() {
        return new HumanResourceManagement();
    }

    @Override
    public IFactionEconomy getFactionEconomy() {
        return new HumanFactionEconomy(this, getResourceManagement());
    }
}
