package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private int position;
    private List<Integer> trace;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
        this.trace = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getTrace(int index) {
        return trace.get(index);
    }

    public void goForwardOrStop(int randomNumber) {
        if(randomNumber >= 4) {
            position++;
        }
    }

    public void recordTrace(int currentPosition) {
        trace.add(currentPosition);
    }

    public String isWinner(int maxPosition) {
        if(position == maxPosition) {
            return name;
        }
        return null;
    }

    public int isMaxPosition(int maxPosition) {
        return Math.max(position, maxPosition);
    }
}

