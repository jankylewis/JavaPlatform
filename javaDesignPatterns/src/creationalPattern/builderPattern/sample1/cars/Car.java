package creationalPattern.builderPattern.sample1.cars;

import creationalPattern.builderPattern.sample1.components.Engine;
import creationalPattern.builderPattern.sample1.components.GPSNavigator;
import creationalPattern.builderPattern.sample1.components.ETransmission;
import creationalPattern.builderPattern.sample1.components.TripComputer;

public class Car {

    public Car(
            ECarType carType, int numberOfSeats, Engine engine, ETransmission transmission,
            TripComputer tripComputer, GPSNavigator gpsNavigator
    ) {
        _carType = carType;
        _numberOfSeats = numberOfSeats;
        _engine = engine;
        _transmission = transmission;

        _tripComputer = tripComputer;
        if (_tripComputer != null)
            _tripComputer.setCar(this);

        _gpsNavigator = gpsNavigator;
    }

    private final ECarType _carType;
    private final int _numberOfSeats;
    private final Engine _engine;
    private final ETransmission _transmission;
    private final TripComputer _tripComputer;
    private final GPSNavigator _gpsNavigator;
    private double _fuel = 0;

    public ECarType getCarType() {
        return _carType;
    }

    public double getFuel() {
        return _fuel;
    }

    public void setFuel(double fuel) {
        _fuel = fuel;
    }

    public int getNumberOfSeats() {
        return _numberOfSeats;
    }

    public Engine getEngine() {
        return _engine;
    }

    public ETransmission getTransmission() {
        return _transmission;
    }

    public TripComputer getTripComputer() {
        return _tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return _gpsNavigator;
    }
}
