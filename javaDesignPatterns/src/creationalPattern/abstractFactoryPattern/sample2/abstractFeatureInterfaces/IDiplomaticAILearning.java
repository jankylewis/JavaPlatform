package creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces;

public interface IDiplomaticAILearning {
    void recordAction(String action, boolean success);
    String chooseBestDiplomaticAction(IFaction anotherFaction);
}
