package creationalPattern.abstractFactoryPattern.sample2.factions.alienFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IResourceManagement;

import java.util.HashMap;
import java.util.Map;

public class AlienResourceManagement implements IResourceManagement {

    public AlienResourceManagement() {
        _alienResources = new HashMap<>();
        _alienResources.put("organic", 800);
        _alienResources.put("energy", 600);
    }

    private Map<String, Integer> _alienResources;

    @Override
    public void aggregateResources(String resourceType, int amount) {
        _alienResources.put(resourceType, _alienResources.getOrDefault(resourceType, 0) + amount);
        System.out.println("Aliens gathered " + amount + " units of " + resourceType);
    }

    @Override
    public void spendResources(String resourceType, int amount) {
        if (_alienResources.get(resourceType) >= amount) {
            _alienResources.put(resourceType, _alienResources.get(resourceType) - amount);
            System.out.println("Alien Warriors spent " + amount + " units of " + resourceType);
        }
        else
            System.out.println("Alien Warriors having insufficient " + resourceType + " resources!      ");
    }

    @Override
    public int retrieveResource(String resourceType) {
        return _alienResources.getOrDefault(resourceType, 0);
    }
}
