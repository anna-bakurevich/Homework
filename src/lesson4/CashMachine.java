package lesson4;

public class CashMachine {
    private int[] note = new int[3]; //массив с количеством купюр каждого номинала
    private int[] nominal = {20, 50, 100}; //массив номиналов

    CashMachine(int[] note) {
        this.note[0] = note[0];
        this.note[1] = note[1];
        this.note[2] = note[2];
    }

    //пополнение банкомата
    int[] replenishment(int[] count) {
        for (int i = 0; i < note.length; i++) {
            this.note[i] += count[i];
        }
        return note;
    }

    //снятие денег
    boolean withdrawal(int sum) {
        int[] count = new int[3];
        int remainderSum;
        //запоминаем первоначальный состав суммы
        int[] tmpNote = {note[0], note[1], note[2]};
        boolean result;
        //если запрашиваемая сумма больше, чем имеется в банкомате
        if (sum > totalSum(note)) {
            System.out.println("-------------------------");
            System.out.printf("Снятие невозможно! Запрошенная сумма %d превышает имеющееся в банкомате количество денег.\n", sum);
            result = false;
        } else if (sum >= 800) {
            System.out.println("-------------------------");
            System.out.println("Запрошенная сумма превышает лимит в 800. Повторите ввод.\n");
            result = false;
        } else {
            remainderSum = sum;
            for (int i = note.length - 1; i >= 0; i--) {
                count[i] = remainderSum / nominal[i];
                if (count[i] > note[i]) {
                    count[i] = note[i];
                    remainderSum -= nominal[i] * note[i];
                    note[i] = 0;
                } else {
                    note[i] -= count[i];
                    remainderSum -= nominal[i] * count[i];
                }
            }
            //если не удается собрать нужную сумму имеющимися купюрами
            if (remainderSum != 0) {
                System.out.println("-------------------------");
                System.out.printf("Возможная сумма к выдаче: %d. Повторите ввод.\n", (sum - remainderSum));
                //восстанавливаем первоначальный состав
                for (int i = 0; i < note.length; i++) {
                    note[i] = tmpNote[i];
                }
                result = false;
            } else {
                System.out.println("-------------------------");
                System.out.printf("Выдана сумма %d рублей купюрами:\n %d шт. по 20 рублей\n %d шт. по 50 рублей\n %d шт. по 100 рублей\n",
                        sum, count[0], count[1], count[2]);
                result = true;
            }
        }
        return result;
    }

    //вывод в консоль содержимого банкомата
    void printBalance() {
        System.out.println("-------------------------");
        System.out.printf("В банкомате %d рублей купюрами:\n %d шт. по 20 рублей\n %d шт. по 50 рублей\n %d шт. по 100 рублей\n",
                totalSum(note), note[0], note[1], note[2]);
    }

    //сумма имеющаяся в банкомате
    int totalSum(int[] note) {
        int sum = 0;
        for (int i = 0; i < note.length; i++) {
            sum += note[i] * nominal[i];
        }
        return sum;
    }
}
