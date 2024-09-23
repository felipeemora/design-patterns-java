package creational.factory;

public class ApplePayment implements Payment {
  @Override
  public void doPayment() {
    System.out.println("Pagando con Apple Pay");
  }
}
