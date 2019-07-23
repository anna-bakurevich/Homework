package lesson15;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
 */
public class Lesson15Task2 {
    public static void main(String[] args) {
        File file = new File("G:" + File.separator + "Inversion.txt");
        //регулярное выражение для определения группы символов = начало слова с гласной буквы в обоих регистрах
        Pattern pattern = Pattern.compile("\\b([аеёиоуыэюяАЕЁИОУЫЭЯaeiouAEIOU])\\w*");
        findInFile(file, pattern);

    }

    public static void findInFile(File file, Pattern pattern) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                //ищем в считанной из файла строке совпадение с шаблоном
                while (matcher.find()) {
                    System.out.println(matcher.group()); //выводим в консоль найденную группу символов
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
