package lesson2;

import java.util.Scanner;

/**
 * Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля").
 * b. Использовать switch
 */

public class Lesson2Task2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int preLastDigital = number % 100 / 10;
        int lastDigital = number % 10;

        if (preLastDigital != 1) {
            switch (lastDigital) {
                case 1:
                    System.out.println(number + " рубль");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(number + " рубля");
                    break;
                default:
                    System.out.println(number + " рублей");
            }
        } else System.out.println(number + " рублей");

    }
}
