package lesson7;

/**
 * Создать класс TrainingGround, содержащий метод main. Протестировать создание героя и его атаку.
 * Протестировать создание героев различных классов и их атаки в классе TrainingGround.
 */

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Лейла Хасан",8);
        Hero mage = new Mage("Гермес Трисмегист", 10);
        Hero archer = new Archer("Радунхагейду", 5);
        System.out.println("--------------------------");
        warrior.attackEnemy();
        mage.attackEnemy();
        archer.attackEnemy();
    }

}
