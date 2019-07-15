package lesson5;

/*
Определить класс, который при инициализации принимает на вход 2 аргумента целого или вещественного типа.
Задать перегруженные методы возвращающие результат арифметических операций над заданными полями
и полями типа BigDecimal.
 */

import lombok.Getter;

import java.math.BigDecimal;

@Getter

public class IntegerDouble {
    private int i1;
    private int i2;
    private double d1;
    private double d2;
    private BigDecimal bd1;
    private BigDecimal bd2;

    public IntegerDouble(int i1, int i2) {
        this.i1 = i1;
        this.i2 = i2;
    }

    public IntegerDouble(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public IntegerDouble(BigDecimal bd1, BigDecimal bd2) {
        this.bd1 = bd1;
        this.bd2 = bd2;
    }

    public int sum(int i1, int i2) {
        return i1 + i2;
    }

    public double sum(double d1, double d2) {
        return d1 + d2;
    }

    public BigDecimal sum(BigDecimal bd1, BigDecimal bd2) {
        return bd1.add(bd2);
    }

    public int multiply(int i1, int i2) {
        return i1 * i2;
    }

    public double multiply(double d1, double d2) {
        return d1 * d2;
    }

    public BigDecimal multiply(BigDecimal bd1, BigDecimal bd2) {
        return bd1.multiply(bd2);
    }
}
