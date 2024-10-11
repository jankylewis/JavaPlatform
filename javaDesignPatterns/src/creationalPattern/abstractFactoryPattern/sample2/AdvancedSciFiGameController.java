package creationalPattern.abstractFactoryPattern.sample2;

import creationalPattern.abstractFactoryPattern.sample2.abstractFeatureInterfaces.*;
import creationalPattern.abstractFactoryPattern.sample2.factions.cyborgFaction.CyborgFaction;

public class AdvancedSciFiGameController {

    public AdvancedSciFiGameController(IFaction faction) {
        _faction = faction;
    }

    private final IFaction _faction;

    public void gameOn() {

        //Creating Character, Weapon and Resource from the Faction
        ICharacter character = _faction.createCharacter();
        IWeapon weapon = _faction.createWeapon();
        IResource resource = _faction.createResource();
        IDiplomaticAILearning diplomaticAILearning = _faction.getDiplomaticAILearning();
        IResourceManagement resourceManagement = _faction.getResourceManagement();
        IFactionEconomy factionEconomy = _faction.getFactionEconomy();

        //Showing faction information
        System.out.println("Faction: " + _faction.getFactionName());

        character.attack();
        character.defend();
        character.gatherResources();
        weapon.take();

        System.out.println("Resource gathered: " + resource.getResourceType());

        resourceManagement.aggregateResources("energy", 200);
        resourceManagement.spendResources("energy", 150);

        System.out.println("Remaining energy: " + resourceManagement.retrieveResource("energy"));

        //Demonstrating diplomatic AI
        diplomaticAILearning.recordAction("Forming alliance with Cyborgs", true);
        String action = diplomaticAILearning.chooseBestDiplomaticAction(new CyborgFaction());

        System.out.println("AI decided to: " + action);

        //Demonstrating economy management
        factionEconomy.updateMorale(10);
        factionEconomy.researchTechnology();
        factionEconomy.adjustEconomyBasedOnPowerShift();
    }
}
