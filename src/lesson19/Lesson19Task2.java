package lesson19;
/*
Магазин имеет перечень товаров (класс Good со свойствами: id, name, price, discount (0-0.89))
{Пиво, Водка, чипсы, хлеб, молоко, селедка, кефир, батон, гречка, колбаски, йогурт и булочка из печки}.
Поток "Покупатель" логирует свои действия в магазине (Например: Покупатель n зашел в магазин. Покупатель n выбрал
товар M в количестве 2 и т.д.). Покупатель может положить в корзину от 0 до K товаров разным количеством (для каждого
потока покупателя определяется случайным образом). Если покупатель ничего не выбрал, то он логирует это и покидает
магазин. Если корзина (ShoppingBasket) не пуста, то покупатель становится в единую очередь, которую обслуживают несколько
касс от 1-3. Первая, освободившаяся касса, обслуживает первого из очереди покупателя. Время обслуживания пропорционально
равно количеству покупок в корзине покупателя. Касса логирует все действия с товарами покупателя и формирует сумму покупки.
Поток покупатель выдает случайным образом сумму больше или равную запрашиваемой. После этого Касса выдает чек, формирует
объект Receipt (id, date, caseNo, List<Item>, totalSum, change). Где Item, класс, идентифицирующий товарную позицию в чеке
(Item: No -порядковый номер позиции, Good, quantity, cost, discount, discountAmount). Печатается текст чека. Покупатель
выходит из магазина и сообщает об этом.
 */

import java.util.concurrent.Semaphore;

public class Lesson19Task2 {
    public static int n = 2; //устанавливаем кол-во работающих касс
    public static Till[] tills = new Till[n];

    public static void main(String[] args) {
        Store store = new Store();
        Semaphore semaphore = new Semaphore(n, true);//countTill касс обслуживают в порядке очереди
        //создаем n свободных (true) касс
        for (int i = 0; i < n; i++) {
            tills[i] = new Till(i + 1, true);
        }
        Thread customer1 = new Thread(new Customer(store, semaphore), "Покупатель 1");
        Thread customer2 = new Thread(new Customer(store, semaphore), "Покупатель 2");
        Thread customer3 = new Thread(new Customer(store, semaphore), "Покупатель 3");
        Thread customer4 = new Thread(new Customer(store, semaphore), "Покупатель 4");
        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
    }
}
