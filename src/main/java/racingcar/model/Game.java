package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Car> cars = new ArrayList<Car>();
    private int numberOfTry;

    public List<Car> run(List<String> carList, int numberOfTry) {
        initGame(carList, numberOfTry);
        playGame();
        return cars;
    }

    private void initGame(List<String> carList, int numberOfTry) {
        for(String carName : carList) {
            Car car = new Car(carName, 0);
            cars.add(car);
        }
        this.numberOfTry = numberOfTry;
    }

    private void playGame() {
        for(int i = 0; i < numberOfTry; i++) {
            eachTry();
        }
    }

    private void eachTry() {
        for(Car car : cars) {
            int randomNumber = Randoms.pickNumberInRange(0, 9);
            car.goForwardOrStop(randomNumber);
            car.recordTrace(car.getPosition());
        }
    }
}
