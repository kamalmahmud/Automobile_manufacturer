package inventory;

import Vehicles.Cars.Car;
import Vehicles.Motorbikes.Motorbike;
import Vehicles.Vehicle;

import java.util.*;


public class Inventory {
    private ArrayList<Vehicle> vehicles;

    public Inventory() {
        vehicles = new ArrayList<>();
    }

    public void add(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int totalCost = 0;
        int carCount = 0;
        int motorbikeCount = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                carCount++;
            } else if (vehicle instanceof Motorbike) {
                motorbikeCount++;
            }

            builder.append(vehicle.toString());
            builder.append("\n");
            totalCost += vehicle.getPrice();
        }
        if (vehicles.size() >= 1) {

            builder.append("TOTAL : ").append(vehicles.size()).append(vehicles.size() != 1 ? " Vehicles including " : " Vehicle including ");

        if (carCount >= 1) {
                builder.append(carCount).append(carCount != 1 ? " Cars" : " Car");
            }
        if (carCount > 0 && motorbikeCount > 0){
            builder.append(" and ");
        }

        if (motorbikeCount >= 1) {
            builder.append(motorbikeCount).append(motorbikeCount != 1 ? " Motorbikes" : " Motorbike");
        }

        builder.append(" having a total price of ").append(totalCost).append(" TL");
        }
        else builder.append("No Vehicles in The Inventory");

        return builder.toString();
    }
}
