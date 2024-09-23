package creational.abstractfactory.example2.armor;

public class Robe implements Armor {
  @Override
  public void protect() {
    System.out.println("robe protect");
  }
}
