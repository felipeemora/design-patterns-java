package creational.abstractfactory.example2.factory;

import creational.abstractfactory.example2.armor.Armor;
import creational.abstractfactory.example2.armor.Robe;
import creational.abstractfactory.example2.enemy.Enemy;
import creational.abstractfactory.example2.enemy.Mage;
import creational.abstractfactory.example2.weapon.Weapon;
import creational.abstractfactory.example2.weapon.WizardStaff;

public class MageFactory extends EnemyAbstractFactory{
  @Override
  public Enemy createEnemy() {
    return new Mage();
  }

  @Override
  public Armor createArmor() {
    return new Robe();
  }

  @Override
  public Weapon createWeapon() {
    return new WizardStaff();
  }
}
