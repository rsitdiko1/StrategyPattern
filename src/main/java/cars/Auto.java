package cars;

import strategy.FillStrategy;

public class Auto {
    FillStrategy fillStrategy;

    public void drive(){
        System.out.println("Drive");
    }

    public void stop(){
        System.out.println("Stop");
    }

    public void fill(){
        fillStrategy.fill();
    }
}
