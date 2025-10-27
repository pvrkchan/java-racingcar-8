package racingcar.model;

public class Car {
    private CarName name;
    private CarPosition position;

    public Car(CarName name, CarPosition position) {
        this.name = name;
        this.position = position;
    }

    public int getPosition() {
        return position.getPosition();
    }

    public int getTrace(int index) {
        return position.getTrace(index);
    }

    public void goForwardOrStop(int randomNumber) {
        if (randomNumber >= 4) {
            position.goForward();
        }
    }

    public void recordTrace(int currentPosition) {
        position.stamp(currentPosition);
    }

    public String isWinner(int maxPosition) {
        if (getPosition() == maxPosition) {
            return name.toString();
        }
        return null;
    }

    public int isMaxPosition(int maxPosition) {
        return Math.max(getPosition(), maxPosition);
    }

    public CarName getName() {
        return name;
    }
}