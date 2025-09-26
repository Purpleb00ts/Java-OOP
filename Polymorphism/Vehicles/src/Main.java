import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(input[1]), Double.parseDouble(input[2]), Double.parseDouble(input[3]));

        input = scanner.nextLine().split("\\s+");

        Vehicle truck = new Truck(Double.parseDouble(input[1]), Double.parseDouble(input[2]), Double.parseDouble(input[3]));

        input = scanner.nextLine().split("\\s+");

        Vehicle bus = new Bus(Double.parseDouble(input[1]), Double.parseDouble(input[2]), Double.parseDouble(input[3]));


        Map<String, Vehicle> vehicleMap = Map.of("Car", car,
                "Truck", truck,
                "Bus", bus);


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            Vehicle vehicle = vehicleMap.get(tokens[1]);
            double parameter = Double.parseDouble(tokens[2]);

            switch(tokens[0]){
                case "Drive":
                    if(vehicle instanceof Bus){
                        ((Bus) vehicle).drivingWithPeople();
                    }
                    vehicle.driving(parameter);
                    break;
                case "Refuel":
                    try {
                        vehicle.refueling(parameter);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "DriveEmpty":
                    vehicle.driving(parameter);
                    break;
            }
        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}
