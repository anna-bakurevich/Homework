package lesson13;

/**
 * Подсчитать количество всех точек, запятых и восклицательных знаков в строке.
 */

public class Lesson13DZTask4 {
    public static void main(String[] args) {
        String s = "A, b, c!!! Defg...";
        int countPoint = 0;
        int countComma = 0;
        int countExclamation = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch){
                case '.':
                    countPoint++;
                    break;
                case ',':
                    countComma++;
                    break;
                case '!':
                    countExclamation++;
                    break;
            }
        }
        System.out.printf("В тексте точек - %d, запятых - %d, восклицательных знаков - %d", countPoint, countComma, countExclamation);
    }
}
