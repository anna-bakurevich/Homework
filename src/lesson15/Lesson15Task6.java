package lesson15;
/*
Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директорий при помощи рекурсии.
 */

import java.io.File;

public class Lesson15Task6 {
    public static void main(String[] args) {
        File dir = new File("G:" + File.separator + "Homework");
        listOfFiles(dir);
    }

    public static void listOfFiles(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File f : files) {
                System.out.println(f);
                listOfFiles(f);
            }
        }
    }
}
