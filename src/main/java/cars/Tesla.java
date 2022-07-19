package cars;

import strategy.ElectricityFillStrategy;

public class Tesla extends Auto{
    public Tesla() {
        fillStrategy = new ElectricityFillStrategy();
    }
}
