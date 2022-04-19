package WildFarm;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private int foodEaten;
    private String livingRegion;

    protected Animal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
        this.livingRegion = livingRegion;
    }

    public abstract void makeSound();
    public void eat(Food food){
        this.foodEaten += food.getQuantity();
    }


    @Override
    public String toString() {
        DecimalFormat formater = new DecimalFormat("##.##");
        return String.format(
                "%s[%s, %s, %s, %d]",
                this.animalType,
                this.animalName,
                formater.format(this.animalWeight),
                this.livingRegion,
                this.foodEaten

        );
    }


    public String getLivingRegion() {
        return livingRegion;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(Double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }
}
