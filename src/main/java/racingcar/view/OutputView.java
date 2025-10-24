package racingcar.view;

import racingcar.model.Car;

import java.util.List;

public class OutputView {
    public static void printResult(int numberOfTry, List<Car> cars, List<String> winners) {
        System.out.println("\n실행 결과");
        for (int i = 0; i < numberOfTry; i++) {
            printEachTry(i, cars);
            System.out.println();
        }
        if(winners.size() == 1) {
            printSoloWinner(winners);
        }
        if(winners.size() > 1){
            printMultiWinner(winners);
        }
    }

    private static void printMultiWinner(List<String> winners) {
        int numberOfWinners = winners.size();
        System.out.print("최종 우승자 : ");
        for(int i = 0; i < numberOfWinners; i++){
            if(i == numberOfWinners - 1){
                System.out.println(winners.get(i));
                break;
            }
            System.out.print(winners.get(i)+", ");
        }
    }

    private static void printSoloWinner(List<String> winners) {
        System.out.print("최종 우승자 : ");
        System.out.println(winners.getFirst());
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
