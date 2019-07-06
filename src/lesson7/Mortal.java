package lesson7;

/**
 * 5. Создать интерфейс Mortal, содержащий метод isAlive().
 * Сделать так, чтобы класс Enemy реализовывал интерфейс Mortal.
 * Определить метод isAlive в классе Enemy так, чтобы тот возвращал true, если количество здоровья врага больше 0.
 */

public interface Mortal {
    public boolean isAlive();
}
