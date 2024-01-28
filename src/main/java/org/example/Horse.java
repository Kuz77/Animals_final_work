package org.example;

class Horse extends PackAnimal {
    private int speed;
    private String breed;

    public Horse(String name, String dateOfBirth, int carryingCapacity, int speed, String breed) {
        super(name, dateOfBirth, carryingCapacity);
        this.speed = speed;
        this.breed = breed;
    }
}
