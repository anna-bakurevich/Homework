package lesson3;

/**
 * Написать алгоритм расчета факториала, используя циклы (for и while).
 */
public class Lesson3Task10 {
    public static void main(String[] args) {

        int n = 25;
        System.out.println("Факториал числа " + n + " равен " + factorialFor(n));
        System.out.println("Факториал числа " + n + " равен " + factorialWhile(n));
    }

    public static long factorialFor(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long factorialWhile(int n) {
        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        return factorial;
    }
}
