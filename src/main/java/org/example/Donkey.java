package org.example;

class Donkey extends PackAnimal {
    private String breed;
    private boolean isStubborn;

    public Donkey(String name, String dateOfBirth, int carryingCapacity, String breed, boolean isStubborn) {
        super(name, dateOfBirth, carryingCapacity);
        this.breed = breed;
        this.isStubborn = isStubborn;
    }
}

