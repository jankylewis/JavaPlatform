package creationalPattern.abstractFactoryPattern.sample1.gameController;

import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiCharacter;
import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiGameFactory;
import creationalPattern.abstractFactoryPattern.sample1.abstractInterfaces.ISciFiWeapon;

public class SciFiGameController {

    public SciFiGameController(ISciFiGameFactory sciFiGameFactory) {
        _sciFiCharacter = sciFiGameFactory.createCharacter();
        _sciFiWeapon = sciFiGameFactory.createWeapon();
    }

    private final ISciFiCharacter _sciFiCharacter;
    private final ISciFiWeapon _sciFiWeapon;

    public void roll() {
        _sciFiCharacter.attack();
        _sciFiWeapon.fire();
    }
}
