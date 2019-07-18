package lesson12;

/*
Создать собственный класс-исключение - наследник класса RuntimeException.
Создать метод, выбрасывающий это исключение.
Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
Добавить в конструктор своего класса возможность указания сообщения.
 */

public class Lesson12Task4 {
    public static void main(String[] args) {
        //т.к. исключение, генерируемое методом method относится к RuntimeException, обработка в try-catch не требуется
        method(-1);
    }

    public static void method(int a) {
        if (a < 0) {
            throw new MyRuntimeException("Ошибка: допустимы только положительные значения аргумента метода!");
        }
    }
}
