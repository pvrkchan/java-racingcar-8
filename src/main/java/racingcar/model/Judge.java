package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Judge {
    public static List<String> winners(List<Car> cars) {
        int maxPosition = maxPosition(cars);
        List<String> winners = new ArrayList<String>();
        for (Car car : cars) {
            Optional.ofNullable(car.isWinner(maxPosition)).ifPresent(winners::add);
        }
        return winners;
    }

    public static int maxPosition(List<Car> cars) {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = car.isMaxPosition(maxPosition);
        }
        return maxPosition;
    }
}
