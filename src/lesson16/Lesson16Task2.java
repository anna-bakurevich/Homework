package lesson16;

import java.io.*;

/*
Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
Десериализовать объект из того же файла, вывести значения полей в консоль.
 */
public class Lesson16Task2 {
    public static void main(String[] args) {
        Computer myComputer = new Computer("Lenovo", "Intel Celeron", "SSD");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:" + File.separator + "Serialize.tmp"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:" + File.separator + "Serialize.tmp"))) {
            oos.writeObject(myComputer);
            Computer c = (Computer) ois.readObject();
            System.out.println(c.getName() + ", " + c.getProcessor() + ", " + c.getHardDisk());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
