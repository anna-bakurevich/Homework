package lesson3;

/**
 * Написать программу, удаляющую все повторяющиеся целые числа из массива и печатающую результат.
 */
public class Lesson3DZTask2 {
    public static void main(String[] args) {

        int[] array = {1, 5, 1, 8, 10, 10, 5, 9};
        System.out.print("Исходный массив: ");
        printArray(array);

        //массив для хранения информации о наличии/осутствии дубликатов по индексу из array
        boolean[] index = new boolean[array.length];
        //сравниваем каждый элемент массива со всеми остальными
        // и заполняем массив index логическим значением по соответствующему индексу
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    index[i] = true;
                    index[j] = true;
                }
            }
        }

        //счетчик повторяющихся значений
        int countDuplicate = 0;
        for (boolean b : index) {
            if (b) {
                countDuplicate++;
            }
        }

        //массив без повторяющихся значений, состоящий только из элементов с индексами со значением true массива index
        int[] arrayNoDuplicate = new int[array.length - countDuplicate];

        int j = 0;
        for (int i = 0; i < index.length; i++) {
            if (index[i] != true) {
                arrayNoDuplicate[j] = array[i];
                j++;
            }
        }

        //вывод итога в консоль
        System.out.print("Преобразованный массив без дубликатов: ");
        printArray(arrayNoDuplicate);
    }

    public static void printArray (int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}