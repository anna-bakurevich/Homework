package lesson7;

/**
 * 3. Создать класс Enemy, представляющий собой врага и содержащий поле health (количество здоровья).
 * Добавить конструктор, принимающий количество здоровья, а также сеттер и геттер.
 * Добавить метод takeDamage(int damage), который уменьшает количество здоровья в соответствии с полученным уроном.
 * Сделать так, чтобы класс Enemy реализовывал интерфейс Mortal.
 * Определить метод isAlive в классе Enemy так, чтобы тот возвращал true, если количество здоровья врага больше 0.
 */
public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    //метод, уменьшающий количество здоровья в соответствии с полученным уроном
    public void takeDamage(int damage) {
        health -= damage;
    }

    //возможность врага атаковать героя
    public void attackHero(Hero hero) {
        System.out.println("Враг атакует " + hero.getName());
        hero.takeDamage(1);
        System.out.println("--------------------------");
    }

    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }
}
