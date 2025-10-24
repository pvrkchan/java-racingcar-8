package racingcar.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringValidator {
    private static final String NAME_PATTERN = "[a-zA-Z,]*";

    public static List<String> validate(String carNames) {
        validateEmptyCarNames(carNames);
        validateOnlyEnglish(carNames);
        validateStartWithComma(carNames);
        validateEndWithComma(carNames);

        List<String> carList = Parser.parse(carNames);

        validateHasOnlyOneCar(carList);
        validateLengthOfName(carList);
        validateDuplicate(carList);
        return carList;
    }

    public static void validateEmptyCarNames(String carNames) {
        if(carNames.isEmpty()){
            throw new IllegalArgumentException("자동차 이름을 입력하세요.");
        }
    }

    private static void validateOnlyEnglish(String carNames) {
        if(!carNames.matches(NAME_PATTERN)) {
            throw new IllegalArgumentException("영문자와 콤마만을 입력하세요.");
        }
    }

    public static void validateStartWithComma(String carNames) {
        if(carNames.startsWith(",")){
            throw new IllegalArgumentException("쉼표가 잘못 입력되었습니다.");
        }
    }

    public static void validateEndWithComma(String carNames) {
        if(carNames.endsWith(",")){
            throw new IllegalArgumentException("쉼표가 잘못 입력되었습니다.");
        }
    }

    public static void validateHasOnlyOneCar(List<String> carList) {
        if(carList.size() == 1){
            throw new IllegalArgumentException("경주를 위해 자동차를 2대 이상 입력하세요.");
        }
    }

    public static void validateLengthOfName(List<String> carList) {
        for(String carName : carList){
            if(carName.length() > 5){
                throw new IllegalArgumentException("자동차의 이름은 최대 5글자까지 입력 가능합니다.");
            }
            if(carName.isEmpty()){
                throw new IllegalArgumentException("콤마 사이에 아무것도 입력되지 않았습니다.");
            }
        }
    }

    private static void validateDuplicate(List<String> carList) {
        Set<String> carSet = new HashSet<String>(carList);
        if(carSet.size() != carList.size()){
            throw new IllegalArgumentException("중복된 이름이 존재합니다.");
        }
    }

}
