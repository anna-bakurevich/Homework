package lesson14;

/*
Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
с помощью регулярных выражений и выводящую их на страницу.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson14Task2 {
    public static void main(String[] args) {
        String line = "В тексте 0xFF встречаются 0x0A отдельностоящие шестнадцатиричные 1E24 числа 0X5C7," +
                "записанные по правилам Java и не по правилам 0x, FF";

        //структура регулярного выражения: граница слова; ноль; x или X; любые цифры и буквы от a до f в обоих регистрах
        //(один или более); граница слова
        Pattern pattern = Pattern.compile("\\b0(x|X)[0-9a-fA-F]+\\b");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
