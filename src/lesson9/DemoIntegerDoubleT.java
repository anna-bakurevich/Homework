package lesson9;

import java.math.BigDecimal;

public class DemoIntegerDoubleT {
    public static void main(String[] args) {
        IntegerDoubleT<Integer> id1 = new IntegerDoubleT<>(5,10);
        IntegerDoubleT<Double> id2 = new IntegerDoubleT<>(5.555, 10.333);
        IntegerDoubleT<BigDecimal> id3 = new IntegerDoubleT<>(new BigDecimal(5.555), new BigDecimal(10.333));
        System.out.println("int");
        System.out.println(id1.getA1() + " + " + id1.getA2() + " = " + id1.sumInt());
        System.out.println(id1.getA1() + " * " + id1.getA2() + " = " + id1.multiplyInt());
        System.out.println("double");
        System.out.println(id2.getA1() + " + " + id2.getA2() + " = " + id2.sumDouble());
        System.out.println(id2.getA1() + " * " + id2.getA2() + " = " + id2.multiplyDouble());
        System.out.println("BigDecimal");
        System.out.println(id2.getA1() + " + " + id2.getA2() + " = " + id2.sumBigDecimal());
        System.out.println(id2.getA1() + " * " + id2.getA2() + " = " + id2.multiplyBigDecimal());
    }
}
