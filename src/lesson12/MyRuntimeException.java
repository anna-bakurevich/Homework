package lesson12;

/*
Создать собственный класс-исключение - наследник класса RuntimeException.
Добавить в конструктор своего класса возможность указания сообщения.
 */
public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String message) {
        super(message);
    }
}
