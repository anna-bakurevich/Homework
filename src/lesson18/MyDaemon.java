package lesson18;

/*
Поток демон каждую пятую миллисекунду выводит в консоль текущее значение просуммированных элементов
 */
public class MyDaemon extends Thread {

    public MyDaemon() {
        super("Daemon");
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        System.out.println("Запущен поток " + getName());
        while (true) {
            try {
                sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf(getName() + ": текущее значение просуммированных элементов равно %,18d\n",MyThread.sum);
        }
    }
}
