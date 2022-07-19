package cars;

import strategy.GasFillStrategy;

public class Track extends Auto {

    public Track() {
        this.fillStrategy = new GasFillStrategy();
    }
}
