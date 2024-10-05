package creationalPattern.builderPattern.sample1.builders;

import creationalPattern.builderPattern.sample1.cars.ECarType;
import creationalPattern.builderPattern.sample1.components.Engine;
import creationalPattern.builderPattern.sample1.components.GPSNavigator;
import creationalPattern.builderPattern.sample1.components.ETransmission;
import creationalPattern.builderPattern.sample1.components.TripComputer;

public interface IBuilder {
    void setCarType(ECarType carType);
    void setSeats(int numberOfSeats);
    void setEngine(Engine engine);
    void setTransmission(ETransmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
