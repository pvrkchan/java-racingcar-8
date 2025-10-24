package racingcar.view;

import racingcar.model.Car;

import java.util.List;

public class OutputView {
    public static void printResult(int numberOfTry, List<Car> cars) {
        System.out.println("\n실행 결과");
        for (int i = 0; i < numberOfTry; i++) {
            printEachTry(i, cars);
            System.out.println();
        }
    }

    private static void printEachTry(int i, List<Car> cars) {
        for(Car car : cars) {
            System.out.print(car.getName() + " : ");
            printPosition(car.getTrace(i));
            System.out.println();
        }
    }

    private static void printPosition(int trace) {
        for(int i = 0; i < trace; i++) {
            System.out.print("-");
        }
    }
}
