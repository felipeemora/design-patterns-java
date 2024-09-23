package creational.abstractfactory.example1;

public class Debit implements PaymentMethod {
  @Override
  public String doPayment() {
    return "Debit pay";
  }
}
