package lesson3;

/**
 * Написать метод equals, который определяет, равны ли между собой соответствующие элементы
 * 2-х двумерных массивов
 */
public class Lesson3Task6 {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3, 4, 5, 6}, {6, 5, 4, 3, 2, 1}};
        int[][] array2 = {{1, 2, 3, 4, 5, 6}, {6, 5, 4, 3, 2, 1}};

        System.out.println(equals(array1, array2));

    }

    public static boolean equals(int[][] array1, int[][] array2) {
        boolean result = false;
        boolean b = false;
        if (!isArraysLength(array1, array2)) {
            System.out.println("Массивы отличаются размерностью");
        } else {
            int i = 0;
            int j = 0;
            for (i = 0; i < array1.length; i++) {
                for (j = 0; j < array1[i].length; j++) {
                    if (array1[i][j] != array2[i][j]) {
                        System.out.println("Элемент array1[" + i + "][" + j + "]"
                                + " не равен элементу array1[" + i + "][" + j + "]");
                        b = true;
                        break;
                    }
                }
                //если найдена хотя бы одна пара не равных соотвествующих элементов, выходим из циклов
                if (b == true) {
                    break;
                }
            }
            //если цикл отработал до конца (т.е. не нашлось отличий)
            if (i == array1.length && j == array1[0].length) {
                System.out.println("Все соответствующие элементы массивов равны между собой");
                result = true;
            }
        }
        return result;
    }

    //метод проверяющий эквивалентность размерности двух двумерных целочисленных массивов
    public static boolean isArraysLength(int[][] array1, int[][] array2) {
        boolean result = true;
        boolean lines = true;
        //если не равно количество строк
        if (array1.length != array2.length) {
            result = false;
        }
        //если не равны длины соответствующих строк
        else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i].length != array2[i].length) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

}
