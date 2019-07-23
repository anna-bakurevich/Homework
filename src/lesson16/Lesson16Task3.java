package lesson16;

import java.io.*;

/*
Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad - также созданного класса
со своими полями.
Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.

 */
public class Lesson16Task3 {
    public static void main(String[] args) {
        Notebook myNotebook = new Notebook("Lenovo", " Intel Core i7", "SSD",
                new Touchpad("Synaptics", 40), 1700);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:" + File.separator + "Serialize.tmp"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:" + File.separator + "Serialize.tmp"))) {
            oos.writeObject(myNotebook);
            Notebook n = (Notebook) ois.readObject();
            System.out.println(n.getName() + ", " + n.getProcessor() + ", " + n.getHardDisk() + ", " + n.getTouchpad()
                    + ", " + n.getPrice());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
