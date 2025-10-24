package racingcar;

import racingcar.model.StringValidator;
import racingcar.view.InputView;

import java.util.List;

public class Controller {
    public void run() {
        String carNames = InputView.registerCarNames();
        List<String> carList = StringValidator.validate(carNames);

        int numberOfTry = InputView.registerNumberOfTry();
    }
}
