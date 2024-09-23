package creational.abstractfactory.example2.factory;

import creational.abstractfactory.example2.armor.Armor;
import creational.abstractfactory.example2.enemy.Enemy;
import creational.abstractfactory.example2.weapon.Weapon;

public abstract class EnemyAbstractFactory {
  public abstract Enemy createEnemy();
  public abstract Armor createArmor();
  public abstract Weapon createWeapon();
}
