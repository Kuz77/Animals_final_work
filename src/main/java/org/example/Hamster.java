package org.example;

class Hamster extends Pet {
    private String breed;
    private boolean isTimid;

    public Hamster(String name, String birthDate, int empathyLevel, String breed, boolean isTimid) {
        super(name, birthDate, empathyLevel);
        this.breed = breed;
        this.isTimid = isTimid;
    }
}