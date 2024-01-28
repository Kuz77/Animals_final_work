package org.example;

class Camel extends PackAnimal {
    private String breed;
    private int numberOfHumps;

    public Camel(String name, String dateOfBirth, int carryingCapacity, String breed, int numberOfHumps) {
        super(name, dateOfBirth, carryingCapacity);
        this.breed = breed;
        this.numberOfHumps = numberOfHumps;
    }
}
