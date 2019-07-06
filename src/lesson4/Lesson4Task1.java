package lesson4;

/**
 * Создать класс, описывающий промежуток времени.
 * Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
 * Создать метод для получения полного количества секунд в объекте
 * Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных.
 * Написать программу для тестирования возможностей класса.
 */
public class Lesson4Task1 {
    public static void main(String[] args) {

        PeriodOfTime periodOfTime1 = new PeriodOfTime(5, 4, 100);
        PeriodOfTime periodOfTime2 = new PeriodOfTime(3660);

        periodOfTime1.printInfo();
        periodOfTime2.printInfo();

        System.out.println("---------------------");
        System.out.println("Full quantity seconds in period of time: " + periodOfTime1.periodOfTimeInSeconds());
        System.out.println("Full quantity seconds in period of time: " + periodOfTime2.periodOfTimeInSeconds());

        //подсчет суммарного времени двух промежутков
        System.out.println("---------------------");
        System.out.printf("Total period of time: %d seconds\n",
                periodOfTime1.periodOfTimeInSeconds() + periodOfTime2.periodOfTimeInSeconds());
    }
}

