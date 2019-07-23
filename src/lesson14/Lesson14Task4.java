package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
X - код оператора
Y - номер телефона
 */
public class Lesson14Task4 {
    public static void main(String[] args) {
        String line = "Номера телефонов +375293345276, +275235645279; 37544333333; +375296296455 для поиска.";
        System.out.println("Исходная строка: \t" + line);

        String phoneNumber = "";
        String formatPhoneNumber = "";
        String result = line;
        Pattern pattern = Pattern.compile("\\+375[0-9]{9}");//шаблон формата +375XXYYYYYYY
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            //ищем номер телефона, соответствующий формату +375XXYYYYYYY
            phoneNumber = matcher.group();
            //преобразуем найденный номер к формату +375 (XX) YYY-YY-YY
            formatPhoneNumber = "+375 (" + phoneNumber.substring(4, 6) + ") " + phoneNumber.substring(6, 9)
                    + "-" + phoneNumber.substring(9, 11) + "-" + phoneNumber.substring(11);
            //заменяем старый формат на новый
            result = result.replace(phoneNumber, formatPhoneNumber);
        }
        System.out.println("Измененная строка: \t" + result);
    }
}
