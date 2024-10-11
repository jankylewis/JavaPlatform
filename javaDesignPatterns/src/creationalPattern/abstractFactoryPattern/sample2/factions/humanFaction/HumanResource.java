package creationalPattern.abstractFactoryPattern.sample2.factions.humanFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IResource;

public class HumanResource implements IResource {

    @Override
    public String getResourceType() {
        return "Energy Cells";
    }

    @Override
    public int gatherResource() {
        System.out.println("Humans gathering energy cells...        ");
        return 100;
    }
}
