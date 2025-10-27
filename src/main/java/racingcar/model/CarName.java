package racingcar.model;

public class CarName {
    private final String name;
    private static final String NAME_PATTERN = "[a-zA-Z,]*";

    public CarName(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        onlyEnglish(name);
        lengthOfName(name);
    }

    private static void onlyEnglish(String name) {
        if (!name.matches(NAME_PATTERN)) {
            throw new IllegalArgumentException("자동차 이름으로는 영문자만 입력할 수 있습니다.");
        }
    }

    public static void lengthOfName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차의 이름은 최대 5글자까지 입력 가능합니다.");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
