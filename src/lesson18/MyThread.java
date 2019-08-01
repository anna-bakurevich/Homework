package lesson18;

/*
Создать поток который будет в цикле итерироваться от 1 до 10 000 000 и суммировать каждый четный элемент кратный 3.
На каждой итерации, кратной 1 000 000, поток должен заснуть на 10 мс
 */
public class MyThread extends Thread {
    public static long sum = 0;

    public MyThread() {
        super("MyThread");
    }

    @Override
    public void run() {
        System.out.println("Запущен поток " + getName());
        for (int i = 0; i < 10_000_000; i++) {
            if (i % 1_000_000 == 0) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Поток " + getName() + "прерван.");
                }
            }
            if (i % 2 == 0 && i % 3 == 0) {
                sum += i;
            }
        }
        System.out.printf(getName() + ": cумма четных элементов, кратных 3, равна %,25d\n", sum);
    }
}
