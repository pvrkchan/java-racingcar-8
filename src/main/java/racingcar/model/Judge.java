package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Judge {
    public static List<String> findWinners(List<Car> cars) {
        int maxPosition = findMaxPosition(cars);
        List<String> winners = new ArrayList<String>();
        for (Car car : cars) {
            if(car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

    public static int findMaxPosition(List<Car> cars) {
        int maxPosition = 0;
        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }
}
