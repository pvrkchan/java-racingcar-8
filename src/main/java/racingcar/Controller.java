package racingcar;

import racingcar.model.*;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Controller {
    public void run() {
        String carNames = InputView.carNames();
        List<String> carList = StringValidator.validate(carNames);

        int numberOfTry = InputView.numberOfTry();
        NumberValidator.validate(numberOfTry);

        Game game = new Game();
        List<Car> cars = game.run(carList, numberOfTry);
        List<String> winners = Judge.winners(cars);
        OutputView.result(numberOfTry, cars, winners);
    }
}