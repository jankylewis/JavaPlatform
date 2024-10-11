package creationalPattern.abstractFactoryPattern.sample2.factions.humanFaction;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IDiplomaticAILearning;
import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.IFaction;

public class HumanDiplomaticAILearning implements IDiplomaticAILearning {

    public HumanDiplomaticAILearning(IFaction faction) {
        _faction = faction;
    }

    private final IFaction _faction;

    @Override
    public void recordAction(String action, boolean isSucceed) {
        System.out.println("Human AI learning from action: " + action + " - success: " + isSucceed);
    }

    @Override
    public String chooseBestDiplomaticAction(IFaction anotherFaction) {
        return "Form Alliance";
    }
}
