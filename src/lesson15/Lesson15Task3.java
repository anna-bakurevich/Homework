package lesson15;

/*
Задан файл с текстом, найти и вывести в консоль все слова,  для которых последняя буква одного слова совпадает
с первой буквой следующего слова
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lesson15Task3 {
    public static void main(String[] args) {
        try {
            //считываем содержимое текстового файла в строку
            String content = new String(Files.readAllBytes(Paths.get("G:" + File.separator + "Inversion.txt")));

            //делим строку на слова (разделители - знаки пунктуации и пробельные символы)
            String[] words = content.split("[\\s.,:;!?]+");

            //сравниваем последнюю букву текущего слова и первую следующего
            for (int i = 0; i < words.length - 1; i++) {
                if (!words[i].isEmpty() && !words[i + 1].isEmpty()) {
                    if (words[i].charAt(words[i].length() - 1) == words[i + 1].charAt(0)) {
                        System.out.println(words[i] + " " + words[i + 1]);
                    }
                } else {
                    continue;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
