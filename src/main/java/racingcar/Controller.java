package racingcar;

import racingcar.model.Car;
import racingcar.model.Game;
import racingcar.model.NumberValidator;
import racingcar.model.StringValidator;
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
        OutputView.printResult(numberOfTry, cars);
    }
}