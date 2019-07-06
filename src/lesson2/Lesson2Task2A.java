package lesson2;

import java.util.Scanner;

/**
 * Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля").
 * Использовать конструкцию if-else.
 */

public class Lesson2Task2A {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int number = scaner.nextInt();

        //предпоследняя цифра числа
        int preLastDigit = number % 100 / 10; //после деления на 10 остается только целая часть числа, т.к. тип int
        //последняя цифра числа
        int lastDigit = number % 10;

        if (lastDigit == 1 && preLastDigit !=1) {
            System.out.println(number + " рубль");
        } else if (lastDigit >= 2 && lastDigit <= 4 && preLastDigit !=1) {
            System.out.println(number + " рубля");
        } else {
            System.out.println(number + " рублей");
        }
    }
}
