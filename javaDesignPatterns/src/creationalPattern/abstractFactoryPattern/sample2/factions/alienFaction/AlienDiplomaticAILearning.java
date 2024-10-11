package creationalPattern.abstractFactoryPattern.sample2.factions.alienFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IDiplomaticAILearning;
import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IFaction;

public class AlienDiplomaticAILearning implements IDiplomaticAILearning {

    public AlienDiplomaticAILearning(IFaction faction) {
        _faction = faction;
    }

    private final IFaction _faction;

    @Override
    public void recordAction(String action, boolean isSucceeded) {
        System.out.println("Alien Warrior AI learning from action: " + action + " - success: " + isSucceeded);
    }

    @Override
    public String chooseBestDiplomaticAction(IFaction anotherFaction) {
        return "Negotiating";
    }
}
