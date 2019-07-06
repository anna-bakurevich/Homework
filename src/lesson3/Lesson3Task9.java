package lesson3;

/**
 * Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
public class Lesson3Task9 {
    public static void main(String[] args) {

        int n = 25;
        System.out.println(Math.sqrt(n));
        int i;
        boolean b = true;
        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                System.out.println("Число " + n + " не является простым");
                b = false;
                break;
            }
        }
        if (b) {
            System.out.println("Число " + n + " является простым");
        }
    }
}
