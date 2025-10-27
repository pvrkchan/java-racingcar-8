package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {
    public static List<String> parse(String carNames) {
        List<String> result = new ArrayList<String>(Arrays.asList(carNames.split(",")));
        return result;
    }
}