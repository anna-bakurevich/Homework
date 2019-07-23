package lesson15;

import java.io.*;

/*
Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
 */
public class Lesson15Task1 {
    public static void main(String[] args) {
        File file = new File("G:" + File.separator + "Inversion.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file));) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


