package lesson15;

/*
Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл в обратном порядке
символы каждой строки.
 */

import java.io.*;

public class Lesson15Task7 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("G:" + File.separator
                + File.separator + "Homework" + File.separator + "src" + File.separator + "lesson15"
                + File.separator + "Lesson15Task1.java"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("G:" + File.separator + "Inversion.txt"))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                StringBuilder builder = new StringBuilder(line);
                writer.write(String.valueOf(builder.reverse()) + "\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
