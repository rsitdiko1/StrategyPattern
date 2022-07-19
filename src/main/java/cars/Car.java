package cars;

import strategy.GasFillStrategy;

public class Car extends Auto {
    public Car() {
        fillStrategy = new GasFillStrategy();
    }
}
