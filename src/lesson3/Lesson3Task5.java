package lesson3;

/**
 * Создать двухмерный квадратный массив, и заполнить его "бабочкой", т.е. таким образом:
 * <p>
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 * <p>
 * Вывести его на экран, заменив 1 символом *, а 0 - пробелом.
 */
public class Lesson3Task5 {
    public static void main(String[] args) {

        //задаем размер массива nxn
        int n = 5;
        String[][] butterfly = new String[n][n];

        //заполняем сверху до середины
        for (int i = 0; i < butterfly.length / 2 + 1; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                if (j < i || (j >= butterfly.length - i)) {
                    butterfly[i][j] = " ";
                } else {
                    butterfly[i][j] = "*";
                }
            }
        }

        //заполняем снизу до середины
        for (int i = butterfly.length - 1; i >= butterfly.length / 2; i--) {
            for (int j = 0; j < butterfly.length; j++) {
                if (j > i || (j < butterfly[i].length - 1 - i)) {
                    butterfly[i][j] = " ";
                } else {
                    butterfly[i][j] = "*";
                }
            }

        }

        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                System.out.print(butterfly[i][j]);
            }
            System.out.println();
        }


    }
}
