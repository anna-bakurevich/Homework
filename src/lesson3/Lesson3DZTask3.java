package lesson3;

/**
 * Заданы 2 массива целых чисел произвольной длины.
 * Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных.
 */
public class Lesson3DZTask3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.print("Первый массив: ");
        printArray(array1);

        int[] array2 = {6, 7, 8};
        System.out.print("Второй массив: ");
        printArray(array2);
        int[] array3 = new int[array1.length+array2.length];


        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < array3.length; i++) {
            array3[i] = array2[i - array1.length];
        }
        System.out.print("Третий (объединенный) массив:");
        printArray(array3);

    }
    public static void printArray (int[] array) {
        for (int i:array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
