package creational.abstractfactory.example2.factory;

import creational.abstractfactory.example2.armor.Armor;
import creational.abstractfactory.example2.armor.HeavyArmor;
import creational.abstractfactory.example2.enemy.Enemy;
import creational.abstractfactory.example2.enemy.Warrior;
import creational.abstractfactory.example2.weapon.Axe;
import creational.abstractfactory.example2.weapon.Weapon;

public class WarriorFactory extends EnemyAbstractFactory{
  @Override
  public Enemy createEnemy() {
    return new Warrior();
  }

  @Override
  public Armor createArmor() {
    return new HeavyArmor();
  }

  @Override
  public Weapon createWeapon() {
    return new Axe();
  }
}
