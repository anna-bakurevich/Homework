package lesson3;

/**
 * Написать программу, перемешивающую и печатающую список карт в колоде.
 * Воспользоваться результатом предыдущей задачи.
 */
public class Lesson3Task8 {
    public static void main(String[] args) {

        //создаем колоду
        String[] cards = new String[52];
        String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suit = {"Hearts", "Spades", "Clubs", "Diamonds"};

        int count = 0;
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                cards[count] = value[i] + " of " + suit[j];
                count++;
            }
        }
        // Алгоритм Фишера – Йетса (Fisher–Yates shuffle)
        // Чтобы перемешать массив array из n элементов (индексы элементов от 0 до n - 1):
        // для всех i от n − 1 до 1:
        // обменять местами array[j] и array[i], где j - целое случайное число 0 ≤ j ≤ i
        for (int i = cards.length - 1; i > 0; i--) {
            swap(cards, randomNumberCard(0, i), i);
        }

        //вывод перемешанной колоды в консоль
        for (String s : cards) {
            System.out.println(s);
        }
    }

    //метод, генерирующий случайный номер карты в промежутке [a,b]
    public static int randomNumberCard(int a, int b) {
        int randomNumber = (int) (Math.random() * (b - a + 1)) + a;
        return randomNumber;
    }

    //метод, меняющий два элемента массива местами (array[a] и array[b])
    public static void swap(String[] array, int a, int b) {
        String tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
