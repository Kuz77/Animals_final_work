package org.example;

class PackAnimal extends Animal {
    private int carryingCapacity;

    public PackAnimal(String name, String dateOfBirth, int carryingCapacity) {
        super(name, dateOfBirth);
        this.carryingCapacity = carryingCapacity;
    }
}
