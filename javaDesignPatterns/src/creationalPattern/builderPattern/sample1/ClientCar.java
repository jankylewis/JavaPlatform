package creationalPattern.builderPattern.sample1;

import creationalPattern.builderPattern.sample1.builders.CarBuilder;
import creationalPattern.builderPattern.sample1.builders.CarManualBuilder;
import creationalPattern.builderPattern.sample1.cars.Car;
import creationalPattern.builderPattern.sample1.components.Engine;
import creationalPattern.builderPattern.sample1.director.Director;

public class ClientCar {

    public static void main(String[] args) {

        System.out.println();

        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.buildSportsCar(carBuilder);

        Car sportsCar = carBuilder.getCar();

        System.out.println("Car built: " + sportsCar.getCarType());

        System.out.println();

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.buildStagflationCar(carManualBuilder);
        carManualBuilder.setEngine(new Engine(50d, 12d));

        System.out.println("Car Manual's information: " +carManualBuilder.getCarManual().getCarManualInfor());
    }
}
