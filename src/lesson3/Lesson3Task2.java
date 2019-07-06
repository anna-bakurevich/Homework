package lesson3;

/**
 * Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую ее
 */
public class Lesson3Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        //счетчик чисел, подходящих по условию
        int count = 0;

        //первое натуральное число, которое делится на 13 или 17
        int number = 13;

        while (count < 100) {

            //если необходимое число найдено, записываем его в массив под номером count и увеличиваем счетчик на 1
            if (number % 13 == 0 || number % 17 == 0) {
                numbers[count] = number;
                count++;
            }
            //увеличиваем натуральное число на 1
            number++;
        }

        //вывод результата в консоль
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}

