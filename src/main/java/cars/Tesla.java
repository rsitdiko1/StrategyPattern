package cars;

import strategy.ElectricityFillStrategy;

public class Tesla extends Auto{
    public Tesla() {
        this.fillStrategy = new ElectricityFillStrategy();
    }
}
