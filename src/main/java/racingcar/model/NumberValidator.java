package racingcar.model;

public class NumberValidator {
    private static final int MAX_TRY_NUMBER = 150;

    public static void validate(int numberOfTry) {
        rangeOfNumber(numberOfTry);
    }

    public static void rangeOfNumber(int numberOfTry) {
        if (numberOfTry > MAX_TRY_NUMBER) {
            throw new IllegalArgumentException("입력할 수 있는 최대 횟수를 초과했습니다. (최대 횟수 : 150)");
        }
        if (numberOfTry < 1) {
            throw new IllegalArgumentException("1 이상의 양의 정수를 입력해주세요.");
        }
    }
}