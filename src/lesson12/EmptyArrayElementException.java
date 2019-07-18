package lesson12;

/*
Создать собственный класс-исключение - наследник класса Exception.
 */
public class EmptyArrayElementException extends Exception {
    private Exception exception;

    public Exception getException() {
        return exception;
    }

}
