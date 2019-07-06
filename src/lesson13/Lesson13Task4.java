package lesson13;

/**
 * Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
 * в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре, а результирующая строка
 * должна быть в верхнем.
 */

public class Lesson13Task4 {
    public static void main(String[] args) {
        String firstName = "Иван";
        String surname = "петров";
        String lastName = "Сидорович";
        System.out.println(fio(firstName,surname,lastName));

    }

    public static String fio(String firstName, String surname, String lastName) {
        String result = "";
        result = (surname.charAt(0)+"." + firstName.charAt(0) + "." +lastName.charAt(0) + ".").toUpperCase();
        return result;
    }
}
