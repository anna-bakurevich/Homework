package lesson16;

import lombok.Getter;

import java.io.Serializable;

/*
Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad - также созданного класса
со своими полями.
 */
@Getter
public class Notebook extends Computer implements Serializable {
    Touchpad touchpad;
    transient int price;

    public Notebook(String name, String processor, String hardDisk, Touchpad touchpad, int price) {
        super(name, processor, hardDisk);
        this.touchpad = touchpad;
        this.price = price;
    }
}
