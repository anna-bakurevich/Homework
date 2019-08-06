package lesson20;
/*
Написать программу, бесконечно считывающую пользовательские числа из консоли.
Эти числа представляют собой количество секунд.
При каждом вводе числа, должна создаваться задача, которая засыпает на введённое число секунд и затем выводит "Я спал N секунд".
Однако нужно сделать так, чтобы все задачи выполнялись в одном и том же потоке в порядке ввода.
Т.е. в программе есть 2 потока: главный и поток для выполнения всех задач по очереди.
При вводе -1 программа должна завершать свою работу.
 */

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lesson20Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeSleep = 0;
        ExecutorService service = Executors.newSingleThreadExecutor();
        while (timeSleep != -1) {
            timeSleep = scanner.nextInt();
            int finalTimeSleep = timeSleep;
            service.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(finalTimeSleep);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Я спал " + finalTimeSleep + " секунд");
                }
            });
        }
        service.shutdown();
    }
}
