package creationalPattern.abstractFactoryPattern.sample2.factions.humanFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IResourceManagement;

import java.util.HashMap;
import java.util.Map;

public class HumanResourceManagement implements IResourceManagement {

    public HumanResourceManagement() {
        _humanResources = new HashMap<>();
        _humanResources.put("energy", 1000);
        _humanResources.put("minerals", 500);
        _humanResources.put("food", 200);
    }

    private final Map<String, Integer> _humanResources;

    @Override
    public void aggregateResources(String resourceType, int amount) {
        _humanResources.put(resourceType, _humanResources.getOrDefault(resourceType, 0) + amount);
        System.out.println("Humans aggregated " + amount + " units of " + resourceType);
    }

    @Override
    public void spendResources(String resourceType, int amount) {

        if (_humanResources.get(resourceType) >= amount)
            _humanResources.put(resourceType, _humanResources.get(resourceType) - amount);
        else
            System.out.println("Humans had insufficient " + resourceType + " resources!     ");
    }

    @Override
    public int retrieveResource(String resourceType) {
        return _humanResources.getOrDefault(resourceType, 0);
    }
}
