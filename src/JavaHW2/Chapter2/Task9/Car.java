package JavaHW2.Chapter2.Task9;

public class Car {

    private double efficiency; //gallons for 100 mile

    public Car(double efficiency) {
        this.efficiency = efficiency;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public double consumption(double miles) {
        return miles * efficiency / 100;
    }

    public double travelMiles( double fuelBefore, double fuelNow) {
        return (fuelBefore-fuelNow)/efficiency * 100;
    }
}
