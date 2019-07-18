package lesson12;
/*
Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное,
указав в качестве причины отловленное.
*/

public class Lesson12Task5 {
    public static void main(String[] args) {
        try {
            methodExceptions();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);
            System.out.println("Первопричина: " + e.getCause());
        }
    }

    public static void methodExceptions() {
        //создаем исключение
        NullPointerException e = new NullPointerException("верхний уровень");

        //добавляем причину исключения
        e.initCause(new EmptyArrayElementException());
        throw e;
    }

}
