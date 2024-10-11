package creationalPattern.abstractFactoryPattern.sample2.factions.cyborgFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IDiplomaticAILearning;
import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IFaction;

public class CyborgDiplomaticAILearning implements IDiplomaticAILearning {

    public CyborgDiplomaticAILearning(IFaction faction) {
        _faction = faction;
    }

    private final IFaction _faction;

    @Override
    public void recordAction(String action, boolean isSucceeded) {
        System.out.println("Cyborg AI learning from action: " + action + " - success: " + isSucceeded);
    }

    @Override
    public String chooseBestDiplomaticAction(IFaction anotherFaction) {
        return "Strategic sabotage";
    }
}
