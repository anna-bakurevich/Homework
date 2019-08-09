package lesson20;
/*
Задан массив случайных целых чисел (от 1 до 300) случайной длины (1 млн элементов).
Найти максимальный элемент в массиве двумя способами: в одном потоке и используя 10 потоков.
Сравнить затраченное в обоих случаях время.
 */

import java.util.*;
import java.util.concurrent.*;

public class Lesson20Task2 {
    public static int[] array;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //создаем масссив случайных целых чисел (от 1 до 300) случайной длины (1 млн элементов)
        int[] array = new int[randomInteger(1_000_000)];
        System.out.printf("Длина массива: %,d элементов\n", array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = randomInteger(300);
        }
        long startTime = System.nanoTime();
        maxElementOneThread(array);
        long finishTime = System.nanoTime();
        System.out.printf("Способ вычисления в одном потоке занял %,d нс\n", (finishTime - startTime));
        startTime = System.nanoTime();
        maxElementTenThreads(array);
        finishTime = System.nanoTime();
        System.out.printf("Способ вычисления при помощи 10 потоков занял %,d нс\n", (finishTime - startTime));
    }

    public static int maxElementOneThread(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Максимальный элемент массива: " + max);
        return max;
    }

    public static int maxElementTenThreads(int[] array) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future<Integer>> tasks = new ArrayList<>();
        int blockSize = (array.length + 9) / 10;
        for (int i = 0; i < 10; i++) {
            int start = blockSize * i;
            int finish = Math.min(blockSize * (i + 1), array.length);
            tasks.add(service.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int max = array[0];
                    for (int j = start; j < finish; j++) {
                        max = Math.max(max, array[j]);
                    }
                    return max;
                }
            }));
        }

        int max = 0;
        for (Future<Integer> task : tasks) {
            if (max < task.get()) {
                max = task.get();
            }
        }
        service.shutdown();
        System.out.println("Максимальный элемент массива: " + max);
        return max;
    }


    public static int randomInteger(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;
    }
}
