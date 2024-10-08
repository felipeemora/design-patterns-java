package creational.builder.example1.director;

import creational.builder.example1.builders.Builder;
import creational.builder.example1.cars.CarType;
import creational.builder.example1.components.Engine;
import creational.builder.example1.components.GPSNavigator;
import creational.builder.example1.components.Transmission;
import creational.builder.example1.components.TripComputer;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {
  public void constructSportsCar(Builder builder) {
    builder.setCarType(CarType.SPORTS_CAR);
    builder.setSeats(2);
    builder.setEngine(new Engine(3.0, 0));
    builder.setTransmission(Transmission.SEMI_AUTOMATIC);
    builder.setTripComputer(new TripComputer());
    builder.setGpsNavigator(new GPSNavigator());
  }

  public void constructCityCar(Builder builder) {
    builder.setCarType(CarType.CITY_CAR);
    builder.setSeats(2);
    builder.setEngine(new Engine(1.2, 0));
    builder.setTransmission(Transmission.AUTOMATIC);
    builder.setTripComputer(new TripComputer());
    builder.setGpsNavigator(new GPSNavigator());
  }

  public void constructSUV(Builder builder) {
    builder.setCarType(CarType.SUV);
    builder.setSeats(4);
    builder.setEngine(new Engine(2.5, 0));
    builder.setTransmission(Transmission.MANUAL);
    builder.setGpsNavigator(new GPSNavigator());
  }
}
