package lesson3;

/**
 * Определить сумму элементов целочисленного массива, расположенных между ближайшими минимальным и максимальным
 * значениями, не включая минимальное и максимальное значение.
 * 0239 -> 2+3=5
 * 02391110129-> 2+3+1+2=8
 * 0298049-> 2+4=6
 */
public class Lesson3Task3 {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 3, 9, 1, 1, 1, 0, 1, 2, 9};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Минимум: " + min + ", максимум: " + max);

        int sum = 0;

        //перебираем все элементы массива начиная с первого
        for (int i = 0; i < numbers.length; i++) {
            //если найден минимальный, сммируем элементы, начиная со следующего за минимальным до нахождения максимального
            if (numbers[i] == min) {
                i++;
                while (numbers[i] != max) {
                    sum += numbers[i];
                    i++;
                }
            }
        }
        System.out.println("Сумма элементов между ближайшими минимальным и максимальным значениями равна " + sum);
    }
}
