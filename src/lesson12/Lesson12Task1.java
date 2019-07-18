package lesson12;

/*
Объявите переменную со значением null. Вызовите метод у этой переменной. Отловите возникшее исключение.
 */
public class Lesson12Task1 {
    public static void main(String[] args) {
        String s = null;
        try {
            s.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Ошибка: обращение по null-ссылке!");
        }
    }
}
