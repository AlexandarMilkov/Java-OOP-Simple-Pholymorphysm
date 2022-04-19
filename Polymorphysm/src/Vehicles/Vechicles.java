package Vehicles;

public abstract class Vechicles implements Vechicless {
    protected double fuelQuantity ;
    protected double fuelConsumption;

    protected Vechicles(double fuelQuantity, double fuelConsumprion) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumprion;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
