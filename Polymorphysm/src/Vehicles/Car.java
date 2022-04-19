package Vehicles;

public class Car extends Vechicles {
    public Car(double fuelQuantity, double fuelConsumprion) {
        super(fuelQuantity, fuelConsumprion);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption += 0.9;
    }

    @Override
    public String drive(double fuel) {
        if (fuelQuantity >= fuel * fuelConsumption){
            fuelQuantity -= fuel;
          return   String.format("Car travelled %.0f km%n",fuel);
        }else {
            return "Car needs refueling";
        }
    }

    @Override
    public void refuel(double fuel) {
        this.fuelQuantity += fuel;
    }


}
