package org.example;

class Horse extends PackAnimal {
    private int speed;
    private String breed;

    public Horse(String name, String birthDate, int carryingCapacity, int speed, String breed) {
        super(name, birthDate, carryingCapacity);
        this.speed = speed;
        this.breed = breed;
    }
}
