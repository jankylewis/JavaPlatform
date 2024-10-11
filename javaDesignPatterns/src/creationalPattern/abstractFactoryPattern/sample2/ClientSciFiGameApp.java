package creationalPattern.abstractFactoryPattern.sample2;

import creationalPattern.abstractFactoryPattern.sample2.factions.alienFaction.AlienFaction;
import creationalPattern.abstractFactoryPattern.sample2.factions.cyborgFaction.CyborgFaction;
import creationalPattern.abstractFactoryPattern.sample2.factions.humanFaction.HumanFaction;

public class ClientSciFiGameApp {

    public static void main(String[] args) {

        //Human Faction
        AdvancedSciFiGameController sciFiHumanGameController = new AdvancedSciFiGameController(new HumanFaction());
        sciFiHumanGameController.gameOn();

        System.out.println("\n--------------------\n");

        //Alien Faction
        AdvancedSciFiGameController sciFiAlienGameController = new AdvancedSciFiGameController(new AlienFaction());
        sciFiAlienGameController.gameOn();

        System.out.println("\n--------------------\n");

        //Cyborg Faction
        AdvancedSciFiGameController sciFiCyborgGameController = new AdvancedSciFiGameController(new CyborgFaction());
        sciFiCyborgGameController.gameOn();

        System.out.println("\n--------------------\n");
    }
}
