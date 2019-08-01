package lesson18;

import java.util.*;

/*Прислужник отправляется на свалку и собирает от 1 до 4 случайных деталей.
Если на свалке деталей нет – прислужник уходит ни с чем
 */
public class Servant extends Thread {
    Scientist scientist = new Scientist();
    int countRobots = 0;

    public Servant() {
        super("Слуга");
    }

    @Override
    public void run() {
        Map<Enum, Integer> detailsServant = new HashMap<>(); //собранные слугой детали <Наименование, количество>
        int countDetailsDump = MethodsMap.countDetails(Factory.getDetailsDump());//количество деталей на свалке
        int count;//количество взятых слугой деталей со свалки
        Random random = new Random();
        for (int i = 1; i <= 50; i++) {
            //если на свалке есть детали
            if (countDetailsDump != 0) {
                //если на свалке деталей меньше 4, то это и есть макс. кол-во деталей для сбора, иначе - случайное число от 1 до 4
                count = countDetailsDump < 4 ? countDetailsDump : random.nextInt(4) + 1;
                //слуга забирает со свалки count деталей (из Map detailsDump в Map detailsServant)
                MethodsMap.takeAwayDetails(Factory.getDetailsDump(), detailsServant, count);
                System.out.println(getName() + ": ночь " + i + " " + detailsServant);
                System.out.println("Остаток на свалке " + Factory.getDetailsDump());
                //слуга отдает собранные детали ученому (объединение map слуги и map ученого)
                detailsServant.forEach((k, v) -> scientist.getDetailsAvailable().merge(k, v, (v1, v2) -> v1 + v2));
                System.out.println("Ученый: " + scientist.getDetailsAvailable());
                //очищаем map слуги
                detailsServant.clear();
                //ученый пытается собирать роботов, пока достаточно деталей
                while (scientist.assemblingRobot()) {
                    countRobots++;
                    System.out.println("------------------------------------");
                    System.out.println("Робот номер " + countRobots + " собран.");
                    System.out.println("------------------------------------");
                    System.out.println("Ученый: " + scientist.getDetailsAvailable());
                }
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("------------------------------------");
        System.out.println("Количество изготовленных роботов: " + countRobots);
    }
}
