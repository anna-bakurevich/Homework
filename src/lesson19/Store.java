package lesson19;

import java.util.*;
import java.util.stream.Collectors;

/*
Магазин имеет перечень товаров (класс Good со свойствами: id, name, price, discount (0-0.89)) {Пиво, Водка, чипсы, хлеб,
молоко, селедка, кефир, батон, гречка, колбаски, йогурт и булочка из печки}
 */
public class Store {
    private Map<Good, Integer> goods = new HashMap<>();

    public Store() {
        goods.put(new Good(1, "Пиво", 2.45, 0), 1200);
        goods.put(new Good(2, "Водка", 13.20, 0), 600);
        goods.put(new Good(3, "Чипсы", 3.10, 0.25), 1000);
        goods.put(new Good(4, "Хлеб", 1.40, 0.1), 2000);
        goods.put(new Good(5, "Молоко", 2.10, 0.15), 3000);
        goods.put(new Good(6, "Сельдь", 3.99, 0), 1500);
        goods.put(new Good(7, "Кефир", 1.10, 0), 1500);
        goods.put(new Good(8, "Батон", 1.45, 0), 2000);
        goods.put(new Good(9, "Гречка", 2, 0.3), 1500);
        goods.put(new Good(10, "Колбаски", 6.15, 0.17), 1000);
        goods.put(new Good(11, "Йогурт", 0.89, 0.1), 4000);
        goods.put(new Good(12, "Булочка", 1.10, 0), 1300);
    }

    //покупка случайного кол-ва случайных товаров в случайном кол-ве каждого наименования
    public boolean get() {
        boolean shopping = false;
        Random random = new Random();
        int countGoods = random.nextInt(goods.size());
        if (countGoods != 0) {
            shopping = true;
            System.out.println(Thread.currentThread().getName() + " будет приобретать " + countGoods +
                    " наименований товаров.");
            for (int i = 1; i <= countGoods; i++) {
                Good randomGood = randomGood();
                int count = randomCount();
                if (randomGood() != null) {
                    goods.put(randomGood, goods.get(randomGood) - count);
                    if (Customer.getShoppingBasket().get().containsKey(randomGood)) {
                        Customer.getShoppingBasket().get().put(randomGood,
                                Customer.getShoppingBasket().get().get(randomGood) + count);
                    } else {
                        Customer.getShoppingBasket().get().put(randomGood, count);
                    }
                    System.out.println(Thread.currentThread().getName() + " выбрал товар " + randomGood.getName() +
                            " в количестве " + count);
                } else {
                    System.out.println(Thread.currentThread().getName() + " выбрал товар " + randomGood.getName() +
                            ", но его нет в наличии.");
                    break;
                }
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " ничего не выбрал.");
        }
        return shopping;
    }

    //генерация случайного товара
    public Good randomGood() {
        Random random = new Random();
        List<Good> good = goods.entrySet().stream()
                .filter(e -> e.getValue() != 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        if (good.size() == 0) {
            return null;
        } else if (good.size() == 1) {
            return good.get(0);
        } else {
            return good.get(random.nextInt(good.size() - 1) + 1);
        }
    }

    //генерация случайного количества
    public int randomCount() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
}
