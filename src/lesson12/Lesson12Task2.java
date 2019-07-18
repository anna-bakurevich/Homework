package lesson12;

/*
Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
 */
public class Lesson12Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i + 1];
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка: выход за пределы диапазона массива!");
        }
    }
}
