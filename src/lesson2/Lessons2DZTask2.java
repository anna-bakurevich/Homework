package lesson2;

import java.util.Scanner;


/**
 * Имеются два дома размерами a на b и c на d. Размеры вводятся пользователем с консоли.
 * Проверить, помещаются ли эти дома на участке размерами e на f.
 * Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.
 */
public class Lessons2DZTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = 10;
        int f = 11;

        int maxSideHouse1 = Math.max(a, b);
        int maxSideHouse2 = Math.max(c, d);
        int minSideHouse1 = Math.min(a, b);
        int minSideHouse2 = Math.min(c, d);
        int sumMinSides = minSideHouse1 + minSideHouse2;

        //если сумма коротких сторон домов меньше либо равна максимальной из длинных сторонов домов
        if (sumMinSides <= Math.max(maxSideHouse1, maxSideHouse2)) {

            //проверяем, чтобы сумма коротких сторон домов не превышала короткую сторону участка и
            //максимальная из длинных сторон домов не превышала длинную сторону участка
            if ((sumMinSides <= Math.min(e, f)) && Math.max(maxSideHouse1, maxSideHouse2) <= Math.max(e, f)) {
                printPositiveResult(a, b, c, d, e, f);
            } else printNegativeResult(a, b, c, d, e, f);

            //иначе, пытаемся расположить сумму минимальных сторон по длинной стороне участка,
            //а максимальную из длинных сторон домов по короткой стороне участка
        } else if ((sumMinSides <= Math.max(e, f)) && Math.max(maxSideHouse1, maxSideHouse2) <= Math.min(e, f)) {
            printPositiveResult(a, b, c, d, e, f);
        } else printNegativeResult(a, b, c, d, e, f);
    }

    public static void printPositiveResult(int a, int b, int c, int d, int e, int f) {
        System.out.println("Дома с размерами " + a + "х" + b + " и " + c + "х" + d +
                " помещаются на участке размером " + e + "x" + f);
    }

    public static void printNegativeResult(int a, int b, int c, int d, int e, int f) {
        System.out.println("Дома с размерами " + a + "х" + b + " и " + c + "х" + d +
                " не помещаются на участке размером " + e + "x" + f);
    }
}
