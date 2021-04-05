package JavaHW2.Chapter2.Task9;

public class TestForCar {

    public static void main(String[] args) {
        Car car = new Car(6.5);
        System.out.println(car.consumption(120));
        System.out.println(car.travelMiles(42,25.6));
    }
}
