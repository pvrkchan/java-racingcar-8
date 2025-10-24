package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String registerCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public static int registerNumberOfTry() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("1 이상의 양의 정수를 입력하세요.");
        }
    }
}
