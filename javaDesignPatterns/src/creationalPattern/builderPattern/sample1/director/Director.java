package creationalPattern.builderPattern.sample1.director;

import creationalPattern.builderPattern.sample1.builders.IBuilder;
import creationalPattern.builderPattern.sample1.cars.ECarType;
import creationalPattern.builderPattern.sample1.components.ETransmission;

public class Director {

    public void buildSportsCar(IBuilder builder) {
        builder.setCarType(ECarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setTransmission(ETransmission.SEMI_AUTOMATIC);
    }

    public void buildCityCar(IBuilder builder) {
        builder.setCarType(ECarType.CITY_CAR);
        builder.setTransmission(ETransmission.AUTOMATIC);
    }

    public void buildSUVCar(IBuilder builder) {
        builder.setCarType(ECarType.SUV);
    }

    public void buildStagflationCar(IBuilder builder) {
        builder.setCarType(ECarType.STAGFLATION);
    }
}
