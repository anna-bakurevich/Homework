package lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Реализовать структуру «Черный ящик» хранящую целые числа. Структура должна поддерживать операции добавления числа
и возвращение К-го по минимальности числа и N-ного по максимальности элемента из ящика.
 */
public class BlackBox {
    private List<Integer> blackBox = new ArrayList<>();

    public List<Integer> getBlackBox() {
        return blackBox;
    }

    public void addElement(Integer e) {
        blackBox.add(e);
    }

    public int minK(int k) {
        if (k <= blackBox.size()) {
            //сортируем в порядке возрастания
            Collections.sort(blackBox);
            System.out.println("Минимальный элемент под номером " + k + " [" + blackBox.get(k - 1) + "]");
            return blackBox.get(k - 1);
        } else {
            System.out.println("B BlackBox находится " + blackBox.size() + " элементов. Измените номер.");
            return 0;
        }
    }

    public int maxN(int n) {
        if (n <= blackBox.size()) {
            Collections.sort(blackBox);
            //сортируем в обратном порядке (убывания)
            Collections.reverse(blackBox);
            System.out.println("Максимальный элемент под номером " + n + " [" + blackBox.get(n - 1) + "]");
            return blackBox.get(n - 1);
        } else {
            System.out.println("B BlackBox находится " + blackBox.size() + " элементов. Измените номер.");
            return 0;
        }
    }
}
