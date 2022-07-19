import cars.Auto;
import cars.Car;
import cars.Tesla;
import cars.Track;

public class Main {
    public static void main(String[] args) {
        Auto car = new Car();
        Auto track = new Track();
        Auto tesla = new Tesla();

        car.fill();
        track.fill();
        tesla.fill();
    }
}
