package creational.abstractfactory.example2.armor;

public class HeavyArmor implements Armor {
  @Override
  public void protect() {
    System.out.println("heavy armor protect");
  }
}
