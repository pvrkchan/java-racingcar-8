package racingcar;

import racingcar.model.Validator;
import racingcar.view.InputView;

import java.util.List;

public class Controller {
    public void run() {
        String carNames = InputView.registerCarNames();
        List<String> carList = Validator.validate(carNames);
    }
}
