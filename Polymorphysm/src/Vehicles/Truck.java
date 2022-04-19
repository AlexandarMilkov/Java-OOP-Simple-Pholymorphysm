package Vehicles;

public class Truck extends Vechicles  {
    public Truck(double fuelQuantity, double fuelConsumprion) {
        super(fuelQuantity, fuelConsumprion);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption += 1.6;
    }

    @Override
    public String drive(double distance) {
        if (this.fuelConsumption >= this.fuelConsumption * distance){
            fuelQuantity -= distance * fuelConsumption;
            return  String.format("Truck travelled %.0f km%n", distance);
        }else {
            return String.format("Truck needs refueling%n");
        }
    }


    @Override
    public void  refuel(double fuel) {
        this.fuelConsumption = fuelConsumption + fuel * 0.95;
    }
}
