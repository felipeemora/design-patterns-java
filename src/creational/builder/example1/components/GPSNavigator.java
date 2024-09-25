package creational.builder.example1.components;

public class GPSNavigator {
  private String route;

  public GPSNavigator() {
    this.route = "Street 49a bis south";
  }

  public GPSNavigator(String manualRoute) {
    this.route = manualRoute;
  }

  public String getRoute() {
    return route;
  }
}
