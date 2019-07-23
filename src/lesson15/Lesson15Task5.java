package lesson15;
/*
Записать в двоичный файл 20 случайных чисел типа int со значением больше 255.
Прочитать записанный файл, распечатать числа и их среднее арифметическое.
 */

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson15Task5 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("D:" + File.separator + "Inversion.txt");
             FileInputStream fis = new FileInputStream("D:" + File.separator + "Inversion.txt")) {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            for (int i = 0; i < 20; i++) {//генерируем 20 случайных целых чисел в промежутке [256;1000] и записываем их в файл
                int n = random.nextInt(256, 1000);
                fos.write((n >>> 24) & 0xFF);
                fos.write((n >>> 16) & 0xFF);
                fos.write((n >>> 8) & 0xFF);
                fos.write((n >>> 0) & 0xFF);
            }
            int sum = 0;
            int n;
            for (int i = 0; i < 20; i++) {//считываем 20 целых чисел из файла, выводим в консоль, накапливаем сумму
                int ch1 = fis.read();
                int ch2 = fis.read();
                int ch3 = fis.read();
                int ch4 = fis.read();
                if ((ch1 | ch2 | ch3 | ch4) < 0)
                    throw new EOFException();
                n = (ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0);
                System.out.print(n + " ");
                sum += n;
            }
            System.out.println();
            System.out.println("Среднее арифметическое равно " + sum / 20);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
