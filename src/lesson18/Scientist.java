package lesson18;

import java.util.HashMap;
import java.util.Map;

/*
Учёный пытается собрать робота из деталей, которые есть в наличии.
 */
public class Scientist {
    private Map<Enum, Integer> detailsAvailable = new HashMap<>();

    public Scientist() {

        detailsAvailable.put(Robot.HEAD, 0);
        detailsAvailable.put(Robot.BODY, 0);
        detailsAvailable.put(Robot.LEFT_HAND, 0);
        detailsAvailable.put(Robot.RIGHT_HAND, 0);
        detailsAvailable.put(Robot.LEFT_LEG, 0);
        detailsAvailable.put(Robot.RIGHT_LEG, 0);
        detailsAvailable.put(Robot.CPU, 0);
        detailsAvailable.put(Robot.RAM, 0);
        detailsAvailable.put(Robot.HDD, 0);
    }

    public Map<Enum, Integer> getDetailsAvailable() {
        return detailsAvailable;
    }

    //сборка робота
    public boolean assemblingRobot() {
        boolean robotComplete = false;
        Robot[] robotAllDetails = Robot.values();
        int i = 0;
        //проверка на достаточность по кол-ву
        if (MethodsMap.countDetails(detailsAvailable) >= robotAllDetails.length) {
            //проверка на достаточность по виду детали
            for (i = 0; i < robotAllDetails.length; i++) {
                //если находим деталь со значением 0 (нет в наличии), выходим из цикла
                if (detailsAvailable.get(robotAllDetails[i]) == 0) {
                    System.out.println("Не хватает детали " + robotAllDetails[i] + ", дальнейшая сборка не возможна.");
                    break;
                }
            }
            //если нашлись все детали, обновляем карту наличия, уменьшая кол-во каждой детали на 1
            if (i == robotAllDetails.length) {
                robotComplete = true;
                for (int j = 0; j < robotAllDetails.length; j++) {
                    detailsAvailable.put(robotAllDetails[j], detailsAvailable.get(robotAllDetails[j]) - 1);
                }
            }
        } else {
            System.out.println("Недостаточно деталей для сборки робота.");
        }
        return robotComplete;
    }
}
