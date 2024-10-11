package creationalPattern.abstractFactoryPattern.sample1;

import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiGameFactory;
import creationalPattern.abstractFactoryPattern.sample1.concreteFactories.AlienFactory;
import creationalPattern.abstractFactoryPattern.sample1.concreteFactories.CyborgFactory;
import creationalPattern.abstractFactoryPattern.sample1.gameController.SciFiGameController;

public class ClientSciFiGameApp {

    public static void main(String[] args) {

        ISciFiGameFactory cyborgGameFactory = new CyborgFactory();
        SciFiGameController cyborgGameController = new SciFiGameController(cyborgGameFactory);

        cyborgGameController.roll();

        System.out.println("\n-------------\n");

        ISciFiGameFactory alienGameFactory = new AlienFactory();
        SciFiGameController alienGameController = new SciFiGameController(alienGameFactory);

        alienGameController.roll();
    }
}
