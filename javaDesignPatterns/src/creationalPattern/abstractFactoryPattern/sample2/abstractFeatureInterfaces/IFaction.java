package creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces;

public interface IFaction {
    ICharacter createCharacter();
    IWeapon createWeapon();
    IResource createResource();
    String getFactionName();
    IDiplomaticAILearning getDiplomaticAILearning();
    IResourceManagement getResourceManagement();
    IFactionEconomy getFactionEconomy();
}
