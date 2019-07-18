package lesson11;

import java.util.*;

/*
Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в двух объектах HashMap в виде:
ключ: номер степени, значение: значение множителя
Вывести результирующий многочлен в виде строки: ax^6 + bx^4 + cx^3 + dx + 8
 */
public class Lesson11Task3 {
    public static void main(String[] args) {
        //храним многочлены в отсортированных в обратном порядке по ключу maps (наивысшая степень - первый ключ)
        Comparator<Integer> comparator = Comparator.reverseOrder();
        Map<Integer, Integer> polynomial1 = new TreeMap<>(comparator);
        Map<Integer, Integer> polynomial2 = new TreeMap<>(comparator);
        polynomial1.put(6, 2);
        polynomial1.put(4, 2);
        polynomial1.put(5, 0);
        polynomial1.put(3, 2);
        polynomial1.put(1, 2);
        polynomial1.put(2, 0);
        polynomial1.put(0, 8);
        polynomial2.put(4, 2);
        polynomial2.put(1, 5);
        polynomial2.put(3, 7);
        polynomial2.put(2, 3);
        polynomial2.put(0, 4);
        System.out.print("Многочлен 1: ");
        printPolynomial(polynomial1);
        System.out.println();
        System.out.print("Многочлен 2: ");
        printPolynomial(polynomial2);
        System.out.println();
        System.out.print("Сумма двух многочленов: ");
        //выбираем многочлен с наивысшей степенью (важно для порядка следования аргументов метода sumPolynomials)
        if (polynomial1.size() > polynomial2.size()) {
            printPolynomial(sumPolynomials(polynomial1, polynomial2));
        } else {
            printPolynomial(sumPolynomials(polynomial2, polynomial1));
        }
    }

    //метод для печати многочлена вида ax^6 + bx^4 + cx^3 + dx + 8
    public static void printPolynomial(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() > 1 && entry.getValue() != 1 && entry.getValue() != 0) {
                System.out.print(entry.getValue() + "x^" + entry.getKey() + " + ");
            } else if (entry.getKey() == 1 && entry.getValue() != 1 && entry.getValue() != 0) {
                System.out.print(entry.getValue() + "x" + " + ");
            } else if ((entry.getKey() == 0 && entry.getValue() != 1 && entry.getValue() != 0)) {
                System.out.print(entry.getValue());
            }
        }
    }

    public static Map<Integer, Integer> sumPolynomials(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        Comparator<Integer> comparator = Comparator.reverseOrder();
        //map для хранения результирующего многочлена
        Map<Integer, Integer> result = new TreeMap<>(comparator);
        //берем элемент первого (наибольшего по степени многочлена) и ищем соответствующий степени элемент во втором
        for (Map.Entry<Integer, Integer> entry1 : map1.entrySet()) {
            for (Map.Entry<Integer, Integer> entry2 : map2.entrySet()) {
                //как только находим, суммируем коэффициенты, заносим пару в результирующую map, выходим из внутреннего цикла
                if (entry1.getKey() == entry2.getKey()) {
                    result.put(entry1.getKey(), entry1.getValue() + entry2.getValue());
                    break;
                    //иначе заносим в результирующую map пару первого многочлена
                } else {
                    result.put(entry1.getKey(), entry1.getValue());
                }
            }
        }
        return result;
    }
}
