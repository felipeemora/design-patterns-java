package creational.abstractfactory.example2.weapon;

public class Axe implements Weapon {
  @Override
  public void doDamage() {
    System.out.println("axe damage");
  }
}
