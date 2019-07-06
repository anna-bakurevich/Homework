package lesson3;

/**
 * Написать программу, эмулирующую выдачу случайной карты из колоды в 52 карты.
 * Вывести результат в формате "Карта of Масть". Например, "AceofSpades".
 * Валет - Jack, Дама - Queen, Король - King, Туз - Ace, Червы - Hearts, Пики - Spades, Трефы - Clubs, Бубны - Diamonds
 */
public class Lesson3Task7 {
    public static void main(String[] args) {
        String[] cards = new String[52];
        String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suit = {"Hearts", "Spades", "Clubs", "Diamonds"};

        //заполнение массива cards
        int count = 0;
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                cards[count] = value[i] + " of " + suit[j];
                count++;
            }
        }
        int randomNumberCards = (int)(Math.random()*51)+1;
        System.out.println(cards[randomNumberCards]);
    }
}
