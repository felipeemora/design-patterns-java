package creational.abstractfactory.example1;

public interface AbstractFactory <T> {
  T create(String type);
}
