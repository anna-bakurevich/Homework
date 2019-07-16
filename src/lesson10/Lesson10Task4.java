package lesson10;

/*
Ввести с консоли число, занести его цифры в стек.
Вывести число, у которого цифры идут в обратном порядке.
 */

import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Lesson10Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();


        Stack stack = new Stack(10);
        for (int i = 1; i <= number.length(); i++) {
            int n;
            n = valueOf(number.substring(i - 1, i));
            stack.push(n);
        }

        for (int i = 0; i < number.length(); i++) {
            System.out.print(stack.pop());
        }
    }
}
