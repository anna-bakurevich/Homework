package lesson12;

/*
Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
*/

import java.util.Random;

public class Lesson12Task6 {
    public static void main(String[] args) {
        try {
            randomException();
        } catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void randomException() throws Exception {
        //создаем массив трех видов исключений
        Exception[] exceptions = {new NullPointerException(), new ArithmeticException(), new ArrayIndexOutOfBoundsException()};
        Random random = new Random();
        //генерируем случайно выбранное исключение
        throw exceptions[random.nextInt(3)];
    }
}
