package creational.abstractfactory.example2.weapon;

public class WizardStaff implements Weapon {
  @Override
  public void doDamage() {
    System.out.println("Wizard Staff damage");
  }
}
