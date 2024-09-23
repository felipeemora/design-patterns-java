package creational.abstractfactory.example1;

public class MasterCard implements Card{
  @Override
  public String getCardType() {
    return "MasterCard";
  }

  @Override
  public String getCardNumber() {
    return "5678";
  }
}
