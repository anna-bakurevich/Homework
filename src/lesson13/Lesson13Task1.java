package lesson13;

/**
 * Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
 * второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.
 */
public class Lesson13Task1 {
    public static void main(String[] args) {

        System.out.println(plusString("Yes!", 10));
        System.out.println("-----------------------------");
        System.out.println(appStringBuilder("Yes!", 10));


    }

    public static String plusString(String s, int count) {
        long startTime = System.nanoTime();
        String result = "";
        for (int i = 0; i < count; i++) {
            result += s;
        }
        long finishTime = System.nanoTime();
        System.out.println("Метод plusString отработал за " + (finishTime - startTime) + " наносекунд");
        return result;

    }

    public static StringBuilder appStringBuilder(String s, int count) {
        long startTime1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb = sb.append(s);
        }
        long finishTime1 = System.nanoTime();
        System.out.println("Метод appStringBuilder отработал за " + (finishTime1 - startTime1) +  " наносекунд");
        return sb;
    }
}
