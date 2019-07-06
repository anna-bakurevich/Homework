package lesson7;

/**
 * 2. Создать классы Warrior, Mage и Archer, представляющие собой наследников класса Hero
 * Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.
 */
public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
        System.out.println("Создан воин по имени " + name);
    }

    public Warrior(String name, int health) {
        super(name, health);
        System.out.println("Создан воин по имени " + name + "с количеством здоровья " + health);
    }

    //метод вызывает у врага .takeDamage и передает в него количество урона, соотверствующее воину
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воин " + getName() + " атакует врага");
        enemy.takeDamage(3);
        System.out.println("--------------------------");
    }

    @Override
    public void attackEnemy() {
        System.out.println("Воин " + getName() + " атакует врага");
        System.out.println("--------------------------");
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    @Override
    public boolean isAlive() {
        if (getHealth() > 0) {
            return true;
        } else {
            return false;
        }
    }

}
