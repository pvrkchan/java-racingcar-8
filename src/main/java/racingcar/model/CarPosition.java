package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class CarPosition {
    private int position;
    private List<Integer> trace;

    public CarPosition(int position) {
        this.position = position;
        this.trace = new ArrayList<>();
    }

    public int getPosition() {
        return position;
    }

    public int getTrace(int index) {
        return trace.get(index);
    }

    public void goForward(){
        position++;
    }

    public void stamp(int position) {
        trace.add(position);
    }
}
