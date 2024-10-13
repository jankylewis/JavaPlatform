package behavioralPattern.observerPattern.sample1;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private final List<IObserver> _observers = new ArrayList<>();
    private int _temperature;
    private int _humidity;

    public int getTemperature() {
        return _temperature;
    }

    public int getHumidity() {
        return _humidity;
    }

    public void setWeatherParameters(int temperature, int humidity) {
        _temperature = temperature;
        _humidity = humidity;
        notifyAllObservers();
    }

    public void addObserver(IObserver observer) {
        _observers.add(observer);
    }

    public void notifyAllObservers() {
        for (IObserver observer : _observers)
            observer.update();
    }
}
