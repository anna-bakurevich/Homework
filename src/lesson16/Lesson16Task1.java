package lesson16;

import java.io.*;

/*
Сравнить скорость чтения и записи 5 МБ символов при использовании классов буфиризированого и не буфиризированого
символьного ввода вывода
 */
public class Lesson16Task1 {
    public static void main(String[] args) {
        File file = new File("G:" + File.separator + "FiveMB.txt");
        try (FileWriter writer = new FileWriter(file);
             BufferedWriter writerBuf = new BufferedWriter(new FileWriter("G:" + File.separator + "F.txt"));
             FileReader reader = new FileReader(file);
             BufferedReader readerBuf = new BufferedReader(new FileReader(file));
             BufferedReader readerBuf1 = new BufferedReader(new FileReader(file))) {

            charWrite(writer);
            bufferedWrite(readerBuf, writerBuf);
            charRead(reader);
            bufferedRead(readerBuf1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void charWrite(FileWriter writer) throws IOException {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            writer.write(i + "");
        }
        long finishTime = System.nanoTime();
        System.out.println("Посимвольная запись заняла " + (finishTime - startTime) + " наносекунд");
    }

    public static void bufferedWrite(BufferedReader reader, BufferedWriter writer) throws IOException {
        long startTime = System.nanoTime();
        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line);
        }
        long finishTime = System.nanoTime();
        System.out.println("Буферизированная запись заняла " + (finishTime - startTime) + " наносекунд");
    }

    public static void charRead(FileReader reader) throws IOException {
        long startTime = System.nanoTime();
        while (reader.ready()) {
            reader.read();
        }
        long finishTime = System.nanoTime();
        System.out.println("Посимвольное чтение заняло " + (finishTime - startTime) + " наносекунд");
    }

    public static void bufferedRead(BufferedReader reader) throws IOException {
        long startTime = System.nanoTime();
        String line;
        while (reader.ready()) {
            reader.read();
        }
        long finishTime = System.nanoTime();
        System.out.println("Буферизированное чтение заняло " + (finishTime - startTime) + " наносекунд");
    }

}
