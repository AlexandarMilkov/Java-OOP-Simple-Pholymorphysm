package Vehicles;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputCar [] = scanner.nextLine().split(" ");
        String inputTruck [] = scanner.nextLine().split(" ");

        Vechicles carr = new Car(Double.parseDouble(inputCar[1]),Double.parseDouble(inputCar[2]));
        Vechicles truck = new Truck(Double.parseDouble(inputTruck[1]),Double.parseDouble(inputTruck[2]));

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < lines; i++) {
            String input [] = scanner.nextLine().split(" ");

            double distance = Double.parseDouble(input[2]);
            if (input[0].equals("Drive")){
                if (input[1].equals("Car")){
                    carr.drive(distance);
                }else {
                    truck.drive(distance);
                }
            }else {
                if (input[1].equals("Car")){
                    carr.refuel(distance);
                }else {
                    truck.refuel(distance);
                }
            }

        }

        System.out.printf("Car: %.2f%n",carr.getFuelQuantity());
        System.out.printf("Truck: %.2f",truck.getFuelQuantity());
    }
}
