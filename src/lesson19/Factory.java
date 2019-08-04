package lesson19;

/*
В первую ночь на свалке находится 20 случайных деталей. Каждую последующую ночь фабрика выбрасывает на свалку от 1 до 4
случайных деталей. Для симуляции принять, что каждая ночь наступает через 100мс.
 */
public class Factory implements Runnable {
    Dump dump;

    public Factory(Dump dump) {
        this.dump = dump;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i == 1) {
                dump.put(20);
                System.out.println("Фабрика: ночь " + i + " " + dump.getDetailsDump());
            } else {
                dump.put(dump.randomCountDetails());
                System.out.println("Фабрика: ночь " + i + " " + dump.getDetailsDump());
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
