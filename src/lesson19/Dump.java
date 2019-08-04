package lesson19;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/*
В первую ночь на свалке находится 20 случайных деталей. Каждую последующую ночь фабрика выбрасывает на свалку от 1 до 4
случайных деталей.
 */
public class Dump {
    private Map<Enum, Integer> detailsDump = new HashMap<>();

    public Dump() {
        detailsDump.put(Robot.BODY, 0);
        detailsDump.put(Robot.CPU, 0);
        detailsDump.put(Robot.HDD, 0);
        detailsDump.put(Robot.HEAD, 0);
        detailsDump.put(Robot.LEFT_HAND, 0);
        detailsDump.put(Robot.LEFT_LEG, 0);
        detailsDump.put(Robot.RAM, 0);
        detailsDump.put(Robot.RIGHT_HAND, 0);
        detailsDump.put(Robot.RIGHT_LEG, 0);

    }

    public Map<Enum, Integer> getDetailsDump() {
        return detailsDump;
    }

    //генерация случайного количества деталей в промежутке [1;4]
    public int randomCountDetails() {
        return new Random().nextInt(4) + 1;
    }

    //добавление count случайных деталей в Map detailsDump
    public synchronized void put(int count) {
        for (int i = 1; i <= count; i++) {
            //если такая деталь уже есть (ключ в map), то увеличиваем значение на 1
            Robot detail = randomDetails();
            if (detailsDump.containsKey(detail)) {
                detailsDump.put(detail, detailsDump.get(detail) + 1);
                //иначе добавляем в map новую деталь со значением 1
            } else {
                detailsDump.put(detail, 1);
            }
        }
    }

    //генерация случайной детали
    public Robot randomDetails() {
        Robot[] details = Robot.values();
        return details[new Random().nextInt(details.length)];
    }

    //взять count случайных деталей, имеющихся в наличии на свалке
    public synchronized void get(int count) {
        for (int i = 1; i <= count; i++) {
            Enum randomDetail = randomDetailDump();
            if (randomDetail != null) {
                detailsDump.put(randomDetail, detailsDump.get(randomDetail) - 1);
                Servant.getDetailsServant().get().put(randomDetail, Servant.getDetailsServant().get().get(randomDetail) + 1);
                System.out.println(Thread.currentThread().getName() + ": берет со свалки деталь " + randomDetail);
            } else {
                break;
            }
        }
    }

    //генерация случайной детали из имеющихся в наличии на свалке
    public Enum randomDetailDump() {
        Random random = new Random();
        List<Enum> details = detailsDump.entrySet().stream()
                .filter(e -> e.getValue() != 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        if(details.size() == 0) {
            return null;
        } else if (details.size() == 1) {
            return details.get(0);
        } else {
            return details.get(random.nextInt(details.size() - 1) + 1);
        }
    }

}
