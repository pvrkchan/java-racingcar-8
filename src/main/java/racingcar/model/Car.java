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

    public void goForward() {
        position++;
    }

    public void recordTrace(int currentPosition) {
        trace.add(currentPosition);
    }
}

