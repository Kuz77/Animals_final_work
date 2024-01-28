package org.example;

class PackAnimal extends Animal {
    private int carryingCapacity;

    public PackAnimal(String name, String birthDate, int carryingCapacity) {
        super(name, birthDate);
        this.carryingCapacity = carryingCapacity;
    }
}
