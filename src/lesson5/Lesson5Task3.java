package lesson5;

/*
Определить класс, который при инициализации принимает на вход 2 аргумента целого или вещественного типа.
Задать перегруженные методы возвращающие результат арифметических операций над заданными полями и полями типа BigDecimal.
 */

public class Lesson5Task3 {
    public static void main(String[] args) {
        IntegerDouble id1 = new IntegerDouble(5,10);
        IntegerDouble id2 = new IntegerDouble(5.555, 10.333);
        System.out.println("int");
        System.out.println(id1.getI1() + " + " + id1.getI2() + " = " + id1.sumInteger());
        System.out.println(id1.getI1() + " * " + id1.getI2() + " = " + id1.multiplicationInteger());
        System.out.println("double");
        System.out.println(id2.getD1() + " + " + id2.getD2() + " = " + id2.sumDouble());
        System.out.println(id2.getD1() + " * " + id2.getD2() + " = " + id2.multiplicationDouble());
        System.out.println("BigDecimal");
        System.out.println(id2.getD1() + " + " + id2.getD2() + " = " + id2.sumBigDecimal());
        System.out.println(id2.getD1() + " * " + id2.getD2() + " = " + id2.multiplicationBigDecimal());
    }
}
