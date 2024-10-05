package creationalPattern.builderPattern.sample1.components;

import creationalPattern.builderPattern.sample1.cars.Car;

public class TripComputer {

    private Car _car;

    public void setCar(Car car) {
        _car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + _car.getFuel());
    }

    public void showStatus() {

        if (_car.getEngine().isStarted()){
            System.out.println("Car is started  ");
            return;
        }

        System.out.println("Car is not started  ");
    }
}
