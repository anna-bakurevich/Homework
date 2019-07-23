package lesson16;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Touchpad implements Serializable {
    String name;
    int price;

    public Touchpad(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Touchpad{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
