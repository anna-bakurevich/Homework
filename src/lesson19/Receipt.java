package lesson19;

import java.time.LocalDate;
import java.util.List;

/*
Касса выдает чек, формирует объект Receipt (id, date, casseNo, List<Item>, totalSum, change).
Где Item, класс идентифицирующий товарную позицию в чеке (Item: No -порядковый номер позиции, Good, quantity,
cost, discount, discountAmount).
 */
public class Receipt {
    private static int id = 0;
    private LocalDate date;
    private int tillNumber;
    private List<Item> listItem;
    private double totalSum;
    private double change;

    public Receipt(int tillNumber, List<Item> listItem, double totalSum, double change) {
        ++id;
        date = LocalDate.now();
        this.tillNumber = tillNumber;
        this.listItem = listItem;
        this.totalSum = totalSum;
        this.change = change;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getTillNumber() {
        return tillNumber;
    }

    public List<Item> getListItem() {
        return listItem;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public double getChange() {
        return change;
    }
}
