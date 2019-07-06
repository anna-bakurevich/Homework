package lesson7;

public class Zombie extends Enemy {

    public Zombie(int health) {
        super(health);
        System.out.println("Создан враг Зомби с количеством здоровья " + health);
    }
    @Override
    public void attackHero(Hero hero) {
        System.out.println("Зомби атакует " + hero.getName());
        hero.takeDamage(1);
        System.out.println("--------------------------");
    }


    int tmpHealth = getHealth();

    @Override
    public boolean isAlive() {
        if (getHealth() > 0) {
            return true;
        } else {//если здоровье закончилось, восстанавливаем его на первоначальный уровень
            System.out.println("Зомби восстал из мертвых!");
            setHealth(tmpHealth);
            return true;
        }
    }

}
