package org.example;

class Camel extends PackAnimal {
    private int humpCount;
    private String breed;

    public Camel(String name, String birthDate, int carryingCapacity, int humpCount, String breed) {
        super(name, birthDate, carryingCapacity);
        this.humpCount = humpCount;
        this.breed = breed;
    }
}
