package behavioralPattern.observerPattern.sample1.concreteObservers;

import behavioralPattern.observerPattern.sample1.WeatherStation;

public class ClientWeatherStation {

    public static void main(String[] args) {

        //Creating Subject
        WeatherStation weatherStation = new WeatherStation();

        //Creating Observers
        new WebAppDisplay(weatherStation);
        new MobileAppDisplay(weatherStation);
        new LCDDisplay(weatherStation);

        //Updating weather parameters => notifying all the observers
        System.out.println("Updating weather parameters to Temperature: 25, Humidity: 50");
        weatherStation.setWeatherParameters(25, 50);

        System.out.println("Updating weather parameters to Temperature: 60, Humidity: 180");
        weatherStation.setWeatherParameters(60, 180);
    }
}
