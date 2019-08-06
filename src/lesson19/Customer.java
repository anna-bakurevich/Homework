package lesson19;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

public class Customer implements Runnable {
    Store store;
    Semaphore semaphore;
    private static ThreadLocal<Map<Good, Integer>> shoppingBasket = new ThreadLocal<Map<Good, Integer>>() {
        @Override
        protected HashMap initialValue() {
            HashMap<Good, Integer> shopping = new HashMap<>();
            return shopping;
        }
    };

    public Customer(Store store, Semaphore semaphore) {
        this.store = store;
        this.semaphore = semaphore;
    }

    public static ThreadLocal<Map<Good, Integer>> getShoppingBasket() {
        return shoppingBasket;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " зашел в магазин.");
        //если количество выбранных товаров не 0, покупатель набирает товары в корзину и обслуживается в кассе
        if (store.get()) {
            //пытается получить разрешение на обслуживание в свободной кассе
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " получено разрешение на обслуживание в свободной кассе.");
                int tillNumber = -1;
                //ищем свободную кассу
                for (int i = 0; i < Lesson19Task2.n; i++) {
                    if (Lesson19Task2.tills[i].available) {
                        //покупатель занимает кассу № i
                        Lesson19Task2.tills[i].available = false;
                        tillNumber = i;
                        System.out.println(Thread.currentThread().getName() + " занял кассу номер "
                                + Lesson19Task2.tills[i].number);
                        break;
                    }
                }
                //обслуживание в кассе
                Lesson19Task2.tills[tillNumber].payment(shoppingBasket.get(), Lesson19Task2.tills[tillNumber]);
                System.out.println(Thread.currentThread().getName() + " освобождает кассу номер "
                        + Lesson19Task2.tills[tillNumber].number);
                //покупатель освобождает кассу
                Lesson19Task2.tills[tillNumber].available = true;
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " выходит из магазина.");
    }
}


