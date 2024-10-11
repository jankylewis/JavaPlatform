package creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces;

public interface IResourceManagement {
    void aggregateResources(String resourceType, int amount);
    void spendResources(String resourceType, int amount);
    int retrieveResource(String resourceType);
}
