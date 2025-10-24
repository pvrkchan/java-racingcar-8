package racingcar;

import racingcar.model.*;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Controller {
    public void run() {
        String carNames = InputView.registerCarNames();
        List<String> carList = StringValidator.validate(carNames);

        int numberOfTry = InputView.registerNumberOfTry();
        NumberValidator.validate(numberOfTry);

        Game game = new Game();
        List<Car> cars = game.run(carList, numberOfTry);
        List<String> winners = Judge.findWinners(cars);
        OutputView.printResult(numberOfTry, cars, winners);
    }
}