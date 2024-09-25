package creational.builder.example1.builders;

import creational.builder.example1.cars.CarType;
import creational.builder.example1.components.Engine;
import creational.builder.example1.components.GPSNavigator;
import creational.builder.example1.components.Transmission;
import creational.builder.example1.components.TripComputer;

public interface Builder {
  void setCarType(CarType type);
  void setSeats(int seats);
  void setEngine(Engine engine);
  void setTransmission(Transmission transmission);
  void setTripComputer(TripComputer tripComputer);
  void setGpsNavigator(GPSNavigator gpsNavigator);
}
