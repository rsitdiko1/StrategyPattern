package strategy;

public class GasFillStrategy implements FillStrategy{

    @Override
    public void fill() {
        System.out.println("I eat gas");
    }
}
