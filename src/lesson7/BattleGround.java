package lesson7;

/**
 * Создать класс BattleGround с методом main, в котором создать симуляцию героя, атакующего врага.
 * Продемонстрировать сражение героя с несколькими соперниками.
 */

public class BattleGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Лейла Хасан", 8);
        Hero mage = new Mage("Гермес Трисмегист", 10);
        Hero archer = new Archer("Радунхагейду", 10);
        Enemy zombie = new Zombie(2);
        Enemy ork = new Ork(4);
        Enemy goblin = new Goblin(2);
        System.out.println("--------------------------");
        battle(warrior, ork, zombie);
    }

    //сражение героя с одним врагом
    public static void battle(Hero hero, Enemy enemy) {
        //пока оба живы
        while (enemy.isAlive() && hero.isAlive()) {
            hero.attackEnemy(enemy); //герой атакует врага
            if (enemy.isAlive()) { //если враг после атаки жив
                enemy.attackHero(hero); //враг в ответ атакует героя
                if (hero.isAlive()) {//если герой остался жив, продолжаем
                    continue;
                } else {//если герой мертв
                    System.out.println("Герой погиб...");
                    break;
                }
            } else {//если враг мертв
                System.out.println("Враг побежден!");
                break;
            }
        }
    }

    //сражение героя с двумя врагами
    public static void battle(Hero hero, Enemy enemy1, Enemy enemy2) {
        //пока хотя бы кто-то из врагов и герой живы
        while ((enemy1.isAlive() || enemy2.isAlive()) && hero.isAlive()) {
            battle(hero, enemy1);
            battle(hero, enemy2);
        }
    }
}
