package creationalPattern.builderPattern.sample1.components;

public class Engine {

    public Engine(double volume, double mileage) {
        _volume = volume;
        _mileage = mileage;
    }

    private final double _volume;

    private double _mileage;
    private boolean _isStarted;

    public void go(double mileage) {

        if (_isStarted) {
            this._mileage += mileage;
            return;
        }

        throw new RuntimeException("Car cannot go, engine must be started first!");
    }

    public void carOn() {
        _isStarted = true;
    }

    public void carOff() {
        _isStarted = false;
    }

    public boolean isStarted() {
        return _isStarted;
    }

    public double getVolume() {
        return _volume;
    }

    public double getMileage() {
        return _mileage;
    }
}
