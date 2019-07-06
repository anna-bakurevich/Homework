package lesson7;

public class Ork extends Enemy {
    public Ork(int health) {
        super(health);
        System.out.println("Создан враг Орк с количеством здоровья " + health);
    }
    @Override
    public void attackHero(Hero hero) {
        System.out.println("Орк атакует " + hero.getName());
        hero.takeDamage(2);
        System.out.println("--------------------------");
    }
}
