package creational.abstractfactory.example1;

public class Visa implements Card{
  @Override
  public String getCardType() {
    return "Visa";
  }

  @Override
  public String getCardNumber() {
    return "1234";
  }
}
