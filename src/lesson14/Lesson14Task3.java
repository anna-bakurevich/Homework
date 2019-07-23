package lesson14;
/*
Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры,
например, <p id="p1">, и замену их на простые теги абзацев <p>.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson14Task3 {
    public static void main(String[] args) {
        String line = "например, <p id=\"p1\">, и замену их на простые теги абзацев <p>";
        Pattern pattern = Pattern.compile("\\<p ?\\S*\\>");
        Matcher matcher = pattern.matcher(line);
        System.out.println("Список всех тегов абзацев:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println("Замена тегов с параметрами на простые теги абзацев: \n"
                + line.replaceAll("\\<p \\S+\\>", "<p>"));
    }
}
