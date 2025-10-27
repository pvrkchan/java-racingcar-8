package racingcar.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringValidator {
    public static List<String> validate(String carNames) {
        endWithComma(carNames);
        List<String> carList = Parser.parse(carNames);
        emptyName(carList);
        return carList;
    }

    private static void emptyName(List<String> carList) {
        if(carList.contains(""))
            throw new IllegalArgumentException("쉼표가 잘못 입력되었습니다.");
    }

    public static void endWithComma(String carNames) {
        if (carNames.endsWith(",")) {
            throw new IllegalArgumentException("쉼표가 잘못 입력되었습니다.");
        }
    }
}
