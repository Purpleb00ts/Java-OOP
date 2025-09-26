public class Bus extends Vehicle{
    protected Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void driving(double distance) {
        super.driving(distance);
    }
    @Override
    public void refueling(double fuel) {
        super.refueling(fuel);
    }

    public void drivingWithPeople() {
        this.fuelConsumption += 1.4;
    }
}
