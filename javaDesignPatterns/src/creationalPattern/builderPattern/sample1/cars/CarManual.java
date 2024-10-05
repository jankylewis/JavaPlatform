package creationalPattern.builderPattern.sample1.cars;

import creationalPattern.builderPattern.sample1.components.Engine;
import creationalPattern.builderPattern.sample1.components.GPSNavigator;
import creationalPattern.builderPattern.sample1.components.ETransmission;
import creationalPattern.builderPattern.sample1.components.TripComputer;

public class CarManual {

    public CarManual(
            ECarType carType, int numberOfSeats, Engine engine,
            ETransmission transmission, TripComputer tripComputer,
            GPSNavigator gpsNavigator
    ) {
        _carType = carType;
        _numberOfSeats = numberOfSeats;
        _engine = engine;
        _transmission = transmission;
        _tripComputer = tripComputer;
        _gpsNavigator = gpsNavigator;
    }

    private final ECarType _carType;
    private final int _numberOfSeats;
    private final Engine _engine;
    private final ETransmission _transmission;
    private final TripComputer _tripComputer;
    private final GPSNavigator _gpsNavigator;

    public String getCarManualInfor() {

        String info = "";
        info += "Type of car: " + _carType + "\n";
        info += "Count of seats: " + _numberOfSeats + "\n";
        info += "Engine: volume - " + _engine.getVolume() + "; mileage - " + _engine.getMileage() + "\n";
        info += "Transmission: " + _transmission + "\n";

        if (_tripComputer != null)
            info += "Trip Computer: Functional" + "\n";
        else
            info += "Trip Computer: N/A" + "\n";

        if (_gpsNavigator != null)
            info += "GPS Navigator: Functional" + "\n";
        else
            info += "GPS Navigator: N/A" + "\n";

        return info;
    }
}
