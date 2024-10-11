package creationalPattern.abstractFactoryPattern.sample2.factions.cyborgFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.*;

public class CyborgFaction implements IFaction {

    @Override
    public ICharacter createCharacter() {
        return new CyborgCharacter();
    }

    @Override
    public IWeapon createWeapon() {
        return new CyborgWeapon();
    }

    @Override
    public IResource createResource() {
        return new CyborgResource();
    }

    @Override
    public String getFactionName() {
        return "Cyborg Dominion";
    }

    @Override
    public IDiplomaticAILearning getDiplomaticAILearning() {
        return new CyborgDiplomaticAILearning(this);
    }

    @Override
    public IResourceManagement getResourceManagement() {
        return new CyborgResourceManagement();
    }

    @Override
    public IFactionEconomy getFactionEconomy() {
        return new CyborgFactionEconomy(this, getResourceManagement());
    }
}
