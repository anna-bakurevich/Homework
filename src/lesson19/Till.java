package lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
Покупатель становится в единую очередь, которую обслуживают несколько
касс от 1-3. Первая, освободившаяся касса, обслуживает первого из очереди покупателя. Время обслуживания пропорционально
равно количеству покупок в корзине покупателя. Касса логирует все действия с товарами покупателя и формирует сумму покупки.
Поток покупатель выдает случайным образом сумму больше или равную запрашиваемой. После этого Касса выдает чек, формирует
объект Receipt (id, date, caseNo, List<Item>, totalSum, change). Где Item, класс, идентифицирующий товарную позицию в чеке
(Item: No -порядковый номер позиции, Good, quantity, cost, discount, discountAmount). Печатается текст чека. Покупатель
выходит из магазина и сообщает об этом.
 */
public class Till {
    int number;
    boolean available;

    public Till(int number, boolean available) {
        this.number = number;
        this.available = available;
    }

    //метод обслуживания в кассе
    public synchronized void payment(Map<Good, Integer> shoppingBasket, Till till) {
        //время обслуживания (в мс)
        System.out.println("В кассе номер " + till.number + " обслуживается " + Thread.currentThread().getName());
        int timeService = sumGoods(shoppingBasket) * 10;
        try {
            Thread.sleep(timeService);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //сумма, которую покупатель выдает кассиру
        double randomSumCustomer = randomSumCustomer(totalSum(shoppingBasket));
        printReceipt(makeReceipt(shoppingBasket, till.number, randomSumCustomer), randomSumCustomer);
    }

    //сумма значений Map (кол-во покупок)
    public synchronized int sumGoods(Map<Good, Integer> map) {
        int count = 0;
        for (int i : map.values()) {
            count += i;
        }
        return count;
    }

    //расчет "Итого" по чеку
    public synchronized double totalSum(Map<Good, Integer> map) {
        double sum = 0.00;
        for (Map.Entry<Good, Integer> entry : map.entrySet()) {
            Good good = entry.getKey();
            sum += good.getPrice() * entry.getValue() * (1 - good.getDiscount());
        }
        return sum;
    }

    //создание чека
    public synchronized Receipt makeReceipt(Map<Good, Integer> map, int tillNumber, double sumCustomer) {
        double totalSum = totalSum(map);
        Receipt receipt = new Receipt(tillNumber, listItem(map), totalSum,
                sumCustomer - totalSum);
        return receipt;
    }

    //создание списка товаров
    public synchronized List<Item> listItem(Map<Good, Integer> map) {
        List<Item> listItem = new ArrayList<>();
        int no = 1;
        for (Map.Entry<Good, Integer> entry : map.entrySet()) {
            Good good = entry.getKey();
            int quantity = entry.getValue();
            listItem.add(new Item(no, good, quantity, good.getPrice() * quantity, good.getDiscount(),
                    good.getPrice() * quantity * good.getDiscount()));
            no++;
        }
        return listItem;
    }

    //печать чека
    public synchronized void printReceipt(Receipt receipt, double randomSumCustomer) {
        System.out.println("====================================================");
        System.out.println("ID: " + receipt.getId() + " Дата: " + receipt.getDate() + " Касса №: " + receipt.getTillNumber());
        System.out.println("\033[0;1m" + "№  Товар       Кол-во Стоимость Скидка Сумма скидки" + "\033[0;0m");
        for (Item item : receipt.getListItem()) {
            System.out.printf("%-3d%-7s%9d%12.2f%7.2f%13.2f\n", item.getN(), item.getGood().getName(), item.getQuantity(),
                    item.getCost(), item.getDiscount(), item.getDiscountAmount());
        }
        System.out.printf("Итого с учетом скидки: %.2f\n", receipt.getTotalSum());
        System.out.printf("Оплачено: %.2f\n", randomSumCustomer);
        System.out.printf("Сдача: %.2f\n", receipt.getChange());
    }

    //генерация случайного вещественного числа в диапазоне [totalSum; totalSum*1.2]
    public synchronized double randomSumCustomer(double totalSum) {
        Random random = new Random();
        return totalSum + random.nextDouble() + totalSum * 0.2;
    }
}
