package creationalPattern.builderPattern.sample1.builders;

import creationalPattern.builderPattern.sample1.cars.Car;
import creationalPattern.builderPattern.sample1.cars.ECarType;
import creationalPattern.builderPattern.sample1.components.Engine;
import creationalPattern.builderPattern.sample1.components.GPSNavigator;
import creationalPattern.builderPattern.sample1.components.ETransmission;
import creationalPattern.builderPattern.sample1.components.TripComputer;

public class CarBuilder implements IBuilder {

    private ECarType _carType;
    private int _numberOfSeats;
    private Engine _engine;
    private ETransmission _transmission;
    private TripComputer _tripComputer;
    private GPSNavigator _gpsNavigator;

    @Override
    public void setCarType(ECarType carType) {
        _carType = carType;
    }

    @Override
    public void setSeats(int numberOfSeats) {
        _numberOfSeats = numberOfSeats;
    }

    @Override
    public void setEngine(Engine engine) {
        _engine = engine;
    }

    @Override
    public void setTransmission(ETransmission transmission) {
        _transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        _tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        _gpsNavigator = gpsNavigator;
    }

    public Car getCar() {
        return new Car(_carType, _numberOfSeats, _engine, _transmission, _tripComputer, _gpsNavigator);
    }
}
