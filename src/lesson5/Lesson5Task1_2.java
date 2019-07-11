package lesson5;

import static jdk.nashorn.internal.ir.debug.ObjectSizeCalculator.getObjectSize;

public class Lesson5Task1_2 {
    public static void main(String[] args) {
        Long[] arrayLong = new Long[10];
        System.out.println("Пустой массив Long[10] занимает \t" + getObjectSize(arrayLong) + " байт");
        Double[] arrayDouble = new Double[10];
        System.out.println("Пустой массив Double[10] занимает \t" + getObjectSize(arrayDouble) + " байт");
        Byte[] arrayByte = new Byte[10];
        System.out.println("Пустой массив Byte[10] занимает \t" + getObjectSize(arrayByte) + " байт");
        String[] arrayString = new String[10];
        System.out.println("Пустой массив String[10] занимает \t" + getObjectSize(arrayString) + " байт");

        //заполняем массивы
        for (Byte i = 0; i < arrayLong.length; i++) {
            arrayLong[i] = Long.valueOf(i*123456789l);
            arrayDouble[i] = Double.valueOf(i*12345.66);
            arrayByte[i] = i;
            arrayString[i] = String.valueOf(i*12345678);
        }

        System.out.println("Размер заполненного массива Long[10]:\t" + getObjectSize(arrayLong) + " байт");
        System.out.println("Размер заполненного массива Double[10]:\t" + getObjectSize(arrayDouble) + " байт");
        System.out.println("Размер заполненного массива Byte[10]:\t" + getObjectSize(arrayByte) + " байт");
        System.out.println("Размер заполненного массива String[10]:\t" + getObjectSize(arrayString) + " байт");
    }
}
