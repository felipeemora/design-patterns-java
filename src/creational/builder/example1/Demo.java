package creational.builder.example1;

import creational.builder.example1.builders.CarBuilder;
import creational.builder.example1.builders.CarManualBuilder;
import creational.builder.example1.cars.Car;
import creational.builder.example1.cars.Manual;
import creational.builder.example1.director.Director;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
  public static void main(String[] args) {
    Director director = new Director();

    // El director obtiene el objeto constructor concreto del cliente
    // (código de aplicación). Esto se debe a que la aplicación sabe mejor cuál
    // constructor a utilizar para obtener un producto específico.
    CarBuilder builder = new CarBuilder();
    director.constructSportsCar(builder);


    // El producto final a menudo se recupera de un objeto constructor, ya que
    // El director no es consciente y no depende de constructores concretos y
    // productos.
    Car car = builder.getResult();
    System.out.println("Car built:\n" + car.getCarType());

    CarManualBuilder manualBuilder = new CarManualBuilder();

    // Director may know several building recipes.
    director.constructSportsCar(manualBuilder);
    Manual carManual = manualBuilder.getResult();
    System.out.println("\nCar manual built:\n" + carManual.print());
  }
}
