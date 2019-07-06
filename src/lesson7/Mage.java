package lesson7;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
        System.out.println("Создан маг по имени " + name);
    }

    public Mage(String name, int health) {
        super(name, health);
        System.out.println("Создан маг по имени " + name + "с количеством здоровья " + health);
    }

    //метод вызывает у врага .takeDamage и передает в него количество урона, соответстветствующее магу
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг " + getName() + " атакует врага");
        enemy.takeDamage(5);
        System.out.println("--------------------------");
    }

    @Override
    public void attackEnemy() {
        System.out.println("Маг " + getName() + " атакует врага");
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
