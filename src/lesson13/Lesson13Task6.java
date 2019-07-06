package lesson13;

/**
 * Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
 * Пример: aaabbcdeef ->abcdef
 */
public class Lesson13Task6 {
    public static void main(String[] args) {
        String s = "aaabbcdeef";
        System.out.println(replaceRepeatWithOne(s));
    }

    public static String replaceRepeatWithOne(String s) {
        String result = "";

        //используем StringBuilder, т.к. в нем есть метод .deleteCharAt
        StringBuilder sb = new StringBuilder(s);

        //проходим по всей строке, ищем подряд идущие одинаковые символы, если нашли, удаляем последующий и уменьшаем индекс на 1;
        for (int i = 0; i < sb.length() - 1; i++) {
               if(sb.charAt(i) == sb.charAt(i+1)) {
                   sb.deleteCharAt(i+1);
                   i--;
               }
        }
        result = sb.toString();
        return result;
    }
}
