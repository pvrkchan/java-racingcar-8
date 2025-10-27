package racingcar.view;

import racingcar.model.Car;

import java.util.List;

public class OutputView {
    public static void result(int numberOfTry, List<Car> cars, List<String> winners) {
        System.out.println("\n실행 결과");
        for (int i = 0; i < numberOfTry; i++) {
            eachTryResult(i, cars);
            System.out.println();
        }
        winners(winners);
    }

    private static void winners(List<String> winners) {
        System.out.print("최종 우승자 : ");
        System.out.println(String.join(", ", winners));
    }

    private static void eachTryResult(int i, List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.getName() + " : ");
            positionWithHyphen(car.getTrace(i));
            System.out.println();
        }
    }

    private static void positionWithHyphen(int trace) {
        for (int i = 0; i < trace; i++) {
            System.out.print("-");
        }
    }
}
