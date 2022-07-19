package cars;

import strategy.GasFillStrategy;

public class Track extends Auto {

    public Track() {
        fillStrategy = new GasFillStrategy();
    }
}
