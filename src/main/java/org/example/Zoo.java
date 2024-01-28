package org.example;

import java.util.ArrayList;
import java.util.List;
public class Zoo {

    private List<Animal> animals;
    public Zoo() {
        this.animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void printAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public Animal getAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }

}
