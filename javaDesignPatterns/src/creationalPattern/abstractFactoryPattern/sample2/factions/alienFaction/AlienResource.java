package creationalPattern.abstractFactoryPattern.sample2.factions.alienFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IResource;

public class AlienResource implements IResource {

    @Override
    public String getResourceType() {
        return "Organic Matter";
    }

    @Override
    public int gatherResource() {
        System.out.println("Alien Warriors harvesting organic matter...     ");
        return 80;
    }
}
