package lesson3;

/**
 * Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном
 */
public class Lesson3Task1 {
    public static void main(String[] args) {
        String [] letters = {"a", "b", "c", "d", "e", "f", "g"};

        //вывод в обычном порядке
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
        System.out.println();

        //вывод в обратном порядке
        for (int i = letters.length-1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
    }
}
