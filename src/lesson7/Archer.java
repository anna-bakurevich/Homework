package lesson7;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
        System.out.println("Создан лучник по имени " + name);
    }

    public Archer(String name, int health) {
        super(name, health);
        System.out.println("Создан лучник по имени " + name + "с количеством здоровья " + health);
    }

    //метод вызывает у врага .takeDamage и передает в него количество урона, соответствующее лучнику
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник " + getName() + " атакует врага");
        enemy.takeDamage(1);
        System.out.println("--------------------------");
    }

    @Override
    public void attackEnemy() {
        System.out.println("Лучник " + getName() + " атакует врага");
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
