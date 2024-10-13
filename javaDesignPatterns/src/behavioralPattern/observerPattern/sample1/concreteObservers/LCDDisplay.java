package behavioralPattern.observerPattern.sample1.concreteObservers;

import behavioralPattern.observerPattern.sample1.IObserver;
import behavioralPattern.observerPattern.sample1.WeatherStation;

public class LCDDisplay implements IObserver {

    public LCDDisplay(WeatherStation weatherStation) {
        _weatherStation = weatherStation;
        _weatherStation.addObserver(this);
    }

    private final WeatherStation _weatherStation;

    @Override
    public void update() {
        System.out.println("LCD Display - Temperature: " + _weatherStation.getTemperature() +
                ", Humidity: " + _weatherStation.getHumidity());
    }
}
