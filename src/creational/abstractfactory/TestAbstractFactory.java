package creational.abstractfactory;

import creational.abstractfactory.example2.armor.Armor;
import creational.abstractfactory.example2.enemy.Enemy;
import creational.abstractfactory.example2.factory.EnemyAbstractFactory;
import creational.abstractfactory.example2.factory.MageFactory;
import creational.abstractfactory.example2.factory.WarriorFactory;
import creational.abstractfactory.example2.weapon.Weapon;

public class TestAbstractFactory {
  public static void main(String[] args) {
    EnemyAbstractFactory factory = new WarriorFactory();
    Enemy warrior = factory.createEnemy();
    Armor heavyArmor = factory.createArmor();
    Weapon axe = factory.createWeapon();

    warrior.attack();
    heavyArmor.protect();
    axe.doDamage();

    EnemyAbstractFactory factory1 = new MageFactory();
    Enemy mage = factory1.createEnemy();
    Armor robe = factory1.createArmor();
    Weapon wizzard = factory1.createWeapon();

    mage.attack();
    robe.protect();
    wizzard.doDamage();

  }
}
