package lesson19;

import java.util.*;
/*
Прислужники обоих учёных отправляются на свалку, и каждый собирает от 1 до 4 случайных деталей.
Если на свалке деталей нет – прислужник уходит ни с чем.
 */
public class Servant implements Runnable {
    Dump dump;
    private static ThreadLocal<Map<Enum, Integer>> detailsServant = new ThreadLocal<Map<Enum, Integer>>() {
        @Override
        protected HashMap initialValue() {
            HashMap<Enum, Integer> details = new HashMap<>();
            details.put(Robot.BODY, 0);
            details.put(Robot.CPU, 0);
            details.put(Robot.HDD, 0);
            details.put(Robot.HEAD, 0);
            details.put(Robot.LEFT_HAND, 0);
            details.put(Robot.LEFT_LEG, 0);
            details.put(Robot.RAM, 0);
            details.put(Robot.RIGHT_HAND, 0);
            details.put(Robot.RIGHT_LEG, 0);
            return details;
        }
    };

    public Servant(Dump dump) {
        this.dump = dump;
    }

    public static ThreadLocal<Map<Enum, Integer>> getDetailsServant() {
        return detailsServant;
    }

    @Override
    public void run() {
        int countDetailsDump = sumDetails(dump.getDetailsDump());//количество деталей на свалке
        int countRobots = 0;//кол-во собранных роботов
        for (int i = 1; i <= 100; i++) {
            int count = dump.randomCountDetails();//количество взятых слугой деталей со свалки
            //если на свалке есть детали
            if (countDetailsDump != 0) {
                //если на свалке деталей меньше 4, то это и есть макс. кол-во деталей для сбора
                if (countDetailsDump < 4) {
                    count = countDetailsDump;
                }
                //слуга забирает со свалки count деталей
                dump.get(count);
                System.out.println(Thread.currentThread().getName() + ": ночь " + i + " " + detailsServant.get());
                System.out.println("Остаток на свалке " + dump.getDetailsDump());
                //ученый пытается собирать роботов, пока достаточно деталей
                System.out.println(Thread.currentThread().getName() + ": ученый пытается собрать робота.");
                while (assemblingRobot()) {
                    countRobots++;
                    System.out.println("\u001B[31m" + Thread.currentThread().getName() +
                            ": РОБОТ НОМЕР " + countRobots + " СОБРАН!" + "\u001B[0m");
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "" + ": мой ученый изготовил " + countRobots + " роботов");
    }

    //сумма деталей map
    public int sumDetails(Map<Enum, Integer> map) {
        int count = 0;
        for (int i : map.values()) {
            count += i;
        }
        return count;
    }

    //сборка робота
    public synchronized boolean assemblingRobot() {
        boolean robotComplete = false;
        Robot[] robotAllDetails = Robot.values();
        int i = 0;
        //проверка на достаточность по кол-ву
        if (sumDetails(detailsServant.get()) >= robotAllDetails.length) {
            //проверка на достаточность по виду детали
            for (i = 0; i < robotAllDetails.length; i++) {
                //если находим деталь со значением 0 (нет в наличии), выходим из цикла
                if (detailsServant.get().get(robotAllDetails[i]) == 0) {
                    System.out.println("Не хватает детали " + robotAllDetails[i] + ", дальнейшая сборка не возможна.");
                    break;
                }
            }
            //если нашлись все детали, обновляем карту наличия, уменьшая кол-во каждой детали на 1
            if (i == robotAllDetails.length) {
                robotComplete = true;
                for (int j = 0; j < robotAllDetails.length; j++) {
                    detailsServant.get().put(robotAllDetails[j], detailsServant.get().get(robotAllDetails[j]) - 1);
                }
            }
        } else {
            System.out.println("Недостаточно деталей для сборки робота.");
        }
        return robotComplete;
    }
}

