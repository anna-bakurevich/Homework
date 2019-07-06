package lesson3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Написать функцию linearize, которая принимает в качестве параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами двумерного.
 */
public class Lesson3DZTask4 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8, 9, 10}, {11,12}, {13}};

        linearize(array);

    }

    public static Object linearize(int[][] array) {
        //высчитываем
        int lengthArrayResult = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                lengthArrayResult++;
            }
        }

        int[] arrayResult = new int[lengthArrayResult];
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayResult[j+n] = array[i][j];
            }
            n += array[i].length;
        }

        for (int i:arrayResult) {
            System.out.print(i + " ");
        }

        return arrayResult;
    }
}
