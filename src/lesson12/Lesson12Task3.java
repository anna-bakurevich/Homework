package lesson12;

/*
Создать собственный класс-исключение - наследник класса Exception.
Создать метод, выбрасывающий это исключение.
Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
 */
public class Lesson12Task3 {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "", "d"};
        try {
            arrayException(words);
        } catch (EmptyArrayElementException e) {
            e.printStackTrace();
        }
    }

    //метод, генерирующий исключение пустого элемента массива
    public static void arrayException(String[] words) throws EmptyArrayElementException {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) {
                throw new EmptyArrayElementException();
            }
        }
    }
}
