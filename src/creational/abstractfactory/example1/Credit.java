package creational.abstractfactory.example1;

public class Credit implements PaymentMethod{
  @Override
  public String doPayment() {
    return "Credit pay";
  }
}
