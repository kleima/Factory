package com.chrisdev;

public class AnimalFactory {
    public static Animal create(String animalType) {
        switch (animalType) {
            case "rabbit": return new RabbitAnimal();
            case "dog": return new DogAnimal();
            case "cat": return new CatAnimal();
            default: return null;
        }
    }
}
