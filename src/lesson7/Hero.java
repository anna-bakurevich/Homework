package lesson7;

/**
 * 1. Создать класс Hero, представляющий собой героя и содержащий поле name.
 * Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
 * Добавить метод attackEnemy(), выводящий в консоль сообщение о том, что герой атакует врага.
 * 4. Сделать класс Hero и его метод attackEnemy абстрактными.
 * 3. Переписать метод attackEnemy класса Hero, добавив ему параметр типа Enemy.
 * Метод должен вызывать у врага метод takeDamage и передавать в него определённое количество урона.
 * Переопределить метод в подклассах Warrior, Mage и Archer так, чтобы каждый герой наносил врагу разное количество урона.
 * 7*. Добавить герою показатель здоровья и возможность погибнуть.
 */
public abstract class Hero implements Mortal {
    private String name;
    private int health;

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract void attackEnemy();

    public abstract void takeDamage(int damage);

    @Override
    public abstract boolean isAlive();
}
