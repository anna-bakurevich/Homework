package lesson4;

public class PeriodOfTime {

        private int hours;
        private int minutes;
        private int seconds;

    //конструктор преобразовывает введенное при объявлении объекта время в корректное число часов, минут, секунд
        PeriodOfTime(int hours, int minutes, int seconds) {
            int s = hours * 3600 + minutes * 60 + seconds;
            int h = s / 3600;
            this.hours = h;
            int m = (s - h * 3600) / 60;
            this.minutes = m;
            this.seconds = s - h * 3600 - m * 60;
        }

        PeriodOfTime(int seconds) {
            this.hours = seconds / 3600;
            this.minutes = (seconds - hours * 3600) / 60;
            this.seconds = seconds - hours * 3600 - minutes * 60;
        }

        //метод для вывода информации об объекте в консоль
        void printInfo() {
            System.out.printf("Hours: %d \tMinutes: %d \tSeconds: %d\n", hours, minutes, seconds);
        }

        //метод для получения полного количества секунд в объекте
        int periodOfTimeInSeconds() {
            return hours * 3600 + minutes * 60 + seconds;
        }
    }


