package strategy;

public class ElectricityFillStrategy implements FillStrategy{

    @Override
    public void fill() {
        System.out.println("I eat electricity");
    }
}
