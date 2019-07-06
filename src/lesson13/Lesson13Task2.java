package lesson13;

/**
 * Заменить все грустные смайлы :( в строке на веселые :)
 */
public class Lesson13Task2 {
    public static void main(String[] args) {
        String s = "Hello:( Bye:(";
        System.out.println(s.replace(":(", ":)"));
    }

}
