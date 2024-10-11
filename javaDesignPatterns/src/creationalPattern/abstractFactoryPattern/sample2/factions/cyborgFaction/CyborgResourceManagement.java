package creationalPattern.abstractFactoryPattern.sample2.factions.cyborgFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IResourceManagement;

import java.util.HashMap;
import java.util.Map;

public class CyborgResourceManagement implements IResourceManagement {

    public CyborgResourceManagement() {
        _cyborgResources = new HashMap<>();
        _cyborgResources.put("nanotech", 1500);
        _cyborgResources.put("energy", 800);
    }

    private Map<String, Integer> _cyborgResources;

    @Override
    public void aggregateResources(String resourceType, int amount) {
        _cyborgResources.put(resourceType, _cyborgResources.getOrDefault(resourceType, 0) + amount);
        System.out.println("Cyborgs gathered " + amount + " units of " + resourceType);
    }

    @Override
    public void spendResources(String resourceType, int amount) {
        if (_cyborgResources.get(resourceType) >= amount) {
            _cyborgResources.put(resourceType, _cyborgResources.get(resourceType) - amount);
            System.out.println("Cyborgs spent " + amount + " units of " + resourceType);
        }
        else
            System.out.println("Cyborgs having insufficient " + resourceType + " resources!     ");
    }

    @Override
    public int retrieveResource(String resourceType) {
        return _cyborgResources.getOrDefault(resourceType, 0);
    }
}
