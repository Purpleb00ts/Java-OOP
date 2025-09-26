import java.text.DecimalFormat;

public class Car extends Vehicle{
    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 0.9, tankCapacity);
    }

    @Override
    public void driving(double distance) {
        super.driving(distance);
    }

    @Override
    public void refueling(double fuel) {
        super.refueling(fuel);
    }
}
