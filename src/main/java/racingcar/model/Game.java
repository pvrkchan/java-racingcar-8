package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private List<Car> cars = new ArrayList<Car>();
    private int numberOfTry;

    public List<Car> run(List<String> carList, int numberOfTry) {
        init(carList, numberOfTry);
        play();
        return cars;
    }

    private void init(List<String> carList, int numberOfTry) {
        initValidator(carList);
        for (String carName : carList) {
            Car car = new Car(new CarName(carName), new CarPosition(0));
            cars.add(car);
        }
        this.numberOfTry = numberOfTry;
    }

    private void play() {
        for (int i = 0; i < numberOfTry; i++) {
            eachTry();
        }
    }

    private void eachTry() {
        for (Car car : cars) {
            int randomNumber = Randoms.pickNumberInRange(0, 9);
            car.goForwardOrStop(randomNumber);
            car.recordTrace(car.getPosition());
        }
    }

    public void initValidator(List<String> carList) {
        Set<String> carSet = new HashSet<String>(carList);
        if (carSet.size() != carList.size()) {
            throw new IllegalArgumentException("중복된 이름의 자동차를 등록하였습니다.");
        }
        if (carList.size() == 1) {
            throw new IllegalArgumentException("경주를 위해 차를 2대 이상 등록해주세요.");
        }
    }
}