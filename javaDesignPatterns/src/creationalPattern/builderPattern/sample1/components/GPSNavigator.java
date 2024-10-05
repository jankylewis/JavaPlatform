package creationalPattern.builderPattern.sample1.components;

public class GPSNavigator {

    public GPSNavigator() {
        _route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        _route = manualRoute;
    }

    private String _route;

    public String getRoute() {
        return _route;
    }
}
