package lesson5;

/*
Определить класс, который при инициализации принимает на вход 2 аргумента целого или вещественного типа.
Задать перегруженные методы возвращающие результат арифметических операций над заданными полями
и полями типа BigDecimal.
 */

import java.math.BigDecimal;

public class Lesson5Task3 {
    public static void main(String[] args) {
        IntegerDouble id1 = new IntegerDouble(5, 10);
        IntegerDouble id2 = new IntegerDouble(5.555, 10.333);
        IntegerDouble id3 = new IntegerDouble(new BigDecimal(5.555), new BigDecimal(10.333));
        System.out.println("int");
        System.out.println(id1.getI1() + " + " + id1.getI2() + " = " + id1.sum(id1.getI1(), id2.getI2()));
        System.out.println(id1.getI1() + " * " + id1.getI2() + " = " + id1.multiply(id1.getI1(), id2.getI2()));
        System.out.println("double");
        System.out.println(id2.getD1() + " + " + id2.getD2() + " = " + id2.sum(id2.getD1(), id2.getD2()));
        System.out.println(id2.getD1() + " * " + id2.getD2() + " = " + id2.multiply(id2.getD1(), id2.getD2()));
        System.out.println("BigDecimal");
        System.out.println(id3.getBd1() + " + " + id3.getBd2() + " = " + id3.sum(id3.getBd1(), id3.getBd2()));
        System.out.println(id3.getBd1() + " * " + id3.getBd2() + " = " + id3.multiply(id3.getBd1(), id3.getBd2()));
    }
}
