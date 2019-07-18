package lesson12;
/*
Написать метод, который в 50% случаев бросает исключение.
Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.
*/

import java.util.Random;

public class Lesson12Task7 {
    static boolean b = false;

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            try {
                fiftyFiftyException();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Блок оператора finally выполняется всегда.");
                System.out.println("-----------------------");
            }
        }
    }

    public static void fiftyFiftyException() throws Exception {
        if (b) {
            System.out.println("Исключение сгенерировано.");
            b = false;
            throw new Exception();
        } else {
            b = true;
            System.out.println("Исключение не сгенерировано.");
        }
    }
}
