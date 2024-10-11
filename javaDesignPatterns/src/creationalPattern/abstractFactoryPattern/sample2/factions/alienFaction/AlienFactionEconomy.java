package creationalPattern.abstractFactoryPattern.sample2.factions.alienFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IFaction;
import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IFactionEconomy;
import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IResourceManagement;

public class AlienFactionEconomy implements IFactionEconomy {

    public AlienFactionEconomy(IFaction faction, IResourceManagement resourceManagement) {
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
        System.out.println("Alien Warrior morale is now " + _morale);
    }

    @Override
    public void researchTechnology() {
        if (_resourceManagement.retrieveResource("organic") >= 300) {
            _resourceManagement.spendResources("organic", 300);
            ++_techLevel;
            System.out.println("Alien Warriors researching new technology! Tech level is now " + _techLevel);
        }
        else
            System.out.println("Alien Warriors are not having organic matter for research!      ");
    }

    @Override
    public void adjustEconomyBasedOnPowerShift() {
        System.out.println("Adjusting Alien Warrior economy based on power!      ");
    }
}
