package creationalPattern.abstractFactoryPattern.sample2.factions.cyborgFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IResource;

public class CyborgResource implements IResource {

    @Override
    public String getResourceType() {
        return "Nanotech Components";
    }

    @Override
    public int gatherResource() {
        System.out.println("Cyborgs gathering nanotech components...        ");
        return 120;
    }
}
