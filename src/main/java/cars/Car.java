package cars;

import strategy.GasFillStrategy;

public class Car extends Auto {
    public Car() {
        this.fillStrategy = new GasFillStrategy();
    }
}
