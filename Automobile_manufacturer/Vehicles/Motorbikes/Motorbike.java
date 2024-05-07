package Vehicles.Motorbikes;

import Vehicles.Vehicle;

public abstract class Motorbike implements Vehicle {
    protected int price;
    protected String name;

    public Motorbike(int price, String name) {
        this.price = price;
        this.name = name;
    }

    protected boolean abs; // Indicates whether the motorbike has an ABS feature
    protected boolean seatHeating; // Indicates whether the motorbike has seat heating

    // Sets the value of the ABS feature and adjusts the price accordingly
    public void setAbs(boolean abs) {
        this.abs = abs;
        if (abs) {
            price += 5000; // Increase the price by 5000 if ABS is present
        }
    }

    // Sets the value of the seat heating feature and adjusts the price accordingly
    public void setSeatHeating(boolean seatHeating) {
        this.seatHeating = seatHeating;
        if (seatHeating) {
            price += 2000; // Increase the price by 2000 if seat heating is present
        }
    }

    // Overrides the getPrice() method from the parent class to return the current price of the motorbike
    @Override
    public int getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }


    // Returns a string representation of the motorbike with its features and price
    public String toString() {
        StringBuilder builder = new StringBuilder();
        //Racer with ABS, Seat Heating having a total price of 67000 TL

        builder.append(name).append(abs || seatHeating ? " with":"");
        if (abs) {
            builder.append(seatHeating ? " ABS," : " ABS");
        }
        if (seatHeating) {
            builder.append(" Seat Heating");
        }
        builder.append(" having a total price of ");
        builder.append(getPrice());
        builder.append(" TL");

        return builder.toString();
    }
}

