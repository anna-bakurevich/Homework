package lesson10;

import java.util.ArrayList;
import java.util.List;

/*
Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
•	Задать размер стека.
•	Внести цифру в стек.
•	Извлечь цифру из стека.
 */
public class Stack {
    private int size;
    private List<Integer> stack = new ArrayList<>();
    private int tos;

    //задать размер и инициализировать вершину стека
    public Stack(int size) {
        this.size = size;
        tos = -1;
    }

    //разместить элемент в стеке
    public void push(int item) {
        if (tos == size - 1) {
            System.out.println("Стек заполнен.");
        } else {
            stack.add(++tos, item);
        }

    }

    //извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stack.get(tos--);
        }
    }
}

