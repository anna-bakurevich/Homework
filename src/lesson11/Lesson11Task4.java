package lesson11;

/*
Реализовать структуру «Черный ящик» хранящую целые числа. Структура должна поддерживать операции добавления числа
и возвращение К-го по минимальности числа и N-ного по максимальности элемента из ящика.
 */
public class Lesson11Task4 {
    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox();
        blackBox.addElement(-5);
        blackBox.addElement(-10);
        blackBox.addElement(4);
        blackBox.addElement(105);
        blackBox.addElement(-20);

        System.out.println(blackBox.getBlackBox());
        blackBox.minK(1);
        blackBox.maxN(1);


    }
}
