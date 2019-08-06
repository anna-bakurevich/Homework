package lesson19;

/*
Item, класс идентифицирующий товарную позицию в чеке (Item: No -порядковый номер позиции, Good, quantity,
cost, discount, discountAmount).
 */
public class Item {
    private int n;
    private Good good;
    private int quantity;
    private double cost;
    private double discount;
    private double discountAmount;

    public Item(int n, Good good, int quantity, double cost, double discount, double discountAmount) {
        this.n = n;
        this.good = good;
        this.quantity = quantity;
        this.cost = cost;
        this.discount = discount;
        this.discountAmount = discountAmount;
    }

    public int getN() {
        return n;
    }

    public Good getGood() {
        return good;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public double getDiscount() {
        return discount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }
}
