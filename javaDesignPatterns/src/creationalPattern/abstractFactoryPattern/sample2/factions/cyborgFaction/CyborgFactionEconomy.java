package creationalPattern.abstractFactoryPattern.sample2.factions.cyborgFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IFaction;
import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IFactionEconomy;
import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IResourceManagement;

public class CyborgFactionEconomy implements IFactionEconomy {

    public CyborgFactionEconomy(IFaction faction, IResourceManagement resourceManagement) {
        _faction = faction;
        _resourceManagement = resourceManagement;
        _morale = 100;
        _techLevel = 1;
    }

    private final IFaction _faction;
    private final IResourceManagement _resourceManagement;
    private int _morale;
    private int _techLevel;

    @Override
    public void updateMorale(int change) {
        _morale += change;
        System.out.println("Cyborg morale is now " + _morale);
    }

    @Override
    public void researchTechnology() {
        if (_resourceManagement.retrieveResource("nanotech") >= 400) {
            _resourceManagement.spendResources("nanotech", 400);
            ++_techLevel;
            System.out.println("Cyborgs researching new technology! Tech level is now " + _techLevel);
        }
        else
            System.out.println("Cyborgs are not having enough nanotech components for doing research!   ");
    }

    @Override
    public void adjustEconomyBasedOnPowerShift() {
        System.out.println("Adjusting Cyborg economy based on power!        ");
    }
}
