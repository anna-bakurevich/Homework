package lesson7;

public class Goblin extends Enemy {
    public Goblin(int health) {
        super(health);
        System.out.println("Создан враг Гоблин с количеством здоровья " + health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Гоблин атакует " + hero.getName());
        hero.takeDamage(3);
        System.out.println("--------------------------");
    }
}
