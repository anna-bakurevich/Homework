package lesson15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.
 */
public class Lesson15Task4 {
    public static void main(String[] args) {
        File file = new File("G:" + File.separator + "Inversion.txt");
        Pattern pattern = Pattern.compile("\\d+");//шаблон последовательно идущих цифр
        try (BufferedReader reader = new BufferedReader(new FileReader(file));) {
            String line = "";
            int numberLine = 0;//номер текущей строки
            while ((line = reader.readLine()) != null) {
                numberLine++;
                Matcher matcher = pattern.matcher(line);
                int max = 0;//максимальное количество цифр подряд;
                String maxSequenceOfNumbers = "";//последовательность символов с максимальным кол-вом цифр подряд
                //ищем в считанной из файла строке совпадение с шаблоном и сравниваем длину набора цифр с max
                while (matcher.find()) {
                    String current = matcher.group();
                    if (current.length() > max) {
                        max = current.length();
                        maxSequenceOfNumbers = current;
                    }
                }
                printMaxSequenceOfNumbers(numberLine, max, maxSequenceOfNumbers);
                max = 0;
                maxSequenceOfNumbers = "";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printMaxSequenceOfNumbers(int numberLine, int max, String maxSequenceOfNumbers) {
        if (max != 0) {
            System.out.println("В строке номер " + numberLine + " максимальная последовательность цифр: " + maxSequenceOfNumbers);
        } else {
            System.out.println("В строке номер " + numberLine + " нет цифр.");
        }
    }
}
