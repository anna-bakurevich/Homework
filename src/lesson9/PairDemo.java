package lesson9;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(2, "two");
        pair.printObjectInfo();
        pair.printTypes();

        //применяем метод swap и выводим результат
       PairUtil.swap(pair).printObjectInfo();
       PairUtil.swap(pair).printTypes();
    }
}
