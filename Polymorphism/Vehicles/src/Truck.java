import java.text.DecimalFormat;

public class Truck extends Vehicle{

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.6, tankCapacity);
    }
    @Override
    public void driving(double distance) {
        super.driving(distance);
    }

    @Override
    public void refueling(double fuel) {
        super.refueling(fuel * 0.95);
    }
}
