package org.example;

class Donkey extends PackAnimal {
    private boolean stubborn;
    private String breed;

    public Donkey(String name, String birthDate, int carryingCapacity, boolean stubborn, String breed) {
        super(name, birthDate, carryingCapacity);
        this.stubborn = stubborn;
        this.breed = breed;
    }
}

