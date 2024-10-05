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
        this._carType = carType;
        this._numberOfSeats = numberOfSeats;
        this._engine = engine;
        this._transmission = transmission;

        this._tripComputer = tripComputer;
        if (this._tripComputer != null)
            this._tripComputer.setCar(this);

        this._gpsNavigator = gpsNavigator;
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
