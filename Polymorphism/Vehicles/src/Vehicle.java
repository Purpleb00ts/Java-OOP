import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;

    protected double fuelConsumption;

    private double tankCapacity;

    private DecimalFormat df;

    protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
        this.df = new DecimalFormat("#.##");
    }

    public void driving(double distance){
        double requiredFuel = this.fuelConsumption * distance;
        if(this.fuelQuantity >= requiredFuel){
            this.fuelQuantity -= requiredFuel;
            System.out.println(this.getClass().getSimpleName() + " travelled " + df.format(distance) + " km");
        } else {
            System.out.printf("%s needs refueling%n", this.getClass().getSimpleName());
        }
    }

    public void refueling(double fuel){
        if(fuel <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        } else if (this.fuelQuantity + fuel > tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity += fuel;
    }

    @Override
    public String toString(){
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
