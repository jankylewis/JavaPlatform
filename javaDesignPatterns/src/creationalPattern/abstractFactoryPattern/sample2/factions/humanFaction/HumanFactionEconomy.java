package creationalPattern.abstractFactoryPattern.sample2.factions.humanFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IFaction;
import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IFactionEconomy;
import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IResourceManagement;

public class HumanFactionEconomy implements IFactionEconomy {

    public HumanFactionEconomy(IFaction faction, IResourceManagement resourceManagement) {
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
        System.out.println("Human morale is now: " + _morale);
    }

    @Override
    public void researchTechnology() {
        if (_resourceManagement.retrieveResource("energy") >= 500) {
            _resourceManagement.spendResources("energy", 500);
            ++_techLevel;
            System.out.println("Humans researched new technology! Tech level goes now: "+ _techLevel);
        }
        else
            System.out.println("Humans did not have enough energy for research!     ");
    }

    @Override
    public void adjustEconomyBasedOnPowerShift() {
        System.out.println("Adjusting Human economy based on power!     ");
    }
}
