package lesson19;
/*
Товарная позиция. Класс Good со свойствами: id, name, price, discount (0-0.89)
 */

public class Good {
    private int id;
    private String name;
    private double price;
    private double discount;

    public Good(int id, String name, double price, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public String getName() {
        return name;
    }
}
