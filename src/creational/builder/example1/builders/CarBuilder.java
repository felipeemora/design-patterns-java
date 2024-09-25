package creational.builder.example1.builders;

import creational.builder.example1.cars.Car;
import creational.builder.example1.cars.CarType;
import creational.builder.example1.components.Engine;
import creational.builder.example1.components.GPSNavigator;
import creational.builder.example1.components.Transmission;
import creational.builder.example1.components.TripComputer;

public class CarBuilder implements Builder {
  private CarType type;
  private int seats;
  private Engine engine;
  private Transmission transmission;
  private TripComputer tripComputer;
  private GPSNavigator gpsNavigator;

  @Override
  public void setCarType(CarType type) {
    this.type = type;
  }

  @Override
  public void setSeats(int seats) {
    this.seats = seats;
  }

  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  @Override
  public void setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;
  }

  @Override
  public void setGpsNavigator(GPSNavigator gpsNavigator) {
    this.gpsNavigator = gpsNavigator;
  }

  public Car getResult() {
    return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
  }
}
