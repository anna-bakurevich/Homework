package lesson5;

import java.math.BigDecimal;

public class IntegerDouble {
    private int i1;
    private int i2;
    private double d1;
    private double d2;


    public IntegerDouble(int i1, int i2) {
        this.i1 = i1;
        this.i2 = i2;
    }

    public IntegerDouble(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public int getI1() {
        return i1;
    }

    public int getI2() {
        return i2;
    }

    public double getD1() {
        return d1;
    }

    public double getD2() {
        return d2;
    }


    public int sumInteger() {
        return i1 + i2;
    }

    public double sumDouble() {
        return d1 + d2;
    }

    public int multiplicationInteger() {
        return i1 * i2;
    }

    public double multiplicationDouble() {
        return d1 * d2;
    }

    public BigDecimal sumBigDecimal() {
        return new BigDecimal(d1).add(new BigDecimal(d2));
    }

    public BigDecimal multiplicationBigDecimal(){
        return new BigDecimal(d1).multiply(new BigDecimal(d2));
    }
}
