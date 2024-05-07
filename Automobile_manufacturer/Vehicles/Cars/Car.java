package Vehicles.Cars;

import Vehicles.Vehicle;

public abstract class Car implements Vehicle {
    protected int price;
    protected String name;

    public Car(int price, String name) {
        this.price = price;
        this.name = name;
    }

    protected boolean abs; // Indicates whether the car has an ABS feature
    protected boolean musicSystem; // Indicates whether the car has a music system
    protected boolean sunRoof; // Indicates whether the car has a sunroof
    protected boolean airBag; // Indicates whether the car has an airbag

    protected boolean selfparking;

    public void setSelfparking(boolean selfparking){
        this.selfparking =selfparking;
        if (selfparking){
            price += 2000;
        }
    }

    // Sets the value of the ABS feature and adjusts the price accordingly
    public void setAbs(boolean abs) {
        this.abs = abs;
        if (abs) {
            price += 5000; // Increase the price by 5000 if ABS is present
        }
    }

    // Sets the value of the music system feature and adjusts the price accordingly
     public void setMusicSystem(boolean musicSystem) {
        this.musicSystem = musicSystem;
        if (musicSystem) {
            price += 1000; // Increase the price by 1000 if a music system is present
        }
    }

    // Sets the value of the airbag feature and adjusts the price accordingly
    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
        if (airBag) {
            price += 3000; // Increase the price by 3000 if an airbag is present
        }
    }

    // Sets the value of the sunroof feature and adjusts the price accordingly
    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
        if (sunRoof) {
            price += 2000; // Increase the price by 2000 if a sunroof is present
        }
    }

    // Returns the current price of the car
    public int getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }

    // Returns a string representation of the car with its features and price
    public String toString() {
        // Sivic with ABS, Music System, Airbag optional having a total price of 59000 TL
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(this.musicSystem || this.airBag || this.sunRoof || this.abs ?" with":""); // Start with the car's name and "with"
        if (this.abs){
            builder.append(this.musicSystem || this.airBag || this.sunRoof ?" ABS,":" ABS") ;
        }
        if (this.musicSystem){
            builder.append(this.airBag || this.sunRoof?" Music System,":" Music System");
        }
        if (this.airBag){
            builder.append(this.sunRoof?" Air Bag,":" Air Bag");
        }
        if (this.sunRoof){
            builder.append(" Sunroof");
        }
        if (this.selfparking){
            builder.append(" selfparking");
        }
        builder.append(" having a total price of ");
        builder.append(getPrice());
        builder.append(" TL");

        return builder.toString();
    }
}

