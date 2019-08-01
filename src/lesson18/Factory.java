package lesson18;

import java.util.*;

/*
В первую ночь на свалке фабрики находится 20 случайных деталей.
Каждую последующую ночь фабрика выбрасывает на свалку от 1 до 4 случайных деталей.
 */
public class Factory extends Thread {

    private static Map<Enum, Integer> detailsDump = new HashMap<>();//детали на свалке

    public Factory() {
        super("Фабрика");
    }

    public static Map<Enum, Integer> getDetailsDump() {
        return detailsDump;
    }

    @Override
    public void run() {
        Random count = new Random();//количество выброшенных деталей
        for (int i = 1; i <= 50; i++) {
            //в первую ночь фабрика выбрасывает 20 случайных деталей
            if (i == 1) {
                for (int j = 0; j < 20; j++) {
                    MethodsMap.putDetail(detailsDump, MethodsMap.getRandomDetail());
                }
                System.out.println(getName() + ": ночь " + i + " " + detailsDump);
                //в последующие - от 1 до 4
            } else {
                for (int k = 1; k <= count.nextInt(4) + 1; k++) {
                    MethodsMap.putDetail(detailsDump, MethodsMap.getRandomDetail());
                }
                System.out.println(getName() + ": ночь " + i + " " + detailsDump);
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
